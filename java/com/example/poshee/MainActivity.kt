package com.example.poshee

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var ImageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ImageView=findViewById(R.id.imageView)

        ImageView.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)

        }
    }
}