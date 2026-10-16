package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC1732v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzafz implements zzadq {
    private String zza = zzafx.REFRESH_TOKEN.toString();
    private String zzb;

    public zzafz(String str) {
        AbstractC1732v.f(str);
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", this.zza);
        jSONObject.put("refreshToken", this.zzb);
        return jSONObject.toString();
    }
}
