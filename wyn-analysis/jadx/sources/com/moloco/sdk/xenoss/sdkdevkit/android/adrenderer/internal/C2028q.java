package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import ef.C2532p;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2028q implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30485a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f30486b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30487c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30488d;

    /* renamed from: e, reason: collision with root package name */
    public final Kd.a f30489e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g f30490f;

    /* renamed from: g, reason: collision with root package name */
    public final C1992g f30491g;

    /* renamed from: h, reason: collision with root package name */
    public final Hf.x0 f30492h;

    /* renamed from: i, reason: collision with root package name */
    public final C2532p f30493i;

    /* renamed from: j, reason: collision with root package name */
    public final Hf.x0 f30494j;

    public C2028q(Context context, com.moloco.sdk.internal.services.events.c cVar, String adm, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(adm, "adm");
        this.f30485a = context;
        this.f30486b = vVar;
        this.f30487c = cVar2;
        this.f30488d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.f32381c;
        Lf.e eVar = Ef.S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f30489e = aVarC;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g gVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.g(context, new com.moloco.sdk.internal.services.B(g02, cVar), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s(), false, 50);
        this.f30490f = gVar;
        this.f30491g = new C1992g(adm, aVarC, gVar);
        Boolean bool = Boolean.FALSE;
        this.f30492h = Hf.k0.c(bool);
        this.f30493i = Fe.c.z(new Af.q(this, 16));
        this.f30494j = Hf.k0.c(bool);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        this.f30491g.a(j8, gVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.j(this.f30489e, null);
        this.f30490f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30488d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f30491g.f30187e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final Hf.v0 k() {
        return this.f30494j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return (Hf.v0) this.f30493i.getValue();
    }
}
