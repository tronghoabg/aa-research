package com.waze.bl.b.c;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class z implements com.waze.bl.c.c.l {
    @Override // com.waze.bl.c.c.l
    public final boolean a() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_MAP_ISSUE_USER_DID_SEE_DISCLAIMER.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
