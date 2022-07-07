package dev.araozu.laboratorio8

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.araozu.laboratorio2.R
import dev.araozu.laboratorio8.model.Candidato
import dev.araozu.laboratorio8.model.CandidatosManager
import dev.araozu.laboratorio8.model.Distrito
import dev.araozu.laboratorio8.model.Partido

val candidatoDefecto = Candidato(
    nombre = "No se ha encontrado ningún candidato.",
    partido = Partido.NINGUNO,
    foto = R.drawable.question_mark,
    biografia = "",
    distrito = Distrito.AREQUIPA,
)

/**
 * Muestra una tarjeta de un candidato
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TarjetaCandidato(candidato: Candidato) {
    val tarjetaAbierta = remember { mutableStateOf(false) }

    ElevatedCard(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.fillMaxWidth(),
        onClick = {
            android.util.Log.d("TARJETA", "click, $tarjetaAbierta")
            tarjetaAbierta.value = !tarjetaAbierta.value
        }
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            // modifier = Modifier.padding(horizontal = 10.dp),
        ) {
            Image(
                painter = painterResource(id = candidato.foto),
                contentDescription = "Imagen de perfil",
                modifier = Modifier
                    .height(150.dp)
                    // .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = candidato.nombre,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = candidato.partido.toString(),
                    fontWeight = FontWeight.Light,
                )
                Text(
                    text = candidato.distrito.toString(),
                    fontWeight = FontWeight.Light,
                )
            }
        }

        AnimatedVisibility(visible = tarjetaAbierta.value) {
            Text(
                text = candidato.biografia,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaCandidatos(titulo: String, lista: List<Candidato>, onBack: () -> Unit) {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(titulo) },
                navigationIcon = {
                    IconButton(onClick = { onBack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        },
        content = { innerPadding ->
            LazyColumn(contentPadding = innerPadding) {
                items(lista) {
                    TarjetaCandidato(it)
                    Spacer(modifier = Modifier.height(15.dp))
                }
                item {
                    Spacer(modifier = Modifier.height(100.dp))
                }
            }
        }
    )
}

/**
 * Muestra una lista de candidatos filtrados segun un distrito
 */
@Composable
fun ListCandidatosDistrito(
    distritoStr: String,
    navController: NavController,
) {
    val distrito = Distrito.fromString(distritoStr)
    val listaCandidatos: List<Candidato> =
        if (distrito == null) {
            arrayListOf(candidatoDefecto)
        } else {
            val candidatos = CandidatosManager.getCandidatosPorDistrito(distrito)
            candidatos.ifEmpty { arrayListOf(candidatoDefecto) }
        }

    ListaCandidatos(
        titulo = distrito?.toString() ?: "Distritos",
        lista = listaCandidatos,
        onBack = {
            navController.navigate(
                route = Destinations.DistritosScreen.route
            )
        },
    )
}


/**
 * Muestra una lista de candidatos filtrados segun un partido politico
 */
@Composable
fun ListCandidatosPartido(
    partidoStr: String,
    navController: NavController,
) {
    val partido = Partido.fromString(partidoStr)
    val listaCandidatos: List<Candidato> =
        CandidatosManager
            .getCandidatosPorPartido(partido)
            .ifEmpty { arrayListOf(candidatoDefecto) }

    ListaCandidatos(
        titulo = partido.toString(),
        lista = listaCandidatos,
        onBack = {
            navController.navigate(
                route = Destinations.PartidosScreen.route
            )
        },
    )
}
