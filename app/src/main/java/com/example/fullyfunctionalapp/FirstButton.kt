package com.example.fullyfunctionalapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class FirstButton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_button)

        val webView = findViewById<WebView>(R.id.webViewOne)
        webViewSetUp(webView)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewSetUp(a: WebView){
        a.webViewClient= WebViewClient()

        a.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true
            loadUrl("https://www.geeksforgeeks.org/learn-data-structures-and-algorithms-dsa-tutorial/?ref=shm")

        }
    }
}