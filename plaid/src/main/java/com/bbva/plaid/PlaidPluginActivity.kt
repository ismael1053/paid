package com.bbva.plaid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.plaid.link.OpenPlaidLink
import com.plaid.link.configuration.LinkTokenConfiguration

class PlaidPluginActivity : AppCompatActivity() {

    private val linkAccountToPlaid = registerForActivityResult(OpenPlaidLink()) { result ->

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val linkToken = intent.getStringExtra("link_token")
        onLinkTokenSuccess(linkToken.orEmpty())
    }

    private fun onLinkTokenSuccess(linkToken: String) {
        val tokenConfiguration = LinkTokenConfiguration.Builder()
            .token(linkToken)
            .build()
        linkAccountToPlaid.launch(tokenConfiguration)
    }
}