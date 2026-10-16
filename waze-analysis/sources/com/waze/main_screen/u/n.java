package com.waze.main_screen.u;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27717a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27718b;

    /* renamed from: c, reason: collision with root package name */
    private final String f27719c;

    /* renamed from: d, reason: collision with root package name */
    private final long f27720d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27721e;

    public n() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_DESTINATION_SUGGESTIONS_TIMEOUT_MS.b();
        h.g.b.x.e(lB, "getValue(...)");
        lB.longValue();
        Boolean boolB = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS.b();
        h.g.b.x.e(boolB, "getValue(...)");
        this.f27717a = boolB.booleanValue();
        Boolean boolB2 = ConfigValues.CONFIG_VALUE_ADS_INVENTORY_PREDICTION_ENABLED.b();
        h.g.b.x.e(boolB2, "getValue(...)");
        boolB2.booleanValue();
        String strB = ConfigValues.CONFIG_VALUE_START_STATE_V2_PREDICTION_CARD_TIMER_BEHAVIOR.b();
        h.g.b.x.e(strB, "getValue(...)");
        this.f27718b = strB;
        String strB2 = ConfigValues.CONFIG_VALUE_START_STATE_V2_RESUME_CARD_TIMER_BEHAVIOR.b();
        h.g.b.x.e(strB2, "getValue(...)");
        this.f27719c = strB2;
        h.o.c cVar = h.o.a.f48264a;
        Long lB2 = ConfigValues.CONFIG_VALUE_START_STATE_V2_PREDICTION_CARD_TIMER_SECONDS.b();
        h.g.b.x.e(lB2, "getValue(...)");
        long jLongValue = lB2.longValue();
        h.o.d dVar = h.o.d.f48273d;
        this.f27720d = h.o.c.j(jLongValue, dVar);
        Long lB3 = ConfigValues.CONFIG_VALUE_START_STATE_V2_PREDICTION_CARD_ROAMING_TIMEOUT_SECONDS.b();
        h.g.b.x.e(lB3, "getValue(...)");
        this.f27721e = h.o.c.j(lB3.longValue(), dVar);
    }

    public final long a() {
        return this.f27721e;
    }

    public final long b() {
        return this.f27720d;
    }

    public final String c() {
        return this.f27718b;
    }

    public final String d() {
        return this.f27719c;
    }

    public final boolean e() {
        return this.f27717a;
    }
}
