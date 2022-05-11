package dev.araozu.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import dev.araozu.laboratorio2.model.Distrito
import dev.araozu.laboratorio2.ui.theme.Laboratorio2Theme

val distritoEjemplo = Distrito.MARIANO_MELGAR;


class DistritosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Distritos(navController: NavController) {
    Button(onClick = { navController.navigate(route = Destinations.CandidatosScreen.createRoute(distritoEjemplo.name)) } ) {
        Text(distritoEjemplo.name)
    }
}
