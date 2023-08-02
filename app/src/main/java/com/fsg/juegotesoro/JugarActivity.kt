package com.fsg.juegotesoro

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Scanner
import kotlin.random.Random


abstract class JugarActivity : AppCompatActivity() {
    var lector = Scanner(System.`in`)
    val VACIO = 'V'
    val TESORO = '€'
    val MINA = '#'
    val SELECCIONADO = 'S'

    val NUMERO_CASILLAS = 5
    lateinit var tablero: Array<CharArray>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)
        var nombre = intent.getStringExtra("Jugar").toString()

        if (nombre != null) {
            var textViewNombre: TextView = findViewById(R.id.textViewNombre)
            textViewNombre.text = "Bienvenido al juego " + nombre
        }

                var colocado = false;
                do{
                    var fila = Random(NUMERO_CASILLAS);
                    var columna = Random(NUMERO_CASILLAS);
                    if (tablero[fila.nextInt()][columna.nextInt()] == VACIO){
                      //  tablero[fila.nextInt()][columna.nextInt()] = elemento
                        colocado = true;
                    }
                } while (!colocado);

           /*     for (fila in 0 && fila<NUMERO_CASILLAS && fila+1){
            for (int columna = 0; columna < NUMERO_CASILLAS; columna++){
            tablero[fila][columna] = VACIO;
        }
        } */

    }
    fun botonCasilla(view: View){

    }
    fun botonSalir(view: View) {
        finish()
    }
}

