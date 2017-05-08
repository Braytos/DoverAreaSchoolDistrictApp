package com.example.emailey.doverareaschooldistrictapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;
import android.widget.Toast;

/**
 * Created by Bmotter on 5/8/2017.
 */

public class DistrictPageFragment extends WebViewFragment {
    public WebView fDistrictWebView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_district_page, container, false);
        fDistrictWebView = (WebView) v.findViewById(R.id.fdistrictpagewebview);
        fDistrictWebView.loadUrl("http://www.doversd.org/district/");


        return v;

    }
}
