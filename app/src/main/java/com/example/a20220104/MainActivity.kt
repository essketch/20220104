package com.example.a20220104

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendMessage.setOnClickListener{
            val inputMessage = edtMessage.text.toString()
            val myIntent = Intent(this,ViewMessageActivity::class.java)
            startActivity(myIntent)

        }

        btnMoveToOther.setOnClickListener{
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)



        }
    }
}