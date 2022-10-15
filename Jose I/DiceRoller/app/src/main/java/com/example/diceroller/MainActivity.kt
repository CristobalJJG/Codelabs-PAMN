package com.example.diceroller

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    var num: Int=1
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
        val drawableImage = when (num) {
            1 -> R.drawable.dice_2
            2 -> R.drawable.dice_3
            3 -> R.drawable.dice_4
            4 -> R.drawable.dice_5
            5 -> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        if(num<=6){num++}
        resultImage.setImageResource(drawableImage)


    }

    private fun rollDice(){
        //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val resultImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        num = randomInt.toInt()
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