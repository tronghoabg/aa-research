package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.dp;
import com.waze.car_lib.r.dq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final dp f21920a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageTemplate f21921b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd(CarContext carContext, com.waze.car_lib.f.cw cwVar) {
        super(carContext, "RequestPermissionScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(cwVar, "coordinatorController");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        dp dpVarA = ((dq) bVarL.a(new h.g.b.m(dq.class), null, null)).a(cwVar);
        this.f21920a = dpVarA;
        this.f21921b = dh.v(carContext, dpVarA.a(), new as((Object) this, (Object) carContext, 15), new bm((com.waze.car_lib.screens.core.n) this, 5));
    }

    public static /* synthetic */ h.ab b(cd cdVar, CarContext carContext) {
        cdVar.f21920a.c(carContext);
        return h.ab.f48028a;
    }

    static final h.ab c(cd cdVar, CarContext carContext) {
        cdVar.n().a(new com.waze.a.aa(cdVar, carContext, 20));
        return h.ab.f48028a;
    }

    static final h.ab d(cd cdVar) {
        cdVar.n().a(new cc(cdVar.f21920a, 0));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21921b;
    }
}
