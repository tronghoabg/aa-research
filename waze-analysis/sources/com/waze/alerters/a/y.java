package com.waze.alerters.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y implements h {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14208a;

    /* renamed from: b, reason: collision with root package name */
    private final n f14209b;

    /* renamed from: c, reason: collision with root package name */
    private List f14210c;

    /* renamed from: d, reason: collision with root package name */
    private final bm f14211d;

    /* renamed from: e, reason: collision with root package name */
    private final bq f14212e;

    public y(af afVar, com.waze.shared_infra.i.e eVar, n nVar, kotlinx.coroutines.b.k kVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(nVar, "stateHolderFactory");
        h.g.b.x.f(kVar, "nativeUpdates");
        this.f14208a = eVar;
        this.f14209b = nVar;
        this.f14210c = h.a.i.h();
        bm bmVarC = bu.c(1, 1, kotlinx.coroutines.a.a.f51272b);
        this.f14211d = bmVarC;
        this.f14212e = ai.S(bmVarC);
        ai.m(new x(ai.L(kVar, new r(this, null)), this), afVar);
    }

    public static final /* synthetic */ List c(y yVar, List list, List list2) {
        List<z> list3 = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((z) obj).c(), obj);
        }
        List list4 = list;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(list4, 10)), 16));
        for (Object obj2 : list4) {
            linkedHashMap2.put(((q) obj2).a(), obj2);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list4) {
            if (!linkedHashMap.containsKey(((q) obj3).a())) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = arrayList;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((q) it.next()).l(null);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            q qVar = (q) obj4;
            if (!qVar.n() && !qVar.m()) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(h.a.i.q(list3, 10));
        for (z zVar : list3) {
            q qVarA = (q) linkedHashMap2.get(zVar.c());
            if (qVarA == null) {
                yVar.f14208a.a("adding a new descriptor id=" + zVar.c() + ", triggerDistance=" + zVar.a() + ", validationResult=" + zVar.b().g());
                qVarA = yVar.f14209b.a(zVar);
            } else {
                qVarA.l(zVar);
            }
            arrayList5.add(qVarA);
        }
        List listAf = h.a.i.af(arrayList4, arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : listAf) {
            if (((q) obj5).o()) {
                arrayList6.add(obj5);
            }
        }
        return arrayList6;
    }

    @Override // com.waze.alerters.a.h
    public final /* synthetic */ kotlinx.coroutines.b.k a() {
        return this.f14212e;
    }
}
