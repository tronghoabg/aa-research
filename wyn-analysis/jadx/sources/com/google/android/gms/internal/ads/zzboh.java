package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzboh extends zzbno {
    final /* synthetic */ zzboi zza;

    public /* synthetic */ zzboh(zzboi zzboiVar, byte[] bArr) {
        Objects.requireNonNull(zzboiVar);
        this.zza = zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(zzbnc zzbncVar) {
        zzboi zzboiVar = this.zza;
        A6.m mVarZzc = zzboiVar.zzc();
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) mVarZzc;
        eVar.f26249b.zzc(eVar.f26248a, zzboiVar.zze(zzbncVar));
    }
}
