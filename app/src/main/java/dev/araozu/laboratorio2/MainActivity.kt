package dev.araozu.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import dev.araozu.laboratorio2.ui.theme.Proyecto1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Proyecto1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
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
                ListCandidatosDistrito(distrito)
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
                ListCandidatosPartido(partido)
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

    BottomNavigation(
        backgroundColor = colorResource(id = R.color.white),
        contentColor = Color.Black,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = {
                    Text(
                        text = item.title,
                        fontSize = 12.sp
                    )
                },
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = Color.Black.copy(0.4f),
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

