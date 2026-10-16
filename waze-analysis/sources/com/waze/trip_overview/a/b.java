package com.waze.trip_overview.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {
    @Override // com.waze.trip_overview.a.a
    public final String a() {
        String strB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_CLOSURE_MAIN_ROAD_TYPES.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.trip_overview.a.a
    public final String b() {
        String strB = ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_CLOSURES_ZOOM_LEVELS.b();
        x.e(strB, "getValue(...)");
        return strB;
    }
}
