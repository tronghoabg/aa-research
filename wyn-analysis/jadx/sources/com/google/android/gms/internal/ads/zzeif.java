package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes3.dex */
final /* synthetic */ class zzeif implements zzfos {
    static final /* synthetic */ zzeif zza = new zzeif();

    private /* synthetic */ zzeif() {
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        G6.L.k("Ad request signals:");
        G6.L.k(jSONObject.toString(2));
        return jSONObject;
    }
}
