package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f30357b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.modules.c.ar f30358c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ak f30359d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f30360e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f30361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, com.waze.modules.c.ar arVar, j jVar, ak akVar, long j2, h.c.e eVar) {
        super(2, eVar);
        this.f30357b = cVar;
        this.f30358c = arVar;
        this.f30361f = jVar;
        this.f30359d = akVar;
        this.f30360e = j2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new b(this.f30357b, this.f30358c, this.f30361f, this.f30359d, this.f30360e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((b) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30356a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        c cVar = this.f30357b;
        com.waze.modules.c.ar arVar = this.f30358c;
        cVar.f30418b.a("start navigating to " + arVar.a());
        j jVar = this.f30361f;
        this.f30356a = 1;
        Object objSelectAlternativeRoute = cVar.f30417a.selectAlternativeRoute(arVar.u(), com.waze.notifications.c.k.k(com.waze.av.d.t.f(jVar)), com.waze.notifications.c.k.k(this.f30359d.a().e().d()), this.f30360e, this);
        return objSelectAlternativeRoute == aVar ? aVar : objSelectAlternativeRoute;
    }
}
