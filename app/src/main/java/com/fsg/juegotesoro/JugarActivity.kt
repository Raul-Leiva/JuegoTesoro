package com.fsg.juegotesoro

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.iterator


abstract class JugarActivity : AppCompatActivity() {

    private var boton = Button(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)

        val nombre = intent.getStringExtra("Jugar").toString()
        val layoutBotones: LinearLayout = findViewById(R.id.layoutBotones)

        val textViewNombre: TextView = findViewById(R.id.textViewNombre)
        textViewNombre.text = "Bienvenido al juego " + nombre


        val listaBotones = ArrayList<Button>()
            for (i in 1..25) {
                boton.text = ""
                listaBotones.add(boton)
            }

    }

    fun botonCasilla(view: View) {
        boton.text = "S"
    }

    fun botonSalir(view: View) {
        finish()
    }
}

