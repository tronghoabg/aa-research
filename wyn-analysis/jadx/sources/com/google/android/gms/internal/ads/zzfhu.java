package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfhu implements zzfie {
    private zzdch zza;

    @Override // com.google.android.gms.internal.ads.zzfie
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.zza;
    }

    public final synchronized p8.p zzb(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcze zzczeVarZza;
        try {
            if (zzdchVar != null) {
                this.zza = zzdchVar;
            } else {
                this.zza = (zzdch) zzfidVar.zza(zzfifVar.zzb).zzh();
            }
            zzczeVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ p8.p zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }
}
