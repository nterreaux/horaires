package com.example.horaires.ui.restaurant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RestaurantViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is restaurant fragment"
    }
    val text: LiveData<String> = _text
}