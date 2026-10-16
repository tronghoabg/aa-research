package com.waze.search.c;

import h.g.b.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final c f35588a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35589b;

    public i(c cVar, int i2) {
        x.f(cVar, "searchEmptyStateCategoriesBuilder");
        this.f35588a = cVar;
        this.f35589b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.waze.search.c.h
    public final List a(List list) {
        Object next;
        Object next2;
        e next3;
        x.f(list, "items");
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            f fVar = (f) obj2;
            if (hashSet.add(new com.waze.places.a.d(fVar.a().e().c().c(), fVar.a().e().b(), fVar.a().e().d()))) {
                arrayList3.add(obj2);
            }
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList3) {
            if (hashSet2.add(com.waze.ac.e.u(((f) obj3).a()))) {
                arrayList4.add(obj3);
            }
        }
        List listAq = h.a.i.aq(arrayList4);
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (com.waze.ac.e.x(((f) next).a())) {
                break;
            }
        }
        f fVar2 = (f) next;
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (com.waze.ac.e.A(((f) next2).a())) {
                break;
            }
        }
        f fVar3 = (f) next2;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = 0;
                break;
            }
            next3 = it3.next();
            if (((g) next3) instanceof e) {
                break;
            }
        }
        e eVar = next3 instanceof e ? next3 : null;
        ArrayList arrayList5 = new ArrayList();
        if (eVar != null) {
            arrayList5.add(0, new e(this.f35588a.a(eVar.a())));
        }
        if (fVar2 != null) {
            arrayList5.add(fVar2);
        }
        if (fVar3 != null) {
            arrayList5.add(fVar3);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : listAq) {
            f fVar4 = (f) obj4;
            if (!com.waze.ac.e.x(fVar4.a()) && !com.waze.ac.e.A(fVar4.a())) {
                arrayList6.add(obj4);
            }
        }
        ArrayList arrayListAm = arrayList6;
        int i2 = this.f35589b;
        if (i2 > 0) {
            arrayListAm = h.a.i.am(arrayListAm, i2);
        }
        arrayList5.addAll(arrayListAm);
        return arrayList5;
    }
}
