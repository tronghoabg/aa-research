package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ag implements com.waze.shared_infra.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final al f31931a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.an.d.b f31932b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f31933c;

    /* renamed from: d, reason: collision with root package name */
    private final y f31934d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31935e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.parking.s f31936f;

    public ag(al alVar, com.waze.an.d.b bVar, com.waze.shared_infra.o.a aVar, y yVar, com.waze.parking.s sVar) {
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(bVar, "notificationInsightsService");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(sVar, "configuration");
        this.f31931a = alVar;
        this.f31932b = bVar;
        this.f31933c = aVar;
        this.f31934d = yVar;
        this.f31936f = sVar;
        this.f31935e = "NetworkStatusAlerterDaemon";
    }

    public static final /* synthetic */ Object f(ag agVar, h.c.e eVar) {
        Object objCollect = new aq(agVar.f31931a.a(), 1).collect(new af(new h.g.b.am(), agVar), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final Object b(h.c.e eVar) {
        Object objO;
        return (this.f31936f.d() && (objO = kotlinx.coroutines.aj.O(new ad(this, null), eVar)) == h.c.a.a.f48038a) ? objO : h.ab.f48028a;
    }

    @Override // com.waze.shared_infra.a.c
    public final String c() {
        return this.f31935e;
    }
}
