package com.example.cristiandev.mockitotest

/**
 * Created by CristianDev on 8/11/2017.
 */
class MainModel(val presenter: MainInterface.Presenter):MainInterface.Model {

    override fun validateUser(user: String, pass: String) {
      if(user.equals("codemakers") && pass.equals("cmcolombia")){
          presenter.onSuccess()
      }else{
          presenter.onError()
      }
    }
}