package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhgm extends zzhfg {
    private final zzhgt zza;
    private final zzibm zzb;
    private final zzibk zzc;
    private final Integer zzd;

    public /* synthetic */ zzhgm(zzhgt zzhgtVar, zzibm zzibmVar, zzibk zzibkVar, Integer num, byte[] bArr) {
        this.zza = zzhgtVar;
        this.zzb = zzibmVar;
        this.zzc = zzibkVar;
        this.zzd = num;
    }

    public static zzhgl zzd() {
        return new zzhgl(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfg, com.google.android.gms.internal.ads.zzhdz
    public final /* synthetic */ zzheq zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Integer zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhfg
    public final zzibk zzc() {
        return this.zzc;
    }

    public final zzibm zze() {
        return this.zzb;
    }

    public final zzhgt zzf() {
        return this.zza;
    }
}
