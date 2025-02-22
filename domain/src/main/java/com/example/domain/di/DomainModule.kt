package com.example.domain.di

import com.example.domain.usecases.IsSignedUseCase
import org.koin.dsl.module

val domainModule = module{
    single {
        IsSignedUseCase(get())
    }




}