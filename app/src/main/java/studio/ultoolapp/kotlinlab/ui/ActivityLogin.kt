package studio.ultoolapp.kotlinlab.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import studio.ultoolapp.kotlinlab.R

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        if (editUserName.text.toString() == "Email" && editPassword.text.toString() == "Password") {
            finish()
        } else {
            Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_SHORT).show()
        }
    }
}