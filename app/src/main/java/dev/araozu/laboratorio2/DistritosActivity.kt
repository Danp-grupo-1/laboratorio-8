package com.lab02.compose


import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.araozu.laboratorio2.Destinations
import dev.araozu.laboratorio2.model.Distrito


var listaDistritos = Distrito.values();

@Composable
fun BotonDistrito(distrito:Distrito, navController: NavController){
    Row(modifier= Modifier.fillMaxWidth()){
        Button(onClick = { navController.navigate(route = Destinations.CandidatosScreen.createRoute(distrito.name)) }) {
            Text(text=distrito.name,
                style= TextStyle(fontSize = 20.sp,fontWeight = FontWeight.Light,fontStyle = FontStyle.Italic
                ))
        }
    }
}

@Composable
fun ListDistritos(navController: NavController){
    LazyColumn(contentPadding = PaddingValues(16.dp)){
        item { Text(text = "Distritos de la provincia de Arequipa",
            style = TextStyle(color = Color.Blue,fontSize = 20.sp,fontWeight = FontWeight.Black))
        }
        items(listaDistritos){
            BotonDistrito(it, navController)
        }
    }
}
