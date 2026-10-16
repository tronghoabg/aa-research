package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bf extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.r.cn f21877a;

    /* renamed from: b, reason: collision with root package name */
    private final LongMessageTemplate f21878b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.waze.car_lib.f.cw cwVar, CarContext carContext, com.waze.uid.stats.s sVar) {
        super(carContext, "PrivacyPolicyScreen", new com.waze.car_lib.l.d(new o(14), new com.waze.alerters.b.f(sVar, 10)));
        h.g.b.x.f(cwVar, "controller");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(sVar, "uidStatsSender");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.cn cnVar = (com.waze.car_lib.r.cn) bVarL.a(new h.g.b.m(com.waze.car_lib.r.cn.class), null, null);
        this.f21877a = cnVar;
        this.f21878b = dh.u(carContext, cnVar.b(), new as((Object) this, (Object) cwVar, 9), new o(15));
    }

    public static /* synthetic */ h.ab b(com.waze.car_lib.f.cw cwVar, bf bfVar) {
        cwVar.m(bfVar.f21877a.a());
        return h.ab.f48028a;
    }

    static final h.ab c(bf bfVar, com.waze.car_lib.f.cw cwVar) {
        bfVar.n().a(new com.waze.a.aa(cwVar, bfVar, 18, null));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21878b;
    }
}
