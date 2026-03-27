package com.example.auth.presentation.intro.login


sealed interface LoginAction {
    data object OnTogglePasswordVisibility: LoginAction
    data object OnLoginClick: LoginAction
    data object OnRegisterClick: LoginAction
}