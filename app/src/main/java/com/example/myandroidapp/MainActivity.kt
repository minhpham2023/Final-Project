package com.example.myandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Next button, to switch to second Activity and transfer user's name to new activity
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity2::class.java)
            intent.putExtra("Username", etUsername.text.toString())
            startActivity(intent)
        }

        btMTK.setOnClickListener{
            val intent = Intent(this, ThirdActivity3::class.java)
            intent.putExtra("Username", etUsername.text.toString())
            startActivity(intent)

        }




    }


}