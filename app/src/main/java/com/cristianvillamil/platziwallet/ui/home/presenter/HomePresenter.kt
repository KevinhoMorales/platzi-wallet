package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view: HomeContract.View): HomeContract.Presenter {

    private val homeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers()   {
        view.showLoading()
        homeInteractor.retrieveFavoriteTransfersFromCache(object: HomeContract.OnResponseCallback {
            override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {
                UserSingleton.userName
//                val user = User("userName", "4DR23R")
                val user = User.Builder()
                    .setUserName("userName")
                    .setPassword("@#53452")
                    .build()
                view.hideLoading()
                view.showFavoriteTransfers(favoriteTransfer)
            }
        })
    }
}