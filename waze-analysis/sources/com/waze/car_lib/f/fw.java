package com.waze.car_lib.f;

import androidx.car.app.CarContext;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fw extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.m.c f19596a;

    /* renamed from: b, reason: collision with root package name */
    private final fv f19597b;

    /* renamed from: c, reason: collision with root package name */
    private kotlinx.coroutines.br f19598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(com.waze.car_lib.m.c cVar, fv fvVar, kotlinx.coroutines.af afVar) {
        super(fy.f19600a, afVar);
        h.g.b.x.f(cVar, "requestRecordAudioPermissionHelper");
        h.g.b.x.f(fvVar, "config");
        h.g.b.x.f(afVar, "scope");
        this.f19596a = cVar;
        this.f19597b = fvVar;
    }

    public final void c(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        boolean zC = com.waze.car_lib.m.c.c(carContext);
        fv fvVar = this.f19597b;
        if (zC) {
            fvVar.a(false);
            d(true);
        } else if (fvVar.b()) {
            H(fz.f19601a);
        } else {
            H(ga.f19603a);
        }
    }

    public final void d(boolean z) {
        H(new fx(z));
    }

    public final void e(CarContext carContext) {
        h.g.b.x.f(carContext, "carContext");
        kotlinx.coroutines.br brVar = this.f19598c;
        if (brVar != null) {
            brVar.s(null);
        }
        this.f19598c = kotlinx.coroutines.aj.z(G(), null, null, new d(this, carContext, (h.c.e) null, 19), 3);
    }
}
