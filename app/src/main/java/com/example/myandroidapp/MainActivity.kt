package com.example.myandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // button to switch to second activity and transfer user's name to second activity
        btnNext.setOnClickListener {
            val intent = Intent(this, SecondActivity2::class.java)
            intent.putExtra("Username", etUsername.text.toString())
            startActivity(intent)
        }

        // button to switch to third activity and transfer user's name to third activity
        btMTK.setOnClickListener{
            val intent = Intent(this, ThirdActivity3::class.java)
            intent.putExtra("Username", etUsername.text.toString())
            startActivity(intent)

        }




    }


}