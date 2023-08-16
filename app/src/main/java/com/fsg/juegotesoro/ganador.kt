package com.fsg.juegotesoro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ganador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganador)
        val ganador = intent.getStringExtra("ganador").toString()

    }

    fun botonSalir(view: View) {
        val inicio = Intent(this, MainActivity::class.java)
        startActivity(inicio)

    }
}