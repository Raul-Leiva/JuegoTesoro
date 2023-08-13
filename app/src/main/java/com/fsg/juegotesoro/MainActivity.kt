package com.fsg.juegotesoro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun botonJugar(view: View) {
        val nombre: EditText = findViewById(R.id.editTextNombre)

        val jugar = Intent(this, JugarActivity::class.java)

        jugar.putExtra("Jugar", nombre.text.toString())
        startActivity(jugar)

    }

    fun botonSalir(view: View) {
        finish()
    }
}