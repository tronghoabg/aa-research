package com.waze.search;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements com.waze.search.h.a {
    @Override // com.waze.search.h.a
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_ND4C_ALGO_TRANSPARENCY_FEATURE_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
