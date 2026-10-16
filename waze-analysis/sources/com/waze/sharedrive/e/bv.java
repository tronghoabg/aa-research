package com.waze.sharedrive.e;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bv implements bp {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.s f38462a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38463b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f38464c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38465d;

    public bv(com.waze.sharedrive.d.aq aqVar, com.waze.sharedrive.s sVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aqVar, "sharedDriveController");
        h.g.b.x.f(sVar, "indicationController");
        h.g.b.x.f(eVar, "logger");
        this.f38465d = aqVar;
        this.f38462a = sVar;
        this.f38463b = eVar;
        kotlinx.coroutines.af afVarG = kotlinx.coroutines.aj.g(com.waze.ui.a.l.p(this, null), new bu(CoroutineExceptionHandler.f51269c, this));
        this.f38464c = afVarG;
        kotlinx.coroutines.aj.z(afVarG, null, null, new bt(this, null), 3);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f38464c, null);
    }
}
