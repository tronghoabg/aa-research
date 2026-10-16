package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.model.signin.SignInTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.an f21754a;

    /* renamed from: b, reason: collision with root package name */
    private final SignInTemplate f21755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(CarContext carContext, com.waze.car_lib.f.co coVar) {
        super(carContext, "LicensePlateSettingsScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(coVar, "controller");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21754a = ((com.waze.car_lib.r.ao) bVarL.a(new h.g.b.m(com.waze.car_lib.r.ao.class), null, null)).a(coVar);
        this.f21755b = dh.M();
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(this), null, null, new z(this, (h.c.e) null, 0), 3);
    }

    public static final /* synthetic */ void c(ac acVar, com.waze.n.ac acVar2) {
        com.waze.car_lib.r.an anVar = acVar.f21754a;
        acVar.q(dh.N(acVar2, new ab(anVar, 0), new aa(anVar)));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21755b;
    }
}
