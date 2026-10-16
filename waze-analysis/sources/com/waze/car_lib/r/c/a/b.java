package com.waze.car_lib.r.c.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {
    @Override // com.waze.car_lib.r.c.a.a
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_V2_PREDICTION_CARD_ROAMING_TIMEOUT_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.car_lib.r.c.a.a
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_V2_PREDICTION_CARD_TIMER_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.car_lib.r.c.a.a
    public final String c() {
        String strB = ConfigValues.CONFIG_VALUE_START_STATE_V2_IN_CAR_PREDICTION_CARD_TIMER_BEHAVIOR.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.car_lib.r.c.a.a
    public final String d() {
        String strB = ConfigValues.CONFIG_VALUE_START_STATE_V2_IN_CAR_RESUME_CARD_TIMER_BEHAVIOR.b();
        x.e(strB, "getValue(...)");
        return strB;
    }
}
