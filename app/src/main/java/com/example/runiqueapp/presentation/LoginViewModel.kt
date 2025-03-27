package com.example.runiqueapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.runiqueapp.domain.AuthRepository
import kotlinx.coroutines.launch

class LoginViewModel (
    private val repository: AuthRepository
) : ViewModel() {

    fun login(){
        viewModelScope.launch {
            repository.login("","")
        }
    }

}