package com.waze.sharedrive.e;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ch implements cc {

    /* renamed from: a, reason: collision with root package name */
    private final q f38488a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38489b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f38490c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f38491d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f38492e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38493f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38494g;

    public ch(e eVar, q qVar, com.waze.sharedrive.d.aq aqVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(eVar, "createSharePreviewStateHolderFactory");
        h.g.b.x.f(qVar, "joinSharePreviewStateHolderFactory");
        h.g.b.x.f(aqVar, "shareDriveController");
        h.g.b.x.f(eVar2, "logger");
        this.f38488a = qVar;
        this.f38494g = aqVar;
        this.f38489b = eVar2;
        kotlinx.coroutines.af afVarG = kotlinx.coroutines.aj.g(com.waze.ui.a.l.p(this, "ShareDriveStateHolder"), new ce(CoroutineExceptionHandler.f51269c, this));
        this.f38490c = afVarG;
        kotlinx.coroutines.b.k kVarD = eVar.d();
        this.f38491d = kVarD;
        kotlinx.coroutines.b.k kVarR = kotlinx.coroutines.b.ai.R(aqVar.n(), new cf(null, this));
        this.f38492e = kVarR;
        kotlinx.coroutines.b.k kVarR2 = kotlinx.coroutines.b.ai.r(kVarD, kVarR, aqVar.n(), new cg(null));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f38493f = kotlinx.coroutines.b.ai.V(kVarR2, afVarG, kotlinx.coroutines.b.by.c(), null);
    }

    @Override // com.waze.sharedrive.e.cc
    public final kotlinx.coroutines.b.ch a() {
        return this.f38493f;
    }

    @Override // com.waze.sharedrive.e.cc
    public final void b() {
        this.f38494g.I();
    }

    @Override // com.waze.sharedrive.e.cc
    public final void c() {
        this.f38494g.F();
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f38490c, null);
    }

    @Override // com.waze.sharedrive.e.cc
    public final void d() {
        this.f38494g.x();
    }
}
