package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbog extends zzbnl {
    final /* synthetic */ zzboi zza;

    public /* synthetic */ zzbog(zzboi zzboiVar, byte[] bArr) {
        Objects.requireNonNull(zzboiVar);
        this.zza = zzboiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(zzbnc zzbncVar, String str) {
        zzboi zzboiVar = this.zza;
        if (zzboiVar.zzd() == null) {
            return;
        }
        zzbnd zzbndVarZze = zzboiVar.zze(zzbncVar);
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) zzboiVar.zzd();
        eVar.f26249b.zzd(eVar.f26248a, zzbndVarZze, str);
    }
}
