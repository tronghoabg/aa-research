package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class el extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28262a;

    el(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        el elVar = new el(eVar);
        elVar.f28262a = obj;
        return elVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((el) create((com.waze.map.cq) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return Boolean.valueOf(h.g.b.x.n(((com.waze.map.cq) this.f28262a).f(), com.waze.map.ch.f28677a));
    }
}
