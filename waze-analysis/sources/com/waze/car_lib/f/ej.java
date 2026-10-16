package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class ej extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.b.br f19544a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.db f19545b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.car_lib.c.d f19546c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.j.x f19547d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.search.bn f19548e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.navigate.b f19549f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.car_lib.d.b f19550g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.config.b f19551h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.config.b f19552i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.c.i f19553j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.main_screen.af.a.i f19554k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.b.ap f19555l;
    private final com.waze.c.e.ce m;
    private final com.waze.navigate.a.f n;
    private final com.waze.map.b.n o;
    private final com.waze.shared_infra.i.e p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej(com.waze.car_lib.b.br brVar, com.waze.navigate.db dbVar, com.waze.car_lib.c.d dVar, com.waze.car_lib.j.x xVar, com.waze.search.bn bnVar, kotlinx.coroutines.af afVar, com.waze.navigate.b bVar, com.waze.car_lib.d.b bVar2, com.waze.config.b bVar3, com.waze.config.b bVar4, com.waze.car_lib.c.i iVar, com.waze.main_screen.af.a.i iVar2, com.waze.car_lib.b.ap apVar, com.waze.c.e.ce ceVar, com.waze.navigate.a.f fVar, com.waze.map.b.n nVar, com.waze.ct ctVar) {
        super(ep.f19561a, afVar);
        h.g.b.x.f(brVar, "reportAlertController");
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(dVar, "analytics");
        h.g.b.x.f(xVar, "tollInfoController");
        h.g.b.x.f(bnVar, "searchQueryBroadcaster");
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(bVar, "beaconInfoStateInterface");
        h.g.b.x.f(bVar2, "bluetoothAccessHelper");
        h.g.b.x.f(bVar3, "userOptedOutBeaconsConfig");
        h.g.b.x.f(bVar4, "wazeAsksInCarEnabled");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        h.g.b.x.f(iVar2, "wazeAsksController");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(ceVar, "openAlternativeRoutesService");
        h.g.b.x.f(fVar, "inCarDeeplinkActionsController");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(ctVar, "locationPreviewIntentBroadcaster");
        this.f19544a = brVar;
        this.f19545b = dbVar;
        this.f19546c = dVar;
        this.f19547d = xVar;
        this.f19548e = bnVar;
        this.f19549f = bVar;
        this.f19550g = bVar2;
        this.f19551h = bVar3;
        this.f19552i = bVar4;
        this.f19553j = iVar;
        this.f19554k = iVar2;
        this.f19555l = apVar;
        this.m = ceVar;
        this.n = fVar;
        this.o = nVar;
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("NavigationCoordinatorController");
        h.g.b.x.e(eVarD, "create(...)");
        this.p = eVarD;
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 14), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 15, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 16, (char[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new d(ctVar, this, (h.c.e) null, 18), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 17, (short[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 18, (int[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 19, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 20, (float[]) null), 3);
        kotlinx.coroutines.aj.z(G(), null, null, new ei(this, null), 3);
    }

    public static final /* synthetic */ void o(ej ejVar) {
        if (ejVar.f19551h.b().booleanValue()) {
            ejVar.p.a("User opted out of using Bluetooth for Beacons");
        } else if (ejVar.f19550g.a()) {
            ejVar.r();
        } else {
            ejVar.p.a("missing bluetooth permissions");
            ejVar.H(new ew(new b((Object) ejVar, 2, (char[]) null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(String str, boolean z) {
        H(new eu(str, z));
    }

    public abstract void a();

    public abstract void b();

    public final com.waze.car_lib.j.x f() {
        return this.f19547d;
    }

    public final void q() {
        H(fd.f19578a);
    }

    protected final void r() {
        if (this.f19550g.b()) {
            return;
        }
        this.p.a("bluetooth is disabled");
        H(new ez(new b((Object) this, 3, (short[]) null)));
    }

    public final void s() {
        this.f19553j.a(com.waze.car_lib.c.g.f19231d, false);
        x(null, false);
    }

    public final void t() {
        this.f19547d.b();
        H(fe.f19579a);
    }

    public final void u() {
        this.f19553j.a(com.waze.car_lib.c.g.f19236i, false);
        this.f19546c.b();
        H(fc.f19577a);
    }

    public final void v() {
        this.f19553j.a(com.waze.car_lib.c.g.f19237j, false);
        kotlinx.coroutines.aj.z(G(), null, null, new ge(this, (h.c.e) null, 1), 3);
        H(es.f19565a);
    }

    public final void w() {
        this.f19553j.a(com.waze.car_lib.c.g.f19235h, false);
        this.f19546c.a();
        H(new ek(false));
    }
}
