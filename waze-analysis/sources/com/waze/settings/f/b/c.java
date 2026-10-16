package com.waze.settings.f.b;

import h.ab;
import h.g.a.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends h.c.b.a.g implements q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f37224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(g gVar, h.c.e eVar) {
        super(3, eVar);
        this.f37224b = gVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = new c(this.f37224b, (h.c.e) obj3);
        cVar.f37223a = (List) obj2;
        return cVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List<String> list = (List) this.f37223a;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            g gVar = this.f37224b;
            String strA = gVar.f37232a.a(str);
            a aVar2 = strA.length() == 0 ? null : new a(str, strA, gVar.i(str), gVar.j(str));
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        return arrayList;
    }
}
