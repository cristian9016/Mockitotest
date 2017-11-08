package com.example.cristiandev.mockitotest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainInterface.View {

    val presenter:MainInterface.Presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_aceptar.setOnClickListener{
            presenter.validateUser(getUser(),getPass())
        }
    }

    override fun getUser(): String {
        return name.text.toString()
    }

    override fun getPass(): String {
        return password.text.toString()
    }


    override fun onsuccess() {
        Toast.makeText(this,"Valid User",Toast.LENGTH_LONG).show()
    }

    override fun onError() {
        Toast.makeText(this,"Invalid User",Toast.LENGTH_LONG).show()
    }

}
