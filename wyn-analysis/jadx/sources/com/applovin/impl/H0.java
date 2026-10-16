package com.applovin.impl;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class H0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f20782b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f20783c;

    public /* synthetic */ H0(int i5, WebView webView, String str) {
        this.f20781a = i5;
        this.f20782b = webView;
        this.f20783c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20781a) {
            case 0:
                this.f20782b.loadUrl(this.f20783c);
                break;
            default:
                this.f20782b.evaluateJavascript(this.f20783c, null);
                break;
        }
    }
}
