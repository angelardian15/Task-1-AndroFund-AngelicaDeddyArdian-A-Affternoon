package com.example.task_1_androfund_angelicadeddyardian_a_afternoon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.et_name)
        etPassword = findViewById(R.id.et_password)
        etEmail = findViewById(R.id.et_email)

        val btnRegist : Button = findViewById(R.id.btn_Register)
        btnRegist.setOnClickListener(this)
        val btnLogin: TextView = findViewById(R.id.tv_haveaccount)
        btnLogin.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_Register -> {
                val bundle = Bundle()
                bundle.putString("username", etUsername.text.toString())
                bundle.putString("password", etPassword.text.toString())
                bundle.putString("email", etEmail.text.toString())

                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
            R.id.tv_haveaccount->{
                val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}