package com.example.syl.compicool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        String url="https://www.google.hu";
        WebView web=(WebView)findViewById(R.id.webView);
        web.loadUrl(url);
    }
}
