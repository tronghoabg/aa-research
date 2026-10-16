package com.waze.location;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class v implements w {
    @Override // com.waze.location.w
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GPS_REDUCED_ACCURACY_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.location.w
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_GPS_USE_NON_DEVICE_FILTERING_FLOW.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
