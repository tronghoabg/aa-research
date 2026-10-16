package com.waze.an.b;

import com.waze.AlerterController$Alerter$Type;
import com.waze.an.a.a.as;
import com.waze.an.a.ap;
import com.waze.an.a.r;
import com.waze.an.a.s;
import com.waze.an.a.t;
import com.waze.an.a.u;
import com.waze.an.a.v;
import com.waze.an.a.w;
import com.waze.location.q;
import h.g.b.aq;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    private final ap f14656a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.k.a f14657b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14658c;

    /* renamed from: d, reason: collision with root package name */
    private final af f14659d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f14660e;

    public o(ap apVar, com.waze.main_screen.k.a aVar, com.waze.shared_infra.i.e eVar, h.c.j jVar) {
        x.f(apVar, "repository");
        x.f(aVar, "insightConfig");
        x.f(eVar, "logger");
        x.f(jVar, "coroutineContext");
        this.f14656a = apVar;
        this.f14657b = aVar;
        this.f14658c = eVar;
        af afVarE = aj.e(jVar.plus(aj.Q()).plus(new ae("InsightPolicy")));
        this.f14659d = afVarE;
        aq aqVar = new aq();
        aqVar.f48105a = f.f14629a;
        kotlinx.coroutines.b.k kVarK = ai.K(ai.z(ai.E(new l(apVar.a(), null, this, aqVar)), new com.waze.z.a.d.c(15)), new m(aqVar, this, null));
        int i2 = bz.f51630a;
        this.f14660e = ai.V(kVarK, afVarE, by.b(), f.f14629a);
    }

    public static final /* synthetic */ r b(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                List listAl = h.a.i.al(arrayList, new n(1));
                com.waze.an.a.b bVar = (com.waze.an.a.b) h.a.i.R(listAl);
                Object obj = null;
                boolean z = (bVar != null ? oVar.i(bVar) : null) == i.f14634b;
                com.waze.shared_infra.i.e eVarJ = oVar.j();
                if (eVarJ != null) {
                    eVarJ.a("Highest alert priority: " + (bVar != null ? oVar.k(bVar) : null) + ", holdOff=" + z);
                }
                if (z) {
                    return null;
                }
                Iterator it2 = listAl.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (oVar.i((com.waze.an.a.b) next) == i.f14635c) {
                        obj = next;
                        break;
                    }
                }
                return (r) obj;
            }
            Object next2 = it.next();
            com.waze.an.a.b bVar2 = (com.waze.an.a.b) next2;
            i iVarI = oVar.i(bVar2);
            i iVar = i.f14633a;
            com.waze.g gVar = com.waze.g.f23984a;
            int iOrdinal = iVarI.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    arrayList.add(next2);
                } else if (iOrdinal != 3) {
                    throw new h.i();
                }
            }
            com.waze.shared_infra.i.e eVarJ2 = oVar.j();
            if (eVarJ2 != null) {
                eVarJ2.a("Skipping: ".concat(oVar.k(bVar2)));
            }
        }
    }

    public static final /* synthetic */ r c(o oVar, List list, List list2, r rVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            i iVarI = oVar.i((com.waze.an.a.b) obj);
            if (iVarI == i.f14634b || iVarI == i.f14635c) {
                arrayList.add(obj);
            }
        }
        List listAf = h.a.i.af(list, arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listAf) {
            if (((r) obj2).j().d()) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                h hVar = new h((r) next);
                do {
                    Object next2 = it.next();
                    h hVar2 = new h((r) next2);
                    int iCompareTo = hVar.compareTo(hVar2);
                    if (iCompareTo > 0) {
                        hVar = hVar2;
                    }
                    if (iCompareTo > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        r rVar2 = (r) next;
        if (((rVar2 instanceof com.waze.an.a.b) && oVar.i((com.waze.an.a.b) rVar2) == i.f14634b) || rVar == null || rVar2 == null || rVar2.j().a() >= rVar.j().a()) {
            return null;
        }
        oVar.f14658c.a("replacing insight=" + oVar.k(rVar) + " with a preemptive insight=" + oVar.k(rVar2));
        return rVar2;
    }

    public static final /* synthetic */ r d(o oVar, List list, f fVar) {
        Object next;
        r rVarB = fVar.b();
        if (rVarB != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x.n(((r) next).m(), rVarB.m())) {
                    break;
                }
            }
            r rVar = (r) next;
            if (rVar != null) {
                return rVar;
            }
            oVar.f14658c.a("currently selected insight is not found in the new descriptors");
        }
        return null;
    }

    public static final /* synthetic */ List h(o oVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.waze.an.a.b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            com.waze.g gVarC = ((com.waze.j) ((com.waze.an.a.b) obj2).b().d()).c();
            boolean zB = true;
            if (gVarC != null) {
                i iVar = i.f14633a;
                int iOrdinal = gVarC.ordinal();
                if (iOrdinal == 0) {
                    zB = false;
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new h.i();
                    }
                    zB = false;
                } else {
                    zB = oVar.f14657b.b();
                }
            }
            if (zB) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    private final i i(com.waze.an.a.b bVar) {
        if (!(bVar instanceof as)) {
            if (!(bVar instanceof com.waze.an.a.a.g)) {
                return i.f14633a;
            }
            int iIntValue = ((com.waze.an.a.a.g) bVar).a().intValue();
            com.waze.main_screen.k.a aVar = this.f14657b;
            return iIntValue > aVar.e().d() ? i.f14633a : iIntValue > aVar.e().c() ? i.f14634b : iIntValue > aVar.a() ? i.f14635c : i.f14636d;
        }
        as asVar = (as) bVar;
        Integer numA = asVar.a();
        AlerterController$Alerter$Type alerterController$Alerter$TypeE = ((com.waze.j) asVar.b().d()).e();
        AlerterController$Alerter$Type alerterController$Alerter$Type = AlerterController$Alerter$Type.DANGER_ZONE;
        if (asVar.e()) {
            return i.f14634b;
        }
        if (alerterController$Alerter$TypeE == alerterController$Alerter$Type) {
            return i.f14635c;
        }
        if (numA == null) {
            return i.f14633a;
        }
        return numA.intValue() > this.f14657b.a() ? i.f14635c : i.f14636d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.waze.shared_infra.i.e j() {
        if (this.f14657b.d()) {
            return this.f14658c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(r rVar) {
        String strConcat;
        String str;
        q qVarM = rVar.m();
        if (qVarM instanceof s) {
            strConcat = "Alert:".concat(String.valueOf(((s) qVarM).b().b()));
        } else if (qVarM instanceof u) {
            strConcat = "Notification:".concat(String.valueOf(((u) qVarM).c()));
        } else if (qVarM instanceof v) {
            strConcat = "Segment:".concat(String.valueOf(((v) qVarM).c()));
        } else if (x.n(qVarM, w.f14611a)) {
            strConcat = "Street";
        } else {
            if (!x.n(qVarM, t.f14606a)) {
                throw new h.i();
            }
            strConcat = "InsightFTE";
        }
        String str2 = "(" + rVar.j().a() + ",premp:" + rVar.j().d() + ")";
        if (rVar instanceof com.waze.an.a.b) {
            com.waze.an.a.b bVar = (com.waze.an.a.b) rVar;
            str = "(" + i(bVar).name() + "," + bVar.a() + ")";
        } else {
            str = "null";
        }
        return "(id:" + strConcat + ", priority:" + str2 + "), tracking:" + str;
    }

    @Override // com.waze.an.b.g
    public final ch a() {
        return this.f14660e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f14659d, null);
        this.f14656a.close();
    }
}
