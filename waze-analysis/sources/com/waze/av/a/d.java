package com.waze.av.a;

import h.ab;
import h.g.a.r;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.g implements r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15792a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15793b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f15794c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ m f15795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(m mVar, h.c.e eVar) {
        super(4, eVar);
        this.f15795d = mVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        d dVar = new d(this.f15795d, (h.c.e) obj4);
        dVar.f15792a = (List) obj;
        dVar.f15793b = (List) obj2;
        dVar.f15794c = (List) obj3;
        return dVar.invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        com.waze.av.b.k next;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f15792a;
        List list2 = (List) this.f15793b;
        List list3 = (List) this.f15794c;
        List<com.waze.av.b.n> list4 = list;
        ArrayList arrayList = new ArrayList(h.a.i.q(list4, 10));
        for (com.waze.av.b.k kVar : list4) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                p pVarE = ((com.waze.av.b.n) next).e();
                if ((pVarE.c().c() != null && x.n(pVarE.c().c(), kVar.e().c().c())) || (pVarE.e() != null && x.n(pVarE.e(), kVar.e().e()))) {
                    break;
                }
            }
            com.waze.av.b.k kVar2 = next instanceof com.waze.av.b.k ? next : null;
            if ((kVar instanceof com.waze.av.b.l) && kVar2 != null) {
                com.waze.av.b.l lVar = (com.waze.av.b.l) kVar;
                kVar = new com.waze.av.b.k(lVar.e(), kVar2.h(), kVar2.f(), lVar.b(), kVar2.d(), kVar2.a(), Integer.valueOf(lVar.a()), kVar2.b());
            }
            arrayList.add(kVar);
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof com.waze.av.b.k) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof com.waze.av.b.k) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj4 : arrayList5) {
            com.waze.av.b.k kVar3 = (com.waze.av.b.k) obj4;
            ArrayList arrayList7 = arrayList4;
            if (!(arrayList7 instanceof Collection) || !arrayList7.isEmpty()) {
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    if (((com.waze.av.b.k) it2.next()).a() == kVar3.a()) {
                        break;
                    }
                }
            }
            arrayList6.add(obj4);
        }
        List listR = h.a.i.r(h.a.i.i(arrayList2, arrayList6, list3));
        ArrayList arrayList8 = new ArrayList();
        for (Object obj5 : listR) {
            com.waze.av.b.n nVar = (com.waze.av.b.n) obj5;
            if (com.waze.ac.e.u(nVar).length() > 0 && !nVar.e().d().g()) {
                arrayList8.add(obj5);
            }
        }
        return arrayList8;
    }
}
