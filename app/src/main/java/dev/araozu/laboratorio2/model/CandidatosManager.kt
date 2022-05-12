package dev.araozu.laboratorio2.model

import dev.araozu.laboratorio2.R
import java.lang.IllegalStateException

object CandidatosManager {
    private val distritos: HashMap<Distrito, List<Candidato>> = HashMap()

    //Partidos
    val partido1 = Partido("Movimiento Regional Reveladora")
    val partido2 = Partido("Frente Popular Agricola del Peru")
    val partido3 = Partido("Arequipa transformacion")
    val partido4 = Partido("Arequipa,Tradicion y Futuro")


    //Candidatos Alto Selva Alegre
    val candidatoAsa1 = Candidato("Enrique Salas Carreño",
        partido1,
        R.drawable.mono_nft,
        "Aqui iria la biografia",
        arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"))

    val candidatoAsa2 = Candidato("Mariano Otazu Yana",
        partido2,
        R.drawable.mono_nft,
        "Aqui iria la biografia",
        arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"))

    val candidatoAsa3 = Candidato("Anibal Agustin Salas Flores",
        partido3,
        R.drawable.mono_nft,
        "Aqui iria la biografia",
        arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"))

    val candidatosAsa: List<Candidato> = listOf(
        candidatoAsa1,
        candidatoAsa2,
        candidatoAsa3
    );

    //Candidatos Arequipa
    val candidatoAqp1 = Candidato("Miriam Janet Pacheco de Carpio",
        partido3,
        R.drawable.mono_nft,
        "Aqui iria la biografia",
        arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"))

    val candidatoAqp2 = Candidato("Oswaldo Alvaro Muñiz Huillca",
        partido4,
        R.drawable.mono_nft,
        "Aqui iria la biografia",
        arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"))

    val candidatosAqp: List<Candidato> = listOf(
        candidatoAqp1,
        candidatoAqp2,
    );


    init {
        Distrito.values().forEach {
            if(it.name.equals("ALTO_SELVA_ALEGRE")){
                distritos[it] = candidatosAsa
            }
            if(it.name.equals("AREQUIPA")){
                distritos[it] = candidatosAqp
            }
        }
    }

    fun getCandidatos(distrito: Distrito): List<Candidato> {
        return distritos[distrito] ?: throw IllegalStateException("El distrito $distrito no tiene candidatos")
    }
}