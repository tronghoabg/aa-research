package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfut {
    private boolean zza;

    public final boolean zza() {
        return this.zza;
    }

    public final void zzb(Context context) {
        zzfws.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfwa.zza().zzb(context);
        zzfvr.zza().zzd(context);
        zzfwn.zza(context);
        zzfwo.zza(context);
        zzfwr.zza(context);
        zzfvx.zza().zzc(context);
        zzfvq.zza().zzc(context);
        zzfwc.zza().zzb(context);
    }
}
