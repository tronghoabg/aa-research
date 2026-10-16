package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC1732v;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahy implements zzadq {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze;

    public zzahy(String str, String str2, String str3, String str4) {
        AbstractC1732v.f(str);
        this.zza = str;
        AbstractC1732v.f(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadq
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zza);
        jSONObject.put("password", this.zzb);
        jSONObject.put("returnSecureToken", this.zze);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        String str2 = this.zzd;
        if (str2 != null) {
            zzaid.zza(jSONObject, "captchaResponse", str2);
        } else {
            zzaid.zza(jSONObject);
        }
        return jSONObject.toString();
    }
}
