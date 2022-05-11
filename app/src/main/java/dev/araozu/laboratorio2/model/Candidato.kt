package dev.araozu.laboratorio2.model

data class Candidato(
    val nombre: String,
    val partido: Partido,
    /**
     * Un puntero hacia un recurso del proyecto de android,
     * obtenido con R.drawable.nombre_foto
     */
    val foto: Int,
    val biografia: String,
    val propuestas: List<String>,
)
