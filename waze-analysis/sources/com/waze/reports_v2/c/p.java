package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.r.y f34530a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.network.z f34531b;

    public p(com.waze.shared_infra.r.y yVar, com.waze.network.z zVar) {
        h.g.b.x.f(yVar, "userState");
        h.g.b.x.f(zVar, "networkEventManager");
        this.f34530a = yVar;
        this.f34531b = zVar;
    }

    public final Object a(h.c.e eVar) {
        Object objI = kotlinx.coroutines.b.ai.i(kotlinx.coroutines.b.ai.F(this.f34531b.c(), this.f34530a.a(), new o(null)), new cv(null, 1, null), eVar);
        return objI == h.c.a.a.f48038a ? objI : h.ab.f48028a;
    }

    public final boolean b() {
        return com.waze.reports_v2.a.a.a.d.b((com.waze.navigate.location_preview.ba) this.f34531b.c().d(), (com.waze.shared_infra.h.b) this.f34530a.a().d());
    }
}
