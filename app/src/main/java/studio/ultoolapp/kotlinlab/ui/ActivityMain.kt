package studio.ultoolapp.kotlinlab.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import studio.ultoolapp.kotlinlab.R

class ActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = "Hello WALUDO!"
        titleText.text = helloWorld
        titleText.setOnClickListener {
            Intent(this, ActivityBmi::class.java).apply {
                startActivity(this)
            }
        }
        btnLogin.setOnClickListener {
            Intent(this, ActivityLogin::class.java).apply {
                startActivity(this)
            }
        }

    }
}