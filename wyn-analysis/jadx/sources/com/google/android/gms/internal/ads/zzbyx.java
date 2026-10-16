package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbyx extends zzbnv {
    private final com.google.android.gms.ads.nativead.d zza;

    public zzbyx(com.google.android.gms.ads.nativead.d dVar) {
        this.zza = dVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzboc zzbocVar) {
        this.zza.onNativeAdLoaded(new zzbys(zzbocVar));
    }
}
