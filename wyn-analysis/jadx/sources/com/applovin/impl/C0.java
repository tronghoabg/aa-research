package com.applovin.impl;

import android.webkit.WebView;

/* loaded from: classes.dex */
public final /* synthetic */ class C0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f20756b;

    public /* synthetic */ C0(WebView webView, int i5) {
        this.f20755a = i5;
        this.f20756b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20755a) {
            case 0:
                this.f20756b.destroy();
                break;
            default:
                p8.a(this.f20756b);
                break;
        }
    }
}
