package com.waze.car_lib.r.a;

import com.waze.a.af;
import com.waze.c.d.ae;
import com.waze.c.d.ai;
import com.waze.c.d.aj;
import com.waze.c.d.am;
import com.waze.c.d.q;
import com.waze.c.d.r;
import com.waze.c.d.s;
import com.waze.c.e.a.t;
import com.waze.car_lib.p.bl;
import com.waze.car_lib.p.bm;
import com.waze.car_lib.screens.bx;
import com.waze.navigate.ei;
import h.ab;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.n f20915a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.sharedui.utils.f f20916b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f20917c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.c.e.a.b f20918d;

    /* renamed from: e, reason: collision with root package name */
    private final am f20919e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.l.d f20920f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.perf.tracer.g f20921g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20922h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f20923i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f20924j;

    /* renamed from: k, reason: collision with root package name */
    private t f20925k;

    public /* synthetic */ p(com.waze.map.b.n nVar, com.waze.sharedui.utils.f fVar, ae aeVar, com.waze.c.e.a.b bVar, am amVar, com.waze.car_lib.l.d dVar, com.waze.perf.tracer.g gVar, com.waze.shared_infra.i.e eVar) {
        this.f20915a = nVar;
        this.f20916b = fVar;
        this.f20917c = aeVar;
        this.f20918d = bVar;
        this.f20919e = amVar;
        this.f20920f = dVar;
        this.f20921g = gVar;
        this.f20922h = eVar;
        bn bnVarB = ck.b(false);
        this.f20923i = bnVarB;
        this.f20924j = ck.b(new bm(((Boolean) bnVarB.d()).booleanValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object d(com.waze.car_lib.r.a.p r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.car_lib.r.a.d
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.car_lib.r.a.d r0 = (com.waze.car_lib.r.a.d) r0
            int r1 = r0.f20884c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20884c = r1
            goto L18
        L13:
            com.waze.car_lib.r.a.d r0 = new com.waze.car_lib.r.a.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f20882a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f20884c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            e.b.c.b(r6)
            com.waze.c.d.ae r6 = r5.f20917c
            kotlinx.coroutines.b.ch r6 = r6.o()
            kotlinx.coroutines.b.k r6 = (kotlinx.coroutines.b.k) r6
            com.waze.car_lib.r.a.e r2 = new com.waze.car_lib.r.a.e
            r4 = 0
            r2.<init>(r4)
            h.g.a.p r2 = (h.g.a.p) r2
            r0.f20884c = r3
            java.lang.Object r6 = kotlinx.coroutines.b.ai.k(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            com.waze.c.d.t r6 = (com.waze.c.d.t) r6
            if (r6 == 0) goto L54
            com.waze.c.d.am r5 = r5.f20919e
            r5.e()
        L54:
            h.ab r5 = h.ab.f48028a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.a.p.d(com.waze.car_lib.r.a.p, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ h.k e(p pVar, long j2) {
        Object next;
        pVar.f20922h.a("onAltRouteMapRouteClicked: " + j2);
        ae aeVar = pVar.f20917c;
        Iterator it = ((com.waze.c.d.t) aeVar.o().d()).f().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (af.m((com.waze.c.d.m) next).a() == j2) {
                break;
            }
        }
        com.waze.c.d.m mVar = (com.waze.c.d.m) next;
        if (mVar == null) {
            return null;
        }
        aeVar.r(mVar);
        return new h.k(mVar, af.l((com.waze.c.d.t) aeVar.o().d()));
    }

    static final ab f(List list, p pVar, com.waze.c.d.m mVar, boolean z, int i2) {
        com.waze.c.d.m mVar2 = (com.waze.c.d.m) h.a.i.S(list, i2);
        if (mVar2 != null) {
            pVar.f20919e.b(mVar2, mVar, z, ai.f18293d, aj.f18304c, null);
            pVar.f20917c.r(mVar2);
        }
        return ab.f48028a;
    }

    public static final /* synthetic */ void h(p pVar, com.waze.c.d.t tVar, h.g.a.a aVar) {
        com.waze.car_lib.l.b bVar;
        s sVarB = tVar.b();
        if (!(sVarB instanceof com.waze.c.d.o)) {
            if (x.n(sVarB, q.f18383a)) {
                pVar.f20919e.f();
                return;
            }
            if (!x.n(sVarB, com.waze.c.d.p.f18382a)) {
                if (!x.n(sVarB, r.f18384a)) {
                    throw new h.i();
                }
                return;
            } else {
                if (tVar.f().size() == 1) {
                    pVar.f20920f.e(com.waze.car_lib.l.c.f20295a);
                    return;
                }
                return;
            }
        }
        com.waze.shared_infra.i.e eVar = pVar.f20922h;
        com.waze.c.d.o oVar = (com.waze.c.d.o) sVarB;
        com.waze.c.d.n nVarA = oVar.a();
        Objects.toString(nVarA);
        eVar.b("invalid state for AlternateRoutes, reason ".concat(String.valueOf(nVarA)));
        com.waze.car_lib.l.d dVar = pVar.f20920f;
        com.waze.c.d.n nVarA2 = oVar.a();
        com.waze.c.d.n nVar = com.waze.c.d.n.f18376a;
        int iOrdinal = nVarA2.ordinal();
        if (iOrdinal == 0) {
            bVar = com.waze.car_lib.l.b.f20294a;
        } else if (iOrdinal == 1) {
            bVar = com.waze.car_lib.l.a.f20293a;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            bVar = com.waze.car_lib.l.a.f20293a;
        } else {
            bVar = com.waze.car_lib.l.c.f20295a;
        }
        dVar.e(bVar);
        pVar.s(aVar);
    }

    public static final /* synthetic */ void i(p pVar, boolean z) {
        bn bnVar;
        Object objD;
        com.waze.car_lib.p.bn bnVarA;
        do {
            bnVar = pVar.f20924j;
            objD = bnVar.d();
            bx bxVar = (bx) objD;
            if (bxVar instanceof bl) {
                bnVarA = bl.q((bl) bxVar, z);
            } else if (bxVar instanceof bm) {
                bnVarA = new bm(z);
            } else {
                if (!(bxVar instanceof com.waze.car_lib.p.bn)) {
                    throw new h.i();
                }
                bnVarA = com.waze.car_lib.p.bn.a((com.waze.car_lib.p.bn) bxVar);
            }
        } while (!bnVar.f(objD, bnVarA));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void j(com.waze.car_lib.r.a.p r29, com.waze.c.d.t r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.car_lib.r.a.p.j(com.waze.car_lib.r.a.p, com.waze.c.d.t, boolean):void");
    }

    public static final /* synthetic */ boolean q(p pVar, com.waze.c.d.t tVar, h.g.a.a aVar) {
        if (tVar.d() != ei.f31310a) {
            return true;
        }
        pVar.s(aVar);
        return false;
    }

    private final void s(h.g.a.a aVar) {
        t tVar = this.f20925k;
        if (tVar != null) {
            tVar.s();
        }
        aVar.invoke();
    }

    private final void t(com.waze.c.d.m mVar, com.waze.c.d.m mVar2, boolean z) {
        this.f20919e.b(mVar, mVar2, z, ai.f18294e, aj.f18304c, null);
    }

    public final void k() {
        this.f20919e.a(ai.f18296g, aj.f18304c);
        t tVar = this.f20925k;
        if (tVar != null) {
            tVar.s();
        }
    }

    public final void l() {
        t tVar = this.f20925k;
        if (tVar != null) {
            tVar.t();
        }
    }

    public final void m() {
        t tVar = this.f20925k;
        if (tVar != null) {
            tVar.u();
        }
    }

    public final void n(boolean z) {
        this.f20923i.e(Boolean.valueOf(z));
    }

    public final void o() {
        this.f20919e.h();
    }

    public final void p() {
        ae aeVar = this.f20917c;
        com.waze.c.d.m mVarL = af.l((com.waze.c.d.t) aeVar.o().d());
        com.waze.shared_infra.h.c cVarE = ((com.waze.c.d.t) aeVar.o().d()).e();
        com.waze.c.d.m mVarA = ((com.waze.c.d.t) aeVar.o().d()).a();
        boolean z = mVarA instanceof com.waze.c.d.i;
        boolean z2 = cVarE != null;
        if (z) {
            this.f20919e.b(mVarA, mVarL, z2, ai.f18295f, aj.f18304c, null);
        } else if (mVarA instanceof com.waze.c.d.j) {
            t(mVarA, mVarL, z2);
            if (((com.waze.c.d.j) mVarA).d()) {
                aeVar.q((com.waze.c.d.l) mVarA);
            }
        } else {
            if (!(mVarA instanceof com.waze.c.d.k)) {
                throw new h.i();
            }
            t(mVarA, mVarL, z2);
            aeVar.q((com.waze.c.d.l) mVarA);
        }
        t tVar = this.f20925k;
        if (tVar != null) {
            tVar.s();
        }
    }

    public final Object r(h.c.j jVar, bq bqVar, boolean z, h.g.a.a aVar) {
        am amVar = this.f20919e;
        amVar.h();
        this.f20925k = this.f20918d.a(jVar, this.f20915a, new f(this), amVar, false);
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(jVar);
        kotlinx.coroutines.aj.z(afVarE, null, null, new g(this, z, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new j(this, aVar, z, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new m(this, null, 1, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new l(this, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new m(this, null, 0), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new o(bqVar, this, aVar, null), 3);
        return kotlinx.coroutines.b.ai.U(this.f20924j);
    }
}
