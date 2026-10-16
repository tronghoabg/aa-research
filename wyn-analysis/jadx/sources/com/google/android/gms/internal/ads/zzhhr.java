package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhhr {
    public static final zzhhr zza = new zzhhr("ASSUME_AES_GCM");
    public static final zzhhr zzb = new zzhhr("ASSUME_XCHACHA20POLY1305");
    public static final zzhhr zzc = new zzhhr("ASSUME_CHACHA20POLY1305");
    public static final zzhhr zzd = new zzhhr("ASSUME_AES_CTR_HMAC");
    public static final zzhhr zze = new zzhhr("ASSUME_AES_EAX");
    public static final zzhhr zzf = new zzhhr("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzhhr(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
