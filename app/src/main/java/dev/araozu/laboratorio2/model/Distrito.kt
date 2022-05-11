package dev.araozu.laboratorio2.model

import androidx.compose.ui.text.toUpperCase
import java.lang.IllegalArgumentException

enum class Distrito {
    ALTO_SELVA_ALEGRE,
    AREQUIPA,
    CAYMA,
    CERRO_COLORADO,
    CHARACATO,
    CHIGUATA,
    JACOBO_HUNTER,
    JOSE_LUIS_BUSTAMANTE_Y_RIVERO,
    MARIANO_MELGAR,
    MIRAFLORES,
    MOLLEBAYA,
    PAUCARPATA,
    POCSI,
    POLOBAYA,
    QUEQUEÑA,
    SABANDÍA,
    SACHACA,
    SOCABAYA,
    TIABAYA,
    UCHUMAYO,
    YANAHUARA,
    YURA;

    companion object {
        fun fromString(distrito: String): Distrito? {
            return try {
                valueOf(distrito.uppercase())
            } catch (e: IllegalArgumentException) {
                null
            }
        }
    }
}
