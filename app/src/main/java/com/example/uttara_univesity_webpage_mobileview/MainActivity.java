package com.example.uttara_univesity_webpage_mobileview;

import static android.provider.Contacts.Settings.getSetting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        webView = findViewById(R.id.webView_Id);


        //Java code/File Enable .
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Another page view by one application .
        webView.setWebViewClient(new WebViewClient());


        webView.loadUrl("https://uttarauniversity.edu.bd/");


    }
}