package com.waze.car_lib.j;

import androidx.car.app.CarContext;
import androidx.car.app.navigation.NavigationManager;
import androidx.lifecycle.Lifecycle;
import com.waze.NativeManager;
import com.waze.car_lib.r.ck;
import com.waze.navigate.db;
import h.g.b.aq;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ck f20256a;

    /* renamed from: b, reason: collision with root package name */
    private final db f20257b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.i.a.ac f20258c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.location.g f20259d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f20260e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.e.a f20261f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.q.g f20262g;

    public r(ck ckVar, db dbVar, com.waze.car_lib.i.a.ac acVar, com.waze.location.g gVar, com.waze.shared_infra.i.e eVar, com.waze.car_lib.e.a aVar, com.waze.car_lib.q.g gVar2) {
        h.g.b.x.f(ckVar, "navigationViewModel");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(acVar, "mapLoaderController");
        h.g.b.x.f(gVar, "autoDriveController");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(aVar, "clusterConfig");
        h.g.b.x.f(gVar2, "carHardwareManagerUtils");
        this.f20256a = ckVar;
        this.f20257b = dbVar;
        this.f20258c = acVar;
        this.f20259d = gVar;
        this.f20260e = eVar;
        this.f20261f = aVar;
        this.f20262g = gVar2;
    }

    public final void h(final kotlinx.coroutines.af afVar, Lifecycle lifecycle, final CarContext carContext) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(carContext, "carContext");
        final NavigationManager navigationManager = (NavigationManager) carContext.getCarService(NavigationManager.class);
        lifecycle.addObserver(new i(navigationManager));
        navigationManager.setNavigationManagerCallback(new k(this, afVar));
        final bn bnVarB = kotlinx.coroutines.b.ck.b(null);
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.car_lib.j.h
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = this;
                kotlinx.coroutines.af afVar2 = afVar;
                kotlinx.coroutines.aj.z(afVar2, null, null, new m(rVar, afVar2, carContext, bnVarB, navigationManager, null), 3);
            }
        });
        kotlinx.coroutines.aj.z(afVar, null, null, new o(this, bnVarB, navigationManager, null), 3);
        aq aqVar = new aq();
        kotlinx.coroutines.aj.z(afVar, null, null, new q(this, aqVar, null), 3).bY(new com.waze.c.e.a.a(aqVar, 1));
    }
}
