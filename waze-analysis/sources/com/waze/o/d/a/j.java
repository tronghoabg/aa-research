package com.waze.o.d.a;

import androidx.car.app.CarContext;
import androidx.car.app.constraints.ConstraintManager;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.o.c.c.c f32856a;

    /* renamed from: b, reason: collision with root package name */
    private final af f32857b;

    /* renamed from: c, reason: collision with root package name */
    private com.waze.car_lib.r.f f32858c;

    public j(com.waze.o.c.c.c cVar, af afVar) {
        x.f(cVar, "companinioControllerFactory");
        x.f(afVar, "scope");
        this.f32856a = cVar;
        this.f32857b = afVar;
    }

    public final com.waze.car_lib.r.f a(CarContext carContext) {
        x.f(carContext, "carContext");
        com.waze.car_lib.r.f fVar = this.f32858c;
        if (fVar != null) {
            return fVar;
        }
        com.waze.o.b.b.k kVarB = this.f32856a.b();
        if (kVarB == null) {
            return null;
        }
        com.waze.car_lib.r.f fVar2 = new com.waze.car_lib.r.f(this.f32857b, ((ConstraintManager) carContext.getCarService(ConstraintManager.class)).isAppDrivenRefreshEnabled(), kVarB);
        this.f32858c = fVar2;
        return fVar2;
    }
}
