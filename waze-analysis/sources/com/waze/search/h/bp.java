package com.waze.search.h;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bp extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35843a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35844b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f35845c;

    bp(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        bp bpVar = new bp((h.c.e) obj4);
        bpVar.f35843a = (List) obj;
        bpVar.f35844b = (List) obj2;
        bpVar.f35845c = (List) obj3;
        return bpVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f35843a;
        List list2 = (List) this.f35844b;
        List list3 = (List) this.f35845c;
        ArrayList arrayList = new ArrayList();
        List list4 = list;
        ArrayList arrayList2 = new ArrayList(h.a.i.q(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.waze.search.c.f((com.waze.av.b.n) it.next()));
        }
        arrayList.addAll(arrayList2);
        List list5 = list2;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new com.waze.search.c.f((com.waze.av.b.n) it2.next()));
        }
        arrayList.addAll(arrayList3);
        List list6 = list3;
        ArrayList arrayList4 = new ArrayList(h.a.i.q(list6, 10));
        Iterator it3 = list6.iterator();
        while (it3.hasNext()) {
            arrayList4.add(new com.waze.search.c.f((com.waze.av.b.n) it3.next()));
        }
        arrayList.addAll(arrayList4);
        return arrayList;
    }
}
