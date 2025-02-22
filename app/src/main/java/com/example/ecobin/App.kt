package com.example.ecobin

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.ecobin.di.appModule
import com.google.firebase.FirebaseApp
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EcoBinApp:Application(){
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
        startKoin{
            androidContext(this@EcoBinApp)
            modules(
                appModule,
                domainModule,
                dataModule
            )
        }
    }
}