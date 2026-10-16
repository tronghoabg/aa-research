package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzcdk implements zzhcc {
    final /* synthetic */ p8.p zza;

    public zzcdk(zzcdp zzcdpVar, p8.p pVar) {
        this.zza = pVar;
        Objects.requireNonNull(zzcdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzcdp.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcdp.zzc.remove(this.zza);
    }
}
