package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class s0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30502a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.events.c f30503b;

    /* renamed from: c, reason: collision with root package name */
    public final C1906u f30504c;

    /* renamed from: d, reason: collision with root package name */
    public final G0 f30505d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v f30506e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f30507f;

    /* renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f30508g;

    /* renamed from: h, reason: collision with root package name */
    public final Kd.a f30509h;

    /* renamed from: i, reason: collision with root package name */
    public L f30510i;

    /* renamed from: j, reason: collision with root package name */
    public C1984c f30511j;
    public C2028q k;

    /* renamed from: l, reason: collision with root package name */
    public final ab.b f30512l;

    /* renamed from: m, reason: collision with root package name */
    public final Hf.x0 f30513m;

    /* renamed from: n, reason: collision with root package name */
    public final Hf.x0 f30514n;

    /* renamed from: o, reason: collision with root package name */
    public final Hf.x0 f30515o;

    /* renamed from: p, reason: collision with root package name */
    public final Hf.x0 f30516p;

    /* renamed from: q, reason: collision with root package name */
    public final Hf.x0 f30517q;

    /* renamed from: r, reason: collision with root package name */
    public final Hf.x0 f30518r;

    public s0(Context context, com.moloco.sdk.internal.services.events.c cVar, C1906u bid, G0 g02, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v vVar, com.moloco.sdk.acm.recorder.c cVar2) {
        AbstractC3340k.e(bid, "bid");
        this.f30502a = context;
        this.f30503b = cVar;
        this.f30504c = bid;
        this.f30505d = g02;
        this.f30506e = vVar;
        this.f30507f = cVar2;
        this.f30508g = null;
        Lf.e eVar = Ef.S.f3698a;
        this.f30509h = Ef.H.c(Jf.n.f6132a);
        this.f30512l = new ab.b();
        Boolean bool = Boolean.FALSE;
        Hf.x0 x0VarC = Hf.k0.c(bool);
        this.f30513m = x0VarC;
        this.f30514n = x0VarC;
        Hf.x0 x0VarC2 = Hf.k0.c(bool);
        this.f30515o = x0VarC2;
        this.f30516p = x0VarC2;
        Hf.x0 x0VarC3 = Hf.k0.c(bool);
        this.f30517q = x0VarC3;
        this.f30518r = x0VarC3;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0 r24, lf.AbstractC3464c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0, lf.c):java.lang.Object");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        Ef.H.D(this.f30509h, null, new C2005m0(this, j8, gVar, null), 3);
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o c() {
        L l10 = this.f30510i;
        if (l10 != null) {
            return l10;
        }
        C1984c c1984c = this.f30511j;
        return c1984c == null ? this.k : c1984c;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.j(this.f30509h, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVarC = c();
        if (oVarC != null) {
            oVarC.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getCreativeType() {
        return this.f30508g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f30514n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public final Hf.v0 k() {
        return this.f30518r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f
    public final Hf.v0 l() {
        return this.f30516p;
    }
}
