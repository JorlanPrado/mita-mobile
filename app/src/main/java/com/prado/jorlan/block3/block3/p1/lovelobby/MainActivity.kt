package com.prado.jorlan.block3.block3.p1.lovelobby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var splashScreen : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        splashScreen = findViewById(R.id.splashscreen)

        splashScreen.alpha = 0f
        splashScreen.animate().setDuration(1500).alpha(1f).withEndAction{
            val intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        }
    }
}