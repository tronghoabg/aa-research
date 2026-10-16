package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfvi {
    private final String zza;
    private final String zzb;

    private zzfvi(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfvi zza(String str, String str2) {
        zzfws.zzc(str, "Name is null or empty");
        zzfws.zzc(str2, "Version is null or empty");
        return new zzfvi(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
