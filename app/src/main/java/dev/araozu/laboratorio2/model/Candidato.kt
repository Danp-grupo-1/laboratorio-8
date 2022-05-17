package dev.araozu.laboratorio2.model

import androidx.annotation.DrawableRes

data class Candidato(
    val nombre: String,
    val partido: Partidos,
    /**
     * Un puntero hacia un recurso del proyecto de android,
     * obtenido con R.drawable.nombre_foto
     */
    @DrawableRes val foto: Int,
    val biografia: String,
    val propuestas: List<String>,
    val distrito: Distrito,
)
