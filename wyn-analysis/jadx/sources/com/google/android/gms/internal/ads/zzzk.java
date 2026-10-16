package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes3.dex */
final class zzzk implements zzzd {
    private final zzzd zza;
    private final long zzb;

    public zzzk(zzzd zzzdVar, long j8) {
        this.zza = zzzdVar;
        this.zzb = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzb() throws IOException {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzc(zzly zzlyVar, zzix zzixVar, int i5) {
        int iZzc = this.zza.zzc(zzlyVar, zzixVar, i5);
        if (iZzc != -4) {
            return iZzc;
        }
        zzixVar.zzd += this.zzb;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final int zzd(long j8) {
        return this.zza.zzd(j8 - this.zzb);
    }

    public final zzzd zze() {
        return this.zza;
    }
}
