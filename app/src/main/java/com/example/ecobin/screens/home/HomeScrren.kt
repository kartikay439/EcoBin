package com.example.ecobin.screens.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(navController: NavHostController,homeScreenViewModel: HomeScreenViewModel = koinViewModel()) {
    if(homeScreenViewModel.isSignOut()){
        navController.navigate("signup")
    }
}