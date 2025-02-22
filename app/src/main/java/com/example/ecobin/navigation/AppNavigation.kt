package com.example.ecobin.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecobin.screens.home.HomeScreen
import com.example.ecobin.screens.signin.SignInScreen
import com.example.ecobin.screens.signup.SignUpScreen
import com.example.ecobin.screens.upload.UploadScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home") { HomeScreen(navController) }
        composable("upload") { UploadScreen(navController) }
        composable("signin") { SignInScreen(navController) }
        composable("signup") { SignUpScreen(navController) }

//        composable("collectors") { CollectScreen(navController)




    }





}