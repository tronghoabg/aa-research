package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.C1906u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class H implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

    /* renamed from: a, reason: collision with root package name */
    public final C1906u f29944a;

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f29945b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E f29946c;

    /* renamed from: d, reason: collision with root package name */
    public final Y2.B f29947d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29948e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29949f;

    /* renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.internal.A f29950g;

    /* renamed from: h, reason: collision with root package name */
    public final Hf.x0 f29951h;

    /* renamed from: i, reason: collision with root package name */
    public final Hf.e0 f29952i;

    /* renamed from: j, reason: collision with root package name */
    public Ef.H0 f29953j;
    public com.moloco.sdk.acm.l k;

    /* renamed from: l, reason: collision with root package name */
    public String f29954l;

    public H(C1906u bid, Kd.a scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.E e7, Y2.B b5, boolean z2, com.moloco.sdk.acm.recorder.c cVar) {
        AbstractC3340k.e(bid, "bid");
        AbstractC3340k.e(scope, "scope");
        this.f29944a = bid;
        this.f29945b = scope;
        this.f29946c = e7;
        this.f29947d = b5;
        this.f29948e = z2;
        this.f29949f = cVar;
        this.f29950g = new com.moloco.sdk.internal.y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.k.f30146a);
        Hf.x0 x0VarC = Hf.k0.c(Boolean.FALSE);
        this.f29951h = x0VarC;
        this.f29952i = new Hf.e0(x0VarC);
    }

    public static final void b(H h10, Ef.K k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
        h10.getClass();
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastAdLoad", "Vast AD failed to load: " + cVar, null, false, 12, null);
        k.cancel(null);
        h10.f29950g = new com.moloco.sdk.internal.y(cVar);
        gVar.e(cVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final void a(long j8, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar) {
        boolean z2 = this.f29948e;
        Kd.a aVar = this.f29945b;
        if (z2) {
            Ef.H0 h02 = this.f29953j;
            if (h02 != null) {
                h02.cancel(null);
            }
            this.f29953j = Ef.H.D(aVar, null, new G(this, gVar, j8, null), 3);
            return;
        }
        Ef.H0 h03 = this.f29953j;
        if (h03 != null) {
            h03.cancel(null);
        }
        this.f29953j = Ef.H.D(aVar, null, new D(this, gVar, j8, null), 3);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
    public final Hf.v0 isLoaded() {
        return this.f29952i;
    }
}
