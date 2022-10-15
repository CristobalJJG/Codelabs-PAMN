package com.example.codelab14

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRestart: Button = findViewById(R.id.btnRestart)
        btnRestart.setOnClickListener { restart() }

        val btnCountUp: Button = findViewById(R.id.btnUp)
        btnCountUp.setOnClickListener{ countUp() }

    }

    private fun restart(){
        val texto: TextView = findViewById(R.id.txtCount)
        texto.text = "0"
    }

    private fun countUp(){
        val texto: TextView = findViewById(R.id.txtCount)
        texto.text= (texto.text.toString().toInt() + 1).toString()
    }
}