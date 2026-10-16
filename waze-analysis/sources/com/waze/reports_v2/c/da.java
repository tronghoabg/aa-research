package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class da extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ db f34385a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cs f34386b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f34387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    da(db dbVar, cs csVar, h.c.e eVar) {
        super(2, eVar);
        this.f34385a = dbVar;
        this.f34386b = csVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        da daVar = new da(this.f34385a, this.f34386b, eVar);
        daVar.f34387c = obj;
        return daVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((da) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) this.f34387c;
        db dbVar = this.f34385a;
        kotlinx.coroutines.br brVarZ = kotlinx.coroutines.aj.z(afVar, null, null, new cz(dbVar, this.f34386b, null), 3);
        brVarZ.bY(new com.waze.car_lib.screens.am(dbVar, 19));
        dbVar.f34397j = brVarZ;
        return h.ab.f48028a;
    }
}
