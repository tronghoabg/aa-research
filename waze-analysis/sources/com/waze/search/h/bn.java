package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f35838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bx f35839b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bn(bx bxVar, h.c.e eVar) {
        super(2, eVar);
        this.f35839b = bxVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        bn bnVar = new bn(this.f35839b, eVar);
        bnVar.f35838a = ((Boolean) obj).booleanValue();
        return bnVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((bn) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f35838a;
        kotlinx.coroutines.b.bn bnVar = this.f35839b.s;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, ce.l((ce) objD, null, null, null, null, false, z, false, null, null, false, 4063)));
        return h.ab.f48028a;
    }
}
