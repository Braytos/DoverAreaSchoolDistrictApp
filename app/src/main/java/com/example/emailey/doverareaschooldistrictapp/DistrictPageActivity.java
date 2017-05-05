package com.example.emailey.doverareaschooldistrictapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class DistrictPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.district_page_activity);
        //Creates the webview, then loads it onto the District page
        WebView districtpage = (WebView) findViewById(R.id.districtpagewebview);

        // Load the client
        districtpage.getSettings().setJavaScriptEnabled(true);
        final Activity activity = this;
        districtpage.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Progresses until it reaches 100%, when it will disappear
                activity.setProgress(progress * 1000);
            }
        });
        //Error handling
        districtpage.setWebViewClient(new WebViewClient() {
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(activity, "Oh no! " + description, Toast.LENGTH_SHORT).show();
            }
        });
        districtpage.loadUrl("http://www.doversd.org/district/");
    }
}
