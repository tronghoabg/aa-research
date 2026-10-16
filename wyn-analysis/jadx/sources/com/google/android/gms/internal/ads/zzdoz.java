package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdoz implements zzimz {
    private final zzdox zza;

    private zzdoz(zzdox zzdoxVar) {
        this.zza = zzdoxVar;
    }

    public static zzdoz zzc(zzdox zzdoxVar) {
        return new zzdoz(zzdoxVar);
    }

    public static JSONObject zzd(zzdox zzdoxVar) {
        JSONObject jSONObjectZzc = zzdoxVar.zzc();
        zzinh.zzb(jSONObjectZzc);
        return jSONObjectZzc;
    }

    public final JSONObject zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
