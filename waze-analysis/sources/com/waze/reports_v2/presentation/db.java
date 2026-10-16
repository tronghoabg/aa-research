package com.waze.reports_v2.presentation;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.e f35016a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.reports_v2.c.br f35017b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35018c;

    public db(com.waze.reports_v2.e eVar, com.waze.reports_v2.c.br brVar) {
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(brVar, "conversationalReportingOnboardingController");
        this.f35016a = eVar;
        this.f35017b = brVar;
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_KEEP_OPEN_AFTER_SUCCESS_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f35018c = h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    public static final int c() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_REPORT_MENU_V2_CONFIRM_TIMER_DURATION_SECONDS.b().longValue();
    }

    public final long a() {
        return this.f35018c;
    }

    public final da b() {
        boolean zB = this.f35017b.b();
        com.waze.reports_v2.e eVar = this.f35016a;
        com.waze.reports_v2.d dVarB = zB ? eVar.b() : eVar.a();
        return dVarB instanceof com.waze.reports_v2.c ? da.f35014c : dVarB instanceof com.waze.reports_v2.a ? da.f35013b : da.f35012a;
    }
}
