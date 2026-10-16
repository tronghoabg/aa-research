package com.waze.car_lib.r;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.n f21083a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21084b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f21085c;

    public bs(com.waze.map.b.n nVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(nVar, "mapController");
        h.g.b.x.f(aVar, "stringProvider");
        this.f21083a = nVar;
        this.f21084b = aVar;
        this.f21085c = kotlinx.coroutines.b.ck.b(false);
    }

    public final LiveData a(kotlinx.coroutines.af afVar, com.waze.car_lib.screens.aq aqVar) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(aqVar, "navigationPopup");
        com.waze.shared_infra.o.a aVar = this.f21084b;
        String strC = aVar.c(aqVar.b(), new Object[0]);
        String strC2 = aVar.c(aqVar.a(), new Object[0]);
        com.waze.car_lib.p.ah ahVar = com.waze.car_lib.p.ah.f20543a;
        com.waze.car_lib.p.af afVar2 = new com.waze.car_lib.p.af(aVar.c(aqVar.c().a(), new Object[0]), aqVar.c().b(), aqVar.c().c());
        com.waze.car_lib.screens.ar arVarD = aqVar.d();
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(new br(new com.waze.car_lib.p.ak(strC, strC2, ahVar, afVar2, arVarD != null ? new com.waze.car_lib.p.af(aVar.c(arVarD.a(), new Object[0]), arVarD.b(), arVarD.c()) : null, null, 32), false));
        kotlinx.coroutines.aj.z(afVar, null, null, new as(this, bnVarB, (h.c.e) null, 2), 3);
        return FlowLiveDataConversions.asLiveData$default(bnVarB, (h.c.j) null, 0L, 3, (Object) null);
    }

    public final void c(boolean z) {
        this.f21085c.e(Boolean.valueOf(z));
    }

    public final void d() {
        com.waze.map.b.bf.c(this.f21083a);
    }

    public final void e() {
        com.waze.map.b.bf.d(this.f21083a);
    }
}
