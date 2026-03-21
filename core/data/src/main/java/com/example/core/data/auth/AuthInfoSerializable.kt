package com.example.core.data.auth

import kotlinx.serialization.Serializable

@Serializable
data class AuthInfoSerializable(
    val refreshToken: String,
    val accessToken: String,
    val userId: String
)