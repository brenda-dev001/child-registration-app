package com.example.clinicofkids.ui.screens.child

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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

    var list by mutableStateOf<List<Child>>(emptyList())
        private set

    var child by mutableStateOf<Child?>(null)

    fun insertChild(child: Child){
        viewModelScope.launch {
            try {
                repository.insertChild(child)
                message = "Child registered!"
            }catch (e: Exception){
                message = "Error registering!"
                Log.e("ChildViewModel", "Insert failed", e)
            }
        }
    }

    fun getAll(){
        viewModelScope.launch {
            try {
                list = repository.getAll()
            }catch (e: Exception){
                Log.e("ChildViewModel", "Failed to load children", e)
            }
        }
    }

    fun getChildByCpf(cpf: String){
        viewModelScope.launch {
            try {
                child = repository.getChildByCpf(cpf)
            }catch (e: Exception){
                Log.e("ChildViewModel", "Search failed", e)
            }
        }
    }

    fun getGuardianByCpf(cpf: String){
        viewModelScope.launch {
            try {
                list = repository.getGuardianByCpf(cpf)
            }catch (e : Exception){
                Log.e("ChildViewModel", "Search failed", e)
            }
        }
    }

    fun updateChild(childUpdate: Child){
        viewModelScope.launch {
            try {
                repository.updateChild(childUpdate)
                message = "Child updated successfully!"
            }catch (e : Exception){
                Log.e("ChildViewModel", "Update failed", e)
            }
        }
    }

    fun updateGuardian(guardianCpf: String,
                       newName: String,
                       newEmail: String,
                       newPhone: String){
        viewModelScope.launch {
            try {
                val children = repository.getAll()
                children.filter { it.guardianCpf == guardianCpf }
                    .forEach { child ->
                        val updatedChild = child.copy(
                            guardianName = newName,
                            guardianEmail = newEmail,
                            guardianPhone = newPhone
                        )
                        repository.updateChild(updatedChild)
                    }
                message = "Guardian updated successfully!"
            }catch (e : Exception){
                Log.e("ChildViewModel", "Update failed", e)
            }
        }
    }

    fun deleteChild(child: Child) {
        viewModelScope.launch {
            try {
                repository.deleteChild(child)
                if(this@ChildViewModel.child?.cpf == child.cpf){
                    this@ChildViewModel.child = null
                }
                list = list.filter { it.cpf != child.cpf }
                message = "Child deleted successfully!"
            } catch (e: Exception) {
                message = "Error deleting child!"
                Log.e("ChildViewModel", "Delete failed", e)
            }
        }
    }

    fun clearSearch() {
        child = null
        list = emptyList()
    }
    fun clearMessage(){
        message = ""
    }
}