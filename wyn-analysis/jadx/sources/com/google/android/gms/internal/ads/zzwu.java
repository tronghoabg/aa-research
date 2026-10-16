package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
final class zzwu implements zzzf {
    private final zzzf zza;
    private final zzgwt zzb;

    public zzwu(zzzf zzzfVar, List list) {
        this.zza = zzzfVar;
        this.zzb = zzgwt.zzq(list);
    }

    public final zzgwt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        return this.zza.zzd(zzmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j8) {
        this.zza.zzf(j8);
    }
}
