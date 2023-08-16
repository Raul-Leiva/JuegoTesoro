package com.fsg.juegotesoro

import android.graphics.Color
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class JugarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)

        val nombre = intent.getStringExtra("Jugar").toString()
        val textViewNombre: TextView = findViewById(R.id.textViewNombre)

        textViewNombre.text = "Bienvenido al juego " + nombre


    }
    fun botonCasilla(view: View) {
        var boton = view as Button

        if (boton.tag.equals("$")){
            Toast.makeText(this, "¡Enhorabuena! Has ganado", Toast.LENGTH_SHORT).show()
            boton.setBackgroundColor(Color.GREEN)
        }
        if (boton.tag.equals("#")){
            Toast.makeText(this, "¡Vaya! Has pedido", Toast.LENGTH_SHORT).show()
            boton.setBackgroundColor(Color.RED)
        }
        if (boton.tag.equals("V")){
            boton.text = "S"
            boton.setBackgroundColor(Color.BLUE)
        }
    }

    fun botonSalir(view: View) {
        finish()
    }
}

