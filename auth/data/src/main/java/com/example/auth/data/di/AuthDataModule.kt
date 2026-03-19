package com.example.auth.data.di

import com.example.auth.data.EmailPatternValidator
import com.example.auth.domain.PatternValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.example.auth.domain.UserDataValidator

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}