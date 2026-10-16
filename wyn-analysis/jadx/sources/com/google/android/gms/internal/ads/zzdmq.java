package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes3.dex */
public final class zzdmq implements zzimz {
    private final zzdml zza;

    private zzdmq(zzdml zzdmlVar) {
        this.zza = zzdmlVar;
    }

    public static zzdmq zzc(zzdml zzdmlVar) {
        return new zzdmq(zzdmlVar);
    }

    public final View zza() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzd();
    }
}
