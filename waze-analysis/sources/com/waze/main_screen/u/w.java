package com.waze.main_screen.u;

import androidx.core.app.NotificationCompat;
import com.waze.modules.navigation.ao;
import com.waze.modules.navigation.as;
import com.waze.modules.navigation.at;
import com.waze.modules.navigation.bp;
import com.waze.navigate.dg;
import java.util.Iterator;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class w implements o {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.location.b.d f27744a;

    /* renamed from: b, reason: collision with root package name */
    private final aj f27745b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bn.b f27746c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.bw.b.a.k f27747d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.q.j f27748e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27749f;

    /* renamed from: g, reason: collision with root package name */
    private final bp f27750g;

    /* renamed from: h, reason: collision with root package name */
    private final af f27751h;

    /* renamed from: i, reason: collision with root package name */
    private final n f27752i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.app_nav.w f27753j;

    /* renamed from: k, reason: collision with root package name */
    private final dg f27754k;

    /* renamed from: l, reason: collision with root package name */
    private final c f27755l;
    private final com.waze.shared_infra.r.y m;
    private final com.waze.network.z n;
    private final com.waze.shared_infra.o.a o;
    private final kotlinx.coroutines.af p;
    private br q;
    private a r;
    private boolean s;
    private final bn t;
    private final ch u;
    private final bm v;

    public w(com.waze.location.b.d dVar, aj ajVar, com.waze.bn.b bVar, com.waze.bw.b.a.k kVar, com.waze.shared_infra.q.j jVar, com.waze.shared_infra.i.e eVar, bp bpVar, af afVar, n nVar, com.waze.app_nav.w wVar, dg dgVar, c cVar, com.waze.shared_infra.r.y yVar, com.waze.network.z zVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(dVar, "locationProvider");
        h.g.b.x.f(ajVar, "resumeDriveStateRepository");
        h.g.b.x.f(bVar, "roamingProvider");
        h.g.b.x.f(kVar, "routeDurationApi");
        h.g.b.x.f(jVar, "wazeDateFormat");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(bpVar, "navigationCoordinatorControllerFactory");
        h.g.b.x.f(afVar, "predictionCardStatsSender");
        h.g.b.x.f(nVar, "config");
        h.g.b.x.f(wVar, "flowController");
        h.g.b.x.f(dgVar, "navigationInfoInterface");
        h.g.b.x.f(cVar, "getPredictionDataUseCase");
        h.g.b.x.f(yVar, "userStateRepository");
        h.g.b.x.f(zVar, "networkEventManagerInterface");
        h.g.b.x.f(aVar, "stringProvider");
        this.f27744a = dVar;
        this.f27745b = ajVar;
        this.f27746c = bVar;
        this.f27747d = kVar;
        this.f27748e = jVar;
        this.f27749f = eVar;
        this.f27750g = bpVar;
        this.f27751h = afVar;
        this.f27752i = nVar;
        this.f27753j = wVar;
        this.f27754k = dgVar;
        this.f27755l = cVar;
        this.m = yVar;
        this.n = zVar;
        this.o = aVar;
        this.p = com.waze.ui.a.l.p(this, "PredictionCardStateHolder");
        bn bnVarB = ck.b(com.waze.ui.u.r.f43466a);
        this.t = bnVarB;
        this.u = kotlinx.coroutines.b.ai.U(bnVarB);
        bm bmVarC = bu.c(0, 1, kotlinx.coroutines.a.a.f51272b);
        this.v = bmVarC;
        kotlinx.coroutines.b.ai.S(bmVarC);
    }

    private final void A(aa aaVar) {
        Object objD = this.u.d();
        com.waze.ui.u.s sVar = objD instanceof com.waze.ui.u.s ? (com.waze.ui.u.s) objD : null;
        com.waze.ui.u.aj ajVarA = sVar != null ? sVar.a() : null;
        if (ajVarA == null) {
            this.f27749f.g("Invalid state: state should be Prediction in order to report dismiss event");
            return;
        }
        com.waze.ui.u.aj ajVar = ajVarA;
        af afVar = this.f27751h;
        y yVarB = com.waze.main_screen.r.a.b.b(ajVar.d());
        ab abVarC = com.waze.main_screen.r.a.b.c(ajVar.a());
        z zVarC = C(ajVar);
        com.waze.shared_infra.h.c cVarD = com.waze.main_screen.r.a.b.d(ajVar.e().b());
        boolean zB = B();
        boolean z = ajVar.f() != null;
        com.waze.ui.u.ai aiVarA = ajVar.e().a().a();
        afVar.b(yVarB, abVarC, zVarC, cVarD, zB, z, aaVar, aiVarA != null ? aiVarA.a() : null);
    }

    private final boolean B() {
        com.waze.ui.u.aj ajVarA;
        Object objD = this.u.d();
        com.waze.ui.u.af afVarC = null;
        com.waze.ui.u.s sVar = objD instanceof com.waze.ui.u.s ? (com.waze.ui.u.s) objD : null;
        if (sVar != null && (ajVarA = sVar.a()) != null) {
            afVarC = ajVarA.c();
        }
        return afVarC == com.waze.ui.u.af.f43428c;
    }

    private static final z C(com.waze.ui.u.aj ajVar) {
        com.waze.ui.u.z zVarC = ajVar.e().c();
        if (zVarC instanceof com.waze.ui.u.w) {
            return z.f27764a;
        }
        if (zVarC instanceof com.waze.ui.u.y) {
            return z.f27765b;
        }
        if (zVarC instanceof com.waze.ui.u.x) {
            return z.f27766c;
        }
        if (zVarC != null) {
            throw new h.i();
        }
        com.waze.ui.u.ag agVarD = ajVar.d();
        com.waze.ui.u.ag agVar = com.waze.ui.u.ag.f43430a;
        int iOrdinal = agVarD.ordinal();
        if (iOrdinal == 0) {
            return z.f27768e;
        }
        if (iOrdinal == 1) {
            return z.f27767d;
        }
        throw new h.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ Object n(w wVar, a aVar, com.waze.sharedui.e.c cVar, h.c.e eVar) {
        com.waze.ui.u.ag agVar = com.waze.ui.u.ag.f43430a;
        com.waze.ui.u.ae aeVarV = wVar.v(agVar);
        com.waze.av.b.c cVar2 = null;
        if (aVar.d() != null) {
            Iterator it = aVar.b().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (h.g.b.x.n(((com.waze.av.b.c) next).c(), aVar.d())) {
                    cVar2 = next;
                    break;
                }
            }
            cVar2 = cVar2;
        }
        Object objX = wVar.x(new com.waze.ui.u.aj(com.waze.main_screen.r.a.b.f(aVar), com.waze.main_screen.r.a.b.e(cVar2), agVar, aeVarV), cVar, eVar);
        return objX == h.c.a.a.f48038a ? objX : h.ab.f48028a;
    }

    public static final /* synthetic */ Object o(w wVar, a aVar, com.waze.location.b.c cVar, h.c.e eVar) {
        Object next;
        com.waze.av.b.c cVar2;
        com.waze.ui.u.ag agVar = com.waze.ui.u.ag.f43431b;
        com.waze.ui.u.ae aeVarV = wVar.v(agVar);
        if (aVar.d() == null) {
            cVar2 = null;
        } else {
            Iterator it = aVar.b().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (h.g.b.x.n(((com.waze.av.b.c) next).c(), aVar.d())) {
                    break;
                }
            }
            cVar2 = (com.waze.av.b.c) next;
        }
        Object objX = wVar.x(new com.waze.ui.u.aj(com.waze.main_screen.r.a.b.f(aVar), com.waze.main_screen.r.a.b.e(cVar2), agVar, aeVarV), cVar != null ? cVar.c() : null, eVar);
        return objX == h.c.a.a.f48038a ? objX : h.ab.f48028a;
    }

    private final com.waze.main_screen.u.a.d u(com.waze.ui.u.ag agVar) {
        String strC;
        com.waze.ui.u.ag agVar2 = com.waze.ui.u.ag.f43430a;
        int iOrdinal = agVar.ordinal();
        if (iOrdinal == 0) {
            strC = this.f27752i.c();
        } else {
            if (iOrdinal != 1) {
                throw new h.i();
            }
            strC = this.f27752i.d();
        }
        int iHashCode = strC.hashCode();
        if (iHashCode != -955687173) {
            if (iHashCode != 2402104) {
                if (iHashCode == 79826725 && strC.equals("TIMER")) {
                    n nVar = this.f27752i;
                    long jB = nVar.b();
                    h.o.c cVar = h.o.a.f48264a;
                    return h.o.a.A(jB, 0L) ? com.waze.main_screen.u.a.a.f27651a : new com.waze.main_screen.u.a.c(nVar.b());
                }
            } else if (strC.equals("NONE")) {
                return com.waze.main_screen.u.a.a.f27651a;
            }
        } else if (strC.equals("ROAMING_TIMEOUT")) {
            n nVar2 = this.f27752i;
            long jA = nVar2.a();
            h.o.c cVar2 = h.o.a.f48264a;
            return h.o.a.A(jA, 0L) ? com.waze.main_screen.u.a.a.f27651a : new com.waze.main_screen.u.a.b(nVar2.a());
        }
        this.f27749f.g("Timer behavior config is " + strC + " which is invalid, no timer shown");
        return com.waze.main_screen.u.a.a.f27651a;
    }

    private final com.waze.ui.u.ae v(com.waze.ui.u.ag agVar) {
        com.waze.main_screen.u.a.d dVarU = u(agVar);
        boolean z = dVarU instanceof com.waze.main_screen.u.a.b;
        if (z) {
            this.f27749f.a("Timer: Roaming timer started");
            this.q = kotlinx.coroutines.aj.z(this.p, null, null, new s(this.f27746c, (com.waze.main_screen.u.a.b) dVarU, this, null), 3);
        }
        if (z) {
            this.f27749f.a("Timer: Roaming timer started");
            this.q = kotlinx.coroutines.aj.z(this.p, null, null, new q(this, dVarU, (h.c.e) null, 0), 3);
            return null;
        }
        if (!(dVarU instanceof com.waze.main_screen.u.a.c)) {
            if (h.g.b.x.n(dVarU, com.waze.main_screen.u.a.a.f27651a)) {
                return null;
            }
            throw new h.i();
        }
        com.waze.ui.u.ae aeVar = new com.waze.ui.u.ae(((com.waze.main_screen.u.a.c) dVarU).a(), System.currentTimeMillis());
        this.f27749f.a("Timer: Regular timer started");
        this.q = kotlinx.coroutines.aj.z(this.p, null, null, new q(dVarU, this, (h.c.e) null, 2), 3);
        return aeVar;
    }

    private final com.waze.ui.u.ag w() {
        com.waze.ui.u.aj ajVarA;
        com.waze.ui.u.ag agVarD;
        Object objD = this.u.d();
        com.waze.ui.u.s sVar = objD instanceof com.waze.ui.u.s ? (com.waze.ui.u.s) objD : null;
        return (sVar == null || (ajVarA = sVar.a()) == null || (agVarD = ajVarA.d()) == null) ? com.waze.ui.u.ag.f43430a : agVarD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.waze.ui.u.aj r19, com.waze.sharedui.e.c r20, h.c.e r21) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.u.w.x(com.waze.ui.u.aj, com.waze.sharedui.e.c, h.c.e):java.lang.Object");
    }

    private final void y() {
        Object next;
        com.waze.av.b.n nVarV;
        com.waze.ui.u.t tVar = (com.waze.ui.u.t) this.u.d();
        boolean z = tVar instanceof com.waze.ui.u.s;
        a aVar = this.r;
        if (!z || aVar == null) {
            this.f27749f.g("Invalid state. State should be Prediction and displayed prediction shouldn't be null");
            return;
        }
        boolean z2 = ((com.waze.ui.u.s) tVar).a().d() == com.waze.ui.u.ag.f43431b;
        Iterator it = aVar.b().d().iterator();
        Object obj = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jA = ((com.waze.av.b.y) next).a();
                do {
                    Object next2 = it.next();
                    long jA2 = ((com.waze.av.b.y) next2).a();
                    if (jA < jA2) {
                        jA = jA2;
                    }
                    if (jA < jA2) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.waze.av.b.y yVar = (com.waze.av.b.y) next;
        if (aVar.d() != null) {
            Iterator it2 = aVar.b().b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next3 = it2.next();
                if (h.g.b.x.n(((com.waze.av.b.c) next3).c(), aVar.d())) {
                    obj = next3;
                    break;
                }
            }
            nVarV = com.waze.bw.c.d.v.v(aVar.b(), this.o, (com.waze.av.b.c) obj, null, null, 12);
        } else if (aVar.c() != null) {
            Iterator it3 = aVar.b().c().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next4 = it3.next();
                long jA3 = ((com.waze.av.b.h) next4).a();
                Long lC = aVar.c();
                if (lC != null && jA3 == lC.longValue()) {
                    obj = next4;
                    break;
                }
            }
            nVarV = com.waze.bw.c.d.v.v(aVar.b(), this.o, null, (com.waze.av.b.h) obj, yVar, 2);
        } else {
            nVarV = com.waze.bw.c.d.v.v(aVar.b(), this.o, null, null, yVar, 6);
        }
        this.f27750g.b(new ao(com.waze.modules.navigation.ah.f30296l, new com.waze.modules.navigation.ai(nVarV), null, true, at.f30321a, z2 ? as.f30318b : as.f30319c, z2, null, 128));
    }

    private final void z(x xVar) {
        String strA;
        ae aeVar;
        ab abVar;
        com.waze.shared_infra.h.c cVar;
        boolean z;
        boolean z2;
        Object objD = this.u.d();
        com.waze.ui.u.s sVar = objD instanceof com.waze.ui.u.s ? (com.waze.ui.u.s) objD : null;
        com.waze.ui.u.aj ajVarA = sVar != null ? sVar.a() : null;
        if (ajVarA == null) {
            this.f27749f.g("Invalid state: state should be Prediction in order to report click event");
            return;
        }
        com.waze.ui.u.aj ajVar = ajVarA;
        af afVar = this.f27751h;
        ae aeVarK = a.a.K(u(w()));
        y yVarB = com.waze.main_screen.r.a.b.b(ajVar.d());
        ab abVarC = com.waze.main_screen.r.a.b.c(ajVar.a());
        z zVarC = C(ajVar);
        com.waze.shared_infra.h.c cVarD = com.waze.main_screen.r.a.b.d(ajVar.e().b());
        boolean zB = B();
        boolean z3 = ajVar.f() != null;
        com.waze.ui.u.ai aiVarA = ajVar.e().a().a();
        if (aiVarA != null) {
            strA = aiVarA.a();
            z2 = zB;
            aeVar = aeVarK;
            abVar = abVarC;
            cVar = cVarD;
            z = z3;
        } else {
            strA = null;
            aeVar = aeVarK;
            abVar = abVarC;
            cVar = cVarD;
            z = z3;
            z2 = zB;
        }
        afVar.a(aeVar, yVarB, abVar, zVarC, cVar, z2, z, xVar, strA);
    }

    @Override // com.waze.main_screen.u.o
    public final ch a() {
        return this.u;
    }

    @Override // com.waze.main_screen.u.o
    public final void b(com.waze.ui.u.p pVar) {
        Object objD;
        com.waze.ui.u.s sVar;
        com.waze.ui.u.aj ajVarA;
        h.g.b.x.f(pVar, NotificationCompat.CATEGORY_EVENT);
        br brVar = this.q;
        if (brVar != null) {
            brVar.s(null);
        }
        if (this.q != null) {
            this.f27749f.a("Timer is cleared");
        }
        com.waze.ui.u.ag agVarD = null;
        this.q = null;
        bn bnVar = this.t;
        do {
            objD = bnVar.d();
            sVar = (com.waze.ui.u.t) objD;
            if (sVar instanceof com.waze.ui.u.s) {
                com.waze.ui.u.aj ajVarH = com.waze.ui.u.aj.h(((com.waze.ui.u.s) sVar).a(), null, null, null, 63);
                h.g.b.x.f(ajVarH, "state");
                sVar = new com.waze.ui.u.s(ajVarH);
            }
        } while (!bnVar.f(objD, sVar));
        if (pVar instanceof com.waze.ui.u.i) {
            z(x.f27756a);
            y();
            A(aa.f27655b);
            close();
            return;
        }
        if (pVar instanceof com.waze.ui.u.o) {
            z(x.f27757b);
            y();
            close();
            return;
        }
        if (pVar instanceof com.waze.ui.u.m) {
            A(aa.f27654a);
            close();
            return;
        }
        if (!(pVar instanceof com.waze.ui.u.h)) {
            if (pVar instanceof com.waze.ui.u.j) {
                z(x.f27759d);
                this.v.c(l.f27716a);
                return;
            } else {
                if (!h.g.b.x.n(pVar, com.waze.ui.u.l.f43461a) && !h.g.b.x.n(pVar, com.waze.ui.u.n.f43463a) && !h.g.b.x.n(pVar, com.waze.ui.u.k.f43460a)) {
                    throw new h.i();
                }
                return;
            }
        }
        z(x.f27758c);
        A(aa.f27656c);
        Object objD2 = this.u.d();
        com.waze.ui.u.s sVar2 = objD2 instanceof com.waze.ui.u.s ? (com.waze.ui.u.s) objD2 : null;
        if (sVar2 != null && (ajVarA = sVar2.a()) != null) {
            agVarD = ajVarA.d();
        }
        if (agVarD == com.waze.ui.u.ag.f43431b) {
            this.f27745b.b();
        }
        close();
    }

    @Override // com.waze.main_screen.u.o
    public final void c() {
        u uVar = new u(this, null, 1, null);
        kotlinx.coroutines.af afVar = this.p;
        kotlinx.coroutines.aj.z(afVar, null, null, uVar, 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new u(this, null, 0), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new v(this, null), 3);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.t.e(com.waze.ui.u.q.f43465a);
        kotlinx.coroutines.aj.h(this.p, null);
    }
}
