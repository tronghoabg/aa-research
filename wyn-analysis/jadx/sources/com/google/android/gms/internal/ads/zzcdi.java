package com.google.android.gms.internal.ads;

import D6.K0;

/* loaded from: classes3.dex */
public final class zzcdi extends zzccv {
    private final S6.b zza;
    private final zzcdj zzb;

    public zzcdi(S6.b bVar, zzcdj zzcdjVar) {
        this.zza = bVar;
        this.zzb = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        zzcdj zzcdjVar;
        S6.b bVar = this.zza;
        if (bVar == null || (zzcdjVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzcdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(K0 k02) {
        S6.b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(k02.W());
        }
    }
}
