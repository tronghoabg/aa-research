package com.waze.stats.a;

import com.waze.config.ConfigValues;
import com.waze.stats.m;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a implements m {
    @Override // com.waze.stats.m
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GENERAL_TEMPORARY_DYNAMIC_EVENT_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.stats.m
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_AD_EVENTS_FEATURE_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
