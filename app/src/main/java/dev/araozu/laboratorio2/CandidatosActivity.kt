package dev.araozu.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.model.Partido
import dev.araozu.laboratorio2.ui.theme.Laboratorio2Theme

val partidoEjemplo = Partido(nombre = "APLA")

val candidatoEjemplo = Candidato(
    nombre = "Juan Perez",
    partido = partidoEjemplo,
    foto = R.drawable.ic_launcher_background,
    biografia = "Juan Perez es un candidato del partido politico APLA para Cayma",
    propuestas = arrayListOf("Propuesta 1", "Propuesta 2", "Propuesta 3"),
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
                    TarjetaCandidato(candidatoEjemplo)
                }
            }
        }
    }
}

@Composable
fun TarjetaCandidato(candidato: Candidato) {
    Text(text = "Hola ${candidato.nombre}")
}
