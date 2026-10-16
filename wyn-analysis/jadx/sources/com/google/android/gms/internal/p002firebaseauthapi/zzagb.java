package com.google.android.gms.internal.p002firebaseauthapi;

import J8.H;
import java.util.ArrayList;
import java.util.List;
import n7.AbstractC3601f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagb implements zzadt<zzagb> {
    private static final String zza = "zzagb";
    private zzagd zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) throws JSONException, zzabg {
        zzagd zzagdVar;
        int i5;
        zzage zzageVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzagdVar = new zzagd(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z2 = false;
                    int i10 = 0;
                    while (i10 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                        if (jSONObject2 == null) {
                            zzageVar = new zzage();
                            i5 = i10;
                        } else {
                            i5 = i10;
                            zzageVar = new zzage(AbstractC3601f.a(jSONObject2.optString("localId", null)), AbstractC3601f.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z2), AbstractC3601f.a(jSONObject2.optString("displayName", null)), AbstractC3601f.a(jSONObject2.optString("photoUrl", null)), zzagu.zza(jSONObject2.optJSONArray("providerUserInfo")), AbstractC3601f.a(jSONObject2.optString("rawPassword", null)), AbstractC3601f.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzags.zza(jSONObject2.optJSONArray("mfaInfo")), H.W(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzageVar);
                        i10 = i5 + 1;
                        z2 = false;
                    }
                    zzagdVar = new zzagd(arrayList);
                }
            } else {
                zzagdVar = new zzagd();
            }
            this.zzb = zzagdVar;
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzaid.zza(e, zza, str);
        } catch (JSONException e10) {
            e = e10;
            throw zzaid.zza(e, zza, str);
        }
    }

    public final List<zzage> zza() {
        return this.zzb.zza();
    }
}
