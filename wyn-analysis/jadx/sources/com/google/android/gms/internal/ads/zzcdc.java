package com.google.android.gms.internal.ads;

import D6.K0;

/* loaded from: classes3.dex */
public final class zzcdc extends zzccv {
    private final R6.d zza;
    private final R6.c zzb;

    public zzcdc(R6.d dVar, R6.c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        R6.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(K0 k02) {
        R6.d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdFailedToLoad(k02.W());
        }
    }
}
