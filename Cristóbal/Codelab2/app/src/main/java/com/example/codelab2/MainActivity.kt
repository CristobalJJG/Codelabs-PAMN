package com.example.codelab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.btnCountUp)
        countUpButton.setOnClickListener { countUp() }
    }

    //RollDice Task añadir botón y cambiar texto
    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.textView)
        resultText.text = "Pulsaste el botón, qué fiera"

        val randomInt = (1..6).random()
        val numero: TextView = findViewById(R.id.numero)
        numero.text = randomInt.toString()

        Toast.makeText(this, "Butón clicado",
            Toast.LENGTH_SHORT).show()
    }

    //Coding challenge sumar 1
    private fun countUp(){
        val countText: TextView = findViewById(R.id.txtCountUp)
        val count = countText.text.toString()
        countText.text = (count.toInt() + 1).toString()
    }
}