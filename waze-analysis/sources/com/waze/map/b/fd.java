package com.waze.map.b;

import android.os.Handler;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.waze.gw.Gateway;
import com.waze.ig;
import com.waze.map.gb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fd implements ed {
    private final kotlinx.coroutines.b.bn A;
    private final bt B;
    private final kotlinx.coroutines.b.ch C;

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f28314a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.cd f28315b;

    /* renamed from: c, reason: collision with root package name */
    private final bu f28316c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28317d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f28318e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28319f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28320g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28321h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f28322i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28323j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f28324k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f28325l;
    private final kotlinx.coroutines.b.bm m;
    private final kotlinx.coroutines.b.bn n;
    private final kotlinx.coroutines.b.bn o;
    private final kotlinx.coroutines.b.bn p;
    private final kotlinx.coroutines.b.bn q;
    private final kotlinx.coroutines.b.bn r;
    private final kotlinx.coroutines.b.bn s;
    private ei t;
    private int u;
    private final kotlinx.coroutines.b.bn v;
    private final kotlinx.coroutines.b.bn w;
    private final kotlinx.coroutines.b.bn x;
    private final kotlinx.coroutines.b.bn y;
    private final kotlinx.coroutines.b.bn z;

    public fd(ch chVar, com.waze.shared_infra.i.b bVar, com.waze.map.cd cdVar, bu buVar, com.waze.shared_infra.i.e eVar, Handler handler) {
        h.g.b.x.f(chVar, "initialConfiguration");
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(cdVar, "defaultViewportResolver");
        h.g.b.x.f(buVar, "statForwarder");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(handler, "handler");
        this.f28314a = bVar;
        this.f28315b = cdVar;
        this.f28316c = buVar;
        this.f28317d = eVar;
        this.f28318e = handler;
        this.f28319f = kotlinx.coroutines.b.ck.b(null);
        this.f28320g = kotlinx.coroutines.b.ck.b(null);
        this.f28321h = kotlinx.coroutines.b.ck.b(new com.waze.map.ck(chVar));
        kotlinx.coroutines.a.a aVar = kotlinx.coroutines.a.a.f51272b;
        this.f28322i = kotlinx.coroutines.b.bu.e(0, 16, aVar, 1);
        this.f28323j = kotlinx.coroutines.b.ck.b(null);
        this.f28324k = kotlinx.coroutines.b.ck.b(new com.waze.map.cm(null));
        this.f28325l = kotlinx.coroutines.b.bu.e(0, 256, aVar, 1);
        this.m = kotlinx.coroutines.b.bu.e(0, 1, aVar, 1);
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(dx.f28228a);
        this.n = bnVarB;
        kotlinx.coroutines.b.bn bnVarB2 = kotlinx.coroutines.b.ck.b(dk.f28192a);
        this.o = bnVarB2;
        kotlinx.coroutines.b.bn bnVarB3 = kotlinx.coroutines.b.ck.b(null);
        this.p = bnVarB3;
        kotlinx.coroutines.b.bn bnVarB4 = kotlinx.coroutines.b.ck.b(null);
        this.q = bnVarB4;
        kotlinx.coroutines.b.bn bnVarB5 = kotlinx.coroutines.b.ck.b(null);
        this.r = bnVarB5;
        this.s = kotlinx.coroutines.b.ck.b(h.a.i.h());
        this.t = new ei(h.a.r.j(), h.a.i.h(), h.a.i.h());
        this.v = kotlinx.coroutines.b.ck.b(h.a.r.j());
        this.w = bnVarB;
        this.x = bnVarB2;
        this.y = bnVarB3;
        this.z = bnVarB4;
        this.A = bnVarB5;
        bt btVar = new bt(eVar);
        this.B = btVar;
        this.C = btVar.a();
    }

    public static /* synthetic */ h.ab F(fd fdVar, dj djVar) {
        Objects.toString(djVar);
        fdVar.f28317d.a("map event! ".concat(String.valueOf(djVar)));
        fdVar.f28325l.c(djVar);
        return h.ab.f48028a;
    }

    static final h.ab G(fd fdVar, dj djVar) {
        h.g.b.x.f(djVar, "it");
        Q(fdVar, new com.waze.car_lib.e.d(fdVar, djVar, 11));
        return h.ab.f48028a;
    }

    static final h.ab H(fd fdVar, dx dxVar) {
        h.g.b.x.f(dxVar, "it");
        fdVar.n.e(dxVar);
        return h.ab.f48028a;
    }

    static final h.ab I(fd fdVar, dk dkVar) {
        h.g.b.x.f(dkVar, "it");
        fdVar.o.e(dkVar);
        fdVar.B.c(dkVar, (dm) fdVar.p.d());
        return h.ab.f48028a;
    }

    static final h.ab J(fd fdVar, dm dmVar) {
        fdVar.p.e(dmVar);
        fdVar.B.e(dmVar);
        return h.ab.f48028a;
    }

    static final h.ab K(fd fdVar, cs csVar) {
        fdVar.q.e(csVar);
        return h.ab.f48028a;
    }

    static final h.ab L(fd fdVar, Cdo cdo) {
        fdVar.r.e(cdo);
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void N(fd fdVar, String str) {
        fdVar.f28317d.a("marker clicked! id:".concat(com.waze.map.ct.b(str)));
        fdVar.R(str);
    }

    public static final /* synthetic */ void O(fd fdVar, String str) {
        fdVar.f28317d.a("polyline clicked! id:".concat(com.waze.map.ct.b(str)));
        fdVar.R(str);
    }

    static final void P(fd fdVar, com.waze.map.bv bvVar, com.waze.map.bs bsVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        fdVar.f28317d.a("user requested to cancel trackPosition(" + bvVar + "), id=" + bsVar.a());
        do {
            bnVar = fdVar.v;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.l((Map) objD, Integer.valueOf(bsVar.a()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(fd fdVar, h.g.a.a aVar) {
        fdVar.f28318e.postAtFrontOfQueue(new ig(aVar, 20));
    }

    private final void R(String str) {
        com.waze.coroutines.b bVar = (com.waze.coroutines.b) this.t.c().get(com.waze.map.ct.a(str));
        if (bVar != null) {
            bVar.d().invoke(bVar.c());
        } else {
            this.f28317d.a("click w/o callback, sending as empty area (fallthrough) click");
            this.f28325l.c(cx.f28173a);
        }
    }

    @Override // com.waze.map.b.ed
    public final void A() {
        this.f28322i.c(com.waze.map.db.f28741b);
    }

    @Override // com.waze.map.b.ed
    public final void B(gb gbVar, com.waze.map.cd cdVar) {
        h.g.b.x.f(gbVar, "presenter");
        kotlinx.coroutines.b.bn bnVar = this.f28323j;
        com.waze.map.da daVar = (com.waze.map.da) bnVar.d();
        if (daVar != null) {
            kotlinx.coroutines.b.bn bnVar2 = this.f28320g;
            com.waze.destination_cell.b.e eVarA = daVar.a();
            com.waze.map.cq cqVar = (com.waze.map.cq) bnVar2.d();
            if (cqVar != null) {
                com.waze.google_assistant.an anVarF = cqVar.f();
                com.waze.map.ci ciVar = anVarF instanceof com.waze.map.ci ? (com.waze.map.ci) anVarF : null;
                if (ciVar != null) {
                    cn cnVarJ = cn.j(ciVar.i(), null, eVarA, 1);
                    h.g.b.x.f(cnVarJ, "original");
                    com.waze.map.ci ciVar2 = new com.waze.map.ci(cnVarJ);
                    if (!h.g.b.x.n(ciVar, ciVar2)) {
                        com.waze.map.cq cqVarG = com.waze.map.cq.g(cqVar, ciVar2);
                        this.f28317d.e("did load (modify) userLocation for bounds with fit=TrackUserLocation, changed from " + ciVar.i().i() + " to " + eVarA);
                        bnVar2.e(cqVarG);
                    }
                }
            }
        }
        aw awVar = new aw(this.s, 3);
        this.B.b();
        gbVar.p(new com.waze.map.cw(new com.waze.map.main.v(cdVar == null ? this.f28315b : cdVar), new com.waze.map.cx(this.f28321h, kotlinx.coroutines.b.ai.D(this.f28319f), kotlinx.coroutines.b.ai.B(kotlinx.coroutines.b.ai.D(this.f28320g), new el(null)), awVar, this.v, this.f28322i, this.f28324k, kotlinx.coroutines.b.ai.D(bnVar)), new com.waze.map.cx(new eg(this, 0), new em(this, 1), new em(this, 0), new eg(this, 2), new eg(this, 3), new eg(this, 4), new eg(this, 5), new eg(this, 6))));
    }

    @Override // com.waze.map.b.ed
    public final void C(ch chVar) {
        h.g.b.x.f(chVar, "newConfiguration");
        kotlinx.coroutines.b.bn bnVar = this.f28321h;
        com.waze.map.ck ckVar = (com.waze.map.ck) bnVar.d();
        if (h.g.b.x.n(ckVar.a(), chVar)) {
            new com.waze.shared_infra.s.c(ckVar.b());
            return;
        }
        ((com.waze.map.ck) bnVar.d()).b().a(false);
        com.waze.map.ck ckVar2 = new com.waze.map.ck(chVar);
        bnVar.e(ckVar2);
        new com.waze.shared_infra.s.c(ckVar2.b());
    }

    @Override // com.waze.map.b.ed
    public final void D(com.waze.aj.b bVar) {
        h.g.b.x.f(bVar, NotificationCompat.CATEGORY_EVENT);
        if (h.g.b.x.n(bVar, com.waze.map.co.f28684a)) {
            this.f28316c.a();
        } else {
            if (!h.g.b.x.n(bVar, com.waze.map.cp.f28685a)) {
                throw new h.i();
            }
            this.f28316c.b();
        }
    }

    @Override // com.waze.map.b.ed
    public final void E(com.waze.destination_cell.b.e eVar) {
        h.g.b.x.f(eVar, "userLocationPosition");
        this.f28317d.a("setUserLocationPosition(" + eVar + ")");
        this.f28323j.e(new com.waze.map.da(eVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc A[PHI: r5
  0x00cc: PHI (r5v11 java.lang.Float) = (r5v1 java.lang.Float), (r5v6 java.lang.Float) binds: [B:22:0x00ca, B:28:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.waze.map.b.ed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.waze.shared_infra.s.c a(com.waze.map.b.bg r7) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.b.fd.a(com.waze.map.b.bg):com.waze.shared_infra.s.c");
    }

    @Override // com.waze.map.b.ed
    public final com.waze.shared_infra.s.c b(bi biVar) {
        String str;
        h.g.b.x.f(biVar, "mapContent");
        bi biVar2 = (bi) Gateway.injectPointMapMarkers(this, biVar);
        String str2 = "setMapData(routes:" + biVar2.h().size() + ", events:" + biVar2.d().size() + ", markers:" + biVar2.e().size() + ", additionalContent:" + biVar2.b() + ", navigation:" + biVar2.c() + ")";
        com.waze.shared_infra.i.e eVar = this.f28317d;
        eVar.a(str2);
        List<com.waze.coroutines.b> listE = biVar2.e();
        List<com.waze.google_assistant.ah> listG = biVar2.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (com.waze.coroutines.b bVar : listE) {
            if (bVar.e() == null) {
                arrayList.add(new com.waze.map.cs(bVar.b()));
            } else {
                com.waze.map.bc bcVarB = bVar.b();
                String strC = bVar.e().c();
                String str3 = (strC.length() > 0 ? "tag{" + strC + "}," : "") + "coordinate{" + bcVarB.h() + "},";
                com.waze.gas.a aVarJ = bcVarB.j();
                if (aVarJ instanceof com.waze.map.ax) {
                    str = "CustomBitmap";
                } else if (aVarJ instanceof com.waze.map.ay) {
                    str = "CustomView(size:" + ((com.waze.map.ay) aVarJ).f() + ")";
                } else {
                    if (!(aVarJ instanceof com.waze.map.az)) {
                        throw new h.i();
                    }
                    str = "R.drawable(" + ((com.waze.map.az) aVarJ).f() + ")";
                }
                String str4 = str3 + "content{" + str + "}";
                com.waze.map.ct.d(str4);
                linkedHashMap.put(com.waze.map.ct.a(str4), bVar.e());
                arrayList.add(new com.waze.map.cs(bVar.b(), str4, null));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (com.waze.google_assistant.ah ahVar : listG) {
            if (ahVar.i() == null) {
                arrayList2.add(new com.waze.map.cu(ahVar.h()));
            } else {
                i2++;
                String str5 = "polyline" + i2;
                com.waze.map.ct.d(str5);
                linkedHashMap.put(com.waze.map.ct.a(str5), ahVar.i());
                arrayList2.add(new com.waze.map.cu(ahVar.h(), str5, null));
            }
        }
        this.t = new ei(linkedHashMap, arrayList, arrayList2);
        kotlinx.coroutines.b.bn bnVar = this.f28319f;
        com.waze.map.cr crVar = (com.waze.map.cr) bnVar.d();
        List listF = biVar2.f();
        ArrayList arrayList3 = new ArrayList(h.a.i.q(listF, 10));
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList3.add(((android.support.v4.a.a.a) it.next()).c());
        }
        com.waze.map.cr crVar2 = new com.waze.map.cr(arrayList3, biVar2.h(), biVar2.d(), this.t.a(), this.t.b(), biVar2.b(), biVar2.c(), biVar2.a());
        if (h.g.b.x.n(crVar, crVar2)) {
            return new com.waze.shared_infra.s.c(crVar.i());
        }
        if (crVar2.e().size() >= 256) {
            eVar.g("too many markers! " + crVar2.e().size());
            this.f28314a.a(new IllegalArgumentException("too many markers"), null);
        }
        if (crVar2.g().size() >= 100) {
            eVar.g("too many polylines! " + crVar2.g().size());
            this.f28314a.a(new IllegalArgumentException("too many polylines"), null);
        }
        Iterator it2 = crVar2.g().iterator();
        while (it2.hasNext()) {
            if (((com.waze.map.cu) it2.next()).a().c().size() < 2) {
                this.f28314a.a(new IllegalArgumentException("polyline with <2 coordinates"), null);
            }
        }
        if (crVar2.f().size() >= 100) {
            eVar.g("too many polygons! " + crVar2.f().size());
            this.f28314a.a(new IllegalArgumentException("too many polygons"), null);
        }
        Iterator it3 = crVar2.f().iterator();
        while (it3.hasNext()) {
            if (((fg) it3.next()).c().size() < 3) {
                this.f28314a.a(new IllegalArgumentException("polygon with <3 coordinates"), null);
            }
        }
        bnVar.e(crVar2);
        if (crVar != null) {
            crVar.i().a(false);
        }
        return new com.waze.shared_infra.s.c(crVar2.i());
    }

    @Override // com.waze.map.b.ed
    public final com.waze.shared_infra.s.d c(com.waze.map.bv bvVar, h.g.a.l lVar) {
        kotlinx.coroutines.b.bn bnVar;
        Object objD;
        h.g.b.x.f(bvVar, TypedValues.AttributesType.S_TARGET);
        h.g.b.x.f(lVar, "onPositionUpdated");
        int i2 = this.u + 1;
        this.u = i2;
        com.waze.map.bs bsVar = new com.waze.map.bs(i2, bvVar, lVar);
        this.f28317d.a("user requested trackPosition(" + bvVar + "), id=" + bsVar.a());
        do {
            bnVar = this.v;
            objD = bnVar.d();
        } while (!bnVar.f(objD, h.a.r.p((Map) objD, new h.k(Integer.valueOf(bsVar.a()), bsVar))));
        return new ef(this, bvVar, bsVar, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        r8 = r7;
        r7 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.waze.map.b.ed
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r7, java.util.List r8, h.c.e r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.map.b.fd.d(java.util.List, java.util.List, h.c.e):java.lang.Object");
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k e() {
        return new aw(this.f28325l, 4);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k f() {
        return new aw(this.f28325l, 5);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k g() {
        return kotlinx.coroutines.b.ai.I(new aw(new aw(this.f28325l, 6), 7), new aw(this.f28322i, 8), this.m);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k h() {
        return new aw(this.f28325l, 9);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k i() {
        return new aw(this.f28325l, 10);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k j() {
        return new aw(this.f28325l, 11);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k k() {
        return new aw(this.f28325l, 12);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k l() {
        return new aw(this.f28325l, 13);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k m() {
        return new aw(this.f28325l, 14);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k n() {
        return new aw(this.f28325l, 15);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k o() {
        return new aw(this.f28325l, 16);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k p() {
        return new aw(this.f28325l, 17);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k q() {
        return new aw(this.f28325l, 18);
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.k r() {
        return new aw(this.f28325l, 19);
    }

    @Override // com.waze.map.b.ed
    public final /* synthetic */ kotlinx.coroutines.b.ch s() {
        return this.z;
    }

    @Override // com.waze.map.b.ed
    public final /* synthetic */ kotlinx.coroutines.b.ch t() {
        return this.x;
    }

    @Override // com.waze.map.b.ed
    public final /* synthetic */ kotlinx.coroutines.b.ch u() {
        return this.A;
    }

    @Override // com.waze.map.b.ed
    public final /* synthetic */ kotlinx.coroutines.b.ch v() {
        return this.w;
    }

    @Override // com.waze.map.b.ed
    public final /* synthetic */ kotlinx.coroutines.b.ch w() {
        return this.y;
    }

    @Override // com.waze.map.b.ed
    public final kotlinx.coroutines.b.ch x() {
        return this.C;
    }

    @Override // com.waze.map.b.ed
    public final void y(com.waze.shared_infra.h.c cVar) {
        this.f28324k.e(new com.waze.map.cm(cVar));
    }

    @Override // com.waze.map.b.ed
    public final void z() {
        this.f28322i.c(com.waze.map.db.f28740a);
    }
}
