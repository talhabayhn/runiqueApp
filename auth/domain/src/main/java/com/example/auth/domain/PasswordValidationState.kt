package com.example.auth.domain

data class PasswordValidationState(
    val hasMinLenght: Boolean = false,
    val hasNumber: Boolean = false,
    val hasLowerCaseCharacter: Boolean = false,
    val hasUpperCaseCharacter: Boolean = false
) {
    val isValidPassword: Boolean
        get() = hasMinLenght && hasNumber && hasLowerCaseCharacter && hasUpperCaseCharacter
}
