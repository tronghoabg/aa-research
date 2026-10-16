package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bq {

    /* renamed from: a, reason: collision with root package name */
    private final long f34275a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34276b;

    public bq() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_CAPPING_PERIOD_DAYS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f34275a = h.o.c.j(lB.longValue(), h.o.d.f48276g);
        Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_MAX_TIMES_TO_SHOW.b();
        h.g.b.x.e(lB2, "getValue(...)");
        this.f34276b = lB2.longValue();
    }

    public static final long c() {
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_SHOWN_COUNT.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    public static final long d() {
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_SHOWN_COUNTER_IN_PERIOD.b();
        h.g.b.x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    public static final void e(long j2) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_REPORT_MENU_ONBOARDING_SHOWN_COUNTER_IN_PERIOD.d(Long.valueOf(j2));
    }

    public final long a() {
        return this.f34275a;
    }

    public final long b() {
        return this.f34276b;
    }
}
