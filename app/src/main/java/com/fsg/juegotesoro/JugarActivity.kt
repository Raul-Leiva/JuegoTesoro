package com.fsg.juegotesoro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class JugarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)
        var nombre = intent.getStringExtra("Jugar").toString()

        if (nombre != null) {
            var textViewNombre: TextView = findViewById(R.id.textViewNombre)
            textViewNombre.text = "Bienvenido al juego " +nombre
        }

    }
    fun botonCasilla(view: View){

    }
    fun botonSalir(view: View) {
        finish()
    }
}