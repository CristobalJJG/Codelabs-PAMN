package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.logging.Logger.global

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
        val resultImage: ImageView = findViewById(R.id.dice_image)

        if (resultImage.drawable.equals(R.drawable.dice_1)) {
            resultImage.setImageResource(R.drawable.dice_2)
        }
        /*} else if (resultImage.drawable.equals(R.drawable.dice_2)){
            resultImage.setImageResource(R.drawable.dice_3)
        } else if (resultImage.drawable.equals(R.drawable.dice_3)){
            resultImage.setImageResource(R.drawable.dice_4)
        } else if (resultImage.drawable.equals(R.drawable.dice_4)){
            resultImage.setImageResource(R.drawable.dice_5)
        } else {
            resultImage.setImageResource(R.drawable.dice_6)
        }*/

    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        val drawableImage = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(drawableImage)
    }
}