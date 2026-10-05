package com.example.reserva_de_espacios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.reserva_de_espacios.ui.Bodylogin
import com.example.reserva_de_espacios.ui.PantallaBase
import com.example.reserva_de_espacios.ui.theme.Reserva_de_EspaciosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Reserva_de_EspaciosTheme {
                PantallaPrincipal()
            }
        }
    }
}

object Rutas {
    const val INICIO = "inicio"
    const val LOGIN = "login"
    const val CALENDARIO = "calendario"
    const val BUSCAR = "buscar"
    const val RESERVAS = "reservas"
}

@Composable
fun PantallaPrincipal(onSalir: () -> Unit) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Rutas.LOGIN
    ) {
        composable(route = Rutas.LOGIN) {
            PantallaLogin()
        }
    }
}

@Composable
private fun PantallaLogin(onIrAPerfil: () -> Unit = {}, onSalir: () -> Unit = {}) {
    PantallaBase(titulo = "Iniciar Sesión", onVolver = onSalir) {
        Bodylogin()
    }
}