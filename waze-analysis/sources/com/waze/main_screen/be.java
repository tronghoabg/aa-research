package com.waze.main_screen;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import kotlinx.coroutines.b.bq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class be extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f25906a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.ad.a.h f25907b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.k.a.u f25908c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.cg.b.e f25909d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.ao f25910e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.bf.c.b f25911f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.ac.c.b f25912g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.s f25913h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.reports_v2.presentation.a.ba f25914i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.c.t f25915j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.o.d.b.b.h f25916k;

    /* renamed from: l, reason: collision with root package name */
    private com.waze.reports_v2.presentation.a.au f25917l;
    private final com.waze.sharedrive.d.aq m;
    private final com.waze.nav_connect.b.af n;

    public be(com.waze.shared_infra.i.e eVar, com.waze.main_screen.ad.a.h hVar, com.waze.main_screen.k.a.u uVar, com.waze.cg.b.e eVar2, com.waze.main_screen.c.r rVar, com.waze.nav_connect.b.x xVar, com.waze.ao aoVar, com.waze.sharedrive.d.a aVar, com.waze.bf.c.b bVar, com.waze.ac.c.b bVar2, com.waze.reports_v2.presentation.a.s sVar, com.waze.reports_v2.presentation.a.ba baVar, com.waze.o.d.b.b.d dVar) {
        bq bqVarC;
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(hVar, "trafficBarStateHolder");
        h.g.b.x.f(uVar, "insightComponentStateHolder");
        h.g.b.x.f(eVar2, "wazeToGoalController");
        h.g.b.x.f(rVar, "buttonPackStateHolderFactory");
        com.waze.nav_connect.b.x xVar2 = xVar;
        h.g.b.x.f(xVar2, "navConnectConsentStateHolderFactory");
        h.g.b.x.f(aoVar, "carManager");
        h.g.b.x.f(aVar, "shareDriveControllerFactory");
        h.g.b.x.f(bVar, "privacyConsentStateHolder");
        h.g.b.x.f(bVar2, "encouragementStateHolder");
        h.g.b.x.f(sVar, "reportLaterStateHolder");
        h.g.b.x.f(baVar, "reportMenuStateHolder");
        h.g.b.x.f(dVar, "companinioOverlayStateHolderFactory");
        this.f25906a = eVar;
        this.f25907b = hVar;
        this.f25908c = uVar;
        this.f25909d = eVar2;
        this.f25910e = aoVar;
        this.f25911f = bVar;
        this.f25912g = bVar2;
        this.f25913h = sVar;
        this.f25914i = baVar;
        com.waze.main_screen.c.t tVarA = rVar.a();
        this.f25915j = tVarA;
        this.m = aVar.a();
        com.waze.o.d.b.b.h hVarA = dVar.a();
        this.f25916k = hVarA;
        xVar2 = tVarA == null ? null : xVar2;
        com.waze.nav_connect.b.af afVarA = xVar2 != null ? xVar2.a() : null;
        this.n = afVarA;
        eVar.a("init " + System.identityHashCode(this));
        if (tVarA != null && (bqVarC = tVarA.c()) != null) {
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(bqVarC, new ba(this, null)), ViewModelKt.getViewModelScope(this));
        }
        be beVar = this;
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(beVar), null, null, new aj(this, (h.c.e) null, 11, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(ViewModelKt.getViewModelScope(beVar), null, null, new aj(this, (h.c.e) null, 10), 3);
        addCloseable((AutoCloseable) uVar);
        addCloseable((AutoCloseable) hVar);
        if (tVarA != null) {
            addCloseable((AutoCloseable) tVarA);
        }
        if (afVarA != null) {
            addCloseable((AutoCloseable) afVarA);
        }
        addCloseable((AutoCloseable) bVar);
        addCloseable((AutoCloseable) bVar2);
        addCloseable((AutoCloseable) sVar);
        addCloseable((AutoCloseable) baVar);
        eVar2.e();
        addCloseable(new AutoCloseable() { // from class: com.waze.main_screen.ay
            @Override // java.lang.AutoCloseable
            public final void close() {
                be.k(this.f25864a);
            }
        });
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.y(new bd(aoVar.a(), 0)), new az(this, null)), ViewModelKt.getViewModelScope(beVar));
        if (hVarA != null) {
            addCloseable((AutoCloseable) hVarA);
        }
    }

    static final void k(be beVar) {
        beVar.f25909d.f();
    }

    public final com.waze.o.d.b.b.h a() {
        return this.f25916k;
    }

    public final com.waze.main_screen.c.t c() {
        return this.f25915j;
    }

    public final com.waze.main_screen.k.a.u d() {
        return this.f25908c;
    }

    public final com.waze.main_screen.ad.a.h e() {
        return this.f25907b;
    }

    public final com.waze.reports_v2.presentation.a.s g() {
        return this.f25913h;
    }

    public final com.waze.reports_v2.presentation.a.au h() {
        return this.f25917l;
    }

    public final com.waze.reports_v2.presentation.a.ba i() {
        return this.f25914i;
    }

    public final com.waze.shared_infra.i.e j() {
        return this.f25906a;
    }

    public final void l(com.waze.reports_v2.presentation.a.au auVar) {
        this.f25917l = auVar;
    }

    public final com.waze.nav_connect.b.af m() {
        return this.n;
    }

    public final com.waze.sharedrive.d.aq n() {
        return this.m;
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        this.f25906a.a("cleared " + System.identityHashCode(this));
    }
}
