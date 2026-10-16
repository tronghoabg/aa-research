package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.SignInTemplate;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final SignInTemplate f21735a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CarContext carContext, com.waze.car_lib.o.v vVar, com.waze.car_lib.c.n nVar, String str) {
        super(carContext, "AboutSettingScreen", vVar, nVar);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(vVar, "setting");
        h.g.b.x.f(nVar, "analyticsSender");
        h.g.b.x.f(str, "clientVersion");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21735a = com.waze.l.m.l(((com.waze.car_lib.r.a) bVarL.a(new h.g.b.m(com.waze.car_lib.r.a.class), null, null)).c(str).b());
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21735a;
    }
}
