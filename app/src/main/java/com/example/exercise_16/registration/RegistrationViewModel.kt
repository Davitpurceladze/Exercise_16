package com.example.exercise_16.registration

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exercise_16.network.Network
import kotlinx.coroutines.launch

class RegistrationViewModel: ViewModel() {

    fun RegisterUser(email: String, password: String) {
        viewModelScope.launch {

             val response = Network.registerUserService().registerUser(User(email = email, password = password))
        }

    }
}