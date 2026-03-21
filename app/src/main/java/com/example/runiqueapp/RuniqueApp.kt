package com.example.runiqueapp

import android.app.Application
import com.example.auth.data.di.authDataModule
import com.example.auth.presentation.intro.di.authViewModelModule
import com.example.core.data.BuildConfig
import com.example.core.data.di.coreDataModule
import com.example.runiqueapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import timber.log.Timber


class RuniqueApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule
            )
        }
    }
}