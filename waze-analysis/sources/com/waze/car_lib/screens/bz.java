package com.waze.car_lib.screens;

import androidx.car.app.CarContext;
import androidx.car.app.model.Template;
import androidx.car.app.navigation.model.MapWithContentTemplate;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.r.dm;
import com.waze.car_lib.r.dn;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bz extends com.waze.car_lib.screens.core.n implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final gg f21908a;

    /* renamed from: b, reason: collision with root package name */
    private final dn f21909b;

    /* renamed from: c, reason: collision with root package name */
    private final dm f21910c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.b.n f21911d;

    /* renamed from: e, reason: collision with root package name */
    private final MapWithContentTemplate f21912e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.s.d f21913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(com.waze.reports_v2.b.r rVar, gg ggVar, CarContext carContext) {
        super(carContext, "ReportClosureAlertScreen");
        h.g.b.x.f(rVar, "closureReportData");
        h.g.b.x.f(ggVar, "controller");
        h.g.b.x.f(carContext, "carContext");
        this.f21908a = ggVar;
        org.a.d.k.b bVarL = l();
        int i2 = h.g.b.ar.f48106a;
        dn dnVar = (dn) bVarL.a(new h.g.b.m(dn.class), null, null);
        this.f21909b = dnVar;
        dm dmVarA = dnVar.a(rVar);
        this.f21910c = dmVarA;
        com.waze.map.b.n nVar = (com.waze.map.b.n) l().a(new h.g.b.m(com.waze.map.b.n.class), null, null);
        this.f21911d = nVar;
        this.f21912e = com.waze.beacons.n.f(carContext, dmVarA.a(), false, new bm((com.waze.car_lib.screens.core.n) this, 2), new bm((com.waze.car_lib.screens.core.n) this, 3), new bm((com.waze.car_lib.screens.core.n) this, 4), new com.waze.alerters.h(12), new o(18), new o(19));
        this.f21913f = nVar.c(dmVarA.b().b());
        getLifecycle().addObserver(new by(this, 0));
    }

    public static /* synthetic */ h.ab c(bz bzVar) {
        bzVar.f21908a.a();
        com.waze.shared_infra.s.d dVar = bzVar.f21913f;
        if (dVar != null) {
            dVar.a();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab d(bz bzVar) {
        bzVar.f21908a.a();
        com.waze.shared_infra.s.d dVar = bzVar.f21913f;
        if (dVar != null) {
            dVar.a();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab e(bz bzVar) {
        bzVar.f21908a.b(bzVar.f21910c.b());
        com.waze.shared_infra.s.d dVar = bzVar.f21913f;
        if (dVar != null) {
            dVar.a();
        }
        return h.ab.f48028a;
    }

    static final h.ab f(bz bzVar) {
        bzVar.n().a(new com.waze.alerters.b.f(bzVar, 14));
        return h.ab.f48028a;
    }

    static final h.ab g(bz bzVar) {
        bzVar.n().a(new com.waze.alerters.b.f(bzVar, 12));
        return h.ab.f48028a;
    }

    static final h.ab h(bz bzVar) {
        bzVar.n().a(new com.waze.alerters.b.f(bzVar, 13));
        return h.ab.f48028a;
    }

    @Override // com.waze.car_lib.screens.core.n
    public final /* synthetic */ Template a() {
        return this.f21912e;
    }
}
