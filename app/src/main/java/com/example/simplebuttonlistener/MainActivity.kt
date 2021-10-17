package com.example.simplebuttonlistener


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etToast = findViewById<EditText>(R.id.et_toast)
        val etTv = findViewById<EditText>(R.id.et_tv)
        val etNewActivity = findViewById<EditText>(R.id.et_new_activity)

        val btnTv = findViewById<Button>(R.id.btn_tv)
        val btnToast = findViewById<Button>(R.id.btn_toast)
        val btnNewActivity = findViewById<Button>(R.id.btn_new_activity)

        val display = findViewById<TextView>(R.id.tv_display)

        btnTv.setOnClickListener {
            display.text = etTv.text
        }

        btnToast.setOnClickListener {
            Toast.makeText(this, "${etToast.text}", Toast.LENGTH_LONG).show()
        }

        btnNewActivity.setOnClickListener {
            val intent = Intent(this, DisplayText::class.java)
            intent.putExtra("text", "${etNewActivity.text}")
            startActivity(intent)
        }

    }
}