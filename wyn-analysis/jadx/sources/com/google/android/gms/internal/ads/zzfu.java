package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzfu {
    private boolean zza;

    public zzfu(Context context, Looper looper, zzdp zzdpVar) {
        context.getApplicationContext();
        zzdpVar.zzd(looper, null);
        zzdpVar.zzd(Looper.getMainLooper(), null);
    }

    public final void zza(boolean z2) {
        if (this.zza == z2) {
            return;
        }
        this.zza = z2;
    }
}
