package dev.araozu.laboratorio8.model

import androidx.annotation.DrawableRes

data class Candidato(
    val nombre: String,
    val partido: Partido,
    /**
     * Un puntero hacia un recurso del proyecto de android,
     * obtenido con R.drawable.nombre_foto
     */
    @DrawableRes val foto: Int,
    val biografia: String,
    val distrito: Distrito,
)
