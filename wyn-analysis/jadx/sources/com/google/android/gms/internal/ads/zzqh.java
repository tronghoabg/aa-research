package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* loaded from: classes3.dex */
public final class zzqh {
    public static final zzqh zza;
    public final String zzb;
    private final zzqg zzc;

    static {
        new zzqh("");
        zza = new zzqh("preload");
    }

    public zzqh(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzqg() : null;
    }

    public final synchronized LogSessionId zza() {
        zzqg zzqgVar;
        zzqgVar = this.zzc;
        if (zzqgVar == null) {
            throw null;
        }
        return zzqgVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzqg zzqgVar = this.zzc;
        if (zzqgVar == null) {
            throw null;
        }
        LogSessionId logSessionId2 = zzqgVar.zza;
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        zzgtr.zzi(logSessionId2.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzqgVar.zza = logSessionId;
    }
}
