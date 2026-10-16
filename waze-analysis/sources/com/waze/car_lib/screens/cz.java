package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.fa;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cz extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final LongMessageTemplate f21991a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(CarContext carContext) {
        super(carContext, "TollInfoScreen");
        h.g.b.x.f(carContext, "carContext");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        this.f21991a = dh.u(carContext, ((fa) bVarL.a(new h.g.b.m(fa.class), null, null)).a(), new bm((com.waze.car_lib.screens.core.n) this, 9), new cp(6));
    }

    static final h.ab b(cz czVar) {
        czVar.n().a(new com.waze.alerters.b.f(czVar, 20));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21991a;
    }
}
