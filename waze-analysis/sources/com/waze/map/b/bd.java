package com.waze.map.b;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.waze.strings.DisplayStrings;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bd implements ai, n, aj {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28054a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final bi f28055b;

    /* renamed from: c, reason: collision with root package name */
    private static final bi f28056c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f28057d;

    /* renamed from: e, reason: collision with root package name */
    private final bk f28058e;

    /* renamed from: f, reason: collision with root package name */
    private final ed f28059f;

    /* renamed from: g, reason: collision with root package name */
    private final c f28060g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28061h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.map.eq f28062i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.stats.ax f28063j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.af f28064k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28065l;
    private final kotlinx.coroutines.b.ch m;
    private final kotlinx.coroutines.b.bn n;
    private final kotlinx.coroutines.b.ch o;
    private final kotlinx.coroutines.b.bn p;
    private final kotlinx.coroutines.b.bn q;
    private final kotlinx.coroutines.b.ch r;
    private final kotlinx.coroutines.b.bm s;
    private final kotlinx.coroutines.b.bn t;
    private final kotlinx.coroutines.b.bn u;
    private final kotlinx.coroutines.b.bn v;
    private final kotlinx.coroutines.b.bn w;
    private final kotlinx.coroutines.b.bm x;
    private final kotlinx.coroutines.b.bm y;
    private boolean z;

    static {
        boolean z = true;
        dn dnVar = new dn(new bz(z, z, z, 4));
        boolean z2 = false;
        f28055b = new bi((List) null, (List) null, (List) null, (List) null, (List) null, new ca(true, new dv(false), true, true, true, true, new dy(false, false), new dl(true, true, true, true, true, true), true, true), dnVar, 159);
        f28056c = new bi((List) null, (List) null, (List) null, (List) null, (List) null, new ca(true, du.f28224a, true, false, false, false, null, new dl(false, false, false, true, true, false), true, false), new dn(new bz(z2, z2, z2, 15)), 159);
    }

    public bd(com.waze.shared_infra.q.e eVar, bk bkVar, ed edVar, c cVar, com.waze.shared_infra.i.e eVar2, com.waze.map.eq eqVar, com.waze.stats.ax axVar, h.c.j jVar) {
        h.g.b.x.f(eVar, "clock");
        h.g.b.x.f(bkVar, "filteredEventsFactory");
        h.g.b.x.f(edVar, "mapViewController");
        h.g.b.x.f(cVar, "contentResolver");
        h.g.b.x.f(eVar2, "logger");
        h.g.b.x.f(eqVar, "primaryMapConfiguration");
        h.g.b.x.f(axVar, "wazeStatsReporter");
        h.g.b.x.f(jVar, "coroutineContext");
        this.f28057d = eVar;
        this.f28058e = bkVar;
        this.f28059f = edVar;
        this.f28060g = cVar;
        this.f28061h = eVar2;
        this.f28062i = eqVar;
        this.f28063j = axVar;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar);
        this.f28064k = afVarE;
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        this.f28065l = bnVarB;
        this.m = kotlinx.coroutines.b.ai.U(bnVarB);
        kotlinx.coroutines.b.bn bnVarB2 = kotlinx.coroutines.b.ck.b(null);
        this.n = bnVarB2;
        this.o = bnVarB2;
        this.p = kotlinx.coroutines.b.ck.b(null);
        kotlinx.coroutines.b.bn bnVarB3 = kotlinx.coroutines.b.ck.b(null);
        this.q = bnVarB3;
        this.r = bnVarB3;
        kotlinx.coroutines.a.a aVar = kotlinx.coroutines.a.a.f51272b;
        this.s = kotlinx.coroutines.b.bu.e(0, 16, aVar, 1);
        this.t = kotlinx.coroutines.b.ck.b(null);
        this.u = kotlinx.coroutines.b.ck.b(new as(new com.waze.map.canvas.bp(q.f28364a, null)));
        this.v = kotlinx.coroutines.b.ck.b(new as(g.f28352a));
        this.w = kotlinx.coroutines.b.ck.b(new com.waze.map.canvas.bm(f28055b, bh.f28073a, null, null, bw.f28116a, null, null, true, false));
        this.x = kotlinx.coroutines.b.bu.e(0, 16, aVar, 1);
        this.y = kotlinx.coroutines.b.bu.e(0, 1, aVar, 1);
        kotlinx.coroutines.aj.z(afVarE, null, null, new aq(this, null), 3);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(edVar.w(), new ar(this, (h.c.e) null, 1, (byte[]) null)), afVarE);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(edVar.t(), new ar(this, null, 0)), afVarE);
    }

    static final void C(bd bdVar, com.waze.shared_infra.l.a aVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        bdVar.f28061h.a("user called cancel() on setClosurePreviewOnSegment(" + aVar + ")");
        do {
            bnVar = bdVar.w;
            objD = bnVar.d();
        } while (!bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, null, null, null, null, false, false, DisplayStrings.DS_PILE_UP)));
    }

    static final void D(bd bdVar, com.waze.shared_infra.h.c cVar, boolean z, com.waze.map.canvas.bo boVar) {
        Object objD;
        com.waze.map.canvas.bm bmVar;
        kotlinx.coroutines.b.bn bnVar = bdVar.w;
        bdVar.f28061h.a("user called cancel() on setCoordinateSelected(" + cVar + ", " + z + "), current: " + ((com.waze.map.canvas.bm) bnVar.d()).b());
        do {
            objD = bnVar.d();
            bmVar = (com.waze.map.canvas.bm) objD;
        } while (!bnVar.f(objD, com.waze.map.canvas.bm.j(bmVar, null, bmVar.b() == boVar ? null : bmVar.b(), null, null, null, null, false, false, 507)));
    }

    static final void E(bd bdVar, com.waze.map.canvas.bn bnVar, com.waze.shared_infra.h.c cVar) {
        kotlinx.coroutines.b.bn bnVar2;
        Object objD;
        com.waze.map.canvas.bm bmVarJ;
        do {
            bnVar2 = bdVar.w;
            objD = bnVar2.d();
            bmVarJ = (com.waze.map.canvas.bm) objD;
            if (h.g.b.x.n(bmVarJ.a(), bnVar)) {
                com.waze.shared_infra.i.e eVar = bdVar.f28061h;
                Objects.toString(cVar);
                eVar.a("new venue pin was removed from ".concat(String.valueOf(cVar)));
                bmVarJ = com.waze.map.canvas.bm.j(bmVarJ, null, null, null, null, null, null, false, false, 503);
            }
        } while (!bnVar2.f(objD, bmVarJ));
    }

    static final h.ab F(bd bdVar, com.waze.map.e.a aVar) {
        bdVar.t.f(aVar, null);
        return h.ab.f48028a;
    }

    static final h.ab G(bd bdVar, com.waze.install.ah ahVar) {
        h.g.b.x.f(ahVar, NotificationCompat.CATEGORY_EVENT);
        Objects.toString(ahVar);
        bdVar.f28061h.a("map event from mapDelegator: ".concat(String.valueOf(ahVar)));
        bdVar.s.c(ahVar);
        return h.ab.f48028a;
    }

    @Override // com.waze.map.b.aj
    public final bl a() {
        return this.f28058e.a(this.s);
    }

    @Override // com.waze.map.b.aj
    public final com.waze.shared_infra.s.d b(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "onEvent");
        kotlinx.coroutines.s sVarI = h.g.b.o.i();
        bc bcVar = new bc(this, lVar, (h.c.e) null, 0);
        kotlinx.coroutines.bo.c(this.f28064k, sVarI, bcVar);
        return new am(sVarI, 0);
    }

    @Override // com.waze.map.b.aj
    public final com.waze.shared_infra.s.d c(com.waze.shared_infra.l.a aVar) {
        h.g.b.x.f(aVar, "segment");
        this.f28061h.a("user called setClosurePreviewOnSegment(" + aVar + ")");
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.w;
            Object objD = bnVar.d();
            final com.waze.shared_infra.l.a aVar2 = aVar;
            if (bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, null, null, null, aVar2, false, false, DisplayStrings.DS_PILE_UP))) {
                return new com.waze.shared_infra.s.d() { // from class: com.waze.map.b.al
                    @Override // com.waze.shared_infra.s.d
                    public final void a() {
                        bd.C(this.f28004a, aVar2);
                    }
                };
            }
            aVar = aVar2;
        }
    }

    @Override // com.waze.map.b.aj
    public final com.waze.shared_infra.s.d d(final com.waze.shared_infra.h.c cVar, final boolean z) {
        Object objD;
        h.g.b.x.f(cVar, "coordinate");
        kotlinx.coroutines.b.bn bnVar = this.w;
        this.f28061h.a("user called setCoordinateSelected(" + cVar + ", " + z + "), prev: " + ((com.waze.map.canvas.bm) bnVar.d()).b());
        final com.waze.map.canvas.bo boVar = new com.waze.map.canvas.bo(cVar, z);
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, boVar, null, null, null, null, false, false, 507)));
        return new com.waze.shared_infra.s.d() { // from class: com.waze.map.b.an
            @Override // com.waze.shared_infra.s.d
            public final void a() {
                bd.D(this.f28008a, cVar, z, boVar);
            }
        };
    }

    @Override // com.waze.map.b.aj
    public final com.waze.shared_infra.s.d e(com.waze.shared_infra.h.c cVar, h.g.a.a aVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(aVar, "onClick");
        Objects.toString(cVar);
        this.f28061h.a("new venue pin was set at ".concat(String.valueOf(cVar)));
        com.waze.map.canvas.bn bnVar2 = new com.waze.map.canvas.bn(cVar, aVar);
        do {
            bnVar = this.w;
            objD = bnVar.d();
        } while (!bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, bnVar2, null, null, null, false, false, 503)));
        return new ef(this, bnVar2, cVar, 1);
    }

    @Override // com.waze.map.b.aj
    public final kotlinx.coroutines.b.k f(com.waze.map.bv bvVar) {
        h.g.b.x.f(bvVar, TypedValues.AttributesType.S_TARGET);
        this.f28061h.a("user called trackPosition(" + bvVar + ")");
        ed edVar = this.f28059f;
        h.g.b.x.f(edVar, "<this>");
        h.g.b.x.f(bvVar, TypedValues.AttributesType.S_TARGET);
        return kotlinx.coroutines.b.ai.n(new fe(edVar, bvVar, null));
    }

    @Override // com.waze.map.b.aj
    public final kotlinx.coroutines.b.ch g() {
        return this.m;
    }

    @Override // com.waze.map.b.aj
    public final kotlinx.coroutines.b.ch h() {
        return this.o;
    }

    @Override // com.waze.map.b.aj
    public final kotlinx.coroutines.b.ch i() {
        return this.r;
    }

    @Override // com.waze.map.b.aj
    public final void j(com.waze.map.canvas.br brVar) {
        h.g.b.x.f(brVar, "map");
        brVar.O(kotlinx.coroutines.b.ai.D(this.t));
        brVar.Q(this.x);
        brVar.R(this.y);
        int i2 = 1;
        brVar.S(new aw(this.u, 1));
        brVar.P(new aw(this.v, 0));
        brVar.N(this.w);
        kotlinx.coroutines.b.k kVarK = kotlinx.coroutines.b.ai.K(brVar.J(), new ar(this, (h.c.e) null, 2, (char[]) null));
        kotlinx.coroutines.af afVar = this.f28064k;
        kotlinx.coroutines.b.ai.m(kVarK, afVar);
        if (!this.z) {
            this.z = true;
            String strValueOf = String.valueOf(System.identityHashCode(this));
            com.waze.map.eq eqVar = this.f28062i;
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new aw(kotlinx.coroutines.b.ai.D(this.f28065l), 2)), new ay(this, strValueOf, eqVar.isWazeMapAsPrimaryEnabled(), null)), afVar);
        }
        kotlinx.coroutines.aj.z(afVar, null, null, new bc(brVar, this, (h.c.e) null, 1), 3);
        com.waze.ad.c.b.a(afVar, new com.waze.car_lib.b.m(brVar.w(new eg(this, i2)), 19));
    }

    @Override // com.waze.map.b.aj
    public final void k(ag agVar) {
        h.g.b.x.f(agVar, "newMode");
        this.y.c(agVar);
    }

    @Override // com.waze.map.b.aj
    public final void l(boolean z) {
        this.f28061h.a("changing ads to " + z);
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.w;
            Object objD = bnVar.d();
            boolean z2 = z;
            if (bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, null, null, null, null, z2, false, DisplayStrings.DS_DICTATION_BOTTOM_SHEET_START_LISTENING_SEARCH))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // com.waze.map.b.aj
    public final void m(boolean z) {
        this.f28061h.a("changing cyclists to " + z);
        while (true) {
            kotlinx.coroutines.b.bn bnVar = this.w;
            Object objD = bnVar.d();
            boolean z2 = z;
            if (bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, null, null, null, null, false, z2, 255))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // com.waze.map.b.aj
    public final void n(int i2) {
        Object objD;
        this.f28061h.a("user called setShowingNavigationArrowOnSegment(segmentIdx:" + i2 + ")");
        com.waze.z.a.d.ai byVar = i2 == -1 ? bx.f28117a : new by(i2);
        kotlinx.coroutines.b.bn bnVar = this.w;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, null, null, null, byVar, Integer.valueOf(i2), null, false, false, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_INCORRECT_JUNCTION)));
    }

    @Override // com.waze.map.b.aj
    public final void o(bf bfVar) {
        h.g.b.x.f(bfVar, "request");
        this.x.c(bfVar);
        if (bfVar instanceof k) {
            this.f28059f.z();
            return;
        }
        if (bfVar instanceof l) {
            this.f28059f.A();
            return;
        }
        if (bfVar instanceof m) {
            m mVar = (m) bfVar;
            if (mVar.a() > 0.0f) {
                this.f28059f.z();
            } else if (mVar.a() < 0.0f) {
                this.f28059f.A();
            }
        }
    }

    @Override // com.waze.map.b.aj
    public final com.waze.shared_infra.n.c p(ed edVar) {
        h.g.b.x.f(edVar, "mapViewController");
        com.waze.shared_infra.i.e eVar = this.f28061h;
        eVar.a("user called switchTo(MapViewController)");
        com.waze.shared_infra.n.c cVar = new com.waze.shared_infra.n.c(eVar);
        final com.waze.map.e.a aVar = new com.waze.map.e.a(edVar, cVar);
        this.t.e(aVar);
        cVar.h(new h.g.a.a() { // from class: com.waze.map.b.ao
            @Override // h.g.a.a
            public final Object invoke() {
                return bd.F(this.f28012a, aVar);
            }
        });
        return cVar;
    }

    @Override // com.waze.map.b.aj
    public final void q(com.waze.an.c.q qVar) {
        h.g.b.x.f(qVar, "darkOverlay");
        this.f28061h.a("user called setDarkOverlay(" + qVar + ")");
        this.v.e(new as(qVar));
    }

    @Override // com.waze.map.b.aj
    public final void r(com.waze.ap.b.o oVar, boolean z) {
        Object objD;
        Object objD2;
        Object objD3;
        h.g.b.x.f(oVar, "state");
        this.f28061h.a("user called setMapState(" + oVar + ", animated:" + z + ")");
        this.u.e(new as(new com.waze.map.canvas.bp(oVar, z ? this.f28057d.b().plusMillis(300L) : null)));
        if (oVar instanceof o) {
            kotlinx.coroutines.b.bn bnVar = this.w;
            do {
                objD3 = bnVar.d();
            } while (!bnVar.f(objD3, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD3, f28055b, null, null, null, null, null, false, false, 510)));
            o oVar2 = (o) oVar;
            if (oVar2.j()) {
                this.v.e(new as(new f(oVar2.h())));
                return;
            }
            return;
        }
        if (h.g.b.x.n(oVar, p.f28363a)) {
            kotlinx.coroutines.b.bn bnVar2 = this.w;
            do {
                objD2 = bnVar2.d();
            } while (!bnVar2.f(objD2, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD2, f28056c, null, null, bx.f28117a, null, null, false, false, DisplayStrings.DS_REPORT_MENU_V2_POLICE_REPORT_LABEL)));
        } else {
            if (!h.g.b.x.n(oVar, q.f28364a)) {
                throw new h.i();
            }
            kotlinx.coroutines.b.bn bnVar3 = this.w;
            do {
                objD = bnVar3.d();
            } while (!bnVar3.f(objD, com.waze.map.canvas.bm.j((com.waze.map.canvas.bm) objD, f28055b, null, null, bw.f28116a, null, null, false, false, DisplayStrings.DS_REPORT_MENU_V2_POLICE_REPORT_LABEL)));
        }
    }
}
