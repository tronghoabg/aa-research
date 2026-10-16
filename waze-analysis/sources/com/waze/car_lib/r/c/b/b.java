package com.waze.car_lib.r.c.b;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {
    @Override // com.waze.car_lib.r.c.b.a
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_VENUES_RTL_ADDRESSES.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
