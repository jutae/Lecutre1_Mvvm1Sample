package com.gibaram.mvvm1st.model

data class Counter(var number: Int = 1) {

    fun increase() {
        this.number++
    }
}