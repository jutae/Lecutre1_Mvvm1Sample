package com.gibaram.mvvm1st

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.gibaram.mvvm1st.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View Model 생성 (취득)
        val viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        // Observe View Model
        viewModel.counter.observe(this, Observer {
            this.numberView?.text = it.number.toString()
        })
        // Event Handling
        this.increaseButton?.setOnClickListener {
            viewModel.onClickIncreaseButton()
        }
    }
}