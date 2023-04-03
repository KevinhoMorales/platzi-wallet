package com.cristianvillamil.platziwallet.ui.facade

// FACADE
class TransferFacade {
    val analyticsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val transferManager = TransferManager()

    fun transfer() {
        val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.transfer(token)
    }
}