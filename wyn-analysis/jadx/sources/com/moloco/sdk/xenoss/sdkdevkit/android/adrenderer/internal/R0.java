package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Ef.C0507p0;
import android.content.Context;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class R0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {

    /* renamed from: g, reason: collision with root package name */
    public final Context f30031g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t f30032h;

    /* renamed from: i, reason: collision with root package name */
    public final ae.b f30033i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30034j;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w k;

    /* renamed from: l, reason: collision with root package name */
    public final Q0 f30035l;

    public R0(Context context, String adm, G0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t watermark, Kd.a scope) {
        ae.b bVar = new ae.b();
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        AbstractC3340k.e(watermark, "watermark");
        AbstractC3340k.e(scope, "scope");
        super(context, scope);
        this.f30031g = context;
        this.f30032h = watermark;
        this.f30033i = bVar;
        setTag("MolocoMraidBannerView");
        this.f30034j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32380b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w wVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w(context, adm, new S8.d(0, this, R0.class, "detachMraidViewFromAdViewWrapper", "detachMraidViewFromAdViewWrapper()V", 0, 23), new S8.d(0, this, R0.class, "attachMraidViewToAdViewWrapper", "attachMraidViewToAdViewWrapper()V", 0, 24), new Af.q(this, 24), new Af.r(this, 25), externalLinkHandler, new K8.H(context, scope, false), null, 1536);
        this.k = wVar;
        this.f30035l = new Q0(scope, null, com.moloco.sdk.service_locator.a.a(), new C0507p0(1, wVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w.class, "loadAndReadyMraid", "loadAndReadyMraid(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        K8.H h10 = this.k.f30433g;
        this.f30033i.getClass();
        FrameLayout frameLayoutA = ae.b.a(this.f30031g, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.O) h10.f6587f);
        ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v) this.f30032h).b(frameLayoutA);
        setAdView(frameLayoutA);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        super.destroy();
        this.k.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30034j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public Q0 getAdLoader() {
        return this.f30035l;
    }
}
