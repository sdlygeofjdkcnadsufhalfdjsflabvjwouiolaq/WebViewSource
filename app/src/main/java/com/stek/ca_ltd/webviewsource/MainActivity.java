package com.stek.ca_ltd.webviewsource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
public WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(" http://youtube.com");
        webView.getSettings().setMediaPlaybackRequiresUserGesture(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setPluginState (WebSettings.PluginState.ON);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/cache");
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setDatabasePath(getApplicationContext().getFilesDir().getAbsolutePath() + "/databases");
    //    webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient(){});


      //  WebSettings webSettings = webView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed(){
        if(webView.canGoBack()) {

            webView.goBack();
        }

else{
    super.onBackPressed();

}

    }
}
