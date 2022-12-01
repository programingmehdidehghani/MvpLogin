package com.example.mvplogin.login.presenter

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
                TODO("Not yet implemented")
            }

            override fun onFailed() {
                TODO("Not yet implemented")
            }

        })
    }
}