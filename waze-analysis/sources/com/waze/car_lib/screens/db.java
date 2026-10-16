package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.ej;
import com.waze.car_lib.p.dh;
import com.waze.car_lib.r.fg;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class db extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final MapTemplate f21995a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(CarContext carContext, ej ejVar, com.waze.car_lib.j.x xVar) {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        super(carContext, "TollPopupScreen");
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(ejVar, "coordinatorController");
        h.g.b.x.f(xVar, "tollInfoController");
        this.f21995a = dh.y();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        fg fgVar = (fg) bVarL.a(new h.g.b.m(fg.class), null, null);
        db dbVar = this;
        if (dbVar instanceof org.a.d.a.b) {
            bVarC = dbVar.l();
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        } else {
            bVarC = dbVar.getKoin().a().c();
            mVar = new h.g.b.m(com.waze.map.b.n.class);
        }
        com.waze.map.b.n nVar = (com.waze.map.b.n) bVarC.a(mVar, null, null);
        addBackPressedCallback(new com.waze.app_nav.a.a((Object) ejVar, 6));
        db dbVar2 = this;
        fgVar.a(LifecycleOwnerKt.getLifecycleScope(dbVar2)).observe(dbVar2, new g((h.g.a.l) new at(this, carContext, fgVar, nVar, xVar, ejVar, 3), 15, (short[][][]) null));
    }

    static final h.ab b(db dbVar, ej ejVar) {
        dbVar.n().a(new com.waze.app_nav.a.a((Object) ejVar, 7));
        return h.ab.f48028a;
    }

    static final h.ab c(db dbVar, ej ejVar) {
        dbVar.n().a(new com.waze.app_nav.a.a((Object) ejVar, 5));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21995a;
    }
}
