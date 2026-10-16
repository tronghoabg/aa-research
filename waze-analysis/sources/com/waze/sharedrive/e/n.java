package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class n implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38543a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f38544b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f38545c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38546d;

    public n(com.waze.sharedrive.d.aq aqVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aqVar, "controller");
        h.g.b.x.f(eVar, "logger");
        this.f38546d = aqVar;
        this.f38543a = eVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f38544b = afVarP;
        m mVar = new m(aqVar.n(), 0);
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f38545c = kotlinx.coroutines.b.ai.V(mVar, afVarP, kotlinx.coroutines.b.by.b(), Boolean.valueOf(aqVar.n().d() instanceof com.waze.sharedrive.d.q));
    }

    public final kotlinx.coroutines.b.ch a() {
        return this.f38545c;
    }

    public final void b() {
        this.f38543a.a("onCreateShareDriveClicked");
        this.f38546d.J();
    }

    public final void c() {
        this.f38543a.a("onOpenLiveDriveClicked: requesting to open live drive screen");
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f38544b, null);
    }
}
