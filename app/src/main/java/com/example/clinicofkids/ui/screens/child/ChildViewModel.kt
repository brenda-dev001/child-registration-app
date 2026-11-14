package com.example.clinicofkids.ui.screens.child

import android.util.Log
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clinicofkids.data.model.Child
import com.example.clinicofkids.data.repository.ChildRepository
import kotlinx.coroutines.launch

class ChildViewModel(
    private val repository: ChildRepository
) : ViewModel() {

    var message by mutableStateOf("")
        private set

    fun insertChild(child: Child){
        viewModelScope.launch {
            try {
                repository.insertChild(child)
                message = "Child registered!"
            }catch (e: Exception){
                message = "Error registering!"
                Log.e("ChildViewModel", "Insert falied", e)
            }
        }
    }

    fun clearMessage(){
        message = ""
    }
}