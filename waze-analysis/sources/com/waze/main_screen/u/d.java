package com.waze.main_screen.u;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class d {
    public d() {
    }

    public static boolean b() {
        Boolean boolA = ConfigValues.CONFIG_VALUE_START_STATE_SETTINGS_ALLOW_TRIP_FORECASTS.b();
        h.g.b.x.e(boolA, "getValue(...)");
        return boolA.booleanValue();
    }

    public /* synthetic */ d(byte[] bArr, byte[] bArr2) {
    }
}
