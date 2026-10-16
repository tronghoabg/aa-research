package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.ep;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ct extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final ep f21980a;

    /* renamed from: b, reason: collision with root package name */
    private final LongMessageTemplate f21981b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct(com.waze.car_lib.f.cw cwVar, CarContext carContext, com.waze.uid.stats.s sVar) {
        super(carContext, "TermsOfServiceScreen", new com.waze.car_lib.l.d(new cp(4), new com.waze.alerters.b.f(sVar, 19)));
        h.g.b.x.f(cwVar, "controller");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(sVar, "uidStatsSender");
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        ep epVar = (ep) bVarL.a(new h.g.b.m(ep.class), null, null);
        this.f21980a = epVar;
        this.f21981b = dh.u(carContext, epVar.b(), new as((Object) this, (Object) cwVar, 20), new cp(5));
    }

    public static /* synthetic */ h.ab b(com.waze.car_lib.f.cw cwVar, ct ctVar) {
        cwVar.o(ctVar.f21980a.a());
        return h.ab.f48028a;
    }

    static final h.ab c(ct ctVar, com.waze.car_lib.f.cw cwVar) {
        ctVar.n().a(new com.waze.app_nav.hub.n(cwVar, ctVar, 7));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21981b;
    }
}
