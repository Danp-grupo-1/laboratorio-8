package dev.araozu.laboratorio2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavigationHost(){

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.DistritosScreen.route){
        composable(route = Destinations.DistritosScreen.route){
            Distritos(navController)
        }
        composable(
            route = Destinations.CandidatosScreen.route,
            arguments = listOf(navArgument("distrito"){ defaultValue="Arequipa"})
        ){
                it->var distrito = it.arguments?.getString("distrito")
            requireNotNull(distrito)
            Screen(distrito)
        }
    }

}