package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbkw {
    public static final zzbkh zza = new zzbkh("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbkh zzb = new zzbkh("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbkh zzc = zzbkh.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbkh zzd = zzbkh.zza("gads:gma_attestation:click:enable", false);
    public static final zzbkh zze = zzbkh.zzb("gads:gma_attestation:click:enable_dynamite_version", Long.MAX_VALUE);
    public static final zzbkh zzf = zzbkh.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbkh zzg = zzbkh.zza("gads:gma_attestation:image_hash", false);
    public static final zzbkh zzh = zzbkh.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbkh zzi;

    static {
        zzbkh.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbkh.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbkh.zza("gads:gma_attestation:click:report_error", true);
    }
}
