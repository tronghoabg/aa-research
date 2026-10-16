package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgqn implements zzhcc {
    final /* synthetic */ zzgqm zza;

    public zzgqn(zzgqo zzgqoVar, zzgqm zzgqmVar) {
        this.zza = zzgqmVar;
        Objects.requireNonNull(zzgqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzgqm zzgqmVar = this.zza;
        zzgqmVar.zzb(th);
        zzgqmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
