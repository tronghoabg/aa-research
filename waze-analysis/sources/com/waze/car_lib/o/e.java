package com.waze.car_lib.o;

import android.view.View;
import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e implements com.waze.settings.tree.c.b {
    @Override // com.waze.settings.tree.c.b
    public final boolean Q() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING.b();
        h.g.b.x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.settings.tree.c.b
    public final void R(View view, boolean z) {
        ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING.d(Boolean.valueOf(z));
        ConfigValues.CONFIG_VALUE_ADS_ALLOW_PROFILE_TARGETING_SELECTION_STATUS.d("set");
    }

    @Override // com.waze.settings.tree.c.b
    public final /* synthetic */ boolean S(View view, boolean z) {
        return true;
    }
}
