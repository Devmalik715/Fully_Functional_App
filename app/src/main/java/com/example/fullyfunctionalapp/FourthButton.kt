package com.example.fullyfunctionalapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class FourthButton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_button2)

        val webView = findViewById<WebView>(R.id.webViewFourth)
        webViewSetUp(webView)
    }
    @SuppressLint("SetJavaScriptEnabled")
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(a:WebView){
        a.webViewClient= WebViewClient()
        a.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true
            loadUrl("https://prepinsta.com/top-100-codes/")
        }
    }
}