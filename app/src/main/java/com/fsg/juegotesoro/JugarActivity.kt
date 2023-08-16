package com.fsg.juegotesoro

import android.content.Context
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
    var numeroJugadas: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jugar)

        val nombre = intent.getStringExtra("Jugar").toString()
        val textViewNombre: TextView = findViewById(R.id.textViewNombre)

        textViewNombre.text = "Bienvenido al juego " + nombre

        var listaBotones: ArrayList<Button> = ArrayList(25)
        listaBotones.add(findViewById(R.id.boton0))
        listaBotones.add(findViewById(R.id.boton1))
        listaBotones.add(findViewById(R.id.boton2))
        listaBotones.add(findViewById(R.id.boton3))
        listaBotones.add(findViewById(R.id.boton4))
        listaBotones.add(findViewById(R.id.boton5))
        listaBotones.add(findViewById(R.id.boton6))
        listaBotones.add(findViewById(R.id.boton7))
        listaBotones.add(findViewById(R.id.boton8))
        listaBotones.add(findViewById(R.id.boton9))
        listaBotones.add(findViewById(R.id.boton10))
        listaBotones.add(findViewById(R.id.boton11))
        listaBotones.add(findViewById(R.id.boton12))
        listaBotones.add(findViewById(R.id.boton13))
        listaBotones.add(findViewById(R.id.boton14))
        listaBotones.add(findViewById(R.id.boton15))
        listaBotones.add(findViewById(R.id.boton16))
        listaBotones.add(findViewById(R.id.boton17))
        listaBotones.add(findViewById(R.id.boton18))
        listaBotones.add(findViewById(R.id.boton19))
        listaBotones.add(findViewById(R.id.boton20))
        listaBotones.add(findViewById(R.id.boton21))
        listaBotones.add(findViewById(R.id.boton22))
        listaBotones.add(findViewById(R.id.boton23))
        listaBotones.add(findViewById(R.id.boton24))

        var numeroAleatorioBomba: Int = (0..24).random()
        listaBotones[numeroAleatorioBomba].tag = "#"
        var numeroAleatorioTesoro: Int = (0..24).random()
        if(numeroAleatorioBomba != numeroAleatorioTesoro) {
            listaBotones[numeroAleatorioTesoro].tag = "$"
        } else{
            listaBotones[numeroAleatorioBomba].tag = "#"
        }
    }
fun verRecord(){
    var sharedPreferences = getSharedPreferences("Juego", Context.MODE_PRIVATE)
    var recordAnterior = sharedPreferences.getInt("Record", -1)

    if (recordAnterior < numeroJugadas){
        Toast.makeText(this, "Nuevo Record!!", Toast.LENGTH_SHORT).show()
        var editor = sharedPreferences.edit()
        editor.putInt("Record", numeroJugadas)
        editor.commit()
    }
}
    fun botonCasilla(view: View) {
        numeroJugadas ++
        var boton = view as Button
        var etiquetaBoton: String? = boton.tag as String?

        if (etiquetaBoton != null && etiquetaBoton.equals("$")){
            Toast.makeText(this, "¡Enhorabuena! Has ganado", Toast.LENGTH_SHORT).show()
            boton.setBackgroundColor(Color.GREEN)
            finish()
        }
        else if (etiquetaBoton != null && etiquetaBoton.equals("#")){
            Toast.makeText(this, "¡Vaya! Has pedido", Toast.LENGTH_SHORT).show()
            boton.setBackgroundColor(Color.RED)
            verRecord()
            finish()
        }
        else{
            boton.text = "S"
            boton.setBackgroundColor(Color.BLUE)
            verRecord()
        }
    }

    fun botonSalir(view: View) {
        finish()
    }
}

