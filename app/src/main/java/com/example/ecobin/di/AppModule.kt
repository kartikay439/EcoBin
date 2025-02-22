package com.example.ecobin.di

import androidx.navigation.compose.rememberNavController
import com.example.data.repository_impl.AuthRepository
import com.example.ecobin.screens.home.HomeScreenViewModel
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module{
    single {
        FirebaseAuth.getInstance()
    }
    single {
        AuthRepository(get())
    }
    viewModel {
        HomeScreenViewModel(get())
    }

}