package com.cristianvillamil.platziwallet

// SINGLETON

// JAVA
//class UserSingleton {
//    val userName = "Kevinho Morales"
//    companion object {
//        private var instance: UserSingleton? = null
//        fun getInstance(): UserSingleton {
//            if (instance == null) {
//                instance = UserSingleton()
//            }
//            return instance as UserSingleton
//        }
//    }
//}

// KOTLIN
object UserSingleton {
    val userName = "Kevinho Morales"
}