package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.pow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.buttonCalculate)
        btn.setOnClickListener{calculateBMI()}
    }

    private fun calculateBMI(){
        val height=editTextHeight.text.toString().toDouble()/100
        val weight=editTextWeight.text.toString().toInt()
        val BMI=weight/(height*height)
        val bmiPic: ImageView =findViewById(R.id.imageViewProfile)
        val textBmi:TextView=findViewById(R.id.textViewBMI)
        textBmi.text=BMI.toString()



        if(BMI<18.5)
        {
            bmiPic.setImageResource(R.drawable.under)
        }
        else if(BMI>25)
        {
            bmiPic.setImageResource(R.drawable.over)
        }
        else
        {
            bmiPic.setImageResource(R.drawable.normal)
        }

    }
}
