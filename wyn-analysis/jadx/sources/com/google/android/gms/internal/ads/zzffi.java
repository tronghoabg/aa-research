package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzffi implements zzfcq {
    private final String zza;

    public zzffi(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.zza;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Fe.e.c0("pii", jSONObject).put("adsid", str);
        } catch (JSONException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed putting trustless token.", e7);
        }
    }
}
