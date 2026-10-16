package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39470a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39471b;

    au(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        au auVar = new au((h.c.e) obj3);
        auVar.f39470a = (com.waze.authentication.ax) obj;
        auVar.f39471b = (com.waze.i.a) obj2;
        return auVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.authentication.ax axVar = (com.waze.authentication.ax) this.f39470a;
        com.waze.i.a aVar2 = (com.waze.i.a) this.f39471b;
        if (axVar instanceof com.waze.h.b.q) {
            return new com.waze.h.h(((com.waze.h.b.q) axVar).a());
        }
        if (h.g.b.x.n(axVar, com.waze.h.b.p.f24333a)) {
            return new com.waze.h.h(null);
        }
        if (!h.g.b.x.n(axVar, com.waze.h.b.o.f24332a)) {
            throw new h.i();
        }
        if (aVar2 instanceof com.waze.h.a.g) {
            return new com.waze.h.e(((com.waze.h.a.g) aVar2).a());
        }
        if (h.g.b.x.n(aVar2, com.waze.h.a.h.f24314a)) {
            return com.waze.h.f.f24354a;
        }
        if (h.g.b.x.n(aVar2, com.waze.h.a.e.f24311a)) {
            return com.waze.h.d.f24352a;
        }
        if (h.g.b.x.n(aVar2, com.waze.h.a.f.f24312a)) {
            return com.waze.h.c.f24335a;
        }
        throw new h.i();
    }
}
