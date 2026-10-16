package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhfr {
    public static final zzhfr zza = new zzhfr("SHA1");
    public static final zzhfr zzb = new zzhfr("SHA224");
    public static final zzhfr zzc = new zzhfr("SHA256");
    public static final zzhfr zzd = new zzhfr("SHA384");
    public static final zzhfr zze = new zzhfr("SHA512");
    private final String zzf;

    private zzhfr(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
