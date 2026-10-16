package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.ListTemplate;
import androidx.car.app.model.Template;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bl extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final ListTemplate f21880a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(CarContext carContext, hm hmVar, com.waze.car_lib.o.v vVar, com.waze.car_lib.c.n nVar) {
        super(carContext, "RecentDestinationsSettingsScreen", vVar, nVar);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(hmVar, "coordinatorController");
        h.g.b.x.f(vVar, "setting");
        h.g.b.x.f(nVar, "analyticsSender");
        this.f21880a = dh.x();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        bl blVar = this;
        ((com.waze.car_lib.r.ct) bVarL.a(new h.g.b.m(com.waze.car_lib.r.ct.class), null, null)).a(LifecycleOwnerKt.getLifecycleScope(blVar), hmVar, n()).observe(blVar, new g((h.g.a.l) new com.waze.c.e.a.a(this, 4), 13, (byte[][][]) null));
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21880a;
    }
}
