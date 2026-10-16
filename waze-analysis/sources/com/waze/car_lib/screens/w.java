package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MessageTemplate f22041a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(CarContext carContext, com.waze.n.ac acVar) {
        super(carContext, "KillSwitchScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(acVar, "state");
        this.f22041a = dh.A();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.ai aiVarA = ((com.waze.car_lib.r.aj) bVarL.a(new h.g.b.m(com.waze.car_lib.r.aj.class), null, null)).a(acVar);
        aiVarA.c();
        aiVarA.a().observe(this, new g((h.g.a.l) new com.waze.ads.c((Object) this, (Object) carContext, (Object) aiVarA, 3, (byte[]) null), 3, (short[]) null));
    }

    static final h.ab b(w wVar, com.waze.car_lib.r.ai aiVar) {
        wVar.n().a(new c(aiVar, 5, (boolean[]) null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f22041a;
    }
}
