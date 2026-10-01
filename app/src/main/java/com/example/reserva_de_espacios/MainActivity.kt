package com.example.reserva_de_espacios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.reserva_de_espacios.ui.theme.Reserva_de_EspaciosTheme
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

object Rutas{
    const val INICIO ="inicio"
    const val LOGIN = "login"
    const val CALENDARIO = "calendario"
    const val BUSCAR = "buscar"
    const val RESERVAS = "reservas"
}

@Composable
fun pantalla(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.LOGIN){
        composable (route= Rutas.LOGIN){

        }

    }
}