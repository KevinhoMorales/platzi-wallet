package com.cristianvillamil.platziwallet.ui

// PROXY
class TransferProxy {
    private val MAX_TRANSFER_AMOUNT = 1000000
    private val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double): String {
        return when {
            amount > MAX_TRANSFER_AMOUNT -> "MAX AMOUNT"
            amount < MIN_TRANSFER_AMOUNT -> "MIN AMOUNT"
            else -> {
                doTransfer(amount)
                "SUCCESS!"
            }
        }
    }

    private fun doTransfer(amount: Double) {

    }
}