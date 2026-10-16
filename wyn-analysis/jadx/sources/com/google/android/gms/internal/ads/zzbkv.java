package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbkv {
    public static final zzbkh zza = zzbkh.zza("gads:init:init_on_bg_thread", true);
    public static final zzbkh zzb = zzbkh.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbkh zzc = zzbkh.zza("gads:adloader_load_bg_thread", true);
    public static final zzbkh zzd = zzbkh.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbkh zze = zzbkh.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbkh zzf = zzbkh.zza("gads:banner_load_bg_thread", true);
    public static final zzbkh zzg = zzbkh.zza("gads:banner_pause_bg_thread", false);
    public static final zzbkh zzh = zzbkh.zza("gads:banner_resume_bg_thread", false);
    public static final zzbkh zzi = zzbkh.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbkh zzj;
    public static final zzbkh zzk;

    static {
        zzbkh.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbkh.zza("gads:query_info_bg_thread", true);
        zzk = zzbkh.zza("gads:rewarded_load_bg_thread", true);
    }
}
