package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39545a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39546b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ float f39547c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bo f39548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bn(bo boVar, h.c.e eVar) {
        super(4, eVar);
        this.f39548d = boVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        float fFloatValue = ((Number) obj3).floatValue();
        bn bnVar = new bn(this.f39548d, (h.c.e) obj4);
        bnVar.f39545a = (com.waze.navigate.ec) obj;
        bnVar.f39546b = (dw) obj2;
        bnVar.f39547c = fFloatValue;
        return bnVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.navigate.ec ecVar = (com.waze.navigate.ec) this.f39545a;
        dw dwVar = (dw) this.f39546b;
        float f2 = this.f39547c;
        bo boVar = this.f39548d;
        if (f2 > boVar.f39553e.b()) {
            boVar.f39552d.g("Downloads failure percentage is " + f2 + " - higher than the threshold - switching to offline mode");
            return bv.f39577a;
        }
        if (ecVar == com.waze.navigate.ec.f31301b) {
            boVar.f39552d.g("navigationOfflineState is Offline - switching to offline mode");
            return bv.f39577a;
        }
        if ((dwVar instanceof du) && ((du) dwVar).c().isEmpty()) {
            boVar.f39552d.g("routeInstructions returned empty - switching to offline mode");
            return bv.f39577a;
        }
        boVar.f39552d.a("Guidance connectivity checks passed - using ONLINE mode");
        return bv.f39578b;
    }
}
