package com.waze.car_lib.f;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cj implements fv {
    @Override // com.waze.car_lib.f.fv
    public final void a(boolean z) {
        ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_USER_DECLINED_PERMISSION.d(Boolean.valueOf(z));
    }

    @Override // com.waze.car_lib.f.fv
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_ACTIVATION_DIALOG_USER_DECLINED_PERMISSION.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
