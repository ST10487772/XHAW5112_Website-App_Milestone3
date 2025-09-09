package com.example.empoweringthenationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        val courseCountInput = findViewById<EditText>(R.id.courseCountInput)
        val resultView = findViewById<TextView>(R.id.quoteResult)
        val calcBtn = findViewById<Button>(R.id.calcQuoteBtn)
        val backBtn = findViewById<Button>(R.id.quoteBackBtn)

        calcBtn.setOnClickListener {
            val count = courseCountInput.text.toString().toIntOrNull()

            if (count == null || count <= 0) {
                Toast.makeText(this, "Please enter a valid number of courses.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Average fee assumption:
            // Long courses = R1500, Short courses = R750
            // To keep it simple here, use R1500 but you can expand this
            val pricePerCourse = 1500
            val total = count * pricePerCourse

            // Discount logic
            val discount = when (count) {
                2 -> 5
                3 -> 10
                in 4..Int.MAX_VALUE -> 15
                else -> 0
            }

            val discountedTotal = total - (total * discount / 100)

            val discountText = if (discount == 0) "No discount" else "$discount% discount"

            resultView.text = "Total for $count courses: R$discountedTotal ($discountText)"
        }

        // Back button
        backBtn.setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
            finish()
        }
    }
}
