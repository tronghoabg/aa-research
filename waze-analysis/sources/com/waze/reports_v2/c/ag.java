package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.reports_v2.e f34179a;

    /* renamed from: b, reason: collision with root package name */
    private final bw f34180b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34181c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34182d;

    public ag(com.waze.reports_v2.e eVar, bw bwVar) {
        h.g.b.x.f(eVar, "conversationalModeProvider");
        h.g.b.x.f(bwVar, "userConsent");
        this.f34179a = eVar;
        this.f34180b = bwVar;
        this.f34182d = eVar.b().a().j();
    }

    public static final int e() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_SHOWN_COUNTER_IN_PERIOD.b().longValue();
    }

    public static final int f() {
        return (int) ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_SHOWN_COUNTER_IN_TOTAL.b().longValue();
    }

    public static final void g(int i2) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_SHOWN_COUNTER_IN_PERIOD.d(Long.valueOf(i2));
    }

    public static final void j(boolean z) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_USER_DECLINED_PERMISSION.d(Boolean.valueOf(z));
    }

    public final boolean a() {
        return this.f34180b.a() != bv.f34293a;
    }

    public final boolean b() {
        return this.f34181c;
    }

    public final boolean c() {
        return !(this.f34179a.b() instanceof com.waze.reports_v2.b);
    }

    public final boolean d() {
        return this.f34182d;
    }

    public final void h() {
        this.f34181c = true;
    }

    public final void i() {
        this.f34179a.b().a().f(true);
    }
}
