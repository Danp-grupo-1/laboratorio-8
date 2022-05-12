package dev.araozu.laboratorio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.lab02.compose.BotonDistrito
import com.lab02.compose.listaDistritos
import dev.araozu.laboratorio2.model.Candidato
import dev.araozu.laboratorio2.model.CandidatosManager
import dev.araozu.laboratorio2.model.Distrito
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

@Composable
fun ListCandidatos(
    distrito:String
){
    //ACA se debe crear un Distrito a partir de los Enum y el string dsitrito que llega
    val distrito = Distrito.fromString("AREQUIPA")
    var listaCandidatos = distrito?.let { CandidatosManager.getCandidatos(it) } ?: arrayListOf(
        candidatoEjemplo)

    LazyColumn(contentPadding = PaddingValues(16.dp)){
        item { Text(text = "Distritos de la provincia de Arequipa",
            style = TextStyle(color = Color.Blue,fontSize = 20.sp,fontWeight = FontWeight.Black))
        }
        items(listaCandidatos){
            TarjetaCandidato(it)
        }
    }
}






















