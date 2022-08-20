package com.bbva.demoplaid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bbva.plaid.PlaidPluginManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PlaidPluginManager(this).apply {
            startPlaidPlugin("link-sandbox-a43725d8-b1b8-421e-89a2-43cdc73842b1")
        }
        finish()
    }
}