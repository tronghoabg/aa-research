package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.f.dn;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f21763a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(CarContext carContext, dn dnVar, boolean z) {
        super(carContext, "LoginErrorScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(dnVar, "coordinatorController");
        this.f21763a = dh.A();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.at atVar = (com.waze.car_lib.r.at) bVarL.a(new h.g.b.m(com.waze.car_lib.r.at.class), null, null);
        atVar.a(z).observe(this, new g((h.g.a.l) new com.waze.main_screen.p.a.b.a.z(this, carContext, atVar, dnVar, z, 1), 4, (int[]) null));
    }

    static final h.ab b(ag agVar, com.waze.car_lib.r.at atVar) {
        agVar.n().a(new com.waze.b.g(atVar, 20));
        return h.ab.f48028a;
    }

    static final h.ab c(ag agVar, com.waze.car_lib.r.at atVar, dn dnVar, boolean z) {
        agVar.n().a(new com.waze.car_lib.o.z(atVar, dnVar, z, 1));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21763a;
    }
}
