package com.example.day4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.day4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)

        with(binding) {
            buttonLight.setOnClickListener {
                startActivity(Intent(this@MainActivity, LightActivity::class.java))
            }
            buttonCctv.setOnClickListener {
                startActivity(Intent(this@MainActivity, CctvActivity::class.java))
            }

            buttonReset.setOnClickListener {
                startActivity(Intent(this@MainActivity, DoorActivity::class.java))
            }

            buttonEv.setOnClickListener {
                startActivity(Intent(this@MainActivity, ElevatorActivity::class.java))
            }
        }
    }
}


