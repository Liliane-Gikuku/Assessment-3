package com.liliane.calculassessent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNumberOne:TextInputLayout
    lateinit var etNumberOne:TextInputEditText
    lateinit var tilNumberTwo:TextInputLayout
    lateinit var etNumberTwo:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnMinus:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvAnswer:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNumberOne = findViewById(R.id.tilNumberOne)
        etNumberOne = findViewById(R.id.etNumberOne)
        tilNumberTwo = findViewById(R.id.tilNumberTwo)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnModulus = findViewById(R.id.btnModulus)
        btnDivide = findViewById(R.id.btnDivide)
        tvAnswer = findViewById(R.id.tvAnswer)


        btnAdd.setOnClickListener {
            var number1 = etNumberOne.text.toString().toDouble()
            var number2 = etNumberTwo.text.toString().toDouble()
            findAddition(number1,number2)

            if (number1.toString().isBlank()){
                tilNumberOne.error="Write a number"
                return@setOnClickListener
            }

            if(number2.toString().isBlank()){
                tilNumberTwo.error="Write a number"
                return@setOnClickListener
            }


        }
        btnMinus.setOnClickListener {
            var number1 = etNumberOne.text.toString().toDouble()
            var number2 = etNumberTwo.text.toString().toDouble()
            diff(number1, number2)

            if(number1.toString().isBlank()){
                tilNumberOne.error="Write a number"
                return@setOnClickListener
            }

            if(number2.toString().isBlank()){
                tilNumberTwo.error="Write a number"
                return@setOnClickListener
            }


        }



        btnModulus.setOnClickListener {
            var number1 = etNumberOne.text.toString().toDouble()
            var number2 = etNumberTwo.text.toString().toDouble()
            modu(number1, number2)

            if(number1.toString().isBlank()){
                tilNumberOne.error="Write a number"
                return@setOnClickListener

            }

                if(number2.toString().isBlank()){
                    tilNumberTwo.error="Write a number"
                    return@setOnClickListener
                }


        }

        btnDivide.setOnClickListener {
            var number1 = etNumberOne.text.toString().toDouble()
            var number2 = etNumberTwo.text.toString().toDouble()
            division(number1, number2)

            if(number1.toString().isBlank()){
                tilNumberOne.error="Write a number"
                return@setOnClickListener
            }

            if(number2.toString().isBlank()){
                tilNumberTwo.error="Write a number"
                return@setOnClickListener
            }
        }
    }

    fun findAddition(number1:Double, number2:Double){
        var sum=number1 + number2
        tvAnswer.text= sum.toString()
    }

    fun diff(number1: Double,number2: Double){
        var diff= number1-number2
        tvAnswer.text=diff.toString()
    }

    fun modu(number1: Double,number2: Double){
        var modulus= number1%number2
        tvAnswer.text=modulus.toString()

    }

    fun division(number1: Double,number2: Double){
        var answer= number1/number2
        tvAnswer.text=answer.toString()
    }
}






















