package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgge implements zzhbn {
    final /* synthetic */ zzggj zza;

    public zzgge(zzggj zzggjVar) {
        Objects.requireNonNull(zzggjVar);
        this.zza = zzggjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ p8.p zza(Object obj) throws Exception {
        zzggc zzggcVar = (zzggc) obj;
        if (zzggcVar != null) {
            return zzhcf.zza(zzggcVar);
        }
        zzggj zzggjVar = this.zza;
        zzggjVar.zza().zzb(51);
        return zzggjVar.zzd(zzggjVar.zze());
    }
}
