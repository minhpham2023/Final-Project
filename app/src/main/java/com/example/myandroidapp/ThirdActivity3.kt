package com.example.myandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third3.*

class ThirdActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third3)

        // declare wcuser to receive user's name from main activity
        val hluser = intent.getStringExtra("Username")

        tvWC1.text = getString(R.string.welcome_messages,hluser)
        if (hluser =="")
        {
            tvWC1.text=getString(R.string.welcome_user)
        }

        btMK.setOnClickListener {
            mileToKM()
        }


    }

    private fun mileToKM() {
        try {
            val celDouble = etMile.text.toString().toDouble()
            val resultKM = celDouble * 1.609
            tvKilometerResult.text = resultKM.toString()
        }catch (e:java.lang.NumberFormatException){
            println(e.localizedMessage)
            tvKilometerResult.text = getString(R.string.nonsense)

        }

    }


}