package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class z extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.an.a.p f20152a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(com.waze.an.a.p pVar, h.c.e eVar) {
        super(3, eVar);
        this.f20152a = pVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new z(this.f20152a, (h.c.e) obj3).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f20152a.k();
        return h.ab.f48028a;
    }
}
