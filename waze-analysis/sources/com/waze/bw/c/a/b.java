package com.waze.bw.c.a;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {
    @Override // com.waze.bw.c.a.a
    public final String a() {
        String strB = ConfigValues.CONFIG_VALUE_CALENDAR_ACTIVATED.b();
        x.e(strB, "getValue(...)");
        return strB;
    }

    @Override // com.waze.bw.c.a.a
    public final kotlinx.coroutines.b.k b() {
        kotlinx.coroutines.b.k kVarK = ConfigValues.CONFIG_VALUE_CALENDAR_ACTIVATED.k();
        x.e(kVarK, "getFlow(...)");
        return kVarK;
    }
}
