package com.waze.trip_overview;

import i.b.l.sk;
import i.b.l.sl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41145a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final Set f41146b = e.c.d.a.r(com.waze.modules.c.i.G, com.waze.modules.c.i.D, com.waze.modules.c.i.m, com.waze.modules.c.i.t, com.waze.modules.c.i.x, com.waze.modules.c.i.C, com.waze.modules.c.i.u, com.waze.modules.c.i.A, com.waze.modules.c.i.v, com.waze.modules.c.i.w, com.waze.modules.c.i.B, com.waze.modules.c.i.y, com.waze.modules.c.i.z, com.waze.modules.c.i.F, com.waze.modules.c.i.o, com.waze.modules.c.i.I);

    public static final sl a(com.waze.modules.c.ar arVar) {
        h.g.b.x.f(arVar, "<this>");
        sk builder = arVar.u().toBuilder();
        h.g.b.x.e(builder, "toBuilder(...)");
        sk skVar = builder;
        skVar.d();
        List listN = arVar.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (((com.waze.modules.c.h) obj).b() == com.waze.modules.c.j.f30175e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.waze.modules.c.eb.m((com.waze.modules.c.h) it.next()));
        }
        skVar.a(arrayList3);
        sl slVarBuild = skVar.build();
        h.g.b.x.e(slVarBuild, "build(...)");
        return slVarBuild;
    }

    public static final boolean b(com.waze.modules.c.h hVar) {
        h.g.b.x.f(hVar, "<this>");
        com.waze.modules.c.j jVarB = hVar.b();
        if (jVarB == null) {
            return false;
        }
        int iOrdinal = jVarB.ordinal();
        if (iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal == 5) {
                return h.a.i.ax(f41146b, hVar.a());
            }
            if (iOrdinal != 16) {
                return false;
            }
        }
        return true;
    }

    public static final List c(com.waze.modules.c.ar arVar) {
        h.g.b.x.f(arVar, "<this>");
        List listN = arVar.n();
        h.g.b.x.f(listN, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (b((com.waze.modules.c.h) obj)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            com.waze.modules.c.j jVarB = ((com.waze.modules.c.h) obj2).b();
            Object obj3 = linkedHashMap.get(jVarB);
            if (obj3 == null) {
                obj3 = (List) new ArrayList();
                linkedHashMap.put(jVarB, obj3);
            }
            ((List) obj3).add(obj2);
        }
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (com.waze.modules.c.j jVar : h.a.i.i(com.waze.modules.c.j.f30173c, com.waze.modules.c.j.f30172b, com.waze.modules.c.j.f30176f, com.waze.modules.c.j.q)) {
            List list = (List) linkedHashMap.get(jVar);
            if (list != null) {
                arrayList2.addAll(list);
                linkedHashMap2.put(jVar, Integer.valueOf(list.size()));
            }
        }
        List listA = new b(arrayList2, linkedHashMap2).a();
        ArrayList arrayList3 = new ArrayList(h.a.i.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList3.add(com.waze.modules.c.eb.m((com.waze.modules.c.h) it.next()));
        }
        return arrayList3;
    }
}
