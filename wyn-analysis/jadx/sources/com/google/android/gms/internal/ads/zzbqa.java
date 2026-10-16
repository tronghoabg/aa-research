package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzbqa {
    private boolean zza = false;
    private boolean zzb = false;
    private float zzc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public final synchronized void zza(boolean z2) {
        this.zza = z2;
        this.zzd.set(true);
    }

    public final synchronized void zzb(boolean z2, float f10) {
        this.zzb = z2;
        this.zzc = f10;
    }

    public final synchronized boolean zzc(boolean z2) {
        if (!this.zzd.get()) {
            return z2;
        }
        return this.zza;
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized float zze() {
        return this.zzc;
    }
}
