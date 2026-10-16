package com.waze.main_screen.l.b;

import com.waze.jni.protos.navigate.NavigationItem;
import com.waze.jni.protos.rtalerts.RtAlertItem;
import com.waze.navigate.cr;
import h.ab;
import h.g.b.x;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r implements j {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f26634a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.main_screen.l.a.e f26635b;

    /* renamed from: c, reason: collision with root package name */
    private final cr f26636c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.navigate.b.g f26637d;

    /* renamed from: e, reason: collision with root package name */
    private final g f26638e;

    /* renamed from: f, reason: collision with root package name */
    private final h f26639f;

    /* renamed from: g, reason: collision with root package name */
    private final af f26640g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f26641h;

    /* renamed from: i, reason: collision with root package name */
    private final ch f26642i;

    public r(com.waze.shared_infra.i.e eVar, com.waze.main_screen.l.a.e eVar2, cr crVar, d dVar, com.waze.navigate.b.g gVar, g gVar2, h hVar) {
        x.f(eVar, "logger");
        x.f(eVar2, "navigationInstructionsListDataAPI");
        x.f(crVar, "instructionState");
        x.f(dVar, "config");
        x.f(gVar, "statsSender");
        x.f(gVar2, "navigationInstructionItemClicked");
        x.f(hVar, "rtRouteEventClicked");
        this.f26634a = eVar;
        this.f26635b = eVar2;
        this.f26636c = crVar;
        this.f26637d = gVar;
        this.f26638e = gVar2;
        this.f26639f = hVar;
        int i2 = av.f51370a;
        af afVarE = aj.e(ac.f51860a.c().plus(aj.Q()).plus(new ae("NavListStateHolder")));
        this.f26640g = afVarE;
        bn bnVarB = ck.b(new i(dVar.a(), h.a.i.h(), h.a.i.h()));
        this.f26641h = bnVarB;
        this.f26642i = ai.U(bnVarB);
        aj.z(afVarE, null, null, new m(this, null), 3).bY(new h.g.a.l() { // from class: com.waze.main_screen.l.b.k
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return r.i(this.f26621a, (Throwable) obj);
            }
        });
        aj.z(afVarE, null, null, new n(this, null), 3).bY(new h.g.a.l() { // from class: com.waze.main_screen.l.b.l
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return r.j(this.f26622a, (Throwable) obj);
            }
        });
        aj.z(afVarE, null, null, new q(this, null), 3);
    }

    static final ab i(r rVar, Throwable th) {
        Objects.toString(th);
        rVar.f26634a.a("Canceled loadInstructions - error:".concat(String.valueOf(th)));
        return ab.f48028a;
    }

    static final ab j(r rVar, Throwable th) {
        Objects.toString(th);
        rVar.f26634a.a("loadAlertsOnRoute - Canceled loadAlertsOnRoute - error:".concat(String.valueOf(th)));
        return ab.f48028a;
    }

    @Override // com.waze.main_screen.l.b.j
    public final ch a() {
        return this.f26642i;
    }

    @Override // com.waze.main_screen.l.b.j
    public final void b() {
        aj.h(this.f26640g, new CancellationException("Clear called"));
    }

    @Override // com.waze.main_screen.l.b.j
    public final void c(NavigationItem navigationItem) {
        this.f26638e.a(navigationItem);
    }

    @Override // com.waze.main_screen.l.b.j
    public final void d(RtAlertItem rtAlertItem) {
        this.f26639f.a(rtAlertItem);
    }

    @Override // com.waze.main_screen.l.b.j
    public final void e() {
        this.f26637d.d(com.waze.navigate.b.d.f31050c);
    }

    @Override // com.waze.main_screen.l.b.j
    public final void f() {
        this.f26637d.d(com.waze.navigate.b.d.f31049b);
    }
}
