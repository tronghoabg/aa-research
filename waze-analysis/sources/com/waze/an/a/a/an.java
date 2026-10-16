package com.waze.an.a.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class an implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.aq f14380a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ar f14381b;

    an(h.g.b.aq aqVar, ar arVar) {
        this.f14380a = aqVar;
        this.f14381b = arVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        Object objD;
        Map mapT;
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(h.a.i.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.an.a.l) it.next()).m());
        }
        Set setAu = h.a.i.au(arrayList);
        h.g.b.aq aqVar = this.f14380a;
        Set setT = e.c.d.a.t((Set) aqVar.f48105a, setAu);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((Set) aqVar.f48105a).contains(((com.waze.an.a.l) obj2).m())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<com.waze.an.a.l> arrayList3 = arrayList2;
        ar arVar = this.f14381b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(h.k.n.h(h.a.r.a(h.a.i.q(arrayList3, 10)), 16));
        for (com.waze.an.a.l lVar : arrayList3) {
            h.k kVar = new h.k(lVar.m(), new ao(lVar, arVar));
            linkedHashMap.put(kVar.c(), kVar.d());
        }
        bn bnVar = arVar.f14392d;
        do {
            objD = bnVar.d();
            Map map = (Map) objD;
            Set set = setT;
            h.g.b.x.f(map, "<this>");
            h.g.b.x.f(set, "keys");
            mapT = h.a.r.t(map);
            h.a.i.aN(mapT.keySet(), set);
        } while (!bnVar.f(objD, h.a.r.o(h.a.r.n(mapT), linkedHashMap)));
        aqVar.f48105a = setAu;
        return h.ab.f48028a;
    }
}
