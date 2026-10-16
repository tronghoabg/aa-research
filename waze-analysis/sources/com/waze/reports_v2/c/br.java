package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.e f34277a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.j.a f34278b;

    /* renamed from: c, reason: collision with root package name */
    private final bq f34279c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f34280d;

    public br(com.waze.reports_v2.e eVar, com.waze.shared_infra.j.a aVar, bq bqVar, com.waze.shared_infra.q.e eVar2) {
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(aVar, "permissionChecker");
        h.g.b.x.f(bqVar, "config");
        h.g.b.x.f(eVar2, "clock");
        this.f34277a = eVar;
        this.f34278b = aVar;
        this.f34279c = bqVar;
        this.f34280d = eVar2;
    }

    public final void a() {
        long jC = bq.c() + 1;
        long jD = bq.d();
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_SHOWN_COUNT.d(Long.valueOf(jC));
        bq.e(jD + 1);
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_LAST_SHOWN_EPOCH_SECONDS.d(Long.valueOf(com.waze.settings.h.c.f(this.f34280d.a())));
    }

    public final boolean b() {
        com.waze.reports_v2.e eVar = this.f34277a;
        com.waze.reports_v2.d dVarB = eVar.b();
        com.waze.reports_v2.b bVar = com.waze.reports_v2.b.f34001a;
        if (h.g.b.x.n(dVarB, bVar) || !h.g.b.x.n(eVar.c(), bVar)) {
            return false;
        }
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        if (!boolB.booleanValue() || !this.f34278b.a("android.permission.RECORD_AUDIO")) {
            return false;
        }
        bq bqVar = this.f34279c;
        long jC = bq.c();
        long jD = bq.d();
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_LAST_SHOWN_EPOCH_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        long jLongValue = lB.longValue();
        long jA = bqVar.a();
        Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_LIMIT_IN_PERIOD.b();
        h.g.b.x.e(lB2, "getValue(...)");
        long jLongValue2 = lB2.longValue();
        if (jC >= bqVar.b()) {
            return false;
        }
        if (com.waze.settings.h.c.f(this.f34280d.a()) > jLongValue + h.o.a.p(jA)) {
            jD = 0;
            bq.e(0L);
        }
        return jD < jLongValue2;
    }
}
