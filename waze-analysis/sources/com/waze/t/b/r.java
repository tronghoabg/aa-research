package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class r extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40805a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40806b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ag agVar, h.c.e eVar) {
        super(3, eVar);
        this.f40806b = agVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.f40806b, (h.c.e) obj3);
        rVar.f40805a = (Throwable) obj2;
        return rVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ag.t(this.f40806b, (Throwable) this.f40805a);
        return h.ab.f48028a;
    }
}
