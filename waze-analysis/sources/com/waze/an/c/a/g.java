package com.waze.an.c.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f14686a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.k.a f14687b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14688c;

    public g(com.waze.shared_infra.o.a aVar, com.waze.main_screen.k.a aVar2, com.waze.shared_infra.i.e eVar) {
        x.f(aVar, "stringProvider");
        x.f(aVar2, "insightConfig");
        x.f(eVar, "logger");
        this.f14686a = aVar;
        this.f14687b = aVar2;
        this.f14688c = eVar;
    }

    public final com.waze.an.c.k a(com.waze.an.a.r rVar, boolean z) {
        if (rVar == null) {
            return null;
        }
        if (rVar instanceof com.waze.an.a.a.g) {
            return new f((com.waze.an.a.a.g) rVar);
        }
        if (rVar instanceof com.waze.an.a.b) {
            return new d((com.waze.an.a.b) rVar, this.f14686a, this.f14688c, z, this.f14687b.c());
        }
        if (rVar instanceof com.waze.an.a.q) {
            return new t((com.waze.an.a.q) rVar, this.f14688c);
        }
        if (rVar instanceof com.waze.an.a.l) {
            return new l((com.waze.an.a.l) rVar);
        }
        if (rVar instanceof com.waze.an.a.a.j) {
            return new com.waze.an.c.j((com.waze.an.a.a.j) rVar, this.f14688c, this.f14686a);
        }
        if (!(rVar instanceof com.waze.an.a.p)) {
            throw new h.i();
        }
        this.f14688c.g("Cannot create PointInsightStateHolder from segment descriptor");
        return null;
    }

    public final p b(com.waze.an.a.p pVar, boolean z) {
        x.f(pVar, "descriptor");
        return new p(pVar, this.f14686a, this.f14687b.e(), z);
    }
}
