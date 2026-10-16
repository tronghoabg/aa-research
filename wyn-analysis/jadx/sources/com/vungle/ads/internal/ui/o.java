package com.vungle.ads.internal.ui;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class o extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public com.vungle.ads.internal.ui.view.p f33741a;

    public o(com.vungle.ads.internal.ui.view.p pVar) {
        this.f33741a = pVar;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        AbstractC3340k.e(webView, "webView");
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        AbstractC3340k.e(webView, "webView");
        boolean z2 = com.vungle.ads.internal.util.u.f33874a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new n(webView, webViewRenderProcess));
        com.vungle.ads.internal.ui.view.p pVar = this.f33741a;
        if (pVar != null) {
            ((com.vungle.ads.internal.presenter.r) pVar).e();
        }
    }
}
