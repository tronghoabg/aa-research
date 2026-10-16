package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzys extends zzwz {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzys(zzyv zzyvVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzyvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i5, zzbe zzbeVar, long j8) {
        this.zzb.zzb(i5, zzbeVar, j8);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwz, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i5, zzbd zzbdVar, boolean z2) {
        this.zzb.zzd(i5, zzbdVar, z2);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
