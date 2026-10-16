package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzmb {
    private long zza;
    private float zzb;
    private long zzc;

    public zzmb() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzmb zza(long j8) {
        this.zza = j8;
        return this;
    }

    public final zzmb zzb(float f10) {
        boolean z2 = true;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 != -3.4028235E38f) {
            z2 = false;
        }
        zzgtr.zza(z2);
        this.zzb = f10;
        return this;
    }

    public final zzmb zzc(long j8) {
        boolean z2 = true;
        if (j8 < 0) {
            if (j8 == -9223372036854775807L) {
                j8 = -9223372036854775807L;
            } else {
                z2 = false;
            }
        }
        zzgtr.zza(z2);
        this.zzc = j8;
        return this;
    }

    public final zzmc zzd() {
        return new zzmc(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzmb(zzmc zzmcVar, byte[] bArr) {
        this.zza = zzmcVar.zza;
        this.zzb = zzmcVar.zzb;
        this.zzc = zzmcVar.zzc;
    }
}
