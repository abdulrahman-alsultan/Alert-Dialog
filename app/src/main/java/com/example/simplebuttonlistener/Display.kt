package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val txt = intent.getStringExtra("text")
        val tv = findViewById<TextView>(R.id.textView)
        tv.text = txt


    }
}