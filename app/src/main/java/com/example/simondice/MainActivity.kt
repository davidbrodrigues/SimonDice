package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var secuencia = ArrayList<String>()
        var ronda = secuencia.size
        var record = 0
        var velocidad = 1


    }


    private fun ClickInicio(){
        bstart.setOnClickListener{
            ronda=1
            velocidad=1
        }

    }
}