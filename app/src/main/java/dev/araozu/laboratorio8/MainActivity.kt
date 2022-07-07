package dev.araozu.laboratorio8

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.messaging.FirebaseMessaging
import dev.araozu.laboratorio8.model.Distrito
import dev.araozu.laboratorio8.model.Partido
import dev.araozu.laboratorio8.ui.theme.Lab8Theme

const val CHANNEL_ID = "NOT"

private fun createNotificationChannel(ctx: Context) {
    // Create the NotificationChannel, but only on API 26+ because
    // the NotificationChannel class is new and not in the support library
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val name = "Default"
        val descriptionText = "Default notifications"
        val importance = NotificationManager.IMPORTANCE_DEFAULT
        val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
            description = descriptionText
        }
        // Register the channel with the system
        val notificationManager =
            ctx.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.createNotificationChannel(channel)
    }
}


private fun notification(ctx: Context) {
    // Intent to open the app
    val intent = Intent(ctx, MainActivity::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
    }
    val pendingIntent = PendingIntent.getActivity(ctx, 0, intent, PendingIntent.FLAG_IMMUTABLE)

    /* First notification action: Distrito */
    val distritoIntent = Intent(ctx, MainActivity::class.java).apply {
         // action = ACTION_SNOOZ
        putExtra("Distrito", Distrito.CHIGUATA.toString())
    }
    val distritoPendingIntent = PendingIntent.getBroadcast(ctx, 0, distritoIntent, 0)

    /* Second notification action: Partido */
    val partidoIntent = Intent(ctx, MainActivity::class.java).apply {
        putExtra("Partido", Partido.partidos[0].nombre)
    }
    val partidoPendingIntent = PendingIntent.getBroadcast(ctx, 0, partidoIntent, 0)

    val builder = NotificationCompat.Builder(ctx, CHANNEL_ID)
        .setSmallIcon(R.drawable.loading)
        .setContentTitle("Sample notification")
        .setContentText("Sample notification content text")
        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
        .setContentIntent(pendingIntent)
        .addAction(R.drawable.loading, "Distrito", distritoPendingIntent)
        .addAction(R.drawable.loading, "Partido", partidoPendingIntent)
        .setAutoCancel(true)

    with(NotificationManagerCompat.from(ctx)) {
        notify(0, builder.build())
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        createNotificationChannel(ctx = this@MainActivity)

        /*
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w("MAIN", "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            // Log and toast
            val msg = token.toString()
            Log.d("MAIN", msg)
            Toast.makeText(baseContext, msg, Toast.LENGTH_SHORT).show()
        })
         */

        setContent {
            Lab8Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavigationHost()
                }
            }
        }
    }
}

/**
 * Configura las rutas para cambiar entre interfaces
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigation(navController) }
    ) {
        NavHost(
            navController = navController,
            startDestination = Destinations.DistritosScreen.route
        ) {
            composable(
                route = Destinations.DistritosScreen.route
            ) {
                ListDistritos(navController)
            }
            composable(
                route = Destinations.CandidatosDistritoScreen.route,
                arguments = listOf(navArgument("distrito") { defaultValue = "Arequipa" })
            ) {
                val distrito = it.arguments?.getString("distrito")
                requireNotNull(distrito)
                ListCandidatosDistrito(distrito, navController)
            }
            composable(
                route = Destinations.PartidosScreen.route
            ) {
                ListPartidos(navController)
            }
            //
            composable(
                route = Destinations.CandidatosPartidoScreen.route,
                arguments = listOf(navArgument("partido") {
                    defaultValue = "Arequipa_Tradicion_Futuro"
                })
            ) {
                val partido = it.arguments?.getString("partido")
                requireNotNull(partido)
                ListCandidatosPartido(partido, navController)
            }
        }
    }

}


// Bottom Navigation

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object DistritosBottom :
        BottomNavItem("Distritos", R.drawable.ic_district, Destinations.DistritosScreen.route)

    object PartidosBottom :
        BottomNavItem("Partidos", R.drawable.ic_party, Destinations.PartidosScreen.route)

}

@Composable
fun BottomNavigation(navController: NavController) {
    val items = listOf(
        BottomNavItem.DistritosBottom,
        BottomNavItem.PartidosBottom,
    )

    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 12.sp
                    )
                },
                alwaysShowLabel = true,
                selected = currentRoute == item.screen_route,
                onClick = {
                    navController.navigate(item.screen_route) {

                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

