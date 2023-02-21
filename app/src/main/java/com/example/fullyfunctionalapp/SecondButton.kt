package com.example.fullyfunctionalapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class SecondButton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_button)

        val webView= findViewById<WebView>(R.id.webViewSecond)
        webViewSetUp(webView)

    }
    private fun webViewSetUp(a:WebView) {
        a.webViewClient= WebViewClient()

        a.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.geeksforgeeks.org/python-programming-language/?ref=shm")
        }
    }
}