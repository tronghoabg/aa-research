package com.waze.car_lib.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18963a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ap f18964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ap apVar, h.c.e eVar) {
        super(2, eVar);
        this.f18964b = apVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aj ajVar = new aj(this.f18964b, eVar);
        ajVar.f18963a = obj;
        return ajVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aj) create((r) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ap.F(this.f18964b, (r) this.f18963a);
        return h.ab.f48028a;
    }
}
