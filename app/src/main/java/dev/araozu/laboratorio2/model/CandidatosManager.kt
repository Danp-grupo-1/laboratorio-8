package dev.araozu.laboratorio2.model

import dev.araozu.laboratorio2.R
import java.lang.IllegalStateException

object CandidatosManager {
    private val distritos: HashMap<Distrito, List<Candidato>> = HashMap()

    // Partidos
    private val partido1 = Partido("Movimiento Regional Reveladora")
    private val partido2 = Partido("Frente Popular Agricola del Peru")
    private val partido3 = Partido("Arequipa transformacion")
    private val partido4 = Partido("Arequipa,Tradicion y Futuro")


    // Candidatos Alto Selva Alegre
    private val candidatoAsa1 = Candidato(
        "Enrique Salas Carreño",
        partido1,
        R.drawable.enrique_salas_carreno,
        "",
        arrayListOf()
    )

    private val candidatoAsa2 = Candidato(
        "Mariano Otazu Yana",
        partido2,
        R.drawable.mariano_otazu_yana,
        "",
        arrayListOf()
    )

    private val candidatoAsa3 = Candidato(
        "Anibal Agustin Salas Flores",
        partido3,
        R.drawable.anibal_agustin_salas_flores,
        "",
        arrayListOf()
    )

    private val candidatosAsa: List<Candidato> = listOf(
        candidatoAsa1,
        candidatoAsa2,
        candidatoAsa3
    )

    // Candidatos Arequipa
    private val candidatoAqp1 = Candidato(
        "Miriam Janet Pacheco de Carpio",
        partido3,
        R.drawable.question_mark,
        "",
        arrayListOf()
    )

    private val candidatoAqp2 = Candidato(
        "Oswaldo Alvaro Muñiz Huillca",
        partido4,
        R.drawable.question_mark,
        "",
        arrayListOf()
    )

    private val candidatosAqp: List<Candidato> = listOf(
        candidatoAqp1,
        candidatoAqp2,
    )


    init {
        Distrito.values().forEach { distritos[it] = arrayListOf() }
        distritos[Distrito.ALTO_SELVA_ALEGRE] = candidatosAsa
        distritos[Distrito.AREQUIPA] = candidatosAqp
    }

    fun getCandidatos(distrito: Distrito): List<Candidato> {
        return distritos[distrito]
            ?: throw IllegalStateException("El distrito $distrito no tiene candidatos")
    }
}