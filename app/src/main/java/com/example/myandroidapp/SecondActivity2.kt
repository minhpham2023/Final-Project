package com.example.myandroidapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        // declare wcuser to receive user's name from main activity
        val wcuser = intent.getStringExtra("Username")


        // show welcome user
        tvWelcome.text = getString(R.string.welcome_messages,wcuser)
        if (wcuser =="")
        {
            tvWelcome.text=getString(R.string.welcome_user)
        }



        btconvert.setOnClickListener{
            calculate()
        }


    }

    private fun calculate() {
        try {
            val celDouble = etCelTemp.text.toString().toDouble()
            val resultFah = (celDouble * 9/5) + 32
            tvfahrenheit.text = resultFah.toString()

        }catch (e:java.lang.NumberFormatException){
            println(e.localizedMessage)
            tvfahrenheit.text = getString(R.string.nonsense)

        }



    }


}