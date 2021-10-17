package com.example.simplebuttonlistener


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlert = findViewById<Button>(R.id.btn_alert)



        btnAlert.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            val view = layoutInflater.inflate(R.layout.custom, null)

            builder.setView(view)

            val tvBtn = view.findViewById<Button>(R.id.custom_btn_tv)
            val goBtn = view.findViewById<Button>(R.id.custom_btn_go)
            val tv = view.findViewById<TextView>(R.id.custom_tv)
            val et = view.findViewById<EditText>(R.id.custom_et)

            builder.setNegativeButton("Close"){_, _ ->}



            builder.create().show()

            tvBtn.setOnClickListener(View.OnClickListener {
                tv.text = et.text
            })

            goBtn.setOnClickListener {
                val intent = Intent(this, Display::class.java)
                intent.putExtra("text", "${et.text}")
                startActivity(intent)
            }
        }

    }


}