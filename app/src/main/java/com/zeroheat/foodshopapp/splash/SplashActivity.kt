package com.zeroheat.foodshopapp.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.zeroheat.foodshopapp.MainActivity
import com.zeroheat.foodshopapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val myHandler = Handler(Looper.getMainLooper())

        myHandler.postDelayed( {

//           Shift + Tab => 들여쓰기를 바깥으로
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

            finish()

        }, 2500 )
    }
}