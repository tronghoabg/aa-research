package com.waze.speech;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final long f40438a;

    /* renamed from: b, reason: collision with root package name */
    private final long f40439b;

    /* renamed from: c, reason: collision with root package name */
    private final long f40440c;

    /* renamed from: d, reason: collision with root package name */
    private final long f40441d;

    public h() {
        Long lB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SILENCE_BASELINE_DURATION_MILLIS.b();
        h.g.b.x.e(lB, "getValue(...)");
        this.f40438a = lB.longValue();
        Long lB2 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SILENCE_DURATION_MILLIS.b();
        h.g.b.x.e(lB2, "getValue(...)");
        this.f40439b = lB2.longValue();
        Long lB3 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_SILENCE_RMS_MULTIPLIER.b();
        h.g.b.x.e(lB3, "getValue(...)");
        this.f40440c = lB3.longValue();
        h.o.c cVar = h.o.a.f48264a;
        Long lB4 = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_MIN_LISTENING_TIME_SECONDS.b();
        h.g.b.x.e(lB4, "getValue(...)");
        this.f40441d = h.o.c.j(lB4.longValue(), h.o.d.f48273d);
    }

    public final long a() {
        return this.f40441d;
    }

    public final long b() {
        return this.f40438a;
    }

    public final long c() {
        return this.f40439b;
    }

    public final long d() {
        return this.f40440c;
    }
}
