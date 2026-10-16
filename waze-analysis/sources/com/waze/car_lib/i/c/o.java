package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20115a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f20116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(t tVar, h.c.e eVar) {
        super(2, eVar);
        this.f20116b = tVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        o oVar = new o(this.f20116b, eVar);
        oVar.f20115a = obj;
        return oVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((o) create((l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        l lVar = (l) this.f20115a;
        t tVar = this.f20116b;
        t.o(tVar, lVar, tVar.o, tVar.p);
        return h.ab.f48028a;
    }
}
