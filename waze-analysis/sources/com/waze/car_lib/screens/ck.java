package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.MessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dg;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ck extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.ca f21938a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageTemplate f21939b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck(CarContext carContext, com.waze.car_lib.o.x xVar, com.waze.car_lib.c.n nVar) {
        super(carContext, "SettingMessageScreen", xVar, nVar);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(xVar, "settingMessage");
        h.g.b.x.f(nVar, "analyticsSender");
        h.g.b.x.f(xVar, "settingMessage");
        h.g.b.x.f(xVar, "<this>");
        com.waze.car_lib.p.ca caVar = new com.waze.car_lib.p.ca(new dg(xVar.g(), xVar.f(), null, false, xVar.c(), xVar.d(), 12), xVar.h(), xVar.i(), xVar.e());
        this.f21938a = caVar;
        ci ciVar = new ci(this, nVar, xVar, 3);
        ci ciVar2 = new ci(this, nVar, xVar, 4);
        h.g.b.x.f(carContext, "context");
        h.g.b.x.f(caVar, "state");
        h.g.b.x.f(ciVar, "firstActionClicked");
        h.g.b.x.f(ciVar2, "secondActionClicked");
        this.f21939b = dh.v(carContext, caVar.a(), ciVar, ciVar2);
    }

    public static /* synthetic */ h.ab b(ck ckVar, com.waze.car_lib.c.n nVar, com.waze.car_lib.o.x xVar) {
        com.waze.car_lib.p.ca caVar = ckVar.f21938a;
        String strB = caVar.b();
        if (strB != null) {
            nVar.c(xVar, strB);
        }
        caVar.c().invoke();
        ckVar.finish();
        return h.ab.f48028a;
    }

    static final h.ab c(ck ckVar, com.waze.car_lib.c.n nVar, com.waze.car_lib.o.x xVar) {
        ckVar.n().a(new com.waze.a.z(ckVar, nVar, xVar, 14, (int[]) null));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(ck ckVar) {
        ckVar.f21938a.d().invoke();
        ckVar.finish();
        return h.ab.f48028a;
    }

    static final h.ab e(ck ckVar) {
        ckVar.n().a(new com.waze.alerters.b.f(ckVar, 17));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21939b;
    }
}
