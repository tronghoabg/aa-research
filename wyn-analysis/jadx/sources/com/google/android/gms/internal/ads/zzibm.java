package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzibm {
    private final zzibk zza;

    private zzibm(zzibk zzibkVar) {
        this.zza = zzibkVar;
    }

    public static zzibm zza(byte[] bArr, zzhey zzheyVar) {
        return new zzibm(zzibk.zza(bArr));
    }

    public static zzibm zzb(int i5) {
        return new zzibm(zzibk.zza(zzhoc.zza(i5)));
    }

    public final byte[] zzc(zzhey zzheyVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
