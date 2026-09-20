package com.ghan.sarvo2;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.*;
import android.view.*;
import android.Manifest;

public class MainActivity extends Activity {
  WebView web;
  @Override public void onCreate(Bundle b){ super.onCreate(b); web=new WebView(this); web.getSettings().setJavaScriptEnabled(true); web.getSettings().setDomStorageEnabled(true); web.getSettings().setAllowFileAccess(true); web.setWebChromeClient(new WebChromeClient()); web.setWebViewClient(new WebViewClient()); setContentView(web); if(android.os.Build.VERSION.SDK_INT>=23) requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},10); web.loadUrl("file:///android_asset/index.html"); }
  @Override public void onBackPressed(){ if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
