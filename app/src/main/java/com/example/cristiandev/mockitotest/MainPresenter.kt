package com.example.cristiandev.mockitotest

/**
 * Created by CristianDev on 8/11/2017.
 */
class MainPresenter:MainInterface.Presenter {

    lateinit var view:MainInterface.View
    lateinit var model:MainInterface.Model

    constructor(view: MainInterface.View ){
        this.view = view
        model = MainModel(this)
    }

    override fun validateUser(user: String, pass: String) {
        if(view!=null){
            model.validateUser(user,pass)
        }
    }

    override fun onSuccess() {
        if(view!=null){
            view.onsuccess()
        }
    }

    override fun onError() {
        if(view!=null){
            view.onError()
        }
    }




}