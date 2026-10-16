package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ae extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.cw f21757a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageTemplate f21758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(CarContext carContext, com.waze.car_lib.f.cw cwVar) {
        super(carContext, "LocationPermissionDeniedScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(cwVar, "coordinatorController");
        this.f21757a = cwVar;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21758b = dh.v(carContext, ((com.waze.car_lib.r.cm) bVarL.a(new h.g.b.m(com.waze.car_lib.r.cm.class), null, null)).a(), new n((com.waze.car_lib.screens.core.n) this, 3), new o(6));
        getLifecycle().addObserver(new bn(this, carContext, 1));
    }

    public static /* synthetic */ h.ab c(ae aeVar) {
        aeVar.f21757a.j();
        return h.ab.f48028a;
    }

    static final h.ab d(ae aeVar) {
        aeVar.n().a(new com.waze.b.g(aeVar, 19));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21758b;
    }

    public final com.waze.car_lib.f.cw b() {
        return this.f21757a;
    }
}
