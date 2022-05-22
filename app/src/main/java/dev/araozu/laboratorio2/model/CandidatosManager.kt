package dev.araozu.laboratorio2.model

import dev.araozu.laboratorio2.R

object CandidatosManager {
    private val candidatos: ArrayList<Candidato> = ArrayList()

    // Candidatos Alto Selva Alegre
    private val candidatoAsa1 = Candidato(
        "Enrique Salas Carreño",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.enrique_salas_carreno,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa2 = Candidato(
        "Mariano Otazu Yana",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.mariano_otazu_yana,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa3 = Candidato(
        "Anibal Agustin Salas Flores",
        Partido.Arequipa_transformacion,
        R.drawable.anibal_agustin_salas_flores,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa4 = Candidato(
        "David Adolfo Barriga Miranda",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.david_adolfo_barriga_miranda,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa5 = Candidato(
        "Domingo Suclle Aragon",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.domingo_suclle_aragon,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa6 = Candidato(
        "Jose Luis Narro Ortiz",
        Partido.Yo_Arequipa,
        R.drawable.jose_luis_narro_ortiz,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa7 = Candidato(
        "Rusbel Gutierrez Canaza",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.rusbel_gutierrez_canaza,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa8 = Candidato(
        "Rusbel Gutierrez Canaza",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.rusbel_gutierrez_canaza,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa9 = Candidato(
        "Hector Jesus Del Carpio Cayo",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.hector_jesus_del_carpio_cayo,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa10 = Candidato(
        "Alfredo Willy Benavente Godoy",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.alfredo_willy_benavente_godoy,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa11 = Candidato(
        "Daniel Ricardo Delgado Quilla",
        Partido.Accion_Popular,
        R.drawable.daniel_ricardo_delgado_quilla,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa12 = Candidato(
        "Raul Lima Coasaca",
        Partido.Partido_Morado,
        R.drawable.raul_lima_coasaca,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa13 = Candidato(
        "Rafael Vicente Villa Moroco",
        Partido.Fe_En_El_Peru,
        R.drawable.rafael_vicente_villa_moroco,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa14 = Candidato(
        "Jesus Antonio Gamero Marquez",
        Partido.Alianza_Para_El_Progreso,
        R.drawable.jesus_antonio_gamero_marquez,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa15 = Candidato(
        "Juan Molina Patiño",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.juan_molina_patinio,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa16 = Candidato(
        "Cristhian Guillen Rivera",
        Partido.Fuerza_Arequipenya,
        R.drawable.cristhian_guillen_rivera,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa17 = Candidato(
        "Silvestre Frisancho Ancasi",
        Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
        R.drawable.silvestre_frisancho_ancasi,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa18 = Candidato(
        "Pedro Santos Cornejo Mamani",
        Partido.Juntos_Por_El_Peru,
        R.drawable.pedro_santos_cornejo_mamani,
        "",
        Distrito.ALTO_SELVA_ALEGRE
    )

    /*
        // Candidatos Arequipa
        private val candidatoAqp1 = Candidato(
            "Miriam Janet Pacheco de Carpio",
            partido3,
            R.drawable.question_mark,
            "",
                        Distrito.AREQUIPA
        )

        private val candidatoAqp2 = Candidato(
            "Oswaldo Alvaro Muñiz Huillca",
            partido4,
            R.drawable.question_mark,
            "",
                        Distrito.AREQUIPA
        )*/
    // Candidatos Cayma
    private val candidatoCay1 = Candidato(
        "Miriam Janet Pacheco de Carpio",
        Partido.Arequipa_transformacion,
        R.drawable.miriam_janet_pacheco_de_carpio,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay2 = Candidato(
        "Oswaldo Alvaro Muñiz Huillca",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.oswaldo_alvaro_muniiz_huillca,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay3 = Candidato(
        "Moises Jesus Chuctaya Huarca",
        Partido.Fuerza_Arequipenya,
        R.drawable.moises_jesus_chuctaya_huarca,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay4 = Candidato(
        "Juan Carlos Callacondo Velarde\n",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.juan_carlos_callacondo_velarde,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay5 = Candidato(
        "Reynaldo Paredes Casapia",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.reynaldo_paredes_casapia,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay6 = Candidato(
        "Jose Renato Carreon Echegaray",
        Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
        R.drawable.jose_renato_carreon_echegaray,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay7 = Candidato(
        "Juan carlos Linares Cama",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.juan_carlos_linares_cama,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay8 = Candidato(
        "Gino Hector Bravo Ardiles",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.gino_hector_bravo_ardiles,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay9 = Candidato(
        "Dolores Virginia Rodriguez Acosta",
        Partido.Yo_Arequipa,
        R.drawable.dolores_virginia_rodriguez_acosta,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay10 = Candidato(
        "Rodolfo Aquepucho Hacha",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.rodolfo_aquepucho_hacha,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay11 = Candidato(
        "Rodolfo Isaias QUispe Taco",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.rodolfo_aquepucho_hacha,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay12 = Candidato(
        "Wenceslao Salomon Tarifa Sucari",
        Partido.Podemos_Peru,
        R.drawable.wenceslao_salomon_tarifa_sucari,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay13 = Candidato(
        "Hector Arturo Pita Catalan",
        Partido.Fuerza_Popular,
        R.drawable.hector_arturo_pita_catalan,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay14 = Candidato(
        "Fortunato Muñuico Muñuico",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.fortunato_mniuico_muniuico,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay15 = Candidato(
        "Pavel Miguel Ibarra Quispe",
        Partido.Alianza_Para_El_Progreso,
        R.drawable.pavel_miguel_ibarra_quispe,
        "",
        Distrito.CAYMA
    )
    private val candidatoCay16 = Candidato(
        "Victor Simon Garcia ALvarez",
        Partido.Juntos_Por_El_Peru,
        R.drawable.victor_simon_garcia_alvarez,
        "",
        Distrito.CAYMA
    )


    //Candidatos Cerro Colorado
    private val candidatoCeColor1 = Candidato(
        "Hugo Efrain Aguilar Gonzales",
        Partido.Arequipa_transformacion,
        R.drawable.hugo_efrain_aguilar_gonzales,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor2 = Candidato(
        "Hugo Efrain Aguilar Gonzales",
        Partido.Arequipa_transformacion,
        R.drawable.hugo_efrain_aguilar_gonzales,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor3 = Candidato(
        "Santos ALfaro Rojas",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.santos_ivan_alfaro_rojas,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor4 = Candidato(
        "Miguel Eliseo Apaza Peña",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.miguel_eliseo_apaza_penia,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor5 = Candidato(
        "Manuel Enrique Vera Paredes",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.manuel_enrique_vera_paredes,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor6 = Candidato(
        "Pedro Florencio HUamani ANcasi",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.pedro_florencio_huamani_ancasi,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor7 = Candidato(
        "Walter Benjamin Diaz Perez",
        Partido.Fuerza_Arequipenya,
        R.drawable.walter_benjamin_diaz_perez,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor8 = Candidato(
        "Luis Elias Apaza Huaman",
        Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
        R.drawable.luis_elias_apaza_huaman,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor9 = Candidato(
        "Pascual Puma Ayma",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.pascual_puma_ayma,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor10 = Candidato(
        "Hermes Nicolas OScco Polar",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.hermes_nicolas_oscco_polar,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor11 = Candidato(
        "Jesus Heraclides Torres Gonzales",
        Partido.Yo_Arequipa,
        R.drawable.jesus_heraclides_torres_gonzales,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor12 = Candidato(
        "Wilfredo Quispe Gutierrez",
        Partido.Fe_En_El_Peru,
        R.drawable.wilfredo_quispe_gutierrez,
        "",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor13 = Candidato(
        "Nila Yesmit Apaza Mamani",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.nila_yesmit_apaza_mamani,
        "",
        Distrito.CERRO_COLORADO
    )


    init {
        candidatos.add(candidatoAsa1)
        candidatos.add(candidatoAsa2)
        candidatos.add(candidatoAsa3)
        candidatos.add(candidatoAsa4)
        candidatos.add(candidatoAsa5)
        candidatos.add(candidatoAsa6)
        candidatos.add(candidatoAsa7)
        candidatos.add(candidatoAsa8)
        candidatos.add(candidatoAsa9)
        candidatos.add(candidatoAsa10)
        candidatos.add(candidatoAsa11)
        candidatos.add(candidatoAsa12)
        candidatos.add(candidatoAsa13)
        candidatos.add(candidatoAsa14)
        candidatos.add(candidatoAsa15)
        candidatos.add(candidatoAsa16)
        candidatos.add(candidatoAsa17)
        candidatos.add(candidatoAsa18)
        //Candidatos Cayma
        candidatos.add(candidatoCay1)
        candidatos.add(candidatoCay2)
        candidatos.add(candidatoCay3)
        candidatos.add(candidatoCay4)
        candidatos.add(candidatoCay5)
        candidatos.add(candidatoCay6)
        candidatos.add(candidatoCay7)
        candidatos.add(candidatoCay8)
        candidatos.add(candidatoCay9)
        candidatos.add(candidatoCay10)
        candidatos.add(candidatoCay11)
        candidatos.add(candidatoCay12)
        candidatos.add(candidatoCay13)
        candidatos.add(candidatoCay14)
        candidatos.add(candidatoCay15)
        candidatos.add(candidatoCay16)
        //Candidatos Cerro Colorado
        candidatos.add(candidatoCeColor1)
        candidatos.add(candidatoCeColor2)
        candidatos.add(candidatoCeColor3)
        candidatos.add(candidatoCeColor4)
        candidatos.add(candidatoCeColor5)
        candidatos.add(candidatoCeColor6)
        candidatos.add(candidatoCeColor7)
        candidatos.add(candidatoCeColor8)
        candidatos.add(candidatoCeColor9)
        candidatos.add(candidatoCeColor10)
        candidatos.add(candidatoCeColor11)
        candidatos.add(candidatoCeColor12)
        candidatos.add(candidatoCeColor13)
        // candidatos.add(candidatoAqp1)
        // candidatos.add(candidatoAqp2)
    }

    fun getCandidatosPorDistrito(distrito: Distrito): List<Candidato> {
        return candidatos.filter { it.distrito == distrito }
    }

    fun getCandidatosPorPartido(partido: Partido): List<Candidato> {
        return candidatos.filter { it.partido == partido }
    }

}