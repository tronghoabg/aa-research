package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzyf extends zzagp {
    final /* synthetic */ zzyr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzyf(zzyr zzyrVar, zzahd zzahdVar) {
        super(zzahdVar);
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagp, com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza.zzQ();
    }
}
