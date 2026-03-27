package com.example.auth.data

import kotlinx.serialization.Serializable

@Serializable
data class LoginResponse(
    val accessTokens: String,
    val refreshToken: String,
    val accessTokenExpirationTimeStamp: Long,
    val userId: String
)