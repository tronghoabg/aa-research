package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapTemplate;
import com.waze.car_lib.f.dw;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aj extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final dw f21766a;

    /* renamed from: b, reason: collision with root package name */
    private final MapTemplate f21767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(com.waze.car_lib.p.aj ajVar, CarContext carContext, dw dwVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        super(carContext, "MapMessagePopupScreen");
        h.g.b.x.f(ajVar, "state");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(dwVar, "controller");
        this.f21766a = dwVar;
        this.f21767b = dh.y();
        aj ajVar2 = this;
        if (ajVar2 instanceof org.a.d.a.b) {
            bVarC = ajVar2.l();
            int i2 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        } else {
            bVarC = ajVar2.getKoin().a().c();
            int i3 = h.g.b.ar.f48106a;
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        }
        com.waze.map.b.n nVar = (com.waze.map.b.n) bVarC.a(mVar, null, null);
        com.waze.car_lib.r.aw awVar = (com.waze.car_lib.r.aw) l().a(new h.g.b.m(com.waze.car_lib.r.aw.class), null, null);
        awVar.a().observe(this, new g(new az(this, carContext, ajVar, awVar, nVar, 1), 6, (float[]) null));
    }

    static final h.ab b(aj ajVar, com.waze.car_lib.p.aj ajVar2) {
        ajVar.n().a(new q(ajVar2, ajVar, 13));
        return h.ab.f48028a;
    }

    static final h.ab c(com.waze.car_lib.p.aj ajVar, aj ajVar2) {
        ajVar.b().invoke();
        ajVar2.g(ajVar.c());
        return h.ab.f48028a;
    }

    static final h.ab d(aj ajVar, com.waze.car_lib.p.aj ajVar2) {
        ajVar.n().a(new q(ajVar2, ajVar, 12));
        return h.ab.f48028a;
    }

    static final h.ab e(com.waze.car_lib.p.aj ajVar, aj ajVar2) {
        ajVar.d().invoke();
        ajVar2.g(ajVar.c());
        return h.ab.f48028a;
    }

    static final h.ab f(aj ajVar, com.waze.car_lib.p.aj ajVar2) {
        ajVar.g(ajVar2.c());
        return h.ab.f48028a;
    }

    private final void g(h.g.a.a aVar) {
        aVar.invoke();
        this.f21766a.b();
        finish();
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21767b;
    }
}
