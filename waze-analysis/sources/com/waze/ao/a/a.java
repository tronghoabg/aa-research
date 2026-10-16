package com.waze.ao.a;

import com.waze.config.ConfigValues;
import h.g.b.x;
import h.o.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f14878a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14879b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f14880c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f14881d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14882e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f14883f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f14884g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f14885h;

    public a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_QUESTION_TIMEOUT_SECONDS.b();
        x.e(lB, "getValue(...)");
        long jLongValue = lB.longValue();
        d dVar = d.f48273d;
        this.f14878a = h.o.c.j(jLongValue, dVar);
        Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_THANK_YOU_TIMEOUT_SECONDS.b();
        x.e(lB2, "getValue(...)");
        this.f14879b = h.o.c.j(lB2.longValue(), dVar);
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_INSIGHT_FEEDBACK_ENABLED.b();
        x.e(boolB, "getValue(...)");
        this.f14880c = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_NEW_INFRA_ENABLED.b();
        x.e(boolB2, "getValue(...)");
        this.f14881d = boolB2.booleanValue();
        Boolean boolB3 = ConfigValues.CONFIG_VALUE_INSIGHT_STANDARD_ENABLED.b();
        x.e(boolB3, "getValue(...)");
        this.f14882e = boolB3.booleanValue();
        Boolean boolB4 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_INSIGHT_FEEDBACK_SETTINGS_DIALOG_ENABLED.b();
        x.e(boolB4, "getValue(...)");
        this.f14883f = boolB4.booleanValue();
        Boolean boolB5 = ConfigValues.CONFIG_VALUE_DRIVE_REMINDER_ENABLED.b();
        x.e(boolB5, "getValue(...)");
        this.f14884g = boolB5.booleanValue();
        Boolean boolB6 = ConfigValues.CONFIG_VALUE_REPORTING_WAZE_ASKS_INSIGHT_FEEDBACK_SILENT_ENABLED.b();
        x.e(boolB6, "getValue(...)");
        this.f14885h = boolB6.booleanValue();
    }

    public final long a() {
        return this.f14879b;
    }

    public final long b() {
        return this.f14878a;
    }

    public final boolean c() {
        return !e() && this.f14882e && this.f14883f && !this.f14884g;
    }

    public final boolean d() {
        return this.f14885h;
    }

    public final boolean e() {
        return (this.f14880c && this.f14881d) ? false : true;
    }
}
