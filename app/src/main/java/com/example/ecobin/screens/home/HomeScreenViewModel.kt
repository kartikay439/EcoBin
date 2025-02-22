package com.example.ecobin.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecases.IsSignedUseCase
import kotlinx.coroutines.launch

class HomeScreenViewModel(val isSignedUseCase: IsSignedUseCase):ViewModel() {

   fun isSignOut():Boolean{
           return isSignedUseCase()
    }


}