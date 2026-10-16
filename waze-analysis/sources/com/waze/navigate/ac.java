package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ac extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30953a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.n f30954b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f30955c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f30956d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ af f30957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(com.waze.av.b.n nVar, long j2, com.waze.av.d.k kVar, af afVar, h.c.e eVar) {
        super(2, eVar);
        this.f30954b = nVar;
        this.f30955c = j2;
        this.f30956d = kVar;
        this.f30957e = afVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ac(this.f30954b, this.f30955c, this.f30956d, this.f30957e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ac) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30953a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        com.waze.av.a.o oVarC = this.f30954b.e().c();
        String strC = oVarC.c();
        String strB = oVarC.b();
        this.f30953a = 1;
        Object objI = kotlinx.coroutines.aj.I(this.f30955c, new ab(this.f30956d, strC, this.f30957e, strB, null), this);
        return objI == aVar ? aVar : objI;
    }
}
