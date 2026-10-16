package com.waze.car_lib.r;

import com.waze.car_lib.f.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21616a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21617b;

    public f(kotlinx.coroutines.af afVar, boolean z, com.waze.o.b.b.k kVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(kVar, "companinioController");
        this.f21617b = kVar;
        kotlinx.coroutines.b.k kVarY = kotlinx.coroutines.b.ai.y(new com.waze.o.d.a.v(kVar.d(), z));
        int i2 = kotlinx.coroutines.b.bz.f51630a;
        this.f21616a = kotlinx.coroutines.b.ai.V(kVarY, afVar, kotlinx.coroutines.b.by.a(5000L, 2), bq.m((com.waze.t.b.bw) kVar.d().d()));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.shared_infra.o.a, java.lang.Object] */
    public final e a(gw gwVar) {
        h.g.b.x.f(gwVar, "searchCoordinatorController");
        return new e(this.f21616a, (com.waze.car_lib.n.j) this.f21617b, gwVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.b.ch] */
    public final kotlinx.coroutines.b.ch b() {
        return this.f21616a;
    }

    public final void c() {
        ((com.waze.o.b.b.k) this.f21617b).e();
    }

    public final void d() {
        ((com.waze.o.b.b.k) this.f21617b).f();
    }

    public final void e() {
        ((com.waze.o.b.b.k) this.f21617b).g();
    }

    public f(com.waze.shared_infra.o.a aVar, com.waze.car_lib.n.j jVar) {
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(jVar, "searchCategories");
        this.f21616a = aVar;
        this.f21617b = jVar;
    }
}
