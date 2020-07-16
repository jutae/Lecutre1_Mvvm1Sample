package com.gibaram.mvvm1st.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gibaram.mvvm1st.model.Counter

class MainActivityViewModel : ViewModel() {

    private val _counter = MutableLiveData<Counter>()
    val counter: LiveData<Counter> = _counter

    init {
        this._counter.value = Counter()
    }

    // Event Handling
    fun onClickIncreaseButton() {
        val counter = this.counter.value ?: return
        counter.increase()
        this._counter.value = counter
    }

}