package com.example.cristiandev.mockitotest

/**
 * Created by CristianDev on 8/11/2017.
 */
interface MainInterface {
    interface View{
        fun onsuccess()
        fun onError()
        fun getUser():String
        fun getPass():String
    }
    interface Model{
        fun validateUser(user:String,pass:String)
    }
    interface Presenter{
        fun validateUser(user:String,pass:String)
        fun onSuccess()
        fun onError()
    }

}