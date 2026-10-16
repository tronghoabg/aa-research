package com.waze.app_nav.hub;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15403a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f15404b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ af f15405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(af afVar, h.c.e eVar) {
        super(3, eVar);
        this.f15405c = afVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        v vVar = new v(this.f15405c, (h.c.e) obj3);
        vVar.f15403a = (com.waze.app_nav.hub.b.k) obj;
        vVar.f15404b = (r) obj2;
        return vVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.app_nav.hub.b.k kVar = (com.waze.app_nav.hub.b.k) this.f15403a;
        r rVar = (r) this.f15404b;
        this.f15405c.al().c().a("popupConfig changed model:" + kVar + " config:" + rVar);
        return new h.k(kVar, rVar);
    }
}
