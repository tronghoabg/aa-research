package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28110a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28111b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f28112c;

    /* renamed from: d, reason: collision with root package name */
    private dm f28113d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f28114e;

    public bt(com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(eVar, "logger");
        this.f28110a = eVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(true);
        this.f28111b = bnVarB;
        kotlinx.coroutines.b.bn bnVar = bnVarB;
        this.f28112c = bnVar;
        this.f28114e = bnVar;
    }

    private final void f() {
        kotlinx.coroutines.b.bn bnVar = this.f28111b;
        if (!((Boolean) bnVar.d()).booleanValue()) {
            this.f28110a.a("isMapCenteredOnLatestBounds -> true");
        }
        this.f28113d = null;
        bnVar.e(true);
    }

    private final void g(dm dmVar) {
        dm dmVar2;
        kotlinx.coroutines.b.bn bnVar = this.f28111b;
        if (!((Boolean) bnVar.d()).booleanValue() || (dmVar2 = this.f28113d) == null || h.g.b.x.n(dmVar2, dmVar)) {
            return;
        }
        this.f28110a.a("isMapCenteredOnLatestBounds -> false");
        bnVar.e(false);
    }

    public final kotlinx.coroutines.b.ch a() {
        return this.f28114e;
    }

    public final void b() {
        f();
    }

    public final void c(dk dkVar, dm dmVar) {
        h.g.b.x.f(dkVar, "movement");
        if (this.f28113d == null && (dkVar == dk.f28194c || dkVar == dk.f28195d)) {
            this.f28113d = dmVar;
        }
        g(dmVar);
    }

    public final void d() {
        f();
    }

    public final void e(dm dmVar) {
        g(dmVar);
    }
}
