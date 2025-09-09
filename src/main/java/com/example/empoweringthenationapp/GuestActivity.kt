package com.example.empoweringthenationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class GuestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guest)

        val nameInput = findViewById<EditText>(R.id.guestName)
        val emailInput = findViewById<EditText>(R.id.guestEmail)
        val courseInput = findViewById<EditText>(R.id.guestCourseInterest)

        val exploreBtn = findViewById<Button>(R.id.guestExploreBtn)
        val requestBtn = findViewById<Button>(R.id.guestRequestInfoBtn)
        val backBtn = findViewById<Button>(R.id.guestBackBtn)
        val guestCoursesBtn = findViewById<Button>(R.id.guestCoursesBtn)

        // Explore button
        exploreBtn.setOnClickListener {
            val course = courseInput.text.toString().trim()
            if (course.isEmpty()) {
                Toast.makeText(this, "Please enter a course to explore.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Showing details for: $course", Toast.LENGTH_LONG).show()
            }
        }

        // Request info button
        requestBtn.setOnClickListener {
            val name = nameInput.text.toString().trim()
            val email = emailInput.text.toString().trim()

            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill in your name and email", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Request sent! We’ll contact you at $email", Toast.LENGTH_LONG).show()
                nameInput.text.clear()
                emailInput.text.clear()
                courseInput.text.clear()
            }
        }

        // Back button → MainActivity
        backBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // Browse Courses button → CoursesActivity
        guestCoursesBtn.setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }
    }
}
