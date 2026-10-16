package com.waze.car_lib.b;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.bw;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class av implements at, com.waze.reports_v2.c.s {

    /* renamed from: a, reason: collision with root package name */
    private final bw f19000a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.s f19001b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19002c;

    public av(bw bwVar, com.waze.reports_v2.c.s sVar) {
        h.g.b.x.f(bwVar, "userConsent");
        h.g.b.x.f(sVar, "commonConfig");
        this.f19000a = bwVar;
        this.f19001b = sVar;
        this.f19002c = h.o.c.i(0, h.o.d.f48273d);
    }

    @Override // com.waze.reports_v2.c.ao
    public final int a() {
        return 0;
    }

    @Override // com.waze.reports_v2.c.ao
    public final int b() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_REPORTED_SUCCESSFULLY_IN_CAR_COUNT.b().longValue();
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
        return this.f19002c;
    }

    @Override // com.waze.reports_v2.c.ao
    public final kotlinx.coroutines.b.k e() {
        com.waze.reports_v2.c.bs bsVar = com.waze.reports_v2.c.bs.f34281a;
        ch chVarF = com.waze.reports_v2.c.bs.f();
        kotlinx.coroutines.b.k kVarB = this.f19000a.b();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_IN_CAR_ENABLED;
        h.g.b.x.e(bVar, "CONFIG_VALUE_REPORTING_C…_REPORTING_IN_CAR_ENABLED");
        kotlinx.coroutines.b.k kVarO = com.waze.n.ac.o(bVar);
        com.waze.config.d dVar = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_MODE;
        h.g.b.x.e(dVar, "CONFIG_VALUE_REPORTING_C…ERSATIONAL_REPORTING_MODE");
        kotlinx.coroutines.b.k kVarO2 = com.waze.n.ac.o(dVar);
        com.waze.config.b bVar2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AAOS_ENABLED;
        h.g.b.x.e(bVar2, "CONFIG_VALUE_REPORTING_C…AL_REPORTING_AAOS_ENABLED");
        return kotlinx.coroutines.b.ai.y(kotlinx.coroutines.b.ai.t(chVarF, kVarB, kVarO, kVarO2, com.waze.n.ac.o(bVar2), new au(this, null)));
    }

    @Override // com.waze.reports_v2.c.s
    public final void f(boolean z) {
        this.f19001b.f(z);
    }

    @Override // com.waze.reports_v2.c.ao
    public final void g(int i2) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_REPORTED_SUCCESSFULLY_IN_CAR_COUNT.d(Long.valueOf(i2));
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean h() {
        return this.f19001b.h();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean i() {
        return false;
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean j() {
        return this.f19001b.j();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean k() {
        return this.f19001b.k();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean l() {
        return this.f19001b.l();
    }

    @Override // com.waze.reports_v2.c.s
    public final boolean m() {
        return this.f19001b.m();
    }

    @Override // com.waze.reports_v2.c.ao
    public final boolean n() {
        return false;
    }

    @Override // com.waze.reports_v2.c.ao
    public final boolean o() {
        return false;
    }
}
