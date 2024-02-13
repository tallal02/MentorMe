package com.example.assign_1

import android.content.Intent
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView  // Import TextView class
import androidx.appcompat.app.AppCompatActivity
import com.tallaleatazaz.i210637.R
import com.tallaleatazaz.i210637.page2Login

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)

        val textViewMentor: TextView = findViewById(R.id.textViewMentor)

        textViewMentor.setOnClickListener {
            // Define the destination activity
            val intent = Intent(this, page2Login::class.java)

            // Start the next activity
            startActivity(intent)
        }

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        val screenWidth = displayMetrics.widthPixels
        val screenHeight = displayMetrics.heightPixels


    }
}
