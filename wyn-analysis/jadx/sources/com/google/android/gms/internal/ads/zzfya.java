package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzfya {
    private final Context zza;
    private final Looper zzb;

    public zzfya(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfyk zzfykVarZza = zzfym.zza();
        Context context = this.zza;
        zzfykVarZza.zza(context.getPackageName());
        zzfykVarZza.zzc(2);
        zzfyi zzfyiVarZza = zzfyj.zza();
        zzfyiVarZza.zza(str);
        zzfyiVarZza.zzb(2);
        zzfykVarZza.zzb(zzfyiVarZza);
        new zzfyb(context, this.zzb, (zzfym) zzfykVarZza.zzbu()).zza();
    }
}
