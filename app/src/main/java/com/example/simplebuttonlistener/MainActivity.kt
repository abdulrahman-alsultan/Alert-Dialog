package com.example.simplebuttonlistener

import android.content.res.Resources
import android.graphics.Color
import android.graphics.Color.DKGRAY
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val xmlButton = findViewById<Button>(R.id.xml_btn)
        xmlButton.setOnClickListener {
            Toast.makeText(this, "XML button was clicked", Toast.LENGTH_LONG).show()
        }

        val height = Resources.getSystem().displayMetrics.heightPixels

        val constraint = findViewById<ConstraintLayout>(R.id.constraint)
        val kotlinButton = Button(this)
        kotlinButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT,
        )
        kotlinButton.text = "Kotlin"
        kotlinButton.y = (height / 2).toFloat() + 30
        kotlinButton.setBackgroundColor(Color.CYAN)
        kotlinButton.gravity = Gravity.CENTER

        kotlinButton.setOnClickListener {
            Toast.makeText(this, "Kotlin button was clicked", Toast.LENGTH_LONG).show()

        }
        constraint.addView(kotlinButton)

    }
}