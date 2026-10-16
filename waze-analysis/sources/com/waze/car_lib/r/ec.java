package com.waze.car_lib.r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ec extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21496a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f21497b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eh f21498c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.map.b.ed f21499d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ec(eh ehVar, com.waze.map.b.ed edVar, h.c.e eVar) {
        super(3, eVar);
        this.f21498c = ehVar;
        this.f21499d = edVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ec ecVar = new ec(this.f21498c, this.f21499d, (h.c.e) obj3);
        ecVar.f21496a = (List) obj;
        ecVar.f21497b = (h.k) obj2;
        return ecVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f21496a;
        h.k kVar = (h.k) this.f21497b;
        if (((Number) kVar.c()).intValue() < 0 || ((Number) kVar.d()).intValue() <= ((Number) kVar.c()).intValue() || ((Number) kVar.d()).intValue() > list.size()) {
            return h.ab.f48028a;
        }
        com.waze.map.b.ed edVar = this.f21499d;
        List listSubList = list.subList(((Number) kVar.c()).intValue(), ((Number) kVar.d()).intValue());
        ArrayList arrayList = new ArrayList(h.a.i.q(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.waze.av.d.k) it.next()).h());
        }
        edVar.a(new com.waze.map.b.bg(new com.waze.map.b.ea(false, new com.waze.map.b.bs(32, 32, 32, 32), 1), new com.waze.map.b.co(arrayList, null, 0.0f, 6), null, true, 4));
        return h.ab.f48028a;
    }
}
