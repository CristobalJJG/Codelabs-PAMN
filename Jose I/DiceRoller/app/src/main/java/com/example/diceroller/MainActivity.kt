package com.example.diceroller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val upButton: Button = findViewById(R.id.up_button)
        rollButton.setOnClickListener{ rollDice() }
        upButton.setOnClickListener{ rollAumenta() }
    }

    private fun rollAumenta() {
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text.equals("Hello World!")) {
            resultText.text = "1"
        }else if ( resultText.text.toString().toInt() < 6 ){
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }

    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
}