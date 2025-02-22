package com.example.data.repository_impl

import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth

class AuthRepository(val firebaseAuth:FirebaseAuth) {



    fun isSignedIn():Boolean{
            return firebaseAuth.currentUser == null
    }



}