package com.example.auth.presentation.intro.register

sealed interface RegisterAction {
    data object OnTogglePasswordVisibilityClick: RegisterAction
    data object OnLoginClick: RegisterAction
    data object OnRegisterClick: RegisterAction
}