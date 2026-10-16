package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cp implements cn, s {

    /* renamed from: a, reason: collision with root package name */
    private final bw f34349a;

    /* renamed from: b, reason: collision with root package name */
    private final s f34350b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34351c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34352d;

    public cp(bs bsVar, bw bwVar, s sVar) {
        h.g.b.x.f(bsVar, "conversationalReportingSupportedLocaleState");
        h.g.b.x.f(bwVar, "userConsent");
        h.g.b.x.f(sVar, "commonConfig");
        this.f34349a = bwVar;
        this.f34350b = sVar;
        if (bwVar.a() == bv.f34293a && ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ENABLED_BY_USER.b().booleanValue()) {
            f(true);
        }
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_NON_FTE_HINT_DELAY_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f34351c = h.o.c.j(lB.longValue(), h.o.d.f48273d);
        Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_NON_FTE_HINT_LOOP_COUNT.b();
        h.g.b.x.e(lB2, "getValue(...)");
        this.f34352d = (int) h.k.n.k(lB2.longValue(), 1L);
    }

    @Override // com.waze.reports_v2.c.ao
    public final int a() {
        return this.f34352d;
    }

    @Override // com.waze.reports_v2.c.ao
    public final int b() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_REPORTED_SUCCESSFULLY_COUNT.b().longValue();
    }

    @Override // com.waze.reports_v2.c.ao
    public final long c() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_MUTE_TIMEOUT_DELAY_MINS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48274e);
    }

    @Override // com.waze.reports_v2.c.ao
    public final long d() {
        return this.f34351c;
    }

    @Override // com.waze.reports_v2.c.ao
    public final kotlinx.coroutines.b.k e() {
        kotlinx.coroutines.b.ch chVarF = bs.f();
        kotlinx.coroutines.b.k kVarB = this.f34349a.b();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_REPORTING_C…ATIONAL_REPORTING_ENABLED");
        kotlinx.coroutines.b.k kVarO = com.waze.n.ac.o(bVar);
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_MODE;
        h.g.b.x.e(dVar, "CONFIG_VALUE_REPORTING_C…ERSATIONAL_REPORTING_MODE");
        return kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.s(chVarF, kVarB, kVarO, com.waze.n.ac.o(dVar), new co(this, null)));
    }

    @Override // com.waze.reports_v2.c.s
    public final void f(boolean z) {
        if (!z) {
            this.f34350b.f(false);
            p(false);
        } else {
            if (m()) {
                return;
            }
            this.f34350b.f(true);
            p(true);
        }
    }

    @Override // com.waze.reports_v2.c.ao
    public final void g(int i2) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_REPORTED_SUCCESSFULLY_COUNT.d(Long.valueOf(i2));
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean h() {
        return this.f34350b.h();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean i() {
        return this.f34350b.i();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean j() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_ANIMATED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean k() {
        return this.f34350b.k();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean l() {
        return this.f34350b.l();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean m() {
        return this.f34350b.m();
    }

    @Override // com.waze.reports_v2.c.ao
    public final boolean n() {
        return this.f34349a.a() == bv.f34293a && l() && ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_FTE_TOOLTIP_ENABLED.b().booleanValue();
    }

    @Override // com.waze.reports_v2.c.ao
    public final boolean o() {
        return l() && m() && ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_NON_FTE_HINT_ENABLED.b().booleanValue();
    }

    public final void p(boolean z) {
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_FTE_TOOLTIP_PRIMED;
        boolean z2 = false;
        if (z && h() && n()) {
            z2 = true;
        }
        bVar.d(Boolean.valueOf(z2));
    }
}
