package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f14480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, h.c.e eVar) {
        super(3, eVar);
        this.f14480a = jVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new i(this.f14480a, (h.c.e) obj3).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f14480a.f14481a.invoke();
        return h.ab.f48028a;
    }
}
