package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtt implements zzcgh {
    final /* synthetic */ zzbtv zza;

    public zzbtt(zzbtv zzbtvVar) {
        Objects.requireNonNull(zzbtvVar);
        this.zza = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        G6.L.k("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
