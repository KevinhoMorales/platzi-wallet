package com.cristianvillamil.platziwallet.ui.home.data.adapter

import com.cristianvillamil.platziwallet.ui.home.view.adapter.UserViewModel

// ADAPTER
class UserAdapter() {
    fun getUserViewModel(userResponse: UserResponse): UserViewModel =
        UserViewModel(userResponse.name, userResponse.userPhotoURL)

}