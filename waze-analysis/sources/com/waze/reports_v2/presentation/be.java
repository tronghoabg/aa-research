package com.waze.reports_v2.presentation;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34855a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f34856b;

    public be() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_FTE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f34855a = boolB.booleanValue();
        com.waze.config.b bVar = ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_FTE_SHOWN;
        h.g.b.x.e(bVar, "CONFIG_VALUE_INSIGHT_STANDARD_FTE_SHOWN");
        this.f34856b = com.waze.n.ac.p(bVar);
    }

    public final kotlinx.coroutines.b.k a() {
        return this.f34856b;
    }

    public final boolean b() {
        return this.f34855a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.b.ch, kotlinx.coroutines.b.k] */
    public final kotlinx.coroutines.b.ch c() {
        return this.f34856b;
    }

    public final boolean d() {
        return this.f34855a;
    }

    public be(com.waze.reports_v2.c.ao aoVar) {
        h.g.b.x.f(aoVar, "conversationalReportingConfig");
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_YELLOW_REPORT_BUTTON_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f34855a = boolB.booleanValue();
        this.f34856b = aoVar.e();
    }
}
