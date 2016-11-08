package com.example.pawan.delhiheartinstitute;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class details extends AppCompatActivity {
    WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        wb = (WebView) findViewById(R.id.detail);
        WebSettings wbsettings = wb.getSettings();
        wbsettings.setJavaScriptEnabled(true);
        wb.loadUrl("http//www.delhiheartinstitute.com");
    }
}
