package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapTemplate;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.f.ft;
import com.waze.car_lib.p.dh;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class be extends com.waze.car_lib.screens.core.n {

    /* renamed from: a, reason: collision with root package name */
    private final ft f21874a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f21875b;

    /* renamed from: c, reason: collision with root package name */
    private final MapTemplate f21876c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ft ftVar, bd bdVar, CarContext carContext) {
        super(carContext, "PredictionCardScreen");
        h.g.b.x.f(ftVar, "predictionCardCoordinatorController");
        h.g.b.x.f(bdVar, "launchParams");
        h.g.b.x.f(carContext, "carContext");
        this.f21874a = ftVar;
        this.f21875b = h.g.b(h.h.f48130a, new bm((org.a.d.a.a) this, 1));
        this.f21876c = dh.y();
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        com.waze.car_lib.r.c.c.i iVarA = ((com.waze.car_lib.r.c.c.c) bVarL.a(new h.g.b.m(com.waze.car_lib.r.c.c.c.class), null, null)).a(bdVar);
        be beVar = this;
        iVarA.h(LifecycleOwnerKt.getLifecycleScope(beVar));
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(beVar), null, null, new bt(iVarA, this, carContext, (h.c.e) null, 1), 3);
        kotlinx.coroutines.aj.z(LifecycleOwnerKt.getLifecycleScope(beVar), null, null, new bc(iVarA, this, null), 3);
    }

    public static final /* synthetic */ com.waze.shared_infra.o.a c(be beVar) {
        return (com.waze.shared_infra.o.a) beVar.f21875b.getValue();
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21876c;
    }
}
