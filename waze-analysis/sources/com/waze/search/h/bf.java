package com.waze.search.h;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bf extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35821a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35822b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f35823c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bx f35824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(bx bxVar, h.c.e eVar) {
        super(4, eVar);
        this.f35824d = bxVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        bf bfVar = new bf(this.f35824d, (h.c.e) obj4);
        bfVar.f35821a = (com.waze.search.c.e) obj;
        bfVar.f35822b = (List) obj2;
        bfVar.f35823c = (an) obj3;
        return bfVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.search.c.e eVar = (com.waze.search.c.e) this.f35821a;
        List list = (List) this.f35822b;
        return this.f35824d.p.a(h.a.i.ag(list, eVar), (an) this.f35823c);
    }
}
