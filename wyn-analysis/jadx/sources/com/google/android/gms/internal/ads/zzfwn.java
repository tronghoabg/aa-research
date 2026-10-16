package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfwn {
    private static UiModeManager zza;

    public static void zza(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static zzfva zzb() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfva.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? zzfva.OTHER : zzfva.CTV : zzfva.MOBILE;
    }
}
