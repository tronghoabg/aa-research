package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bz {

    /* renamed from: a, reason: collision with root package name */
    private final ck f21120a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.db f21121b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.b.f f21122c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.sound.bs f21123d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.config.d f21124e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.config.b f21125f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.config.b f21126g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.car_lib.b.bo f21127h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.car_lib.b.ap f21128i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.map.b.n f21129j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f21130k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.z f21131l;
    private final com.waze.network.b.al m;
    private final com.waze.navigate.eo n;
    private final com.waze.network.b.y o;
    private final com.waze.car_lib.c.i p;
    private final com.waze.o.c.c.b q;

    public bz(ck ckVar, com.waze.navigate.db dbVar, com.waze.car_lib.b.f fVar, com.waze.sound.bs bsVar, com.waze.config.d dVar, com.waze.config.b bVar, com.waze.config.b bVar2, com.waze.car_lib.b.bo boVar, com.waze.car_lib.b.ap apVar, com.waze.map.b.n nVar, com.waze.shared_infra.o.a aVar, com.waze.z zVar, com.waze.network.b.al alVar, com.waze.navigate.eo eoVar, com.waze.network.b.y yVar, com.waze.car_lib.c.i iVar, com.waze.o.c.c.b bVar3) {
        h.g.b.x.f(ckVar, "navigationViewModel");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(dVar, "configValueNavigationGuidanceMode");
        h.g.b.x.f(bVar, "configValueAddEtaToTripText");
        h.g.b.x.f(bVar2, "configValueAddTimeToDestinationToTripText");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(zVar, "appType");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        h.g.b.x.f(bVar3, "companinioConfig");
        this.f21120a = ckVar;
        this.f21121b = dbVar;
        this.f21122c = fVar;
        this.f21123d = bsVar;
        this.f21124e = dVar;
        this.f21125f = bVar;
        this.f21126g = bVar2;
        this.f21127h = boVar;
        this.f21128i = apVar;
        this.f21129j = nVar;
        this.f21130k = aVar;
        this.f21131l = zVar;
        this.m = alVar;
        this.n = eoVar;
        this.o = yVar;
        this.p = iVar;
        this.q = bVar3;
    }

    public final by a() {
        return new by(this.f21120a, this.f21121b, this.f21122c, this.f21123d, this.f21124e, this.f21125f, this.f21126g, this.f21127h, this.f21128i, this.f21129j, this.f21130k, this.f21131l, this.m, this.n, this.o, this.p, this.q);
    }
}
