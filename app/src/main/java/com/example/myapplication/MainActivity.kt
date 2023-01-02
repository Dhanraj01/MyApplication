package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    lateinit var heightText : EditText
    lateinit var weightText : EditText
    lateinit var button : Button
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heightText = findViewById(R.id.height2)
        weightText = findViewById(R.id.weight2)
        button = findViewById(R.id.btn2)
        result = findViewById(R.id.result2)
        var weight1: Double
        var height1: Double
        var bmi : Double
        var mes : String
        button.setOnClickListener {
            weight1 = weightText.text.toString().toDouble()
            height1 = heightText.text.toString().toDouble()
            bmi = weight1 / (height1 * height1) *10000
            if (bmi<18.5){
                mes="Underweight"
            }
            else if(bmi<25 && bmi>18){
                mes = "normal Range"
            }
            else if(bmi>25 && bmi<30 ){
                mes = "Overweight"
            }
            else {
                mes = "Obese"
            }

            result.text = bmi.toInt().toString() + "\n" + mes
        }

    }
}