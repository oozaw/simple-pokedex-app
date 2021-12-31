package com.dicoding.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="About Trainer"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}