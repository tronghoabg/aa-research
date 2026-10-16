package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.GridTemplate;
import androidx.car.app.model.Template;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.gw;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final GridTemplate f22014a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CarContext carContext, gw gwVar) {
        super(carContext, "CategorySearchScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(gwVar, "coordinatorController");
        this.f22014a = dh.w();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.e eVarA = ((com.waze.car_lib.r.f) bVarL.a(new h.g.b.m(com.waze.car_lib.r.f.class), null, null)).a(gwVar);
        h hVar = this;
        eVarA.b(LifecycleOwnerKt.getLifecycleScope(hVar)).observe(hVar, new g(new com.waze.ads.c((Object) this, (Object) carContext, (Object) eVarA, 2, (byte[]) null), 0));
    }

    static final h.ab b(h hVar, com.waze.car_lib.r.e eVar, com.waze.car_lib.p.t tVar) {
        h.g.b.x.f(tVar, "it");
        hVar.n().a(new com.waze.a.aa(eVar, tVar, 13));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22014a;
    }
}
