package com.waze.bw.c.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ak extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17790a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17791b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f17792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ak(am amVar, h.c.e eVar) {
        super(3, eVar);
        this.f17792c = amVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ak akVar = new ak(this.f17792c, (h.c.e) obj3);
        akVar.f17790a = (List) obj;
        akVar.f17791b = (com.waze.bw.b.a.o) obj2;
        return akVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f17790a;
        com.waze.bw.b.a.o oVar = (com.waze.bw.b.a.o) this.f17791b;
        return this.f17792c.G(list, oVar != null ? oVar.c() : h.a.r.j());
    }
}
