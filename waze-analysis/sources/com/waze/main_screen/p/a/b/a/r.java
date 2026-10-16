package com.waze.main_screen.p.a.b.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f26817a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(t tVar, h.c.e eVar) {
        super(3, eVar);
        this.f26817a = tVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new r(this.f26817a, (h.c.e) obj3).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        t tVar = this.f26817a;
        tVar.f26829k = tVar.e().i();
        return h.ab.f48028a;
    }
}
