package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfeo implements zzfcq {
    private final String zza;
    private final String zzb;

    public zzfeo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        try {
            JSONObject jSONObjectC0 = Fe.e.c0("pii", (JSONObject) obj);
            jSONObjectC0.put("doritos", this.zza);
            jSONObjectC0.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            G6.L.k("Failed putting doritos string.");
        }
    }
}
