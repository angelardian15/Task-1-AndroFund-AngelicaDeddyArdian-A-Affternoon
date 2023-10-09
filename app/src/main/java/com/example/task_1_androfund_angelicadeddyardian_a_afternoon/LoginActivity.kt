package com.example.task_1_androfund_angelicadeddyardian_a_afternoon

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts



class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)

        val bundle = intent.extras
        if (bundle != null){
            etEmail.setText(bundle.getString("email"))
            etPassword.setText(bundle.getString("password"))
        }


        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener(this)
        val btnRegis: TextView = findViewById(R.id.tv_register)
        btnRegis.setOnClickListener(this)
 }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_login->{
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)

                startActivity(intent)
            }
                R.id.tv_register->{
                    val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                    intent.putExtra("User", User(etEmail.text.toString(),etPassword.text.toString()))
                    startActivity(intent)
                }
        }

    }

}