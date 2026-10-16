package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfhv implements zzfie {
    private final zzfie zza;
    private zzdch zzb;

    public zzfhv(zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.zzb;
    }

    public final synchronized p8.p zzb(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcbk zzcbkVar;
        this.zzb = zzdchVar;
        if (zzdchVar == null || (zzcbkVar = zzfifVar.zza) == null) {
            return ((zzfhu) this.zza).zzb(zzfifVar, zzfidVar, zzdchVar);
        }
        zzcze zzczeVarZza = zzdchVar.zza();
        return zzczeVarZza.zzc(zzczeVarZza.zza(zzhcf.zza(zzcbkVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ p8.p zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }
}
