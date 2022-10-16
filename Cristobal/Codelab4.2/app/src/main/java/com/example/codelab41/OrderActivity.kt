package com.example.codelab41

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class OrderActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val order = intent.getStringExtra("orden")
        val txtMsg: TextView = findViewById(R.id.txtOrder)
        txtMsg.text=order

        val spinner: Spinner = findViewById(R.id.spinner)
        if(spinner != null) spinner.onItemSelectedListener

        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.labels_array, android.R.layout.simple_spinner_dropdown_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        if(spinner != null) spinner.adapter = adapter
    }

    fun displayToast(message: String){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    fun onClick2(view: View){
        when(view.id){
            R.id.rbtn1 -> displayToast("Eres mu guap@")
            R.id.rbtn2 -> displayToast("Eres rico")
            R.id.rbtn3 -> displayToast("Eres un fiera")
        }

    }
}