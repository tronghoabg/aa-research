package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.C0588a0;
import android.content.Context;
import ef.C2532p;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2002l extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e {

    /* renamed from: g, reason: collision with root package name */
    public final Context f30219g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t f30220h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g f30221i;

    /* renamed from: j, reason: collision with root package name */
    public final C1992g f30222j;
    public final Kd.a k;

    /* renamed from: l, reason: collision with root package name */
    public final ae.b f30223l;

    /* renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30224m;

    /* renamed from: n, reason: collision with root package name */
    public final C2532p f30225n;

    public C2002l(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t watermark, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar, C1992g c1992g, Kd.a scope) {
        ae.b bVar = new ae.b();
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(watermark, "watermark");
        AbstractC3340k.e(scope, "scope");
        super(context, scope);
        this.f30219g = context;
        this.f30220h = watermark;
        this.f30221i = gVar;
        this.f30222j = c1992g;
        this.k = scope;
        this.f30223l = bVar;
        setTag("MolocoStaticBannerView");
        this.f30224m = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32381c;
        this.f30225n = Fe.c.z(new Af.q(this, 15));
    }

    public static final Hf.e0 c(C2002l c2002l) {
        return Hf.k0.x(new C0588a0(super.l(), c2002l.f30221i.f30544g, new com.moloco.sdk.internal.publisher.L(3, null, 2)), c2002l.k, Hf.n0.f5168a, Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    public final void b() {
        C2000k c2000k = new C2000k(this, null);
        Ef.H.C(this.k, C3109i.f38759a, Ef.F.f3663a, c2000k);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        super.destroy();
        this.f30221i.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30224m;
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t getWatermark() {
        return this.f30220h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return (Hf.v0) this.f30225n.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e
    @NotNull
    public C1992g getAdLoader() {
        return this.f30222j;
    }
}
