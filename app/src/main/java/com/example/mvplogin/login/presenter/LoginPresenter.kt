package com.example.mvplogin.login.presenter

import android.util.Log
import com.example.mvplogin.login.model.UserInfoModel
import com.example.mvplogin.login.presenter.controller.LoginController
import com.example.mvplogin.login.view.ILoginView

class LoginPresenter(var iLoginView: ILoginView) : ILoginPresenter {
    override fun clear() {
        iLoginView.onClear()
    }

    override fun showProgress() {
        iLoginView.onShowProgress()
    }

    override fun hideProgress() {
        iLoginView.onHideProgress()
    }

    override fun login(id: String, password: String) {
        showProgress()
        LoginController.requestLogin(id = id, password = password, object : LoginController.LoginControllerDelegate{
            override fun onSuccess(response: String) {
                Log.i("tag",response.toString())

                val userInfoModel = UserInfoModel()
                userInfoModel.nickName = "coding with out"
                userInfoModel.age = 1

                hideProgress()
                iLoginView.onUpdateUserInfo(nickName = userInfoModel.nickName, age = userInfoModel.age)
            }

            override fun onFailed() {
                TODO("Not yet implemented")
            }

        })
    }
}