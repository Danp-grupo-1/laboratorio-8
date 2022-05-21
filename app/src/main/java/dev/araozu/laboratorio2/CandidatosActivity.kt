package dev.araozu.laboratorio2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.model.CandidatosManager
import dev.araozu.laboratorio2.model.Distrito
import dev.araozu.laboratorio2.model.Partido

val candidatoDefecto = Candidato(
    nombre = "No se ha encontrado ningún candidato.",
    partido = Partido.NINGUNO,
    foto = R.drawable.question_mark,
    biografia = "",
    propuestas = arrayListOf(),
    distrito = Distrito.AREQUIPA,
)

@Composable
fun TarjetaCandidato(candidato: Candidato) {
    Surface(
        shape = MaterialTheme.shapes.medium,
        elevation = 6.dp,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.Top,
            modifier = Modifier.padding(10.dp),
        ) {
            Image(
                painter = painterResource(id = candidato.foto),
                contentDescription = "Imagen de perfil",
                modifier = Modifier
                    .height(50.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(text = candidato.nombre, fontSize = 20.sp, fontWeight = FontWeight.Medium)
                Text(
                    text = candidato.partido.toString(),
                    fontWeight = FontWeight.Light,
                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(text = candidato.biografia)

                if (candidato.propuestas.isNotEmpty()) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Propuestas:",
                        fontWeight = FontWeight.Medium,
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    for (propuesta in candidato.propuestas) {
                        Text(propuesta)
                    }
                }
            }
        }
    }
}

@Composable
fun ListCandidatosDistrito(
    distritoStr: String
) {
    val distrito = Distrito.fromString(distritoStr)
    val listaCandidatos: List<Candidato> =
        if (distrito == null) {
            arrayListOf(candidatoDefecto)
        } else {
            val candidatos = CandidatosManager.getCandidatosPorDistrito(distrito)
            candidatos.ifEmpty { arrayListOf(candidatoDefecto) }
        }


    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        item {
            Text(
                text = distrito?.toString() ?: "Distritos",
                style = TextStyle(
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black
                ),
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
        items(listaCandidatos) {
            TarjetaCandidato(it)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}


@Composable
fun ListCandidatosPartido(
    partidoStr: String
) {
    val partido = Partido.fromString(partidoStr)
    val listaCandidatos: List<Candidato> =
        CandidatosManager
            .getCandidatosPorPartido(partido)
            .ifEmpty { arrayListOf(candidatoDefecto) }


    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        item {
            Text(
                text = partido.toString(),
                style = TextStyle(
                    color = Color.Blue,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black
                ),
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
        items(listaCandidatos) {
            TarjetaCandidato(it)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Preview
@Composable
fun Prev() {
    ListCandidatosDistrito(distritoStr = "Arequipa")
}