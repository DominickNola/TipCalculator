package com.example.tipcalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        infoTextView.visibility = View.INVISIBLE

        calcButton.setOnClickListener {
            // bill?, tip?, tip, total, display visible with results
            val bill = billEditText.text.toString().toDouble()
            // tip?
            val tipPercentage = tipEditText.text.toString().toDouble()/100
            val tip = bill * tipPercentage
            val total = bill + tip

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip)} Total: ${doubleToDollar(total)}"
        }

    }

    fun doubleToDollar(number:Double): String {
        return "$" + String.format("%.2f", number)
    }



}
