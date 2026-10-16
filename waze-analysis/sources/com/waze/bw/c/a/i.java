package com.waze.bw.c.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i implements h {
    @Override // com.waze.bw.c.a.h
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_LEAVE_NOW_THRESHOLD_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_SHORTCUT_PROXIMITY_THRESHOLD_METERS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long c() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_V2_FAVORITES_CAROUSEL_MAX_ITEMS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long d() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_MAX_CELLS_TO_REQUEST_ETA.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long e() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_SEARCH_NUM_LOCAL_RECENT_DESTINATIONS_TO_DISPLAY.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long f() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_SEARCH_NUM_LOCAL_EVENTS_TO_DISPLAY.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final long g() {
        Long lB = ConfigValues.CONFIG_VALUE_REWIRE_START_STATE_ROAMING_MINIMIZE_TIMOUT_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.c.a.h
    public final String h() {
        String strB = ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.bw.c.a.h
    public final boolean i() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_START_STATE_V2_FAVORITES_CAROUSEL_HOME_WORK_SET_SUBTITLE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
