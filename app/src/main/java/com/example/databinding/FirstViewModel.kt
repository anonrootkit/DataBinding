package com.example.databinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlin.random.Random

class FirstViewModel : ViewModel() {

    private val _value = MutableLiveData<String>()
    val value : LiveData<String>
        get() = _value

    fun generateRandomValue() {
        val number = Random.nextInt()
        _value.value = "Random : $number"
    }

    class Factory : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return FirstViewModel() as T
        }
    }
}