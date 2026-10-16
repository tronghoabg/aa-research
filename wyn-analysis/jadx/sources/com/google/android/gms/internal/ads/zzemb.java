package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzemb implements zzema {
    public final zzema zza;
    private final zzgti zzb;

    public zzemb(zzema zzemaVar, zzgti zzgtiVar) {
        this.zza = zzemaVar;
        this.zzb = zzgtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        return this.zza.zza(zzfkyVar, zzfknVar);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(zzfky zzfkyVar, zzfkn zzfknVar) {
        return zzhcf.zzk(this.zza.zzb(zzfkyVar, zzfknVar), this.zzb, zzcfy.zza);
    }
}
