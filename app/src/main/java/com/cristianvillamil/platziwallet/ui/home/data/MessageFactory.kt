package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

// FACTORY
class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSuccess"
        val TYPE_INFO = "typeSuccess"
    }
    fun getDialog(context: Context, type: String): AlertDialog.Builder {
        when(type) {
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("ERROR!")
            }
            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("SUCCESS!")
            }
            TYPE_INFO -> {
                return AlertDialog.Builder(context)
                    .setMessage("INFO!")
            }
        }
        return AlertDialog.Builder(context)
            .setMessage("ADD NEW TYPE")
    }
}