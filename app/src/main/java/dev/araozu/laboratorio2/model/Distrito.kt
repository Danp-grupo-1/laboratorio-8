package dev.araozu.laboratorio2.model

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
    PAUCARPATA,
    SABANDIA,
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
