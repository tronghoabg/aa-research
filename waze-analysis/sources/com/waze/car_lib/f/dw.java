package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class dw extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.aj f19510a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw(kotlinx.coroutines.af afVar, com.waze.car_lib.b.ap apVar, com.waze.shared_infra.i.e eVar) {
        super(dy.f19512a, afVar);
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(eVar, "logger");
        this.f19510a = (com.waze.car_lib.p.aj) apVar.D().d();
        kotlinx.coroutines.aj.z(afVar, null, null, new dv(apVar, this, eVar, null), 3);
    }

    public final void b() {
        H(dx.f19511a);
    }

    public final void c(com.waze.car_lib.p.aj ajVar) {
        h.g.b.x.f(ajVar, "uiState");
        H(new dz(ajVar));
    }
}
