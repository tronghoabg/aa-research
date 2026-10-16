package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f21756a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(CarContext carContext, com.waze.car_lib.f.cw cwVar) {
        super(carContext, "LocationAccessFailedScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(cwVar, "coordinatorController");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21756a = dh.v(carContext, ((com.waze.car_lib.r.cm) bVarL.a(new h.g.b.m(com.waze.car_lib.r.cm.class), null, null)).a(), new q((Object) this, (Object) cwVar, 6), new o(5));
    }

    static final h.ab b(ad adVar, com.waze.car_lib.f.cw cwVar) {
        adVar.n().a(new c((Object) cwVar, 8, (char[][]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21756a;
    }
}
