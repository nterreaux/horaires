package com.example.horaires.ui.magasin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MagasinViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is magasin fragment"
    }
    val text: LiveData<String> = _text
}