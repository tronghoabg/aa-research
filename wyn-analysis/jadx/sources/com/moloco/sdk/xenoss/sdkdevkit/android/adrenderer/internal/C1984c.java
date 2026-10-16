package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Ef.C0507p0;
import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1984c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30056a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f30057b;

    /* renamed from: c, reason: collision with root package name */
    public final Q0 f30058c;

    /* renamed from: d, reason: collision with root package name */
    public final H0 f30059d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t f30060e;

    /* renamed from: f, reason: collision with root package name */
    public final String f30061f;

    /* renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30062g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30063h;

    /* renamed from: i, reason: collision with root package name */
    public final Kd.a f30064i;

    /* renamed from: j, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g f30065j;
    public com.moloco.sdk.internal.publisher.i0 k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30066l;

    /* renamed from: m, reason: collision with root package name */
    public final Hf.x0 f30067m;

    /* renamed from: n, reason: collision with root package name */
    public final Hf.x0 f30068n;

    /* renamed from: o, reason: collision with root package name */
    public final Hf.x0 f30069o;

    /* renamed from: p, reason: collision with root package name */
    public final Hf.x0 f30070p;

    public C1984c(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, Q0 q02, H0 h02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.t tVar, String str, com.moloco.sdk.acm.recorder.c cVar) {
        Hf.j0 j0Var = MraidActivity.f30371h;
        this.f30056a = context;
        this.f30057b = vVar;
        this.f30058c = q02;
        this.f30059d = h02;
        this.f30060e = tVar;
        this.f30061f = str;
        this.f30062g = cVar;
        this.f30063h = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32380b;
        Lf.e eVar = Ef.S.f3698a;
        this.f30064i = Ef.H.c(Jf.n.f6132a);
        Boolean bool = Boolean.FALSE;
        Hf.x0 x0VarC = Hf.k0.c(bool);
        this.f30067m = x0VarC;
        this.f30068n = x0VarC;
        Hf.x0 x0VarC2 = Hf.k0.c(bool);
        this.f30069o = x0VarC2;
        this.f30070p = x0VarC2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.f30065j = gVar;
        this.f30059d.f30431e = new C0507p0(1, this, C1984c.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0, 3);
        this.f30058c.a(j8, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.j(this.f30064i, null);
        this.f30059d.destroy();
        Boolean bool = Boolean.FALSE;
        Hf.x0 x0Var = this.f30067m;
        x0Var.getClass();
        x0Var.k(null, bool);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30063h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f30058c.f30029f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final Hf.v0 k() {
        return this.f30070p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return this.f30068n;
    }
}
