package com.example.calculadora

import android.icu.text.DecimalFormat
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val SUMA = "+"
    val RESTA = "-"
    val MULTIPLICACION = "*"
    val DIVISION = "/"
    val PORCENTAJE = "%"

    var operacionActual = ""
    var primNum: Double? = null
    var segNum: Double? = null

    lateinit var ValTemp:TextView
    lateinit var ValFinal:TextView

    lateinit var formatoDecimal:DecimalFormat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        formatoDecimal = DecimalFormat("#.#####")
        ValTemp = findViewById(R.id.ValTemp)
        ValFinal = findViewById(R.id.ValFinal)
    }
    fun cambioOperador(b:View){
        val boton:Button = b as Button
        if(boton.text.toString().trim()== "/"){
            operacionActual="/"
        }else if(boton.text.toString().trim()== "X"){
            operacionActual="*"
        }else {
            operacionActual = boton.text.toString().trim()
        }
    }
}