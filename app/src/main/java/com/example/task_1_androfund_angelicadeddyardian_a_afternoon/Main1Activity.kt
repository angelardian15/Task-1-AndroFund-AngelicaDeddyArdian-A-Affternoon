package com.example.task_1_androfund_angelicadeddyardian_a_afternoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class Main1Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val btnSignIn: Button = findViewById(R.id.btn_signIn)
        btnSignIn.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_signIn-> {
                val intent = Intent(this@Main1Activity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}