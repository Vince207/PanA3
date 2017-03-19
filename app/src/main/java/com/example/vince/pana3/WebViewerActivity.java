package com.example.vince.pana3;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewerActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        String urlAdress = getIntent().getStringExtra("URL");
        WebView viewUrl = (WebView)findViewById(R.id.MyWebView);
        viewUrl.getSettings().setJavaScriptEnabled(true);
        viewUrl.setWebViewClient(new WebViewClient());
        viewUrl.loadUrl(urlAdress);
        setContentView(viewUrl);


    }


}
