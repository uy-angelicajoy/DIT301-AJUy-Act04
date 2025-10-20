package com.example.eventpracticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private lateinit var editTextName: EditText
    private lateinit var editTextAge: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var textViewOutput: TextView
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLayout = findViewById(R.id.mainLayout)
        editTextName = findViewById(R.id.editTextName)
        editTextAge = findViewById(R.id.editTextAge)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewOutput = findViewById(R.id.textViewOutput)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString().trim()
            val ageInput = editTextAge.text.toString().trim()

            // ✅ Check for empty fields
            if (name.isEmpty() || ageInput.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            try {
                // ✅ Try to convert input to number
                val age = ageInput.toInt()
                val message = "Hello $name! You are $age years old."
                textViewOutput.text = message

                // ✅ Feedback success
                Snackbar.make(mainLayout, "Information displayed successfully!", Snackbar.LENGTH_SHORT).show()

            } catch (e: NumberFormatException) {
                // ⚠️ Handle invalid (non-numeric) input
                textViewOutput.text = ""
                Snackbar.make(mainLayout, "Invalid input: Age must be a number.", Snackbar.LENGTH_LONG).show()
            }
        }
    }
}
