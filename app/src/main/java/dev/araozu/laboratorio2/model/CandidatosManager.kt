package dev.araozu.laboratorio2.model

import dev.araozu.laboratorio2.R

object CandidatosManager {
    private val candidatos: ArrayList<Candidato> = ArrayList()

    // Candidatos Alto Selva Alegre
    private val candidatoAsa1 = Candidato(
        "Enrique Salas Carreño",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.enrique_salas_carreno,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa2 = Candidato(
        "Mariano Otazu Yana",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.mariano_otazu_yana,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa3 = Candidato(
        "Anibal Agustin Salas Flores",
        Partido.Arequipa_transformacion,
        R.drawable.anibal_agustin_salas_flores,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )

    private val candidatoAsa4 = Candidato(
        "David Adolfo Barriga Miranda",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.david_adolfo_barriga_miranda,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa5 = Candidato(
        "Domingo Suclle Aragon",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.domingo_suclle_aragon,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa6 = Candidato(
        "Jose Luis Narro Ortiz",
        Partido.Yo_Arequipa,
        R.drawable.jose_luis_narro_ortiz,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa7 = Candidato(
        "Rusbel Gutierrez Canaza",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.rusbel_gutierrez_canaza,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa8 = Candidato(
        "Rusbel Gutierrez Canaza",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.rusbel_gutierrez_canaza,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa9 = Candidato(
        "Hector Jesus Del Carpio Cayo",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.hector_jesus_del_carpio_cayo,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa10 = Candidato(
        "Alfredo Willy Benavente Godoy",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.alfredo_willy_benavente_godoy,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa11 = Candidato(
        "Daniel Ricardo Delgado Quilla",
        Partido.Accion_Popular,
        R.drawable.daniel_ricardo_delgado_quilla,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa12 = Candidato(
        "Raul Lima Coasaca",
        Partido.Partido_Morado,
        R.drawable.raul_lima_coasaca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa13 = Candidato(
        "Rafael Vicente Villa Moroco",
        Partido.Fe_En_El_Peru,
        R.drawable.rafael_vicente_villa_moroco,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa14 = Candidato(
        "Jesus Antonio Gamero Marquez",
        Partido.Alianza_Para_El_Progreso,
        R.drawable.jesus_antonio_gamero_marquez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa15 = Candidato(
        "Juan Molina Patiño",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.juan_molina_patinio,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa16 = Candidato(
        "Cristhian Guillen Rivera",
        Partido.Fuerza_Arequipenya,
        R.drawable.cristhian_guillen_rivera,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa17 = Candidato(
        "Silvestre Frisancho Ancasi",
        Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
        R.drawable.silvestre_frisancho_ancasi,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )
    private val candidatoAsa18 = Candidato(
        "Pedro Santos Cornejo Mamani",
        Partido.Juntos_Por_El_Peru,
        R.drawable.pedro_santos_cornejo_mamani,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.ALTO_SELVA_ALEGRE
    )


    // Candidatos Cayma
    private val candidatoCay1 = Candidato(
        "Miriam Janet Pacheco de Carpio",
        Partido.Arequipa_transformacion,
        R.drawable.miriam_janet_pacheco_de_carpio,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay2 = Candidato(
        "Oswaldo Alvaro Muñiz Huillca",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.oswaldo_alvaro_muniiz_huillca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay3 = Candidato(
        "Moises Jesus Chuctaya Huarca",
        Partido.Fuerza_Arequipenya,
        R.drawable.moises_jesus_chuctaya_huarca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay4 = Candidato(
        "Juan Carlos Callacondo Velarde\n",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.juan_carlos_callacondo_velarde,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay5 = Candidato(
        "Reynaldo Paredes Casapia",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.reynaldo_paredes_casapia,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay6 = Candidato(
        "Jose Renato Carreon Echegaray",
        Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
        R.drawable.jose_renato_carreon_echegaray,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay7 = Candidato(
        "Juan carlos Linares Cama",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.juan_carlos_linares_cama,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay8 = Candidato(
        "Gino Hector Bravo Ardiles",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.gino_hector_bravo_ardiles,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay9 = Candidato(
        "Dolores Virginia Rodriguez Acosta",
        Partido.Yo_Arequipa,
        R.drawable.dolores_virginia_rodriguez_acosta,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay10 = Candidato(
        "Rodolfo Aquepucho Hacha",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.rodolfo_aquepucho_hacha,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay11 = Candidato(
        "Rodolfo Isaias QUispe Taco",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.rodolfo_aquepucho_hacha,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay12 = Candidato(
        "Wenceslao Salomon Tarifa Sucari",
        Partido.Podemos_Peru,
        R.drawable.wenceslao_salomon_tarifa_sucari,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay13 = Candidato(
        "Hector Arturo Pita Catalan",
        Partido.Fuerza_Popular,
        R.drawable.hector_arturo_pita_catalan,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay14 = Candidato(
        "Fortunato Muñuico Muñuico",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.fortunato_mniuico_muniuico,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay15 = Candidato(
        "Pavel Miguel Ibarra Quispe",
        Partido.Alianza_Para_El_Progreso,
        R.drawable.pavel_miguel_ibarra_quispe,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )
    private val candidatoCay16 = Candidato(
        "Victor Simon Garcia ALvarez",
        Partido.Juntos_Por_El_Peru,
        R.drawable.victor_simon_garcia_alvarez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CAYMA
    )


    //Candidatos Cerro Colorado
    private val candidatoCeColor1 = Candidato(
        "Hugo Efrain Aguilar Gonzales",
        Partido.Arequipa_transformacion,
        R.drawable.hugo_efrain_aguilar_gonzales,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor2 = Candidato(
        "Hugo Efrain Aguilar Gonzales",
        Partido.Arequipa_transformacion,
        R.drawable.hugo_efrain_aguilar_gonzales,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor3 = Candidato(
        "Santos ALfaro Rojas",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.santos_ivan_alfaro_rojas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor4 = Candidato(
        "Miguel Eliseo Apaza Peña",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.miguel_eliseo_apaza_penia,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor5 = Candidato(
        "Manuel Enrique Vera Paredes",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.manuel_enrique_vera_paredes,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor6 = Candidato(
        "Pedro Florencio HUamani ANcasi",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.pedro_florencio_huamani_ancasi,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor7 = Candidato(
        "Walter Benjamin Diaz Perez",
        Partido.Fuerza_Arequipenya,
        R.drawable.walter_benjamin_diaz_perez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor8 = Candidato(
        "Luis Elias Apaza Huaman",
        Partido.Arequipa_Unidos_Por_El_Gran_Cambio,
        R.drawable.luis_elias_apaza_huaman,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor9 = Candidato(
        "Pascual Puma Ayma",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.pascual_puma_ayma,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor10 = Candidato(
        "Hermes Nicolas OScco Polar",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.hermes_nicolas_oscco_polar,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor11 = Candidato(
        "Jesus Heraclides Torres Gonzales",
        Partido.Yo_Arequipa,
        R.drawable.jesus_heraclides_torres_gonzales,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor12 = Candidato(
        "Wilfredo Quispe Gutierrez",
        Partido.Fe_En_El_Peru,
        R.drawable.wilfredo_quispe_gutierrez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )
    private val candidatoCeColor13 = Candidato(
        "Nila Yesmit Apaza Mamani",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.nila_yesmit_apaza_mamani,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CERRO_COLORADO
    )


    // Candidatos Characato
    private val candidatochr1 = Candidato(
        "Maribel Efigenia Linares Luque",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.maribel_efigenia_linares_luque,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr2 = Candidato(
        "Teresa Moscoso Oscco",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.teresa_moscoso_oscco,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr3 = Candidato(
        "Alexander Hector Quise Vilca",
        Partido.Fuerza_Arequipenya,
        R.drawable.alexander_hector_quispe_vilca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )

    private val candidatochr4 = Candidato(
        "Angel Anastacio Linares Portilla",
        Partido.Arequipa_Renace,
        R.drawable.angel_anastacio_linares_portilla,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr5 = Candidato(
        "Carlos Alberto Portilla Tejada",
        Partido.Arequipa_transformacion,
        R.drawable.carlos_alberto_portilla_tejada,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr6 = Candidato(
        "Jorge Rony Portilla Portilla",
        Partido.Yo_Arequipa,
        R.drawable.jorge_rony_portilla_portilla,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr7 = Candidato(
        "Percy Juan Herrera Morales",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.percy_juan_herrera_morales,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr8 = Candidato(
        "Donilly Willy Alvarez Arce",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.donilly_willy_alvarez_arce,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr9 = Candidato(
        "Jesus Godofredo Aguillar Guillen",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.jesus_godofredo_aguilar_guillen,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr10 = Candidato(
        "Luciano Mamani Maquera",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.luciano_mamani_maquera,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    private val candidatochr11 = Candidato(
        "Lucero Violeta Linares Cornejo",
        Partido.Movimiento_Regional_Del_Ajo_Justicia_Y_Orden,
        R.drawable.lucero_violeta_linares_cornejo,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHARACATO
    )
    //Candidatos
    private val candidatochi1 = Candidato(
        "Piter Vilca Gallegos",
        Partido.Fuerza_Arequipenya,
        R.drawable.piter_vilca_gallegos,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi2 = Candidato(
        "Gladys Ticona Flores",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.gladys_ticona_flores,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi3 = Candidato(
        "Yris Paola Calisaya Vilca",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.yris_paola_calisaya_vilca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi4 = Candidato(
        "Gregorio Angel Corrales Delgado",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.gregorio_angel_corrales_delgado,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi5 = Candidato(
        "Emiliano Vilca Cruz",
        Partido.Partido_Politico_Nacional_Peru_Libre,
        R.drawable.emiliano_vilca_ruiz,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi6 = Candidato(
        "Remigio Bernardo Cahua Sahuanay",
        Partido.Partido_Frente_De_La_Esperanza_2021,
        R.drawable.remigio_bernardo_cahua_sahuanay,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    private val candidatochi7 = Candidato(
        "Moises Urbano Vizcarra Andamayo",
        Partido.Alianza_Para_El_Progreso,
        R.drawable.moises_jesus_chuctaya_huarca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.CHIGUATA
    )
    //Candidatos Jacobo Hunter
    private val candidatohunt1 = Candidato(
        "Cecilia Imelda Fuentes Guerra",
        Partido.Avanza_Pais_Partido_De_Integracion_Social,
        R.drawable.cecilia_imelda_fuentes_guerra,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JACOBO_HUNTER
    )
    private val candidatohunt2 = Candidato(
        "Sergio Alfredo Barriga Rodriguez",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.sergio_alfredo_barriga_rodriguez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JACOBO_HUNTER
    )
    private val candidatohunt3 = Candidato(
        "Jummy Edgardo Vargas Espinoza",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.jimmy_edgardo_vargas_espinoza,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JACOBO_HUNTER
    )
    private val candidatohunt4 = Candidato(
        "Reger Andia Romero",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.roger_andia_romero,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JACOBO_HUNTER
    )
    private val candidatohunt5 = Candidato(
        "David Apaza Enriquez",
        Partido.Fuerza_Arequipenya,
        R.drawable.david_apaza_enriquez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JACOBO_HUNTER
    )
    //Candidatos Jose luis Bustamante y Rivero
    private val candidatojlb1 = Candidato(
        "Ronldo Pablo Ibañez Barreda",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.ronald_pablo_ibaniez_barreda,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
    )
    private val candidatojlb2 = Candidato(
        "Guillermo Pablo Reinoso Barletti",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.guillermo_pablo_reinoso_barletti,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
    )
    private val candidatojlb3 = Candidato(
        "David Zapata Lovaton",
        Partido.Fuerza_Arequipenya,
        R.drawable.david_zapata_lovaton,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
    )
    private val candidatojlb4 = Candidato(
        "Cesar Mario Flores Ytusaca",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.cesar_mario_flores_ytusaca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
    )
    private val candidatojlb5 = Candidato(
        "Carlo Ramiro Aliaga Nuñez",
        Partido.Arequipa_transformacion,
        R.drawable.carlo_ramiro_aliaga_nuniez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.JOSE_LUIS_BUSTAMANTE_Y_RIVERO
    )
    //Candidatos Mariano Melgar
    private val candidatomm1 = Candidato(
        "Sergio Gonzales Apaza",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.sergio_gonzales_apaza,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MARIANO_MELGAR
    )
    private val candidatomm2 = Candidato(
        "Jose Maquera Torres",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.jose_maquera_torres,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MARIANO_MELGAR
    )
    private val candidatomm3 = Candidato(
        "Oscar Alfredo Ayala Arenas",
        Partido.Fuerza_Arequipenya,
        R.drawable.oscar_alfredo_ayala_arenas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MARIANO_MELGAR
    )
    private val candidatomm4 = Candidato(
        "Roberto Carlo Molina Diaz",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.roberto_carlo_molina_diaz,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MARIANO_MELGAR
    )
    //Candidatos Miraflores
    private val candidatomir1 = Candidato(
        "German Torres Chambi",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.german_torres_chambi,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MIRAFLORES
    )
    private val candidatomir2 = Candidato(
        "Marco NatonioCenty Lopez",
        Partido.Fuerza_Arequipenya,
        R.drawable.marco_antonio_centty_lopez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MIRAFLORES
    )
    private val candidatomir3 = Candidato(
        "Jose Roberto Roque Quispe",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.jose_roberto_roque_quispe,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MIRAFLORES
    )
    private val candidatomir4 = Candidato(
        "Pedro Ramiro Escobedo Aza",
        Partido.Renovacion_Popular,
        R.drawable.pedro_ramiro_escobedo_aza,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MIRAFLORES
    )
    private val candidatomir5 = Candidato(
        "Luis Angel Sanxhez Ñaupa",
        Partido.Podemos_Peru,
        R.drawable.luis_angel_sanchez_niaupa,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.MIRAFLORES
    )
    //Candidatos Paucarpata
    private val candidatopau1 = Candidato(
        "Marco Antonio Anco Huarachi",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.marco_antonio_anco_huarachi,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.PAUCARPATA
    )
    private val candidatopau2 = Candidato(
        "Esteban Llacchua Segovia",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.esteban_llacchua_segovia,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.PAUCARPATA
    )
    private val candidatopau3= Candidato(
        "Angel David Condori",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.angel_david_condori,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.PAUCARPATA
    )
    private val candidatopau4 = Candidato(
        "Alvaro Florentino Rojas Chavez",
        Partido.Fe_En_El_Peru,
        R.drawable.alvaro_florencio_rojas_chavez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.PAUCARPATA
    )
    private val candidatopau5 = Candidato(
        "Raul Gregorio Chara Chambi",
        Partido.Arequipa_transformacion,
        R.drawable.raul_gregorio_chara_chambi,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.PAUCARPATA
    )
    //candidatos de
    private val candidatosab1 = Candidato(
        "Herless Ronald Diaz Perea",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.herless_ronald_diaz_perea,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SABANDIA
    )
    private val candidatosab2 = Candidato(
        "Santos Albertano Salinas Valencia",
        Partido.Arequipa_Renace,
        R.drawable.santos_alberto_salinas_valencia,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SABANDIA
    )
    private val candidatosab3 = Candidato(
        "Victor Raul Pauca Calcina",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.victor_raul_pauca_calcina,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SABANDIA
    )
    private val candidatosab4 = Candidato(
        "Leslie Noelia Stephany Castillo Rodriguez",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.leslie_noelia_stephany_castillo_rodriguez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SABANDIA
    )
    private val candidatosab5 = Candidato(
        "Johel Agapito Calderon Taco",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.johel_agapito_calderon_taco,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SABANDIA
    )
    // Candidatos Sachaca
    private val candidatosach1 = Candidato(
        "Evaristo Florentino Calderon Nuñez",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.evaristo_florentino_calderon_nuniez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SACHACA
    )
    private val candidatosach2 = Candidato(
        "Ivan Fortunato Fernandez Febres",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.ivan_fortunato_fernandez_febres,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SACHACA
    )
    private val candidatosach3 = Candidato(
        "Miguel Angel Cuadros Paredes",
        Partido.Fuerza_Arequipenya,
        R.drawable.miguel_angel_cuadros_paredes,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SACHACA
    )
    private val candidatosach4 = Candidato(
        "Renzo ALonso Salas Herrera",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.renzo_alonso_salas_herrera,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SACHACA
    )
    private val candidatosach5 = Candidato(
        "Lissett Romina Diaz Valdez",
        Partido.Renovacion_Popular,
        R.drawable.lissett_romina_diaz_valdez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SACHACA
    )
    //Candidatos Socabaya
    private val candidatosoc1 = Candidato(
        "Zacarias Pfoccori Pumacallahue",
        Partido.Frente_Popular_Agricola_del_Peru,
        R.drawable.zacarias_pfoccori_pumacallahue,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SOCABAYA
    )
    private val candidatosoc2 = Candidato(
        "Juan Carlos Ortiz Villalta",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.juan_carlos_ortiz_villalta,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SOCABAYA
    )
    private val candidatosoc3 = Candidato(
        "Glissolym Soledad Monataño Condori",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.glissolym_soledad_montanio_condori,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SOCABAYA
    )
    private val candidatosoc4 = Candidato(
        "Romulo Freddy Teran Trigoso Soto",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.romulo_freddy_teran_trigoso_soto,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SOCABAYA
    )
    private val candidatosoc5 = Candidato(
        "Pedro Jesus Fuentes Lopez",
        Partido.Fe_En_El_Peru,
        R.drawable.pedro_jesus_fuentes_lopez,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.SOCABAYA
    )
    //Candidatos Tiabaya
    private val candidatotia1 = Candidato(
        "Julio Renato Marca Mamani",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.julio_renato_marca_mamani,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.TIABAYA
    )
    private val candidatotia2 = Candidato(
        "Nelson Godofredo Delgado Dueños",
        Partido.Yo_Arequipa,
        R.drawable.nelson_godofredo_delgado_duenias,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.TIABAYA
    )
    private val candidatotia3 = Candidato(
        "Eduardo Mejia Vargas",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.eduardo_mejia_vargas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.TIABAYA
    )
    private val candidatotia4 = Candidato(
        "Lizeth Maribel Mamani Corrales",
        Partido.Juntos_Por_El_Desarrollo_De_Arequipa,
        R.drawable.lizeth_maribel_mamani_corrales,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.TIABAYA
    )
    private val candidatotia5 = Candidato(
        "Rissy Paola Calderon Zeballos",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.rissy_paola_calderon_zeballos,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.TIABAYA
    )

    //Candidatos Uchumayo
    private val candidatouchu1 = Candidato(
        "Alberto Guillermo Zevallos Torres",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.alberto_guillermo_zevallos_torres,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.UCHUMAYO
    )
    private val candidatouchu2 = Candidato(
        "Jorge Luis Alvarez Briceño",
        Partido.Arequipa_transformacion,
        R.drawable.jorge_luis_alvarez_bricenio,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.UCHUMAYO
    )
    private val candidatouchu3 = Candidato(
        "Jorge Alfredo Tapia Neira",
        Partido.Yo_Arequipa,
        R.drawable.jorge_alfredo_tapia_neira,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.UCHUMAYO
    )
    private val candidatouchu4 = Candidato(
        "Gualberto Chilo Monroy",
        Partido.Renovacion_Popular,
        R.drawable.gualberto_calixto_chilo_monroy,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.UCHUMAYO
    )
    private val candidatouchu5 = Candidato(
        "Hardin Jose Abril Velarde",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.hardin_jose_abril_velarde,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.UCHUMAYO
    )
    //Candidatos Ynahuara
    private val candidatoyana1 = Candidato(
        "Ernesto Jesus Montoya Mogrovejo",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.ernesto_jesus_montoya_mogrovejo,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YANAHUARA
    )
    private val candidatoyana2 = Candidato(
        "Sergio Javier Bolliger Marroquin",
        Partido.Arequipa_transformacion,
        R.drawable.sergio_javier_bolliger_marroquin,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YANAHUARA
    )
    private val candidatoyana3 = Candidato(
        "Jose Augusto Arce Paredes",
        Partido.Partido_Democratico_Somos_Peru,
        R.drawable.jose_augusto_arce_paredes,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YANAHUARA
    )
    private val candidatoyana4 = Candidato(
        "Aldo Alonso Franco Salinas",
        Partido.Movimiento_Regional_Reveladora,
        R.drawable.aldo_alonso_franco_salinas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YANAHUARA
    )
    private val candidatoyana5 = Candidato(
        "Pilar Teresa Vera Madariaga",
        Partido.Accion_Popular,
        R.drawable.pilar_teresa_vera_madariaga,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YANAHUARA
    )
    //Candidatos Yura
    private val candidatoyur1 = Candidato(
        "Mirtha Mavel Ruelas Casillas",
        Partido.Arequipa_Tradicion_Futuro,
        R.drawable.mirtha_mavel_ruelas_casillas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YURA
    )
    private val candidatoyur2 = Candidato(
        "Maria Magdalena Llasaca Ala",
        Partido.Fuerza_Arequipenya,
        R.drawable.maria_magdalena_llasaca_ala,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YURA
    )
    private val candidatoyur3 = Candidato(
        "Julio Jose Fuentes Barriga",
        Partido.Arequipa_Renace,
        R.drawable.julio_jose_fuentes_barriga,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YURA
    )
    private val candidatoyur4 = Candidato(
        "Ruben Manuel Pari Cañaza",
        Partido.Yo_Arequipa,
        R.drawable.ruben_manuel_pari_caniazaca,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YURA
    )
    private val candidatoyur5 = Candidato(
        "Luis Javier Fuentes Salas",
        Partido.Movimineto_Regional_Arequipa_Avancemos,
        R.drawable.luis_javier_fuentes_salas,
        "Mas informacion:  ipsum, dolor sit amet consectetur adipisicing elit. Cum nam ab quae impedit repudiandae, sunt pariatur facere amet " +
                "obcaecati iusto repellat, officiis incidunt rerum nesciunt necessitatibus? Culpa voluptas autem excepturi!",
        Distrito.YURA
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
        //Candidatos Characato
        candidatos.add(candidatochr1)
        candidatos.add(candidatochr2)
        candidatos.add(candidatochr3)
        candidatos.add(candidatochr4)
        candidatos.add(candidatochr5)
        candidatos.add(candidatochr6)
        candidatos.add(candidatochr7)
        candidatos.add(candidatochr8)
        candidatos.add(candidatochr9)
        candidatos.add(candidatochr10)
        candidatos.add(candidatochr11)
        //candidatos chiguata
        candidatos.add(candidatochi1)
        candidatos.add(candidatochi2)
        candidatos.add(candidatochi3)
        candidatos.add(candidatochi4)
        candidatos.add(candidatochi5)
        candidatos.add(candidatochi6)
        candidatos.add(candidatochi7)
        //Candidatos Javobo HUnter
        candidatos.add(candidatohunt1)
        candidatos.add(candidatohunt2)
        candidatos.add(candidatohunt3)
        candidatos.add(candidatohunt4)
        candidatos.add(candidatohunt5)
        //Candidatos Jose Luis Bustamente y Rivero
        candidatos.add( candidatojlb1)
        candidatos.add( candidatojlb2)
        candidatos.add( candidatojlb3)
        candidatos.add( candidatojlb4)
        candidatos.add( candidatojlb5)
        //Candiadtos Mariano Melgar
        candidatos.add(candidatomm1)
        candidatos.add(candidatomm2)
        candidatos.add(candidatomm3)
        candidatos.add(candidatomm4)
        //Candidatos Miraflores
        candidatos.add(candidatomir1)
        candidatos.add(candidatomir2)
        candidatos.add(candidatomir3)
        candidatos.add(candidatomir4)
        candidatos.add(candidatomir5)
        //Candidatos Paucarpata
        candidatos.add(candidatopau1)
        candidatos.add(candidatopau2)
        candidatos.add(candidatopau3)
        candidatos.add(candidatopau4)
        candidatos.add(candidatopau5)
    //Candidatos Sabandia
        candidatos.add(candidatosab1)
        candidatos.add(candidatosab2)
        candidatos.add(candidatosab3)
        candidatos.add(candidatosab4)
        candidatos.add(candidatosab5)
     //Candidatos Sachaca
        candidatos.add( candidatosach1)
        candidatos.add( candidatosach2)
        candidatos.add( candidatosach3)
        candidatos.add( candidatosach4)
        candidatos.add( candidatosach5)
     //Candidatos Socabaya
        candidatos.add( candidatosoc1)
        candidatos.add( candidatosoc2)
        candidatos.add( candidatosoc3)
        candidatos.add( candidatosoc4)
        candidatos.add( candidatosoc5)

    //Candidatos Tiabaya
        candidatos.add(candidatotia1)
        candidatos.add(candidatotia2)
        candidatos.add(candidatotia3)
        candidatos.add(candidatotia4)
        candidatos.add(candidatotia5)

    //Candidatos Uchumayo
        candidatos.add(candidatouchu1)
        candidatos.add(candidatouchu2)
        candidatos.add(candidatouchu3)
        candidatos.add(candidatouchu4)
        candidatos.add(candidatouchu5)
    //Candidatos Ynahuara
        candidatos.add(candidatoyana1)
        candidatos.add(candidatoyana2)
        candidatos.add(candidatoyana3)
        candidatos.add(candidatoyana4)
        candidatos.add(candidatoyana5)
    //Candidatos Yura
        candidatos.add(candidatoyur1)
        candidatos.add(candidatoyur2)
        candidatos.add(candidatoyur3)
        candidatos.add(candidatoyur3)
        candidatos.add(candidatoyur5)
    }

    fun getCandidatosPorDistrito(distrito: Distrito): List<Candidato> {
        return candidatos.filter { it.distrito == distrito }
    }

    fun getCandidatosPorPartido(partido: Partido): List<Candidato> {
        return candidatos.filter { it.partido == partido }
    }

}