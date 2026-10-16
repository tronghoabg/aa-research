package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.LongMessageTemplate;
import androidx.car.app.model.Template;
import com.waze.car_lib.p.dg;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cj extends cn {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.p.ca f21936a;

    /* renamed from: b, reason: collision with root package name */
    private final LongMessageTemplate f21937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj(CarContext carContext, com.waze.car_lib.o.x xVar, com.waze.car_lib.c.n nVar) {
        super(carContext, "SettingLongMessageScreen", xVar, nVar);
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(xVar, "settingMessage");
        h.g.b.x.f(nVar, "analyticsSender");
        h.g.b.x.f(xVar, "settingMessage");
        h.g.b.x.f(xVar, "<this>");
        com.waze.car_lib.p.ca caVar = new com.waze.car_lib.p.ca(new dg(xVar.g(), xVar.f(), null, false, xVar.c(), xVar.d(), 12), xVar.h(), xVar.i(), xVar.e());
        this.f21936a = caVar;
        ci ciVar = new ci(this, nVar, xVar, 0);
        ci ciVar2 = new ci(this, nVar, xVar, 2);
        h.g.b.x.f(carContext, "context");
        h.g.b.x.f(caVar, "state");
        h.g.b.x.f(ciVar, "firstActionClicked");
        h.g.b.x.f(ciVar2, "secondActionClicked");
        this.f21937b = dh.u(carContext, caVar.a(), ciVar, ciVar2);
    }

    public static /* synthetic */ h.ab b(cj cjVar, com.waze.car_lib.c.n nVar, com.waze.car_lib.o.x xVar) {
        com.waze.car_lib.p.ca caVar = cjVar.f21936a;
        String strB = caVar.b();
        if (strB != null) {
            nVar.c(xVar, strB);
        }
        caVar.c().invoke();
        cjVar.finish();
        return h.ab.f48028a;
    }

    static final h.ab c(cj cjVar, com.waze.car_lib.c.n nVar, com.waze.car_lib.o.x xVar) {
        cjVar.n().a(new com.waze.a.z(cjVar, nVar, xVar, 13, (int[]) null));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(cj cjVar) {
        cjVar.f21936a.d().invoke();
        cjVar.finish();
        return h.ab.f48028a;
    }

    static final h.ab e(cj cjVar) {
        cjVar.n().a(new com.waze.alerters.b.f(cjVar, 16));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21937b;
    }
}
