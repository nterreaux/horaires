package com.example.horaires.ui.station

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is station service Fragment"
    }
    val text: LiveData<String> = _text
}