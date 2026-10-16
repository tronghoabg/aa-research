package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeof implements zzemc {
    private final zzdxk zza;

    public zzeof(zzdxk zzdxkVar) {
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        return new zzemd(this.zza.zza(str, jSONObject), new zzenp(), str);
    }
}
