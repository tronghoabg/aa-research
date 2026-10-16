package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbzo {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbzo(boolean z2, String str, boolean z10) {
        this.zza = z2;
        this.zzb = str;
        this.zzc = z10;
    }

    public static zzbzo zza(JSONObject jSONObject) {
        return new zzbzo(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", ""), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
