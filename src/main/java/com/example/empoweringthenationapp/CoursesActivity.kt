package com.example.empoweringthenationapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        // Buttons for each course
        val firstAidBtn = findViewById<Button>(R.id.firstAidBtn)
        val sewingBtn = findViewById<Button>(R.id.sewingBtn)
        val landscapingBtn = findViewById<Button>(R.id.landscapingBtn)
        val lifeSkillsBtn = findViewById<Button>(R.id.lifeSkillsBtn)
        val childMindingBtn = findViewById<Button>(R.id.childMindingBtn)
        val cookingBtn = findViewById<Button>(R.id.cookingBtn)
        val gardenMaintenanceBtn = findViewById<Button>(R.id.gardenMaintenanceBtn)

        val quoteBtn = findViewById<Button>(R.id.getQuoteBtn)
        val backBtn = findViewById<Button>(R.id.coursesBackBtn)

        // Show Toasts when a course is clicked
        firstAidBtn.setOnClickListener {
            Toast.makeText(this, "First Aid: Covers CPR, choking, wound care. Fee: R1500", Toast.LENGTH_LONG).show()
        }

        sewingBtn.setOnClickListener {
            Toast.makeText(this, "Sewing: Alterations, stitches, zips, new garments. Fee: R1500", Toast.LENGTH_LONG).show()
        }

        landscapingBtn.setOnClickListener {
            Toast.makeText(this, "Landscaping: Indigenous plants, layout, aesthetics. Fee: R1500", Toast.LENGTH_LONG).show()
        }

        lifeSkillsBtn.setOnClickListener {
            Toast.makeText(this, "Life Skills: Banking, labour law, literacy, numeracy. Fee: R1500", Toast.LENGTH_LONG).show()
        }

        childMindingBtn.setOnClickListener {
            Toast.makeText(this, "Child Minding: Baby to toddler care, feeding, hygiene. Fee: R750", Toast.LENGTH_LONG).show()
        }

        cookingBtn.setOnClickListener {
            Toast.makeText(this, "Cooking: Nutrition, meal planning, recipes. Fee: R750", Toast.LENGTH_LONG).show()
        }

        gardenMaintenanceBtn.setOnClickListener {
            Toast.makeText(this, "Garden Maintenance: Watering, pruning, planting. Fee: R750", Toast.LENGTH_LONG).show()
        }

        // Navigate to QuoteActivity
        quoteBtn.setOnClickListener {
            startActivity(Intent(this, QuoteActivity::class.java))
        }

        // Back to MainActivity
        backBtn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
