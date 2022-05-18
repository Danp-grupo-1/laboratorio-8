package dev.araozu.laboratorio2

sealed class Destinations(val route: String) {
    object DistritosScreen : Destinations("distritos_screen")
    object PartidosScreen : Destinations("partidos_screen")
    object CandidatosScreen : Destinations("candidatos_screen/?distrito={distrito}") {
        fun createRoute(distrito: String) = "candidatos_screen/?distrito=$distrito"
    }
}
