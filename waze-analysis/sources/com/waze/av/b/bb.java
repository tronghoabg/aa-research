package com.waze.av.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bb extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    int f15926a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15927b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f15928c;

    public bb(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bb bbVar = new bb((h.c.e) obj3);
        bbVar.f15928c = (kotlinx.coroutines.b.l) obj;
        bbVar.f15927b = (Object[]) obj2;
        return bbVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f15926a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f15928c;
            bb bbVar = this;
            List listH = com.waze.ac.e.h(h.a.i.r(h.a.c.X((List[]) ((Object[]) this.f15927b))));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listH) {
                aa aaVar = (aa) obj2;
                if (aaVar.a().e() != null && !aaVar.a().d().g()) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : arrayList) {
                Integer numE = ((aa) obj3).a().e();
                h.g.b.x.c(numE);
                Integer num = new Integer(numE.intValue());
                Object obj4 = linkedHashMap.get(num);
                if (obj4 == null) {
                    obj4 = (List) new ArrayList();
                    linkedHashMap.put(num, obj4);
                }
                ((List) obj4).add(obj3);
            }
            Set setEntrySet = linkedHashMap.entrySet();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                ArrayList arrayList3 = new ArrayList(h.a.i.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((aa) it2.next()).a());
                }
                com.waze.av.a.p pVar = (com.waze.av.a.p) h.a.i.P(arrayList3);
                ArrayList arrayList4 = new ArrayList(h.a.i.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((aa) it3.next()).c());
                }
                List listAa = h.a.i.aa(h.a.i.r(arrayList4));
                ArrayList arrayList5 = new ArrayList(h.a.i.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((aa) it4.next()).d());
                }
                List listAa2 = h.a.i.aa(h.a.i.r(arrayList5));
                ArrayList arrayList6 = new ArrayList(h.a.i.q(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList6.add(((aa) it5.next()).b());
                }
                arrayList2.add(new aa(pVar, listAa, listAa2, h.a.i.aa(h.a.i.r(arrayList6))));
            }
            this.f15926a = 1;
            if (lVar.emit(arrayList2, bbVar) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
