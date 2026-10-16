package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class L implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29974a;

    /* renamed from: b, reason: collision with root package name */
    public final C1906u f29975b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f29976c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29977d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f29978e;

    /* renamed from: f, reason: collision with root package name */
    public final Kd.a f29979f;

    /* renamed from: g, reason: collision with root package name */
    public final H f29980g;

    /* renamed from: h, reason: collision with root package name */
    public final Hf.x0 f29981h;

    /* renamed from: i, reason: collision with root package name */
    public final Hf.x0 f29982i;

    /* renamed from: j, reason: collision with root package name */
    public final Hf.x0 f29983j;
    public final Hf.x0 k;

    public L(Context context, C1906u bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E e7, Y2.B b5, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, com.moloco.sdk.acm.recorder.c cVar) {
        AbstractC3340k.e(bid, "bid");
        this.f29974a = context;
        this.f29975b = bid;
        this.f29976c = vVar;
        this.f29977d = cVar;
        this.f29978e = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32379a;
        Lf.e eVar = Ef.S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f29979f = aVarC;
        this.f29980g = new H(bid, aVarC, e7, b5, z2, cVar);
        Boolean bool = Boolean.FALSE;
        Hf.x0 x0VarC = Hf.k0.c(bool);
        this.f29981h = x0VarC;
        this.f29982i = x0VarC;
        Hf.x0 x0VarC2 = Hf.k0.c(bool);
        this.f29983j = x0VarC2;
        this.k = x0VarC2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.f29980g.a(j8, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.j(this.f29979f, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f29978e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f29980g.f29952i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final Hf.v0 k() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return this.f29982i;
    }
}
