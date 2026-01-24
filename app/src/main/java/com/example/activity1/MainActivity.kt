package com.example.activity1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.graphics.Color
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // TextViews
        val txtColor1 = findViewById<TextView>(R.id.txt_color1)
        val txtColor2 = findViewById<TextView>(R.id.txt_color2)
        val txtOutput = findViewById<TextView>(R.id.txt_output)

        // Buttons
        val btnBlue = findViewById<Button>(R.id.btn_blue)
        val btnRed = findViewById<Button>(R.id.btn_red)
        val btnYellow = findViewById<Button>(R.id.btn_yellow)
        val btnGenerate = findViewById<Button>(R.id.btn_generate)

        // Variables to store selected colors
        var color1 = ""
        var color2 = ""

        // Disable generate button at start
        btnGenerate.isEnabled = false

        btnBlue.setOnClickListener {
            if (color1.isEmpty()) {
                color1 = "Blue"
                txtColor1.text = "Blue"
                txtColor1.setTextColor(Color.BLUE)
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)
            } else if (color2.isEmpty()) {
                color2 = "Blue"
                txtColor2.text = "Blue"
                txtColor2.setTextColor(Color.BLUE)
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)

                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)
                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)
                btnGenerate.isEnabled = true
            }
        }

        btnRed.setOnClickListener {
            if (color1.isEmpty()) {
                color1 = "Red"
                txtColor1.text = "Red"
                txtColor1.setTextColor(Color.RED)
                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)
            } else if (color2.isEmpty()) {
                color2 = "Red"
                txtColor2.text = "Red"
                txtColor2.setTextColor(Color.RED)
                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)

                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)
                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)
                btnGenerate.isEnabled = true
            }
        }

        btnYellow.setOnClickListener {
            if (color1.isEmpty()) {
                color1 = "Yellow"
                txtColor1.text = "Yellow"
                txtColor1.setTextColor(Color.YELLOW)
                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)
            } else if (color2.isEmpty()) {
                color2 = "Yellow"
                txtColor2.text = "Yellow"
                txtColor2.setTextColor(Color.YELLOW)
                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)

                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)
                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)
                btnGenerate.isEnabled = true
            }
        }

        btnGenerate.setOnClickListener {
            if (color1 == "Blue" && color2 == "Red" ||
                color1 == "Red" && color2 == "Blue") {

                txtOutput.text = "Purple"
                txtOutput.setTextColor(Color.MAGENTA)

                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else if (color1 == "Blue" && color2 == "Yellow" ||
                color1 == "Yellow" && color2 == "Blue") {

                txtOutput.text = "Green"
                txtOutput.setTextColor(Color.GREEN)

                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else if (color1 == "Red" && color2 == "Yellow" ||
                color1 == "Yellow" && color2 == "Red") {

                txtOutput.text = "Orange"
                txtOutput.setTextColor(Color.rgb(255, 165, 0))

                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else {
                txtOutput.text = "Unknown Color"
            }
        }

    }
}