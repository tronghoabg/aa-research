package com.waze.car_lib.n;

import com.waze.R;
import com.waze.av.b.at;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.r.cq;
import com.waze.car_lib.r.cr;
import com.waze.search.bp;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ar implements al {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.af f20379a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.b.ah f20380b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.location.y f20381c;

    /* renamed from: d, reason: collision with root package name */
    private final b f20382d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.car_lib.c.l f20383e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.c.e f20384f;

    /* renamed from: g, reason: collision with root package name */
    private final bp f20385g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20386h;

    /* renamed from: i, reason: collision with root package name */
    private br f20387i;

    /* renamed from: j, reason: collision with root package name */
    private final bn f20388j;

    /* renamed from: k, reason: collision with root package name */
    private final bm f20389k;

    public ar(kotlinx.coroutines.af afVar, com.waze.av.b.ah ahVar, com.waze.location.y yVar, b bVar, com.waze.car_lib.c.l lVar, com.waze.car_lib.c.e eVar, bp bpVar, com.waze.shared_infra.i.e eVar2) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(ahVar, "wazePlaceRepository");
        h.g.b.x.f(yVar, "locationEventManager");
        h.g.b.x.f(bVar, "autocompleteFetcher");
        h.g.b.x.f(lVar, "analyticsSender");
        h.g.b.x.f(eVar, "autoCompleteAnalyticsSender");
        h.g.b.x.f(bpVar, "techCodeHandler");
        h.g.b.x.f(eVar2, "logger");
        this.f20379a = afVar;
        this.f20380b = ahVar;
        this.f20381c = yVar;
        this.f20382d = bVar;
        this.f20383e = lVar;
        this.f20384f = eVar;
        this.f20385g = bpVar;
        this.f20386h = eVar2;
        this.f20388j = ck.b(new ak(p()));
        this.f20389k = bu.e(1, 0, null, 6);
        ahVar.e();
        kotlinx.coroutines.aj.z(afVar, null, null, new ap(this, null, 1, null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new ap(this, null, 0), 3);
    }

    static final h.ab k(ar arVar, gw gwVar, v vVar, Boolean bool) {
        Objects.toString(bool);
        arVar.f20386h.a("techCodeHandler returned ".concat(String.valueOf(bool)));
        if (h.g.b.x.n(bool, true)) {
            gwVar.e(Integer.valueOf(R.string.AAOS_TECH_CODE_TRIGGERED));
        } else {
            gwVar.i(vVar);
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void n(ar arVar, String str) {
        Object objD;
        br brVar = arVar.f20387i;
        if (brVar != null) {
            brVar.s(null);
        }
        if (str.length() != 0) {
            arVar.f20387i = kotlinx.coroutines.aj.z(arVar.f20379a, null, null, new aq(arVar, str, (h.c.e) null, 0), 3);
            return;
        }
        arVar.f20383e.e();
        bn bnVar = arVar.f20388j;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, new ak(arVar.p())));
    }

    public static final /* synthetic */ void o(ar arVar) {
        bn bnVar;
        Object objD;
        ak akVar;
        do {
            bnVar = arVar.f20388j;
            objD = bnVar.d();
            akVar = (cr) objD;
            if (akVar instanceof ak) {
                akVar = new ak(arVar.p());
            }
        } while (!bnVar.f(objD, akVar));
    }

    private final List p() {
        com.waze.av.b.ah ahVar = this.f20380b;
        com.waze.av.b.aa aaVarE = at.e(ahVar);
        ag agVar = aaVarE != null ? new ag(aaVarE) : null;
        com.waze.av.b.aa aaVarF = at.f(ahVar);
        return h.a.i.k(ae.f20359a, agVar, aaVarF != null ? new ai(aaVarF) : null, at.j(ahVar).isEmpty() ? null : af.f20360a, at.k(ahVar).isEmpty() ? null : ah.f20362a);
    }

    @Override // com.waze.car_lib.n.al
    public final ch a() {
        return this.f20388j;
    }

    @Override // com.waze.car_lib.n.al
    public final void b(com.waze.w.i iVar) {
        com.waze.search.stats.c cVar;
        h.g.b.x.f(iVar, "result");
        Object objD = a().d();
        Object obj = null;
        aj ajVar = objD instanceof aj ? (aj) objD : null;
        if (ajVar == null) {
            return;
        }
        Iterator it = ajVar.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (h.g.b.x.n(((ad) next).b(), iVar)) {
                obj = next;
                break;
            }
        }
        ad adVar = (ad) obj;
        if (adVar != null) {
            int iIndexOf = ajVar.b().indexOf(adVar);
            com.waze.car_lib.c.e eVar = this.f20384f;
            if (iVar instanceof com.waze.w.e) {
                cVar = com.waze.search.stats.c.f36013b;
            } else if (iVar instanceof com.waze.w.f) {
                cVar = com.waze.search.stats.c.f36014c;
            } else {
                if (!(iVar instanceof com.waze.w.h)) {
                    throw new h.i();
                }
                com.waze.av.b.n nVarD = ((com.waze.w.h) iVar).d();
                if (nVarD instanceof com.waze.av.b.j) {
                    cVar = com.waze.search.stats.c.f36015d;
                } else if (nVarD instanceof com.waze.av.b.k) {
                    cVar = com.waze.search.stats.c.f36016e;
                } else if (nVarD instanceof com.waze.av.b.l) {
                    cVar = com.waze.search.stats.c.f36017f;
                } else {
                    if (!(nVarD instanceof com.waze.av.b.m)) {
                        throw new h.i();
                    }
                    cVar = com.waze.search.stats.c.f36015d;
                }
            }
            com.waze.search.stats.c cVar2 = cVar;
            int iIndexOf2 = ajVar.b().indexOf(adVar);
            String strA = ajVar.a();
            Integer numD = adVar.d();
            eVar.a(cVar2, iIndexOf2, strA, numD != null ? numD.intValue() : 0, iIndexOf);
        }
    }

    @Override // com.waze.car_lib.n.al
    public final void c() {
        this.f20383e.d();
    }

    @Override // com.waze.car_lib.n.al
    public final void d(String str) {
        h.g.b.x.f(str, "searchTerm");
        this.f20389k.c(str);
    }

    @Override // com.waze.car_lib.n.al
    public final void e(final v vVar, final gw gwVar) {
        h.g.b.x.f(vVar, "query");
        h.g.b.x.f(gwVar, "coordinatorController");
        if (vVar instanceof t) {
            gwVar.i(vVar);
        } else {
            if (!(vVar instanceof u)) {
                throw new h.i();
            }
            this.f20385g.techCodeHandle(((u) vVar).a(), new h.g.a.l() { // from class: com.waze.car_lib.n.am
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return ar.k(this.f20367a, gwVar, vVar, (Boolean) obj);
                }
            });
        }
    }

    @Override // com.waze.car_lib.n.al
    public final void f() {
        Object objD = a().d();
        ak akVar = objD instanceof ak ? (ak) objD : null;
        if (akVar != null) {
            this.f20383e.b(akVar.a().contains(ae.f20359a), akVar.a().size());
        }
    }

    @Override // com.waze.car_lib.n.al
    public final void g(cq cqVar) {
        com.waze.search.stats.k kVar;
        com.waze.search.stats.f fVar;
        String strC;
        com.waze.shared_infra.h.c cVarD;
        com.waze.search.stats.q qVar;
        com.waze.shared_infra.h.c cVar;
        com.waze.search.stats.k kVar2;
        com.waze.search.stats.f fVar2;
        com.waze.search.stats.q qVar2;
        h.g.b.x.f(cqVar, "item");
        String str = null;
        if (h.g.b.x.n(cqVar, ae.f20359a)) {
            kVar2 = com.waze.search.stats.k.f36060c;
            fVar2 = com.waze.search.stats.f.f36030e;
            qVar2 = null;
            cVar = null;
        } else {
            if (h.g.b.x.n(cqVar, ah.f20362a)) {
                kVar2 = com.waze.search.stats.k.f36062e;
                fVar2 = com.waze.search.stats.f.f36029d;
                qVar2 = com.waze.search.stats.q.f36095k;
            } else if (h.g.b.x.n(cqVar, af.f20360a)) {
                kVar2 = com.waze.search.stats.k.f36062e;
                fVar2 = com.waze.search.stats.f.f36028c;
                qVar2 = com.waze.search.stats.q.f36095k;
            } else {
                if (cqVar instanceof ag) {
                    kVar = com.waze.search.stats.k.f36062e;
                    fVar = com.waze.search.stats.f.f36026a;
                    ag agVar = (ag) cqVar;
                    strC = agVar.a().a().c().c();
                    cVarD = agVar.a().a().d();
                    qVar = com.waze.search.stats.q.f36094j;
                } else {
                    if (!(cqVar instanceof ai)) {
                        throw new h.i();
                    }
                    kVar = com.waze.search.stats.k.f36062e;
                    fVar = com.waze.search.stats.f.f36027b;
                    ai aiVar = (ai) cqVar;
                    strC = aiVar.a().a().c().c();
                    cVarD = aiVar.a().a().d();
                    qVar = com.waze.search.stats.q.f36094j;
                }
                com.waze.search.stats.q qVar3 = qVar;
                cVar = cVarD;
                kVar2 = kVar;
                fVar2 = fVar;
                str = strC;
                qVar2 = qVar3;
            }
            cVar = null;
        }
        this.f20383e.a(kVar2, new com.waze.search.stats.e(str, qVar2, fVar2, cVar));
    }
}
