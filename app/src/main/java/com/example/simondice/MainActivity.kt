package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var secuencia = ArrayList<String>()
        var ronda = secuencia.size
        var record = 0
        var velocidad = 1


        val bstart: Button = findViewById(R.id.bstart)
        val azul: Button = findViewById(R.id.azul)
        val amarillo: Button = findViewById(R.id.amarillo)
        val rojo: Button = findViewById(R.id.rojo)
        val verde: Button = findViewById(R.id.verde)

    }


    private fun ClickInicio(){
        Toast.makeText(, "juego iniciado", Toast.LENGTH_SHORT).show()



    }
}