package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzblm {
    public static final zzbkh zza = zzbkh.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbkh zzb;

    static {
        zzbkh.zza("gads:invalidate_token_at_refresh_start", true);
        zzbkh.zza("gms:expose_token_for_gma:enabled", true);
        zzbkh.zza("gads:referesh_rate_limit", false);
        zzb = zzbkh.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbkh.zza("gads:token_anonymization:enabled", true);
        zzbkh.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
