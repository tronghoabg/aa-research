package com.waze.beacons;

import com.waze.config.ConfigValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c implements b {
    @Override // com.waze.beacons.b
    public final void a(boolean z) {
        ConfigValues.CONFIG_VALUE_BEACONS_POPUP_OPTOUT.d(Boolean.valueOf(z));
    }

    @Override // com.waze.beacons.b
    public final boolean b() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_BEACONS_POPUP_OPTOUT.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }

    @Override // com.waze.beacons.b
    public final boolean c() {
        Boolean boolB = ConfigValues.CONFIG_VALUE_BEACONS_ANDROID_SCAN_FILTER_ENABLED.b();
        x.e(boolB, "getValue(...)");
        return boolB.booleanValue();
    }
}
