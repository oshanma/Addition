package com.example.addition

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var number1EditText: EditText
    private lateinit var number2EditText: EditText
    private lateinit var number3EditText: EditText
    private lateinit var resultTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        number1EditText = findViewById(R.id.number1EditText)
        number2EditText = findViewById(R.id.number2EditText)
        number3EditText = findViewById(R.id.number3EditText)
        resultTextView = findViewById(R.id.resultTextView)

        val addButton = findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            addNumbers()
        }
        val clearButton = findViewById<Button>(R.id.clearButton)
        clearButton.setOnClickListener {
            clearNumbers()
        }
    }

    private fun addNumbers() {
        val number1Str = number1EditText.text.toString()
        val number2Str = number2EditText.text.toString()
        val number3Str = number3EditText.text.toString()

        if (number1Str.isNotEmpty() && number2Str.isNotEmpty()) {
            val number1 = number1Str.toDouble()
            val number2 = number2Str.toDouble()
            val number3 = number3Str.toDouble()
            val sum = (number1*number3) -( (number1*number3)*(number2/100))
            resultTextView.text = "You will receive: $ $sum"
        } else {
            resultTextView.text = "Please enter all numbers."
        }
    }
    private fun clearNumbers() {
        // Clear input fields and result
        number1EditText.text.clear()
        number2EditText.text.clear()
        number3EditText.text.clear()
        resultTextView.text = ""
    }
}
