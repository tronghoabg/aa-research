package com.vungle.ads.internal.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class t extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebView f33746a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RenderProcessGoneDetail f33747b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        super(0);
        this.f33746a = webView;
        this.f33747b = renderProcessGoneDetail;
    }

    @Override // tf.a
    public final Object invoke() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onRenderProcessGone url: ");
        WebView webView = this.f33746a;
        sbA.append(webView != null ? webView.getUrl() : null);
        sbA.append(", did crash: ");
        RenderProcessGoneDetail renderProcessGoneDetail = this.f33747b;
        sbA.append(renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null);
        return sbA.toString();
    }
}
