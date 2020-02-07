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

        calcButtonBad.setOnClickListener {
            val bill2 = billEditText.text.toString().toDouble()

            val tip2 = bill2 * .10
            val total2 = bill2 + tip2

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip2)} Total: ${doubleToDollar(total2)}"
        }
        calcButtonDecent.setOnClickListener {
            val bill2 = billEditText.text.toString().toDouble()

            val tip2 = bill2 * .15
            val total2 = bill2 + tip2

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip2)} Total: ${doubleToDollar(total2)}"
        }
        calcButtonGood.setOnClickListener {
            val bill2 = billEditText.text.toString().toDouble()

            val tip2 = bill2 * .20
            val total2 = bill2 + tip2

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip2)} Total: ${doubleToDollar(total2)}"
        }
        calcButtonGreat.setOnClickListener {
            val bill2 = billEditText.text.toString().toDouble()

            val tip2 = bill2 * .25
            val total2 = bill2 + tip2

            infoTextView.visibility = View.VISIBLE
            infoTextView.text = "Tip: ${doubleToDollar(tip2)} Total: ${doubleToDollar(total2)}"
        }


    }

    fun doubleToDollar(number:Double): String {
        return "$" + String.format("%.2f", number)
    }



}
