package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtw implements zzcgh {
    final /* synthetic */ zzbtv zza;

    public zzbtw(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        G6.L.k("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbsw) obj).zzl());
    }
}
