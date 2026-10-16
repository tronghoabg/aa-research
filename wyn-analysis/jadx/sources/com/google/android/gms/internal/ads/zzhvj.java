package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* loaded from: classes3.dex */
public final class zzhvj extends zzhxv {
    private final zzhvf zza;
    private final ECPoint zzb;
    private final zzibk zzc;
    private final Integer zzd;

    public /* synthetic */ zzhvj(zzhvf zzhvfVar, ECPoint eCPoint, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhvfVar;
        this.zzb = eCPoint;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhvi zzc() {
        return new zzhvi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxv, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzd;
    }

    public final ECPoint zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxv
    public final zzibk zze() {
        return this.zzc;
    }

    public final zzhvf zzf() {
        return this.zza;
    }
}
