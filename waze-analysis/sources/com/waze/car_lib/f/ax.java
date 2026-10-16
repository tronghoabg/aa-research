package com.waze.car_lib.f;

import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ax extends com.waze.shared_infra.coordinators.s {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.navigate.db f19398a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.car_lib.b.br f19399b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.af.a.i f19400c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.b.ap f19401d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.r.a f19402e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.login.m f19403f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.isolated.i f19404g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.search.bn f19405h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.bj f19406i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.car_lib.n.z f19407j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f19408k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.g.j f19409l;
    private final com.waze.z m;
    private final com.waze.cg.b.e n;
    private final com.waze.map.b.n o;
    private final CompletableDeferred p;
    private final kotlinx.coroutines.b.bn q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(com.waze.navigate.db dbVar, com.waze.car_lib.b.br brVar, com.waze.main_screen.af.a.i iVar, com.waze.car_lib.b.ap apVar, com.waze.shared_infra.r.a aVar, com.waze.car_lib.login.m mVar, com.waze.map.isolated.i iVar2, com.waze.search.bn bnVar, com.waze.bj bjVar, com.waze.car_lib.n.z zVar, com.waze.shared_infra.i.e eVar, com.waze.car_lib.g.j jVar, au auVar, com.waze.z zVar2, com.waze.cg.b.e eVar2, com.waze.map.b.n nVar, com.waze.ct ctVar, kotlinx.coroutines.af afVar) {
        super(bt.f19436a, afVar);
        h.g.b.x.f(dbVar, "navigationController");
        h.g.b.x.f(brVar, "reportAlertController");
        h.g.b.x.f(iVar, "wazeAsksController");
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(aVar, "appSessionController");
        h.g.b.x.f(mVar, "loginController");
        h.g.b.x.f(iVar2, "mapEventsProvider");
        h.g.b.x.f(bnVar, "searchQueryBroadcaster");
        h.g.b.x.f(bjVar, "deepLinkController");
        h.g.b.x.f(zVar, "searchRepository");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(jVar, "lcvController");
        h.g.b.x.f(auVar, "config");
        h.g.b.x.f(zVar2, "appType");
        h.g.b.x.f(eVar2, "wazeToGoalController");
        h.g.b.x.f(nVar, "mainMapController");
        h.g.b.x.f(ctVar, "locationPreviewIntentBroadcaster");
        h.g.b.x.f(afVar, "scope");
        this.f19398a = dbVar;
        this.f19399b = brVar;
        this.f19400c = iVar;
        this.f19401d = apVar;
        this.f19402e = aVar;
        this.f19403f = mVar;
        this.f19404g = iVar2;
        this.f19405h = bnVar;
        this.f19406i = bjVar;
        this.f19407j = zVar;
        this.f19408k = eVar;
        this.f19409l = jVar;
        this.m = zVar2;
        this.n = eVar2;
        this.o = nVar;
        this.p = kotlinx.coroutines.bo.j();
        this.q = kotlinx.coroutines.b.ck.b(av.f19392a);
        eVar2.e();
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 12, (short[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 13, (int[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 14, (boolean[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 15, (float[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 16, (byte[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 17, (char[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 18, (short[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 19, (int[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 20, (boolean[][]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 9), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 10, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new aj(this, (h.c.e) null, 11, (char[]) null), 3);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(J(ctVar.a(), this), new ik(this, (h.c.e) null, 1)), afVar);
        com.waze.ad.c.b.a(afVar, new an(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.b.bq J(kotlinx.coroutines.b.bq bqVar, ax axVar) {
        return kotlinx.coroutines.b.ai.T(bqVar, new aw(axVar, (h.c.e) null, 2, (char[]) null));
    }

    static final h.ab o(ax axVar) {
        axVar.n.f();
        return h.ab.f48028a;
    }

    public final void A() {
        this.f19408k.a("started");
        this.p.a(h.ab.f48028a);
    }

    public final void B(com.waze.av.d.t tVar) {
        h.g.b.x.f(tVar, NotificationCompat.CATEGORY_EVENT);
        H(new bu(tVar));
    }

    public final kotlinx.coroutines.b.ch r() {
        return this.q;
    }

    public final void t() {
        H(ay.f19410a);
    }

    public final void u() {
        if (this.f19398a.e().d() == com.waze.navigate.ei.f31311b) {
            this.f19408k.a("onLoggedInFromAnotherDeviceEnded start navigation");
            H(be.f19418a);
        }
    }

    public final void v() {
        kotlinx.coroutines.aj.z(G(), null, null, new aw(this, (h.c.e) null, 1, (byte[]) null), 3);
        H(bj.f19425a);
    }

    public final void w() {
        H(bm.f19430a);
    }

    public final void x() {
        H(new bl(null, false, null));
    }

    public final void y(av avVar) {
        h.g.b.x.f(avVar, "mapType");
        this.q.e(avVar);
        H(new bc(avVar));
    }

    public final void z() {
        H(bo.f19431a);
    }
}
