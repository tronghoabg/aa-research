package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC1644j0;
import com.applovin.impl.n8;

/* loaded from: classes.dex */
public class l extends AbstractC1644j0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f21093c;

    public l(String str, com.applovin.impl.sdk.ad.b bVar, n8 n8Var, Context context) {
        super(context);
        this.f21093c = str;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        if (bVar.I0()) {
            applySettings(bVar);
        } else {
            settings.setAllowFileAccess(true);
            if (bVar.D0()) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        }
        setWebViewClient(n8Var);
        setWebChromeClient(new WebChromeClient());
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
    }

    public void a(String str) {
        loadDataWithBaseURL(this.f21093c, str, "text/html", null, "");
    }
}
