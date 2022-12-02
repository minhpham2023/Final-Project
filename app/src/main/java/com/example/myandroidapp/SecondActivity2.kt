package com.example.myandroidapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        // declare wcuser to receive user's name from main activity
        val wcuser = intent.getStringExtra("Username")


        // show welcome user's name
        tvWelcome.text = getString(R.string.welcome_messages,wcuser)

        // if user does not enter name, just show "welcome user"
        if (wcuser =="")
        {
            tvWelcome.text=getString(R.string.welcome_user)
        }


        // convert button, to convert celsius to fahrenheit when user click on it
        btconvert.setOnClickListener{
            // call a function
            calculate()
        }

        // button, back to main activity
        btbtm.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // function to calculate the result in fahrenheit with celsius input
    private fun calculate() {
        try {
            val celDouble = etCelTemp.text.toString().toDouble()
            val resultFah = (celDouble * 9/5) + 32
            tvfahrenheit.text = resultFah.toString()

        }catch (e:java.lang.NumberFormatException){
            println(e.localizedMessage)
            tvfahrenheit.text = getString(R.string.nonsense)

        }
        // try - catch to check the data input, make sure the data input is number



    }


}