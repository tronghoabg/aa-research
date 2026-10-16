package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes4.dex */
public final class Q0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f30024a;

    /* renamed from: b, reason: collision with root package name */
    public final C1906u f30025b;

    /* renamed from: c, reason: collision with root package name */
    public final Y2.B f30026c;

    /* renamed from: d, reason: collision with root package name */
    public final C3338i f30027d;

    /* renamed from: e, reason: collision with root package name */
    public final Hf.x0 f30028e;

    /* renamed from: f, reason: collision with root package name */
    public final Hf.x0 f30029f;

    /* renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.internal.A f30030g;

    /* JADX WARN: Multi-variable type inference failed */
    public Q0(Kd.a scope, C1906u c1906u, Y2.B b5, tf.l lVar) {
        AbstractC3340k.e(scope, "scope");
        this.f30024a = scope;
        this.f30025b = c1906u;
        this.f30026c = b5;
        this.f30027d = (C3338i) lVar;
        Hf.x0 x0VarC = Hf.k0.c(Boolean.FALSE);
        this.f30028e = x0VarC;
        this.f30029f = x0VarC;
        this.f30030g = new com.moloco.sdk.internal.y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f30106f);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        Ef.H.D(this.f30024a, null, new P0(this, gVar, j8, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f30029f;
    }
}
