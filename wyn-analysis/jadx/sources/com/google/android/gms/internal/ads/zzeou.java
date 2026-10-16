package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeou implements zzhcc {
    final /* synthetic */ zzfkn zza;
    final /* synthetic */ zzeov zzb;

    public zzeou(zzeov zzeovVar, zzfkn zzfknVar) {
        this.zza = zzfknVar;
        Objects.requireNonNull(zzeovVar);
        this.zzb = zzeovVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzeov zzeovVar = this.zzb;
        synchronized (zzeovVar) {
            try {
                zzeow zzeowVarZzc = zzeovVar.zzc();
                zzfkn zzfknVar = this.zza;
                zzeowVarZzc.zzc(th, zzfknVar);
                zzfkn zzfknVarZza = zzeovVar.zzc().zza();
                if (zzfknVar.zzav) {
                    while (zzfknVarZza != null) {
                        zzeovVar.zzb(zzfknVarZza);
                        zzfknVarZza = zzeovVar.zzc().zza();
                    }
                } else if (zzfknVarZza != null) {
                    zzeovVar.zzb(zzfknVarZza);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeov zzeovVar = this.zzb;
        zzepm zzepmVar = (zzepm) obj;
        synchronized (zzeovVar) {
            try {
                zzeovVar.zzc().zzb(zzepmVar, this.zza);
                zzfkn zzfknVarZza = zzeovVar.zzc().zza();
                if (zzfknVarZza != null) {
                    zzeovVar.zzb(zzfknVarZza);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
