@file:OptIn(ExperimentalFoundationApi::class)

package com.example.auth.presentation.intro.login

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text2.input.TextFieldState


data class LoginState(
    val email: TextFieldState = TextFieldState(),
    val password: TextFieldState = TextFieldState(),
    val isPasswordVisible: Boolean = false,
    val canLogin: Boolean = false,
    val isLoggingIn: Boolean = false
)