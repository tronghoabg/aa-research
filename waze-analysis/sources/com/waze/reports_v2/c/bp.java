package com.waze.reports_v2.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bp implements bk {
    @Override // com.waze.reports_v2.c.bk
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
