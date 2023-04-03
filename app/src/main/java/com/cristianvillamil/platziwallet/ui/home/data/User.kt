package com.cristianvillamil.platziwallet.ui.home.data

// BUILDER
class User private constructor(private val userName: String, private val password: String) {
    class Builder {
        private var userName: String = ""
        private var password: String = ""
        fun setUserName(newUserName: String): Builder {
            userName = newUserName
            return this
        }
        fun setPassword(newPassword: String): Builder {
            password = newPassword
            return this
        }
//        fun build(): User {
//            return User(userName, password)
//        }
        fun build(): User = User(userName, password)
    }
}