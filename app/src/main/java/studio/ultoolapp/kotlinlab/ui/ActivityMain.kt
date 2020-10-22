package studio.ultoolapp.kotlinlab.ui

import android.app.Activity
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import studio.ultoolapp.kotlinlab.R

class ActivityMain : AppCompatActivity() {
    companion object {
        const val CODE_LOGIN = 306
    }

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
                startActivityForResult(this, CODE_LOGIN)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CODE_LOGIN) {
            // 登入活動
            if (resultCode == Activity.RESULT_OK) {
                // 登入成功
                AlertDialog.Builder(this)
                    .setTitle("Login")
                    .setMessage("Login Success!")
                    .show()
            }
        }

    }
}