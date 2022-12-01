package com.example.mvplogin.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.mvplogin.R

class LoginActivity : AppCompatActivity() {

    lateinit var et_text_id_login_activity : EditText
    lateinit var et_text_pm_login_activity : EditText
    lateinit var btn_login : Button
    lateinit var tv_result_view_login_info : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findView()
        setListener()

    }

    private fun findView(){
        et_text_id_login_activity = findViewById(R.id.et_text_id_login_activity)
        et_text_pm_login_activity = findViewById(R.id.et_text_pm_login_activity)
        btn_login = findViewById(R.id.btn_login)
        tv_result_view_login_info = findViewById(R.id.tv_result_view_login_info)

        btn_login.setOnClickListener {

        }
    }

    private fun setListener(){

    }
}