package studio.ultoolapp.kotlinlab.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bmi.*
import studio.ultoolapp.kotlinlab.R

class ActivityBmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
        btnCalculate.setOnClickListener {
            val weight = editTextWeight.text.toString().toFloat()
            val height = editTextHeight.text.toString().toFloat()
            val bmi = weight / (height * height)
            val msg = "Your BMI is: $bmi"
            textMessage.text = msg
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
            AlertDialog.Builder(this)
                .setTitle("BMI")
                .setMessage(msg)
                .show()
        }

    }
}