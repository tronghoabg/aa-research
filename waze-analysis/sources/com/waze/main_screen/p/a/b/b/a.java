package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.cg;
import com.waze.navigate.cj;
import com.waze.navigate.eo;
import com.waze.sound.bs;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final cg f26864a;

    /* renamed from: b, reason: collision with root package name */
    private final cj f26865b;

    /* renamed from: c, reason: collision with root package name */
    private final eo f26866c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.network.b.al f26867d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.network.b.y f26868e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.main_screen.bottom_bars.scrollable_eta.q f26869f;

    /* renamed from: g, reason: collision with root package name */
    private final bs f26870g;

    /* renamed from: h, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f26871h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.app_nav.w f26872i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.settings.ai f26873j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.as.a f26874k;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26875l;

    public a(cg cgVar, cj cjVar, eo eoVar, com.waze.network.b.al alVar, com.waze.network.b.y yVar, com.waze.main_screen.bottom_bars.scrollable_eta.q qVar, bs bsVar, com.waze.shared_infra.o.a aVar, com.waze.app_nav.w wVar, com.waze.settings.ai aiVar, com.waze.as.a aVar2, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(cjVar, "etaStateInterface");
        h.g.b.x.f(eoVar, "navigationStatusInterface");
        h.g.b.x.f(alVar, "networkStatusIndicatorUseCase");
        h.g.b.x.f(yVar, "networkIndicatorStatsReporter");
        h.g.b.x.f(qVar, "etaStatsSender");
        h.g.b.x.f(bsVar, "guidanceModeRepository");
        h.g.b.x.f(aVar, "stringProvider");
        h.g.b.x.f(wVar, "mainScreenFlowController");
        h.g.b.x.f(aiVar, "openSettingsCompat");
        h.g.b.x.f(aVar2, "deviceLockStateService");
        h.g.b.x.f(eVar, "logger");
        this.f26864a = cgVar;
        this.f26865b = cjVar;
        this.f26866c = eoVar;
        this.f26867d = alVar;
        this.f26868e = yVar;
        this.f26869f = qVar;
        this.f26870g = bsVar;
        this.f26871h = aVar;
        this.f26872i = wVar;
        this.f26873j = aiVar;
        this.f26874k = aVar2;
        this.f26875l = eVar;
    }

    public final c a() {
        return new q(this.f26864a, this.f26865b, this.f26866c, this.f26867d, this.f26868e, this.f26874k, this.f26869f, this.f26871h, this.f26872i, this.f26873j, this.f26870g, this.f26875l);
    }
}
