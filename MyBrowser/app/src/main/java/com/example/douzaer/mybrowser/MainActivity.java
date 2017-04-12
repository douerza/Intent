package com.example.douzaer.mybrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取第三方app传入数据
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data == null) {
            String url = "https://www.baidu.com";
            data = Uri.parse(url);
        }
        WebView webview = (WebView) findViewById(R.id.web_view);
        WebSettings setting = webview.getSettings();
        setting.setJavaScriptEnabled(true);
        //访问网页
        webview.loadUrl(data.toString());
        webview.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return true;
            }

        });
    }


}



