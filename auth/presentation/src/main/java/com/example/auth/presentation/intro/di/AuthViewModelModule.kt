package com.example.auth.presentation.intro.di

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module
import com.example.auth.presentation.intro.register.RegisterViewModel

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
}