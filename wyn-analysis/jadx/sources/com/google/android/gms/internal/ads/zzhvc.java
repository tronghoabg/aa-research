package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhvc {
    public static final zzhvc zza = new zzhvc("SHA256");
    public static final zzhvc zzb = new zzhvc("SHA384");
    public static final zzhvc zzc = new zzhvc("SHA512");
    private final String zzd;

    private zzhvc(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
