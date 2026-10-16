package com.vungle.ads.internal.presenter;

import android.webkit.WebView;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes5.dex */
public final class h extends AbstractC3343n implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f33524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar) {
        super(0);
        this.f33524a = rVar;
    }

    @Override // tf.a
    public final Object invoke() {
        com.vungle.ads.internal.ui.z zVar = this.f33524a.f33543d;
        WebView webView = zVar.f33821m;
        if (webView != null) {
            zVar.a(webView, "window.vungle.mraidBridgeExt.notifyPresentAppStoreFailed(0)");
        }
        return C2515C.f34653a;
    }
}
