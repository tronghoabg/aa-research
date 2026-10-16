package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.AbstractC3601f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzagu {
    private List<zzagr> zza;

    public zzagu() {
        this.zza = new ArrayList();
    }

    public static zzagu zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzagu(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i5);
            arrayList.add(jSONObject == null ? new zzagr() : new zzagr(AbstractC3601f.a(jSONObject.optString("federatedId", null)), AbstractC3601f.a(jSONObject.optString("displayName", null)), AbstractC3601f.a(jSONObject.optString("photoUrl", null)), AbstractC3601f.a(jSONObject.optString("providerId", null)), null, AbstractC3601f.a(jSONObject.optString("phoneNumber", null)), AbstractC3601f.a(jSONObject.optString("email", null))));
        }
        return new zzagu(arrayList);
    }

    private zzagu(List<zzagr> list) {
        if (!list.isEmpty()) {
            this.zza = DesugarCollections.unmodifiableList(list);
        } else {
            this.zza = Collections.EMPTY_LIST;
        }
    }

    public final List<zzagr> zza() {
        return this.zza;
    }
}
