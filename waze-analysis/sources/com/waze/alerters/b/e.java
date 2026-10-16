package com.waze.alerters.b;

import com.waze.asks.ab;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14226a;

    /* renamed from: b, reason: collision with root package name */
    private final af f14227b;

    /* renamed from: c, reason: collision with root package name */
    private d f14228c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f14229d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f14230e;

    /* renamed from: f, reason: collision with root package name */
    private final ab f14231f;

    public e(com.waze.alerters.a.d dVar, kotlinx.coroutines.ab abVar, ab abVar2, com.waze.shared_infra.i.e eVar) {
        x.f(dVar, "collection");
        x.f(abVar, "dispatcher");
        x.f(abVar2, "config");
        x.f(eVar, "logger");
        this.f14231f = abVar2;
        this.f14226a = eVar;
        af afVarE = aj.e(abVar);
        this.f14227b = afVarE;
        this.f14228c = new d(h.a.i.h(), null, null);
        bn bnVarB = ck.b(null);
        this.f14229d = bnVarB;
        this.f14230e = ai.U(bnVarB);
        ai.m(ai.K(dVar.a(), new j(this, (h.c.e) null, 1)), afVarE);
    }

    public static final /* synthetic */ d c(e eVar, d dVar, List list) {
        com.waze.alerters.a.c cVarH;
        com.waze.shared_infra.h.c cVarB;
        com.waze.j jVar;
        com.waze.j jVar2;
        com.waze.shared_infra.h.c cVarH2;
        int iA;
        com.waze.k kVarA;
        Object next;
        com.waze.alerters.a.c cVarA = dVar.a();
        com.waze.g gVarC = null;
        if (cVarA == null || (kVarA = cVarA.a()) == null) {
            cVarH = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (x.n(((com.waze.alerters.a.c) next).a(), kVarA)) {
                    break;
                }
            }
            cVarH = (com.waze.alerters.a.c) next;
        }
        if (cVarH != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((com.waze.alerters.a.c) obj).c().d()) {
                    arrayList.add(obj);
                }
            }
            com.waze.alerters.a.c cVarH3 = h(arrayList);
            if (cVarH3 != null && cVarH3.c().a() < cVarH.c().a()) {
                eVar.f14226a.e("replacing alert=" + cVarH.a() + " with a preemptive alert=" + cVarH3.a());
                cVarH = cVarH3;
            }
        }
        if (cVarH == null) {
            com.waze.shared_infra.h.c cVarB2 = dVar.b();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                com.waze.alerters.a.c cVar = (com.waze.alerters.a.c) obj2;
                if (!cVar.b().b() || cVarB2 == null || (cVarH2 = ((com.waze.j) cVar.d().d()).h()) == null || (iA = (int) com.waze.sharedui.utils.f.a(cVarB2, cVarH2)) >= eVar.f14231f.b()) {
                    arrayList2.add(obj2);
                } else {
                    eVar.f14226a.a("filtering id=" + cVar.a() + ", distanceToLastSelected=" + iA);
                }
            }
            cVarH = h(arrayList2);
            if (cVarH != null && cVarH.b().c()) {
                eVar.f14226a.a("not selecting a nearing alerter alerter=" + cVarH.a() + ", priority=" + cVarH.c());
                cVarH = null;
            }
        }
        if (cVarH != null && (jVar2 = (com.waze.j) cVarH.d().d()) != null) {
            gVarC = jVar2.c();
        }
        if (gVarC == null) {
            if (cVarH == null || (jVar = (com.waze.j) cVarH.d().d()) == null || (cVarB = jVar.h()) == null) {
                cVarB = dVar.b();
            }
            return d.d(list, cVarH, cVarB);
        }
        eVar.f14226a.g("alerter is silently activated, alert={" + cVarH.a() + "}");
        cVarH.j();
        return d.d(list, null, dVar.f14225c);
    }

    public static final /* synthetic */ void f(e eVar, List list, com.waze.k kVar) {
        Object objA;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.waze.alerters.a.c cVar = (com.waze.alerters.a.c) it.next();
            if (!x.n(cVar.a(), kVar)) {
                eVar.f14226a.a("alertId=" + cVar.a() + " is queued");
                try {
                    cVar.g();
                    objA = h.ab.f48028a;
                } catch (Throwable th) {
                    objA = e.b.c.a(th);
                }
                Throwable thC = h.m.c(objA);
                if (thC != null) {
                    eVar.f14226a.g("failed to run onQueue callback: alertId=" + cVar.a() + ", ex=" + thC);
                }
            }
        }
    }

    private static final com.waze.alerters.a.c h(List list) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                c cVar = new c((com.waze.alerters.a.c) next);
                do {
                    Object next2 = it.next();
                    c cVar2 = new c((com.waze.alerters.a.c) next2);
                    int iCompareTo = cVar.compareTo(cVar2);
                    if (iCompareTo > 0) {
                        cVar = cVar2;
                    }
                    if (iCompareTo > 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (com.waze.alerters.a.c) obj;
    }

    @Override // com.waze.alerters.b.b
    public final ch a() {
        return this.f14230e;
    }
}
