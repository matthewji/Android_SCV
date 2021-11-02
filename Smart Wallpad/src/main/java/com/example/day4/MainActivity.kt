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

        val buttonCctv: Button = findViewById(R.id.button_cctv)

        buttonLight.setOnClickListener {
            startActivity(Intent(this, CctvActivity::class.java))
        }

        val buttonDoor: Button = findViewById(R.id.button_reset)

        buttonLight.setOnClickListener {
            startActivity(Intent(this, CctvActivity::class.java))
        }

        val buttonElevator: Button = findViewById(R.id.button_ev)

        buttonLight.setOnClickListener {
              startActivity(Intent(this, ElevatorActivity::class.java))

        }

    }
}


