package com.bbva.plaid

import android.content.Context
import android.content.Intent


class PlaidPluginManager constructor(private val context: Context) {

    fun startPlaidPlugin(linkToken: String) {
        val intent = Intent(context, PlaidPluginActivity::class.java)
        intent.putExtra("link_token", linkToken)
        context.startActivity(intent)
    }

}