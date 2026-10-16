package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class er implements cj {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.canvas.a.d f28845a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.canvas.a.a f28846b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.map.canvas.a.f f28847c;

    /* renamed from: d, reason: collision with root package name */
    private final ar f28848d;

    /* renamed from: e, reason: collision with root package name */
    private final br f28849e;

    /* renamed from: f, reason: collision with root package name */
    private final cl f28850f;

    /* renamed from: g, reason: collision with root package name */
    private final de f28851g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f28852h;

    public er(com.waze.map.canvas.a.d dVar, com.waze.map.canvas.a.a aVar, com.waze.map.canvas.a.f fVar, ar arVar, br brVar, cl clVar, de deVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(dVar, "mapDelegatorFactory");
        h.g.b.x.f(aVar, "boundsHelper");
        h.g.b.x.f(fVar, "protoHelper");
        h.g.b.x.f(arVar, "markerResolver");
        h.g.b.x.f(brVar, "positionTrackerFactory");
        h.g.b.x.f(clVar, "coroutineDispatcherProvider");
        h.g.b.x.f(deVar, "schemaProvider");
        h.g.b.x.f(eVar, "logger");
        this.f28845a = dVar;
        this.f28846b = aVar;
        this.f28847c = fVar;
        this.f28848d = arVar;
        this.f28849e = brVar;
        this.f28850f = clVar;
        this.f28851g = deVar;
        this.f28852h = eVar;
    }

    @Override // com.waze.map.cj
    public final /* bridge */ /* synthetic */ gb a(cv cvVar, kotlinx.coroutines.af afVar, kotlinx.coroutines.b.ch chVar, kotlinx.coroutines.b.k kVar, h.g.a.l lVar, h.g.a.a aVar, dq dqVar) {
        h.g.b.x.f(cvVar, "mapType");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(chVar, "mapState");
        h.g.b.x.f(kVar, "showLoader");
        h.g.b.x.f(lVar, "getCanvasViewBounds");
        h.g.b.x.f(aVar, "getContext");
        h.g.b.x.f(dqVar, "touchNotifier");
        de deVar = this.f28851g;
        cl clVar = this.f28850f;
        return new gb(this.f28845a, this.f28846b, this.f28847c, this.f28848d, this.f28849e, this.f28852h, afVar, clVar.b(cvVar), clVar.a(cvVar), chVar, kVar, deVar, lVar, aVar, dqVar);
    }
}
