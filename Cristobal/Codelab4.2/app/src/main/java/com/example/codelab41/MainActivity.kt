package com.example.codelab41

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var order: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showMessage(message: String){
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun showDonutOrder(view: View){
        showMessage(getString(R.string.donut_order_message))
        order = "Donusito"
    }
    fun showIceCreamOrder(view: View){
        showMessage(getString(R.string.ice_cream_order_message))
        order = "Heladito"
    }
    fun showFroyoOrder(view: View){
        showMessage(getString(R.string.froyo_order_message))
        order = "Yogursito"
    }

    fun onClick(view: View){
        val intent: Intent = Intent(this,OrderActivity::class.java)
        intent.putExtra("orden", order)
        startActivity(intent)
    }
}