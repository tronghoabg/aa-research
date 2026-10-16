package com.waze.bw.b.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements q {
    @Override // com.waze.bw.b.a.q
    public final long a() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_SUGGESTIONS_REFRESH_METERS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }

    @Override // com.waze.bw.b.a.q
    public final long b() {
        Long lB = ConfigValues.CONFIG_VALUE_START_STATE_LOCATION_FIX_FRESHNESS_SECONDS.b();
        x.e(lB, "getValue(...)");
        return lB.longValue();
    }
}
