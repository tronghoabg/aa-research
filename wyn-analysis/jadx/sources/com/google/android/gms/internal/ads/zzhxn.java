package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class zzhxn extends zzhxv {
    private final zzhxj zza;
    private final BigInteger zzb;
    private final zzibk zzc;
    private final Integer zzd;

    public /* synthetic */ zzhxn(zzhxj zzhxjVar, BigInteger bigInteger, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhxjVar;
        this.zzb = bigInteger;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhxm zzc() {
        return new zzhxm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhxv, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzd;
    }

    public final BigInteger zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxv
    public final zzibk zze() {
        return this.zzc;
    }

    public final zzhxj zzf() {
        return this.zza;
    }
}
