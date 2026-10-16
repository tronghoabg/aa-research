package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbic;

/* loaded from: classes3.dex */
public final class zzdwc implements zzimz {
    private final zzini zza;

    private zzdwc(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdwc zza(zzini zziniVar) {
        return new zzdwc(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbic.zza.EnumC0140zza enumC0140zza = ((zzdcq) this.zza).zza().zzp.zza == 3 ? zzbic.zza.EnumC0140zza.REWARDED_INTERSTITIAL : zzbic.zza.EnumC0140zza.REWARD_BASED_VIDEO_AD;
        zzinh.zzb(enumC0140zza);
        return enumC0140zza;
    }
}
