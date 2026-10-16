package com.waze.bl.b.c;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.bk;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q implements bk {
    @Override // com.waze.reports_v2.c.bk
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_AGENT_ENABLED.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
