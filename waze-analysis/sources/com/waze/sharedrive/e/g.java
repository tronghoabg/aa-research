package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38525a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f38526b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, h.c.e eVar) {
        super(3, eVar);
        this.f38526b = hVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f38526b, (h.c.e) obj3);
        gVar.f38525a = (com.waze.sharedrive.d.r) obj;
        return gVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.sharedrive.d.r rVar = (com.waze.sharedrive.d.r) this.f38525a;
        return this.f38526b.h(rVar instanceof com.waze.sharedrive.d.g ? (com.waze.sharedrive.d.g) rVar : null);
    }
}
