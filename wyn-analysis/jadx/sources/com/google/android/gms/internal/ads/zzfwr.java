package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes3.dex */
public final class zzfwr {
    private static int zza = 2;

    public static void zza(Context context) {
        context.registerReceiver(new zzfwq(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfwn.zzb() != zzfva.CTV) {
            return 2;
        }
        return zza;
    }
}
