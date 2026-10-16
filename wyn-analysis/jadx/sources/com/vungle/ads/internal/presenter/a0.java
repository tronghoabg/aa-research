package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f33504a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.ui.z f33505b;

    public a0(com.vungle.ads.internal.ui.z webViewClient, WebView webView) {
        AbstractC3340k.e(webView, "webView");
        AbstractC3340k.e(webViewClient, "webViewClient");
        this.f33504a = webView;
        this.f33505b = webViewClient;
    }

    public final WebView a() {
        return this.f33504a;
    }

    public final com.vungle.ads.internal.ui.z b() {
        return this.f33505b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return AbstractC3340k.a(this.f33504a, a0Var.f33504a) && AbstractC3340k.a(this.f33505b, a0Var.f33505b);
    }

    public final int hashCode() {
        return this.f33505b.hashCode() + (this.f33504a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("WebViewEntry(webView=");
        sbA.append(this.f33504a);
        sbA.append(", webViewClient=");
        sbA.append(this.f33505b);
        sbA.append(')');
        return sbA.toString();
    }
}
