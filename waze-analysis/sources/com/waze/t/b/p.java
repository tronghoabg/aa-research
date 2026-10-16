package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class p extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ag f40799a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.n f40800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(ag agVar, com.waze.z.a.b.n nVar, h.c.e eVar) {
        super(2, eVar);
        this.f40799a = agVar;
        this.f40800b = nVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new p(this.f40799a, this.f40800b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((p) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f40799a.f40679l.r(this.f40800b);
        return h.ab.f48028a;
    }
}
