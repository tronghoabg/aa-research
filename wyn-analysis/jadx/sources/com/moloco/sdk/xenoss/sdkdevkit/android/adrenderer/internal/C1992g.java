package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1992g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f30183a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30184b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g f30185c;

    /* renamed from: d, reason: collision with root package name */
    public final Hf.x0 f30186d;

    /* renamed from: e, reason: collision with root package name */
    public final Hf.x0 f30187e;

    public C1992g(String adm, Kd.a scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar) {
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(scope, "scope");
        this.f30183a = adm;
        this.f30184b = scope;
        this.f30185c = gVar;
        Hf.x0 x0VarC = Hf.k0.c(Boolean.FALSE);
        this.f30186d = x0VarC;
        this.f30187e = x0VarC;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        Ef.H.D(this.f30184b, null, new C1990f(this, j8, gVar, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f30187e;
    }
}
