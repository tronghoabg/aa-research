package com.waze;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ke implements kd {

    /* renamed from: a, reason: collision with root package name */
    private final ao f25029a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25030b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f25031c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25032d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f25033e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25034f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f25035g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f25036h;

    public ke(ao aoVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(eVar, "logger");
        this.f25029a = aoVar;
        this.f25030b = eVar;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f25031c = bnVarB;
        this.f25032d = bnVarB;
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 64, null, 5);
        this.f25033e = bmVarE;
        this.f25034f = bmVarE;
        kotlinx.coroutines.b.bm bmVarE2 = kotlinx.coroutines.b.bu.e(0, 64, null, 5);
        this.f25035g = bmVarE2;
        this.f25036h = bmVarE2;
    }

    @Override // com.waze.kd
    public final kotlinx.coroutines.b.k a() {
        return this.f25034f;
    }

    @Override // com.waze.kd
    public final kotlinx.coroutines.b.k b() {
        return this.f25036h;
    }

    @Override // com.waze.kd
    public final kotlinx.coroutines.b.k c() {
        return this.f25032d;
    }

    @Override // com.waze.kd
    public final void d(boolean z) {
        ao aoVar = this.f25029a;
        boolean z2 = ((cf) aoVar.a().d()) instanceof am;
        kotlinx.coroutines.b.bn bnVar = this.f25031c;
        ka kaVar = (ka) bnVar.d();
        boolean z3 = !z2 || z || (kaVar == null || !kaVar.m().b());
        com.waze.shared_infra.i.e eVar = this.f25030b;
        eVar.a("PopupController: dismissPopup called: shouldReleasePopup=" + z3 + "  (byUser: " + z + ", connectionState: " + aoVar.a().d() + ", popup: " + bnVar.d());
        if (z3) {
            eVar.a("PopupController: popup released");
            bnVar.c(null);
        }
    }

    @Override // com.waze.kd
    public final void e(ka kaVar) {
        h.g.b.x.f(kaVar, "popup");
        if (kaVar instanceof jj) {
            jj jjVar = (jj) kaVar;
            com.waze.shared_infra.i.e eVar = this.f25030b;
            Objects.toString(jjVar);
            eVar.a("PopupController: submit loader: ".concat(jjVar.toString()));
            this.f25033e.c(jjVar);
            return;
        }
        if (kaVar instanceof jl) {
            this.f25035g.c((jl) kaVar);
        } else {
            com.waze.shared_infra.i.e eVar2 = this.f25030b;
            Objects.toString(kaVar);
            eVar2.a("submit popup: ".concat(kaVar.toString()));
            this.f25031c.c(kaVar);
        }
    }
}
