package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f22042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(CarContext carContext, com.waze.car_lib.f.cw cwVar) {
        super(carContext, "LegalNoticesScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(cwVar, "coordinatorController");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f22042a = dh.v(carContext, ((com.waze.car_lib.r.ak) bVarL.a(new h.g.b.m(com.waze.car_lib.r.ak.class), null, null)).a(), new q((Object) this, (Object) cwVar, 4), new q((Object) this, (Object) cwVar, 5));
    }

    static final h.ab b(x xVar, com.waze.car_lib.f.cw cwVar) {
        xVar.n().a(new c(cwVar, 6, (float[]) null));
        return h.ab.f48028a;
    }

    static final h.ab c(x xVar, com.waze.car_lib.f.cw cwVar) {
        xVar.n().a(new c((Object) cwVar, 7, (byte[][]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22042a;
    }
}
