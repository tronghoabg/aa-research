package com.waze.bw.a.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {
    @Override // com.waze.bw.a.a.a
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_LEAVE_NOW_THRESHOLD_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.a.a.a
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_SHORTCUT_PROXIMITY_THRESHOLD_METERS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.a.a.a
    public final long c() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_SEARCH_NUM_LOCAL_RECENT_DESTINATIONS_TO_DISPLAY.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.a.a.a
    public final long d() {
        Long lB = ConfigValues.CONFIG_VALUE_CAR_LIB_START_STATE_ROAMING_TIMEOUT_SEC.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }
}
