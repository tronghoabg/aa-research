package com.waze.car_lib.r.d;

import com.waze.config.ConfigValues;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class y implements g {
    @Override // com.waze.car_lib.r.d.g
    public final long a() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_AAOS_ROAMING_AUTOMATIC_START_DRIVE_DURATION_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.car_lib.r.d.g
    public final long b() {
        h.o.c cVar = h.o.a.f48264a;
        Long lB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_AAOS_START_DRIVE_TIMER_DURATION_SECONDS.b();
        h.g.b.x.e(lB, "getValue(...)");
        return h.o.c.j(lB.longValue(), h.o.d.f48273d);
    }

    @Override // com.waze.car_lib.r.d.g
    public final String c() {
        String strB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_AAOS_CONTENT_RANK.b();
        h.g.b.x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.car_lib.r.d.g
    public final boolean d() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_IN_CAR_SHOW_SINGLE_RESTRICTED_AREA_NAME.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.car_lib.r.d.g
    public final boolean e() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_AAOS_SHOW_VIA_CONTENT_LINE.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
