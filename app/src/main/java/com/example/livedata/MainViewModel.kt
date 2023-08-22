package com.example.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
   private val factsLiveDataObject = MutableLiveData<String>("this is Normal Data")


    val factsLiveData: LiveData<String>
        get() =  factsLiveDataObject


    fun updateLiveData(){
        factsLiveDataObject.value = "This is updated live data"
    }
}