package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* loaded from: classes3.dex */
public final class zzhvb {
    public static final zzhvb zza = new zzhvb("NIST_P256", zzhlt.zza);
    public static final zzhvb zzb = new zzhvb("NIST_P384", zzhlt.zzb);
    public static final zzhvb zzc = new zzhvb("NIST_P521", zzhlt.zzc);
    private final String zzd;
    private final ECParameterSpec zze;

    private zzhvb(String str, ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final String toString() {
        return this.zzd;
    }

    public final ECParameterSpec zza() {
        return this.zze;
    }
}
