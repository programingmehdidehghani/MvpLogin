package com.example.mvplogin.login.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.TextView
import com.example.mvplogin.R
import com.example.mvplogin.login.presenter.ILoginPresenter
import com.example.mvplogin.login.presenter.LoginPresenter

class LoginActivity : AppCompatActivity() , ILoginView {

    lateinit var et_text_id_login_activity : EditText
    lateinit var et_text_pm_login_activity : EditText
    lateinit var btn_login : Button
    lateinit var tv_result_view_login_info : TextView
    lateinit var fl_progress : FrameLayout

    lateinit var iLoginPresenter: ILoginPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findView()
        setListener()
    }

    private fun initPresent(){
        iLoginPresenter = LoginPresenter(iLoginView = this)
    }

    private fun findView(){
        et_text_id_login_activity = findViewById(R.id.et_text_id_login_activity)
        et_text_pm_login_activity = findViewById(R.id.et_text_pm_login_activity)
        btn_login = findViewById(R.id.btn_login)
        tv_result_view_login_info = findViewById(R.id.tv_result_view_login_info)
        fl_progress = findViewById(R.id.fl_progress)
        btn_login.setOnClickListener {

        }
    }

    private fun setListener(){

    }

    override fun onClear() {
        et_text_id_login_activity.setText("")
        et_text_pm_login_activity.setText("")
    }

    override fun onShowProgress() {
        fl_progress.visibility = View.VISIBLE
    }

    override fun onHideProgress() {
        fl_progress.visibility = View.GONE
    }

    override fun onUpdateUserInfo(nickName: String, age: Int) {
        tv_result_view_login_info.text = "nickName is $nickName, age is $age"
    }


}