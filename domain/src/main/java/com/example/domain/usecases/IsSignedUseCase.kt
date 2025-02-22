package com.example.domain.usecases

import com.example.data.repository_impl.AuthRepository

class IsSignedUseCase(val authRepository: AuthRepository) {
    operator fun invoke():Boolean{
    return authRepository.isSignedIn()
    }
}