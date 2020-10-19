package studio.ultoolapp.kotlinlab

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import studio.ultoolapp.kotlinlab.ui.ActivityBmi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = "Hello WALUDO!"
        titleText.text = helloWorld
        titleText.setOnClickListener {
            val intent = Intent(this, ActivityBmi::class.java)
            startActivity(intent)
        }
    }
}