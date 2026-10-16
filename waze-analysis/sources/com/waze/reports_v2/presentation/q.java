package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final bb f35059a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.m.a f35060b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.c.bj f35061c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.c.ao f35062d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f35063e;

    public q(bb bbVar, com.waze.shared_infra.m.a aVar, com.waze.reports_v2.c.bj bjVar, com.waze.reports_v2.c.ao aoVar, com.waze.reports_v2.c.br brVar) {
        h.g.b.x.f(bbVar, "categoriesTransformer");
        h.g.b.x.f(aVar, "mediaVolumeRepository");
        h.g.b.x.f(bjVar, "controller");
        h.g.b.x.f(aoVar, "conversationalReportingConfig");
        h.g.b.x.f(brVar, "conversationalReportingReportMenuOnboardingController");
        this.f35059a = bbVar;
        this.f35060b = aVar;
        this.f35061c = bjVar;
        this.f35062d = aoVar;
        this.f35063e = brVar;
    }

    public final ab a(p pVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(pVar, "config");
        h.g.b.x.f(eVar, "logger");
        return new ah(this.f35059a, eVar, pVar, this.f35062d, this.f35060b, this.f35061c, this.f35063e);
    }
}
