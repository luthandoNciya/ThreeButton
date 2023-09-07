package com.example.a3button

import java.lang.StringBuilder
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var etNum: EditText? = null
    private var tvDisplay: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum = findViewById(R.id.etNum1)
        tvDisplay = findViewById(R.id.tvDisplay)

        val btnButton = findViewById<Button>(R.id.btnButton)

        btnButton.setOnClickListener {
            disp()
        }


        private fun disp() {
            val builder = StringBuilder()
            val intCount = 0
            for (intCount 1..12) {
                var intAns = intNum1 * intCount
                builder.append("" + intNum + intCount + "=" + intAns)
                    .append('\n')

            }

        }
    }

    private fun disp() {
        TODO("Not yet implemented")
    }




