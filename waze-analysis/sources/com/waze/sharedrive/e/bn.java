package com.waze.sharedrive.e;

import com.waze.navigate.dg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedrive.b.a f38446a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ao f38447b;

    /* renamed from: c, reason: collision with root package name */
    private final dg f38448c;

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.coroutines.af f38449d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f38450e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedrive.d.aq f38451f;

    public bn(com.waze.sharedrive.d.aq aqVar, com.waze.sharedrive.b.a aVar, com.waze.ao aoVar, dg dgVar, kotlinx.coroutines.af afVar, i iVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(aqVar, "controller");
        h.g.b.x.f(aVar, "config");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(dgVar, "navigationInfo");
        h.g.b.x.f(afVar, "coroutineScope");
        h.g.b.x.f(iVar, "distanceCalculator");
        h.g.b.x.f(eVar, "logger");
        this.f38451f = aqVar;
        this.f38446a = aVar;
        this.f38447b = aoVar;
        this.f38448c = dgVar;
        this.f38449d = afVar;
        this.f38450e = eVar;
    }

    private final void g() {
        kotlinx.coroutines.aj.z(this.f38449d, null, null, new bm(this, (h.c.e) null, 0), 3);
    }

    public final bh c(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "newDestination");
        com.waze.cf cfVar = (com.waze.cf) this.f38447b.a().d();
        if ((cfVar instanceof com.waze.am) || (cfVar instanceof com.waze.ak)) {
            return bh.f38427a;
        }
        Object objD = this.f38451f.n().d();
        com.waze.sharedrive.d.q qVar = objD instanceof com.waze.sharedrive.d.q ? (com.waze.sharedrive.d.q) objD : null;
        if (qVar == null) {
            return bh.f38427a;
        }
        com.waze.sharedrive.c.a.m mVar = (com.waze.sharedrive.c.a.m) qVar.a().b();
        com.waze.sharedrive.c.a.l lVarA = com.waze.sharedrive.g.bf.A(qVar);
        if (lVarA == null) {
            return bh.f38427a;
        }
        com.waze.shared_infra.h.c cVarA = mVar.a().a();
        h.g.b.x.f(cVarA, "c1");
        h.g.b.x.f(cVar, "c2");
        float fC = com.waze.shared_infra.h.b.c(cVarA, cVar);
        float fA = this.f38446a.a();
        com.waze.sharedrive.c.a.k kVar = (com.waze.sharedrive.c.a.k) lVarA.c().b();
        if (kVar instanceof com.waze.sharedrive.c.a.h) {
            return fC <= fA ? bh.f38427a : bh.f38428b;
        }
        if (kVar instanceof com.waze.sharedrive.c.a.j) {
            return fC <= fA ? bh.f38429c : bh.f38428b;
        }
        if (kVar instanceof com.waze.sharedrive.c.a.i) {
            return bh.f38427a;
        }
        throw new h.i();
    }

    public final void d(bg bgVar) {
        h.g.b.x.f(bgVar, "choice");
        bg bgVar2 = bg.f38423a;
        int iOrdinal = bgVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                g();
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                this.f38451f.F();
            }
        }
    }

    public final boolean e() {
        com.waze.sharedrive.c.a.q qVarC;
        Object objD = this.f38451f.n().d();
        com.waze.sharedrive.c.a.k kVar = null;
        com.waze.sharedrive.d.q qVar = objD instanceof com.waze.sharedrive.d.q ? (com.waze.sharedrive.d.q) objD : null;
        com.waze.sharedrive.c.a.l lVarA = qVar != null ? com.waze.sharedrive.g.bf.A(qVar) : null;
        if (lVarA != null && (qVarC = lVarA.c()) != null) {
            kVar = (com.waze.sharedrive.c.a.k) qVarC.b();
        }
        boolean z = kVar instanceof com.waze.sharedrive.c.a.j;
        com.waze.shared_infra.i.e eVar = this.f38450e;
        if (!z) {
            eVar.g("ShareDrive caller is not a viewer, not launching auto-upgrade.");
            return false;
        }
        eVar.e("Bypassing same-destination prompt for ShareDrive caller, launching auto-upgrade.");
        g();
        return true;
    }
}
