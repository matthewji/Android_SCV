package com.example.day4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLight: Button = findViewById(R.id.button_light)

        buttonLight.setOnClickListener {
            startActivity(Intent(this, LightActivity::class.java))
        }
    }
}