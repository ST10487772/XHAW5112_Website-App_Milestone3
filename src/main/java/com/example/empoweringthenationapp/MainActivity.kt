package com.example.empoweringthenationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Sign Up button
        findViewById<Button>(R.id.signUpBtn).setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        // Log In button
        findViewById<Button>(R.id.logInBtn).setOnClickListener {
            startActivity(Intent(this, LogInActivity::class.java))
        }

        // Guest button
        findViewById<Button>(R.id.guestBtn).setOnClickListener {
            startActivity(Intent(this, GuestActivity::class.java))
        }

        // Courses button
        findViewById<Button>(R.id.coursesBtn).setOnClickListener {
            startActivity(Intent(this, CoursesActivity::class.java))
        }

        // About button
        findViewById<Button>(R.id.aboutBtn).setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }
    }
}
