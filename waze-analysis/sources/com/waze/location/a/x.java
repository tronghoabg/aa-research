package com.waze.location.a;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class x implements p {
    @Override // com.waze.location.a.p
    public final long a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_MIN_ISSUE_DURATION_SEC.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.location.a.p
    public final long b() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_MIN_REPORT_INTERVAL_MS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48272c);
    }

    @Override // com.waze.location.a.p
    public final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GPS_ISSUE_DETECTOR_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.location.a.p
    public final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_ALERTS_GPS_SPOOFING_ALERTER_ANDROID_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
