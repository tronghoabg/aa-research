package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* loaded from: classes3.dex */
public final class zzfwj extends zzfwi {
    public zzfwj(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzc(webView);
    }
}
