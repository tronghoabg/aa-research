package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.bx;
import com.waze.navigate.cg;
import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.sound.bs;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q implements c {

    /* renamed from: a, reason: collision with root package name */
    private final cj f26974a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.as.a f26975b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.main_screen.bottom_bars.scrollable_eta.q f26976c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f26977d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.app_nav.w f26978e;

    /* renamed from: f, reason: collision with root package name */
    private final bs f26979f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26980g;

    /* renamed from: h, reason: collision with root package name */
    private final kotlinx.coroutines.af f26981h;

    /* renamed from: i, reason: collision with root package name */
    private final bn f26982i;

    /* renamed from: j, reason: collision with root package name */
    private final ch f26983j;

    /* renamed from: k, reason: collision with root package name */
    private final ch f26984k;

    /* renamed from: l, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f26985l;
    private final kotlinx.coroutines.b.k m;
    private final ch n;

    public q(cg cgVar, cj cjVar, eo eoVar, com.waze.network.b.al alVar, com.waze.network.b.y yVar, com.waze.as.a aVar, com.waze.main_screen.bottom_bars.scrollable_eta.q qVar, com.waze.shared_infra.o.a aVar2, com.waze.app_nav.w wVar, com.waze.settings.ai aiVar, bs bsVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(cjVar, "etaStateInterface");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(aVar, "deviceLockStateService");
        h.g.b.x.f(qVar, "etaStatsSender");
        h.g.b.x.f(aVar2, "stringProvider");
        h.g.b.x.f(wVar, "mainScreenFlowController");
        h.g.b.x.f(aiVar, "openSettingsCompat");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(eVar, "logger");
        this.f26974a = cjVar;
        this.f26975b = aVar;
        this.f26976c = qVar;
        this.f26977d = aVar2;
        this.f26978e = wVar;
        this.f26979f = bsVar;
        this.f26980g = eVar;
        kotlinx.coroutines.s sVarQ = kotlinx.coroutines.aj.Q();
        int i2 = kotlinx.coroutines.av.f51370a;
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(sVarQ.plus(kotlinx.coroutines.e.ac.f51860a.c()).plus(new kotlinx.coroutines.ae("EtaBarStateHolder")));
        this.f26981h = afVarE;
        bn bnVarB = ck.b(b.f26945a);
        this.f26982i = bnVarB;
        ch chVarU = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f26983j = chVarU;
        boolean z = false;
        n nVar = new n(chVarU, 0);
        int i3 = bz.f51630a;
        bz bzVarB = by.b();
        bx bxVar = ((b) chVarU.d()).f26947c;
        if (bxVar != null && bxVar.e()) {
            z = true;
        }
        this.f26984k = kotlinx.coroutines.b.ai.V(nVar, afVarE, bzVarB, Boolean.valueOf(z));
        this.f26985l = kotlinx.coroutines.b.ai.y(new n(eoVar.ae(), 2));
        this.m = kotlinx.coroutines.b.ai.y(new n(com.waze.network.b.ay.d(alVar.a(), yVar), 3));
        this.n = kotlinx.coroutines.b.ai.V(cgVar.M(), afVarE, by.b(), null);
        kotlinx.coroutines.aj.z(afVarE, null, null, new f(this, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new i(this, null), 3);
        kotlinx.coroutines.aj.z(afVarE, null, null, new k(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ com.waze.navigate.bx j(com.waze.main_screen.p.a.b.b.q r13, com.waze.navigate.ci r14, boolean r15, boolean r16, com.waze.ui.r.a.e.b.a r17) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.p.a.b.b.q.j(com.waze.main_screen.p.a.b.b.q, com.waze.navigate.ci, boolean, boolean, com.waze.ui.r.a.e.b.a):com.waze.navigate.bx");
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final ch a() {
        return this.f26983j;
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final ch b() {
        return this.f26984k;
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void c() {
        this.f26976c.a(com.waze.main_screen.bottom_bars.scrollable_eta.j.f25977a);
    }

    @Override // com.waze.main_screen.p.a.b.b.c, com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kotlinx.coroutines.aj.h(this.f26981h, null);
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void d() {
        this.f26976c.a(com.waze.main_screen.bottom_bars.scrollable_eta.j.f25977a);
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void e() {
        this.f26976c.a(com.waze.main_screen.bottom_bars.scrollable_eta.j.f25978b);
        com.waze.a.af.j(this.f26978e, false, null, 2);
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void f() {
        this.f26976c.b(com.waze.main_screen.bottom_bars.scrollable_eta.l.r);
        h.g.b.x.f("settings_main", "pageId");
        com.waze.bs.a.f("settings_main", "MAP", false);
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void g() {
        com.waze.main_screen.bottom_bars.scrollable_eta.q qVar = this.f26976c;
        qVar.b(com.waze.main_screen.bottom_bars.scrollable_eta.l.q);
        qVar.a(null);
    }

    @Override // com.waze.main_screen.p.a.b.b.c
    public final void h() {
        this.f26980g.a("Stop navigation button clicked, stopping ETA bar updates");
        close();
    }
}
