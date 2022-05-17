package dev.araozu.laboratorio2.model

import dev.araozu.laboratorio2.R
import java.lang.IllegalStateException

object CandidatosManager {
    private val candidatos: ArrayList<Candidato> = ArrayList()

    // Partidos
    private val partido3 = Partidos.Arequipa_transformacion
    private val partido4 = Partidos.Arequipa_Tradicion_Futuro


    // Candidatos Alto Selva Alegre
    private val candidatoAsa1 = Candidato(
        "Enrique Salas Carreño",
        Partidos.Movimiento_Regional_Reveladora,
        R.drawable.enrique_salas_carreno,
        "",
        arrayListOf(),
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa2 = Candidato(
        "Mariano Otazu Yana",
        Partidos.Frente_Popular_Agricola_del_Peru,
        R.drawable.mariano_otazu_yana,
        "",
        arrayListOf(),
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa3 = Candidato(
        "Anibal Agustin Salas Flores",
        Partidos.Arequipa_transformacion,
        R.drawable.anibal_agustin_salas_flores,
        "",
        arrayListOf(),
        Distrito.ALTO_SELVA_ALEGRE
    )

    // Candidatos Arequipa
    private val candidatoAqp1 = Candidato(
        "Miriam Janet Pacheco de Carpio",
        partido3,
        R.drawable.question_mark,
        "",
        arrayListOf(),
        Distrito.AREQUIPA
    )

    private val candidatoAqp2 = Candidato(
        "Oswaldo Alvaro Muñiz Huillca",
        partido4,
        R.drawable.question_mark,
        "",
        arrayListOf(),
        Distrito.AREQUIPA
    )

    init {
        candidatos.add(candidatoAsa1)
        candidatos.add(candidatoAsa2)
        candidatos.add(candidatoAsa3)
        candidatos.add(candidatoAqp1)
        candidatos.add(candidatoAqp2)
    }

    fun getCandidatosPorDistrito(distrito: Distrito): List<Candidato> {
        return candidatos.filter { it.distrito == distrito }
    }

    fun getCandidatosPorPartido(partido: Partidos): List<Candidato> {
        return candidatos.filter { it.partido == partido }
    }

}