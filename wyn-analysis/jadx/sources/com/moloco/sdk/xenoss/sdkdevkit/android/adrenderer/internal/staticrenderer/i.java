package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Ef.H;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.x0;
import R8.v;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.B;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class i extends WebViewClientCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f30549a;

    /* renamed from: b, reason: collision with root package name */
    public final B f30550b;

    /* renamed from: c, reason: collision with root package name */
    public final s f30551c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f30552d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f30553e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f30554f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f30555g;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f30556h;

    /* renamed from: i, reason: collision with root package name */
    public final e0 f30557i;

    /* renamed from: j, reason: collision with root package name */
    public final j0 f30558j;
    public final j0 k;

    /* renamed from: l, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f30559l;

    public i(Kd.a aVar, B clickthroughService, s buttonTracker) {
        AbstractC3340k.e(clickthroughService, "clickthroughService");
        AbstractC3340k.e(buttonTracker, "buttonTracker");
        this.f30549a = aVar;
        this.f30550b = clickthroughService;
        this.f30551c = buttonTracker;
        Boolean bool = Boolean.FALSE;
        x0 x0VarC = k0.c(bool);
        this.f30552d = x0VarC;
        this.f30553e = x0VarC;
        x0 x0VarC2 = k0.c(bool);
        this.f30554f = x0VarC2;
        this.f30555g = new e0(x0VarC2);
        x0 x0VarC3 = k0.c(null);
        this.f30556h = x0VarC3;
        this.f30557i = new e0(x0VarC3);
        j0 j0VarB = k0.b(0, 0, 7);
        this.f30558j = j0VarB;
        this.k = j0VarB;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Boolean bool = Boolean.TRUE;
        x0 x0Var = this.f30552d;
        x0Var.getClass();
        x0Var.k(null, bool);
        x0 x0Var2 = this.f30554f;
        x0Var2.getClass();
        x0Var2.k(null, bool);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i5, String str, String str2) {
        super.onReceivedError(webView, i5, str, str2);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f30125c;
        x0 x0Var = this.f30556h;
        x0Var.getClass();
        x0Var.k(null, gVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", v.f("onReceivedError ", str), null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g.f30126d;
        x0 x0Var = this.f30556h;
        x0Var.getClass();
        x0Var.k(null, gVar);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.f30559l) == null) {
            return true;
        }
        H.D(this.f30549a, null, new h(this, str, aVar, null), 3);
        return true;
    }
}
