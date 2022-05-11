package dev.araozu.laboratorio2.model

import java.lang.IllegalStateException

object CandidatosManager {
    private val distritos: HashMap<Distrito, List<Candidato>> = HashMap()

    init {
        Distrito.values().forEach { distritos[it] = ArrayList() }
    }

    fun getCandidatos(distrito: Distrito): List<Candidato> {
        return distritos[distrito] ?: throw IllegalStateException("El distrito $distrito no tiene candidatos")
    }
}