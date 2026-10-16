package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Ef.H;
import Ef.S;
import Hf.e0;
import Hf.k0;
import Hf.v0;
import Hf.x0;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.moloco.sdk.internal.MolocoLogger;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class i extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l f30725a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30726b;

    /* renamed from: c, reason: collision with root package name */
    public final o f30727c;

    /* renamed from: d, reason: collision with root package name */
    public final Kd.a f30728d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f30729e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f30730f;

    /* renamed from: g, reason: collision with root package name */
    public final e0 f30731g;

    public i(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.l lVar2, com.moloco.sdk.acm.recorder.c cVar, boolean z2) {
        o oVar = new o(lVar, cVar, z2);
        super(context);
        this.f30725a = lVar2;
        this.f30726b = cVar;
        this.f30727c = oVar;
        Lf.e eVar = S.f3698a;
        this.f30728d = H.c(Jf.n.f6132a);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f30591a;
        this.f30729e = k0.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b());
        setWebViewClient(oVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f30730f = oVar.f30755j;
        this.f30731g = oVar.f30753h;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @NotNull
    public final v0 getOrientation$moloco_sdk_release() {
        return this.f30729e;
    }

    @NotNull
    public final v0 getUnrecoverableError() {
        return this.f30730f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        H.j(this.f30728d, null);
    }
}
