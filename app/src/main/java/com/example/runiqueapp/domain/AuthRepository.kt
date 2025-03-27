package com.example.runiqueapp.domain

interface AuthRepository {
    suspend fun login(email : String, password: String)
}