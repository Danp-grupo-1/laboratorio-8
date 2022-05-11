package dev.araozu.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.model.Partido
import dev.araozu.laboratorio2.ui.theme.Laboratorio2Theme

val partidoEjemplo = Partido(nombre = "APLA")

val candidatoEjemplo = Candidato(
    nombre = "Mono NFT",
    partido = partidoEjemplo,
    foto = R.drawable.mono_nft,
    biografia = "Mono NFT es un candidato del partido politico APLA para Cayma, creado en 2019",
    propuestas = arrayListOf("Legalizar Bitcoin", "Legalizar NFT", "Regular el acceso a internet"),
)

class CandidatosActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TarjetaCandidato(/*candidatoEjemplo*/)
                }
            }
        }
    }
}

@Preview
@Composable
fun TarjetaCandidato(/*candidato: Candidato*/) {
    val candidato = candidatoEjemplo
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
                painter = painterResource(id = candidatoEjemplo.foto),
                contentDescription = "Imagen de perfil",
                modifier = Modifier
                    .height(50.dp)
                    .clip(CircleShape),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                horizontalAlignment = Alignment.Start,
            ) {
                Text(text = candidato.nombre, fontSize = 30.sp, fontWeight = FontWeight.Medium)
                Text(
                    text = candidato.partido.nombre,
                    fontWeight = FontWeight.Light,
                )
                Spacer(modifier = Modifier.height(20.dp))

                Text(text = candidato.biografia)

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























