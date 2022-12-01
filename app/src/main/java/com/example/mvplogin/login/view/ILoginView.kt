package com.example.mvplogin.login.view

interface ILoginView {

    fun onClear()
    fun onShowProgress()
    fun onHideProgress()
    fun onUpdateUserInfo(nickName : String, age : Int)
}