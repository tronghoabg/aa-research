package com.waze.car_lib.j;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z implements y {
    @Override // com.waze.car_lib.j.y
    public final int a() {
        return (int) ConfigValues.CONFIG_VALUE_TRAFFIC_METER_DISTANCE_TO_HIDE_BEFORE_TURN_IN_METERS.b().longValue();
    }

    @Override // com.waze.car_lib.j.y
    public final int b() {
        return (int) ConfigValues.CONFIG_VALUE_TRAFFIC_METER_TIME_TO_SHOW_AFTER_TURN_IN_SECONDS.b().longValue();
    }

    @Override // com.waze.car_lib.j.y
    public final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_CAR_LIB_TRAFFIC_METER_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
