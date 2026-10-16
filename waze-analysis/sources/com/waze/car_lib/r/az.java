package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class az extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20991a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f20992b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bc f20993c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(bc bcVar, h.c.e eVar) {
        super(3, eVar);
        this.f20993c = bcVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        az azVar = new az(this.f20993c, (h.c.e) obj3);
        azVar.f20991a = (com.waze.bw.a.c.r) obj;
        azVar.f20992b = zBooleanValue;
        return azVar.invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.bw.a.c.r rVar = (com.waze.bw.a.c.r) this.f20991a;
        boolean z = this.f20992b;
        bc bcVar = this.f20993c;
        com.waze.car_lib.p.am amVarD = (com.waze.car_lib.p.am) bcVar.f21026j.getValue();
        if (amVarD == null) {
            amVarD = bcVar.d();
        }
        return com.waze.car_lib.p.am.e(amVarD, false, false, false, new com.waze.car_lib.p.al(rVar.g(), rVar.i(), rVar.d(), z, bcVar.f21023g.d()), 7);
    }
}
