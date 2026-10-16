package com.waze.main_screen.p.a.b.b;

import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import com.waze.iu;
import com.waze.navigate.AddressItem;
import com.waze.navigate.NavResultData;
import com.waze.navigate.ch;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aj implements af {

    /* renamed from: a, reason: collision with root package name */
    private final ch f26897a;

    /* renamed from: b, reason: collision with root package name */
    private final c f26898b;

    /* renamed from: c, reason: collision with root package name */
    private final am f26899c;

    /* renamed from: d, reason: collision with root package name */
    private final t f26900d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.main_screen.bottom_bars.scrollable_eta.q f26901e;

    /* renamed from: f, reason: collision with root package name */
    private final NativeManager f26902f;

    /* renamed from: g, reason: collision with root package name */
    private final kotlinx.coroutines.af f26903g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f26904h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f26905i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f26906j;

    public aj(ch chVar, c cVar, am amVar, t tVar, com.waze.main_screen.p.a.a.a aVar, com.waze.main_screen.bottom_bars.scrollable_eta.q qVar, NativeManager nativeManager) {
        h.g.b.x.f(chVar, "etaScreenNavDataProvider");
        h.g.b.x.f(cVar, "mainBarStateHolder");
        h.g.b.x.f(amVar, "midSectionStateHolder");
        h.g.b.x.f(tVar, "controlPanelStateHolder");
        h.g.b.x.f(aVar, "etaDrawerConfig");
        h.g.b.x.f(qVar, "etaStatsSender");
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f26897a = chVar;
        this.f26898b = cVar;
        this.f26899c = amVar;
        this.f26900d = tVar;
        this.f26901e = qVar;
        this.f26902f = nativeManager;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "EtaDrawerStateHolder");
        this.f26903g = afVarP;
        bn bnVarB = ck.b(new ae(null, false));
        this.f26904h = bnVarB;
        int i2 = bz.f51630a;
        this.f26905i = kotlinx.coroutines.b.ai.V(bnVarB, afVarP, by.b(), bnVarB.d());
        kotlinx.coroutines.aj.z(afVarP, null, null, new ai(this, null), 3);
    }

    static final void j(aj ajVar) {
        NativeManager nativeManager = ajVar.f26902f;
        iu.StopFollow$default(nativeManager, null, 1, null);
        NavResultData navResultData = ((s) ajVar.f26900d.a().d()).f26989a;
        if (navResultData == null || !navResultData.is_trip_rsp) {
            nativeManager.stopNavigation();
        } else {
            nativeManager.stopTripServerNavigation();
        }
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final c a() {
        return this.f26898b;
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final t b() {
        return this.f26900d;
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final am c() {
        return this.f26899c;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f26898b.close();
        this.f26899c.close();
        this.f26900d.close();
        kotlinx.coroutines.aj.h(this.f26903g, null);
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final kotlinx.coroutines.b.ch d() {
        return this.f26905i;
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final void e() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f26904h;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ae.b((ae) objD, null, false, 1)));
        this.f26901e.b(com.waze.main_screen.bottom_bars.scrollable_eta.l.o);
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final void f() {
        bn bnVar;
        Object objD;
        String venueId;
        do {
            bnVar = this.f26904h;
            objD = bnVar.d();
        } while (!bnVar.f(objD, ae.b((ae) objD, null, true, 1)));
        this.f26897a.O();
        t tVar = this.f26900d;
        NavResultData navResultData = ((s) tVar.a().d()).f26989a;
        if (navResultData != null) {
            int i2 = (navResultData.isWaypoint ? navResultData.etaSecondsToWaypoint : navResultData.etaSecondsToDestination) - navResultData.otherRouteDurationSeconds;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            com.waze.main_screen.bottom_bars.scrollable_eta.n nVar = new com.waze.main_screen.bottom_bars.scrollable_eta.n(navResultData.otherRouteHovMinPassengers, i2 / 60);
            AddressItem addressItem = navResultData.destination;
            String str = (addressItem == null || (venueId = addressItem.getVenueId()) == null || venueId.length() <= 0) ? null : venueId;
            boolean z = ((s) tVar.a().d()).f26991c;
            List listD = navResultData.altHasHov ? h.a.i.d(com.waze.main_screen.bottom_bars.scrollable_eta.p.f26002b) : h.a.i.h();
            com.waze.main_screen.bottom_bars.scrollable_eta.q qVar = this.f26901e;
            com.waze.main_screen.bottom_bars.scrollable_eta.m mVar = this.f26906j ? com.waze.main_screen.bottom_bars.scrollable_eta.m.f25994b : com.waze.main_screen.bottom_bars.scrollable_eta.m.f25993a;
            Boolean boolB = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b();
            h.g.b.x.e(boolB, "getValue(...)");
            qVar.d(mVar, str, nVar, boolB.booleanValue(), navResultData.isWaypoint, z, listD);
            this.f26906j = true;
        }
    }

    @Override // com.waze.main_screen.p.a.b.b.af
    public final void g() {
        this.f26898b.h();
        this.f26902f.PostRunnable(new Runnable() { // from class: com.waze.main_screen.p.a.b.b.ag
            @Override // java.lang.Runnable
            public final void run() {
                aj.j(this.f26893a);
            }
        });
    }
}
