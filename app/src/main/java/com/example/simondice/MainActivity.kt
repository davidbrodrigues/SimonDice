package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // variables
        var random = (0..3).random()
        val cuatroColores = arrayOf("Verde", "Amarillo", "Azul", "Rojo")
        val todosLosColores: ArrayList<String> = arrayListOf(cuatroColores[random])
        val iniciar = findViewById<Button>(R.id.bstart)
        val arrayFuncionesColores = arrayOf(Green::class.java, Yellow::class.java, Blue::class.java, Red::class.java)

        // Colores del juego random
        for(i in 0..3){
            random = (0..3).random()
            todosLosColores.add(cuatroColores[random])
        }

        // boton de inicio del juego
        bstart.setOnClickListener {
            val intento = intento(this@MainActivity, arrayFuncionesColores[random])
            intento.putStringArrayListExtra("colores", todosLosColores)
            intento.putExtra("contador", 0)
            intento.putExtra("puntuacion", 0)
            startActivity(intento)

    }

}