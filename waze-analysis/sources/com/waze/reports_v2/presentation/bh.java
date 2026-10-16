package com.waze.reports_v2.presentation;

import com.waze.reports_v2.c.Cdo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh implements bf {

    /* renamed from: a, reason: collision with root package name */
    private final be f34860a;

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f34861b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.reports_v2.b.aq f34862c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.reports_v2.c.cr f34863d;

    /* renamed from: e, reason: collision with root package name */
    private final q f34864e;

    /* renamed from: f, reason: collision with root package name */
    private final k f34865f;

    /* renamed from: g, reason: collision with root package name */
    private final m f34866g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f34867h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.reports_v2.e f34868i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.bl.d.a f34869j;

    public bh(be beVar, Cdo cdo, com.waze.reports_v2.b.aq aqVar, com.waze.reports_v2.c.cr crVar, q qVar, k kVar, m mVar, com.waze.shared_infra.i.e eVar, com.waze.reports_v2.e eVar2, com.waze.bl.d.a aVar) {
        h.g.b.x.f(beVar, "config");
        h.g.b.x.f(cdo, "statsSender");
        h.g.b.x.f(aqVar, "reportPointsProvider");
        h.g.b.x.f(crVar, "tapReportingEducationHandlerFactory");
        h.g.b.x.f(qVar, "conversationalReportingStateHolderFactory");
        h.g.b.x.f(kVar, "conversationalReportingFteTooltipStateHolderFactory");
        h.g.b.x.f(mVar, "conversationalReportingNonFteHintStateHolderFactory");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(eVar2, "conversationalModeProvider");
        h.g.b.x.f(aVar, "reportAgentStateHolderFactory");
        this.f34860a = beVar;
        this.f34861b = cdo;
        this.f34862c = aqVar;
        this.f34863d = crVar;
        this.f34864e = qVar;
        this.f34865f = kVar;
        this.f34866g = mVar;
        this.f34867h = eVar;
        this.f34868i = eVar2;
        this.f34869j = aVar;
    }

    @Override // com.waze.reports_v2.presentation.bf
    public final bp a() {
        return new bp(this.f34860a, this.f34861b, this.f34862c, this.f34863d, this.f34864e, this.f34865f, this.f34866g, this.f34867h, this.f34868i, this.f34869j);
    }
}
