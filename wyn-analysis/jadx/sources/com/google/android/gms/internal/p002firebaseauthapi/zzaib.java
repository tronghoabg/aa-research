package com.google.android.gms.internal.p002firebaseauthapi;

import n7.AbstractC3601f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaib implements zzadt<zzaib> {
    private static final String zza = "zzaib";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaib zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = AbstractC3601f.a(jSONObject.optString("idToken", null));
            this.zzc = AbstractC3601f.a(jSONObject.optString("refreshToken", null));
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
