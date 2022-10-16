package com.example.codelab41

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val order = intent.getStringExtra("orden")
        val txtMsg: TextView = findViewById(R.id.txtOrder)
        txtMsg.text=order
    }
}