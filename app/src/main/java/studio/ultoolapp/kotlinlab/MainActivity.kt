package studio.ultoolapp.kotlinlab

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorld = "Hello WALUDO!"
        findViewById<TextView>(R.id.titleText).text = helloWorld
    }
}