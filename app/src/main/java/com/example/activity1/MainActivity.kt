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

        // TextViews for showing selected colors and output result
        val txtColor1 = findViewById<TextView>(R.id.txt_color1)
        val txtColor2 = findViewById<TextView>(R.id.txt_color2)
        val txtOutput = findViewById<TextView>(R.id.txt_output)

        // Buttons for selecting colors, generating output, resetting, and showing about dialog
        val btnBlue = findViewById<Button>(R.id.btn_blue)
        val btnRed = findViewById<Button>(R.id.btn_red)
        val btnYellow = findViewById<Button>(R.id.btn_yellow)
        val btnGenerate = findViewById<Button>(R.id.btn_generate)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val btnAbout = findViewById<Button>(R.id.btn_about)

        // Variables to store selected colors
        var color1 = ""
        var color2 = ""

        // Initially, Generate button is disabled because no colors are selected yet
        btnGenerate.isEnabled = false


        // Color Selection Buttons
        btnBlue.setOnClickListener {
            if (color1.isEmpty()) {
                // Set first color
                color1 = "Blue"
                txtColor1.text = "Blue"
                txtColor1.setTextColor(Color.BLUE)

                // Disable the button after selection
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)
            } else if (color2.isEmpty()) {
                // Set second color
                color2 = "Blue"
                txtColor2.text = "Blue"
                txtColor2.setTextColor(Color.BLUE)
                // Disable the button after selection
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)

                // Disable other color buttons to prevent more selections
                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)

                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)

                // Enable Generate button now that two colors are selected
                btnGenerate.isEnabled = true
                btnGenerate.setBackgroundColor(Color.parseColor("#9C27B0")) // Purple
                btnGenerate.setTextColor(Color.WHITE)
            }
        }

        // Red button logic (same as Blue)
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

                // Disable other color buttons
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)

                btnYellow.isEnabled = false
                btnYellow.setBackgroundColor(Color.GRAY)
                btnYellow.setTextColor(Color.DKGRAY)

                // Enable Generate button
                btnGenerate.isEnabled = true
                btnGenerate.setBackgroundColor(Color.parseColor("#9C27B0")) // Purple
                btnGenerate.setTextColor(Color.WHITE)
            }
        }

        // Yellow button logic (same pattern)
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

                // Disable other color buttons
                btnBlue.isEnabled = false
                btnBlue.setBackgroundColor(Color.GRAY)
                btnBlue.setTextColor(Color.DKGRAY)

                btnRed.isEnabled = false
                btnRed.setBackgroundColor(Color.GRAY)
                btnRed.setTextColor(Color.DKGRAY)

                // Enable Generate button
                btnGenerate.isEnabled = true
                btnGenerate.setBackgroundColor(Color.parseColor("#9C27B0")) // Purple
                btnGenerate.setTextColor(Color.WHITE)
            }
        }

        // Generate Mixed Color
        btnGenerate.setOnClickListener {
            // Determine mixed color based on color1 and color2
            if (color1 == "Blue" && color2 == "Red" ||
                color1 == "Red" && color2 == "Blue") {

                txtOutput.text = "Purple"
                txtOutput.setTextColor(Color.MAGENTA)

                // Disable Generate button after use
                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else if (color1 == "Blue" && color2 == "Yellow" ||
                color1 == "Yellow" && color2 == "Blue") {

                txtOutput.text = "Green"
                txtOutput.setTextColor(Color.GREEN)

                // Disable Generate button after use
                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else if (color1 == "Red" && color2 == "Yellow" ||
                color1 == "Yellow" && color2 == "Red") {

                txtOutput.text = "Orange"
                txtOutput.setTextColor(Color.rgb(255, 165, 0))

                // Disable Generate button after use
                btnGenerate.isEnabled = false
                btnGenerate.setBackgroundColor(Color.GRAY)
                btnGenerate.setTextColor(Color.DKGRAY)

            } else {
                txtOutput.text = "Unknown Color"
            }
        }

        // Reset Button
        btnReset.setOnClickListener {

            // Clear selected colors
            color1 = ""
            color2 = ""

            // Reset TextViews to default
            txtColor1.text = "Color 1"
            txtColor2.text = "Color 2"
            txtOutput.text = "Output"
            txtColor1.setTextColor(Color.BLACK)
            txtColor2.setTextColor(Color.BLACK)
            txtOutput.setTextColor(Color.BLACK)

            // Re-enable all color buttons
            btnBlue.isEnabled = true
            btnRed.isEnabled = true
            btnYellow.isEnabled = true

            // Restore original button colors
            btnBlue.setBackgroundColor(Color.parseColor("#ff0099cc"))   // Blue
            btnRed.setBackgroundColor(Color.parseColor("#ffcc0000"))    // Red
            btnYellow.setBackgroundColor(Color.parseColor("#ffffbb33")) // Yellow
            btnBlue.setTextColor(Color.WHITE)
            btnRed.setTextColor(Color.WHITE)
            btnYellow.setTextColor(Color.WHITE)

            // Disable Generate button until two new colors are selected
            btnGenerate.isEnabled = false
            btnGenerate.setBackgroundColor(Color.LTGRAY)
            btnGenerate.setTextColor(Color.DKGRAY)
        }

        // About Button (Popup Dialog)
        btnAbout.setOnClickListener {
            val dialog = androidx.appcompat.app.AlertDialog.Builder(this)
                .setTitle("About")
                .setMessage("Created by:\nCarl Alfred G. Chan\nBSIT - 405")
                .setCancelable(false) // Prevent closing without pressing button
                .setPositiveButton("Close") { dialogInterface, _ ->
                    dialogInterface.dismiss() // Close dialog
                }
                .create()

            dialog.show()
        }
    }
}