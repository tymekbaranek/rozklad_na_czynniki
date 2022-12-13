package com.example.rozkad_na_czynniki

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rozklad).setOnClickListener{
            var rozkladIn = findViewById<TextView>(R.id.liczbaIn).text.toString().toInt()
            var dzielenie = 2
            if (rozkladIn == 0 || rozkladIn == 1){
                val czynnik=rozkladIn.toString()
                findViewById<TextView>(R.id.rozkladOut).text=(czynnik)}
            else{
                var wynik= mutableListOf<String>()
                while(rozkladIn>1) {
                    while(rozkladIn%dzielenie==0){
                        val czynnik=dzielenie.toString()
                        wynik+=czynnik
                        rozkladIn/=dzielenie
                    }
                    dzielenie+=1
                }
                findViewById<TextView>(R.id.rozkladOut).text=(wynik).toString()
            }
        }
    }
}