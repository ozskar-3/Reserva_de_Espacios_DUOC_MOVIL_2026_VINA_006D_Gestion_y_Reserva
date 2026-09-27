package com.example.reserva_de_espacios.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.reserva_de_espacios.R

@Composable
fun MensajeBienvenida(){
    Text(text = "Bienvenido",
        fontSize = 23.sp,
        fontWeight = FontWeight.Bold,
        color = Color.LightGray)
}

@Composable
@Preview(showBackground = true)
fun MensajePreview(){
    MensajeBienvenida()
}

@Composable
fun LogoApp(){
    Image(
        painter = painterResource(R.drawable.duocuc),
        contentDescription = "Logo DuocUC",
        modifier = Modifier.scale(0.6f).width(120.dp),
        contentScale = ContentScale.Fit
    )
}

@Composable
@Preview
fun LogoPreview(){
    LogoApp()
}

@Composable
fun Bodylogin(){
    Column {
        LogoApp()
        MensajeBienvenida()
        AppBoton()
    }

}

@Composable
@Preview
fun BodyPreview(){
    Bodylogin()
}

@Composable
fun AppBoton(){
    Button(
        onClick = {}
    ) {
        Text(text = "Iniciar Sesion")
    }
}

@Composable
@Preview
fun BotonPreview(){
    AppBoton()
}