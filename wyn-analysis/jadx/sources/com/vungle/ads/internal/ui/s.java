package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class s extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f33745a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(WebView webView) {
        super(0);
        this.f33745a = webView;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.f33745a;
        sbA.append(webView != null ? webView.getUrl() : null);
        return sbA.toString();
    }
}
