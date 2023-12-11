package com.example.exercise_16.service

import com.example.exercise_16.registration.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface RegistrationService {

    @POST("register")
    suspend fun registerUser(@Body user: User): Response<Any>
}