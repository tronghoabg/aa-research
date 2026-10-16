package com.waze.install;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class z extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24802a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f24803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ae aeVar, h.c.e eVar) {
        super(2, eVar);
        this.f24803b = aeVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        z zVar = new z(this.f24803b, eVar);
        zVar.f24802a = obj;
        return zVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((z) create((com.waze.shared_infra.h.b) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ae.n(this.f24803b, (com.waze.shared_infra.h.b) this.f24802a);
        return h.ab.f48028a;
    }
}
