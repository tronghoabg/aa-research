package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class n extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f33739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebViewRenderProcess f33740b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        super(0);
        this.f33739a = webView;
        this.f33740b = webViewRenderProcess;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onRenderProcessUnresponsive(Title = ");
        sbA.append(this.f33739a.getTitle());
        sbA.append(", URL = ");
        sbA.append(this.f33739a.getOriginalUrl());
        sbA.append(", (webViewRenderProcess != null) = ");
        sbA.append(this.f33740b != null);
        return sbA.toString();
    }
}
