package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalc.setOnClickListener(){

            val carPrice = inptcarPrice.text.toString()
            val downPay = inptdownPay.text.toString()
            val interest = inptInt.text.toString()
            val loanPeriod = inptLoan.text.toString()

            val carLoan:Double = carPrice.toDouble() - downPay.toDouble()

            resultCarloan.text = "%.2f".format(carLoan)

            val totInterest = carLoan * interest.toDouble() * loanPeriod.toDouble()

            resultInt.text = "%.2f".format(totInterest)

            val totMonth = (carLoan + totInterest) / loanPeriod.toDouble() /12

            resultMonth.text = "%.2f".format(totMonth)

        }
    }


}
