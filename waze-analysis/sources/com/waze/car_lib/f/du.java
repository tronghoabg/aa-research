package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class du implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dw f19503a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f19504b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.b.ap f19505c;

    du(dw dwVar, com.waze.shared_infra.i.e eVar, com.waze.car_lib.b.ap apVar) {
        this.f19503a = dwVar;
        this.f19504b = eVar;
        this.f19505c = apVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        dw dwVar = this.f19503a;
        com.waze.car_lib.p.aj ajVar = (com.waze.car_lib.p.aj) obj;
        if (!h.g.b.x.n(dwVar.f19510a, ajVar)) {
            this.f19504b.a("MapMessagePopupCoordinatorController showing newCoordinator, current popup: " + this.f19505c.D().d() + ", new popup: " + ajVar);
            if (ajVar != null) {
                dwVar.H(new ea(ajVar));
            }
        }
        return h.ab.f48028a;
    }
}
