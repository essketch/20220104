package com.example.a20220104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnReturnToMain.setOnClickListener{
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)
            finish()

        }


    }
}