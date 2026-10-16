package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzbol extends zzbnv {
    private final A6.n zza;

    public zzbol(A6.n nVar) {
        this.zza = nVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzboc zzbocVar) {
        zzbod zzbodVar = new zzbod(zzbocVar);
        com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.zza;
        eVar.getClass();
        com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
        aVar.f5716l = new Bundle();
        aVar.f5706a = zzbodVar.zza();
        aVar.f5707b = zzbodVar.zzb();
        aVar.f5708c = zzbodVar.zzc();
        aVar.f5709d = zzbodVar.zzd();
        aVar.f5710e = zzbodVar.zze();
        aVar.f5711f = zzbodVar.zzf();
        aVar.f5712g = zzbodVar.zzg();
        aVar.f5713h = zzbodVar.zzh();
        aVar.f5714i = zzbodVar.zzi();
        aVar.k = zzbodVar.zzk();
        aVar.f5717m = true;
        aVar.f5718n = true;
        aVar.f5715j = zzbodVar.zzj();
        eVar.f26249b.onAdLoaded(eVar.f26248a, aVar);
    }
}
