package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzhdc extends zzhcm {
    final /* synthetic */ zzhde zza;
    private final zzhbm zzb;

    public zzhdc(zzhde zzhdeVar, zzhbm zzhbmVar) {
        Objects.requireNonNull(zzhdeVar);
        this.zza = zzhdeVar;
        this.zzb = zzhbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzhbm zzhbmVar = this.zzb;
        p8.p pVarZza = zzhbmVar.zza();
        zzgtr.zzl(pVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbmVar);
        return pVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((p8.p) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    public final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
