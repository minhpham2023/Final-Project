package com.example.myandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third3.*

class ThirdActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third3)

        // declare hluser to receive user's name from main activity
        val hluser = intent.getStringExtra("Username")

        // show welcome user's name
        tvWC1.text = getString(R.string.welcome_messages,hluser)

        // // if user does not enter the name, just show "welcome user"
        if (hluser =="")
        {
            tvWC1.text=getString(R.string.welcome_user)
        }

        // convert button, to convert mile to kilometer when user click on it
        btMK.setOnClickListener {
            // call a function
            mileToKM()
        }

        // back button to return to main activity
        btback1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    // function to calculate the result in kilometer with mile input
    private fun mileToKM() {
        try {
            val celDouble = etMile.text.toString().toDouble()
            val resultKM = celDouble * 1.609
            tvKilometerResult.text = resultKM.toString()
        }catch (e:java.lang.NumberFormatException){
            println(e.localizedMessage)
            tvKilometerResult.text = getString(R.string.nonsense)

        }
        // try - catch to check the data input, make sure the data input is number

    }


}