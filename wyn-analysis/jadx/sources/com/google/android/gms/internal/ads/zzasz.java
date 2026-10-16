package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzasz {
    private int zza = UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL;
    private int zzb;

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final void zzc(zzatu zzatuVar) throws zzatu {
        int i5 = this.zzb + 1;
        this.zzb = i5;
        int i10 = this.zza;
        this.zza = i10 + i10;
        if (i5 > 1) {
            throw zzatuVar;
        }
    }
}
