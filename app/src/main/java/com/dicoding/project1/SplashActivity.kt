package com.dicoding.project1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val moveIntent = Intent(this, MainActivity::class.java)
        val handler = Handler()
        handler.postDelayed(Runnable {
            run {
                startActivity(moveIntent)
                finish()
            }
        }, 2000)
    }
}