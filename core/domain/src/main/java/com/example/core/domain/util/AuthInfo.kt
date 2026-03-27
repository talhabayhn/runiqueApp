package com.example.core.domain.util

data class AuthInfo(
    val refreshToken: String,
    val accessToken: String,
    val userId: String
)
