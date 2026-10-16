package com.waze.car_lib.r;

import androidx.car.app.CarContext;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.waze.NativeManager;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bk implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.f.ax f21046a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f21047b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.sound.bs f21048c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.car_lib.b.bo f21049d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.bn.b f21050e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.car_lib.b.f f21051f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.map.b.n f21052g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.network.b.al f21053h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.network.b.y f21054i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.main_screen.u.c f21055j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.car_lib.c.i f21056k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.car_lib.p.ao f21057l;
    private final kotlinx.coroutines.b.bn m;
    private final kotlinx.coroutines.b.bn n;
    private final com.waze.bw.a.b.v o;

    public bk(com.waze.car_lib.f.ax axVar, kotlinx.coroutines.b.k kVar, com.waze.sound.bs bsVar, com.waze.car_lib.b.bo boVar, com.waze.bn.b bVar, com.waze.car_lib.b.f fVar, com.waze.map.b.n nVar, com.waze.network.b.al alVar, com.waze.bw.a.b.v vVar, com.waze.network.b.y yVar, com.waze.main_screen.u.c cVar, com.waze.car_lib.c.i iVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(axVar, "coordinatorController");
        h.g.b.x.f(kVar, "configValueShutdownEnabled");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(boVar, "notificationToastLifecyclePresenter");
        h.g.b.x.f(bVar, "roamingStateProvider");
        h.g.b.x.f(fVar, "alertLifecyclePresenter");
        h.g.b.x.f(nVar, "mainMap");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(vVar, "startStateCarViewModel");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(cVar, "getPredictionDataUseCase");
        h.g.b.x.f(iVar, "inCarMainScreenStatsReporter");
        h.g.b.x.f(eVar, "logger");
        this.f21046a = axVar;
        this.f21047b = kVar;
        this.f21048c = bsVar;
        this.f21049d = boVar;
        this.f21050e = bVar;
        this.f21051f = fVar;
        this.f21052g = nVar;
        this.f21053h = alVar;
        this.o = vVar;
        this.f21054i = yVar;
        this.f21055j = cVar;
        this.f21056k = iVar;
        com.waze.car_lib.p.ao aoVar = new com.waze.car_lib.p.ao(R.drawable.icon_outline_settings_30px, R.drawable.icon_outline_search_30px, R.drawable.icon_outline_close_30px, null, false, null, false, false, false);
        this.f21057l = aoVar;
        this.m = kotlinx.coroutines.b.ck.b(false);
        this.n = kotlinx.coroutines.b.ck.b(aoVar);
    }

    public static final /* synthetic */ void m(bk bkVar, com.waze.bw.a.b.c cVar) {
        if (!(cVar instanceof com.waze.bw.a.b.c)) {
            throw new h.i();
        }
        bkVar.f21046a.B(new com.waze.modules.navigation.br(new com.waze.modules.navigation.ao(cVar.b(), new com.waze.modules.navigation.ai(cVar.a()), null, true, com.waze.modules.navigation.at.f30321a, null, false, null, 224)));
    }

    public static final /* synthetic */ void n(bk bkVar, com.waze.main_screen.u.a aVar) {
        com.waze.car_lib.screens.bd bdVar = new com.waze.car_lib.screens.bd(aVar);
        h.g.b.x.f(bdVar, "launchParams");
        bkVar.f21046a.H(new com.waze.car_lib.f.bg(bdVar));
    }

    public final LiveData a() {
        return FlowLiveDataConversions.asLiveData$default(this.n, (h.c.j) null, 0L, 3, (Object) null);
    }

    public final com.waze.car_lib.p.ao e() {
        return this.f21057l;
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    public final void o() {
        this.f21056k.a(com.waze.car_lib.c.g.f19234g, false);
        this.f21052g.r(com.waze.map.b.q.f28364a, true);
    }

    public final void p(boolean z) {
        this.m.e(Boolean.valueOf(z));
    }

    public final void q() {
        this.f21056k.a(com.waze.car_lib.c.g.f19230c, false);
        this.f21046a.w();
    }

    public final void r() {
        this.f21056k.a(com.waze.car_lib.c.g.f19231d, false);
        this.f21046a.x();
    }

    public final void s() {
        this.f21056k.a(com.waze.car_lib.c.g.f19233f, false);
        this.f21046a.z();
    }

    public final void t(final kotlinx.coroutines.af afVar, Lifecycle lifecycle, CarContext carContext) {
        h.g.b.x.f(afVar, "scope");
        h.g.b.x.f(lifecycle, "lifecycle");
        h.g.b.x.f(carContext, "carContext");
        this.f21049d.b(lifecycle, carContext);
        this.f21051f.h(lifecycle, carContext);
        final kotlinx.coroutines.b.k kVarF = kotlinx.coroutines.b.ai.F(this.f21050e.a(), this.f21048c.b(), new bv(null, 1, null));
        NativeManager.runOnNativeManagerReady(new Runnable() { // from class: com.waze.car_lib.r.bd
            @Override // java.lang.Runnable
            public final void run() {
                bk bkVar = this;
                kotlinx.coroutines.af afVar2 = afVar;
                kotlinx.coroutines.aj.z(afVar2, null, null, new bi(bkVar, afVar2, kVarF, (h.c.e) null, 0), 3);
            }
        });
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 8, (byte[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 9, (char[]) null), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 7), 3);
        kotlinx.coroutines.aj.z(afVar, null, null, new j(this, (h.c.e) null, 10, (short[]) null), 3);
    }

    public final void u() {
        this.o.o(com.waze.bw.a.b.d.f17572a);
    }

    public final void v() {
        this.f21056k.a(com.waze.car_lib.c.g.f19239l, false);
        com.waze.map.b.bf.c(this.f21052g);
    }

    public final void w() {
        this.f21056k.a(com.waze.car_lib.c.g.m, false);
        com.waze.map.b.bf.d(this.f21052g);
    }

    public final com.waze.bw.a.b.v x() {
        return this.o;
    }
}
