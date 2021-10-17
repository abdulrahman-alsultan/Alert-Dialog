package com.example.simplebuttonlistener

import android.content.res.Resources
import android.graphics.Color
import android.graphics.Color.DKGRAY
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val input = findViewById<EditText>(R.id.et_input)
        val btn = findViewById<Button>(R.id.btn_submit)
        val display = findViewById<TextView>(R.id.tv_display)

        btn.setOnClickListener {
            display.text = input.text
        }

    }
}