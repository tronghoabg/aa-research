package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfec implements zzfcq {
    final String zza;
    final int zzb;

    public zzfec(String str, int i5) {
        this.zza = str;
        this.zzb = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) throws JSONException {
        int i5;
        String str = this.zza;
        JSONObject jSONObject = (JSONObject) obj;
        if (TextUtils.isEmpty(str) || (i5 = this.zzb) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectC0 = Fe.e.c0("pii", jSONObject);
            jSONObjectC0.put("pvid", str);
            jSONObjectC0.put("pvid_s", i5);
        } catch (JSONException e7) {
            G6.L.l("Failed putting gms core app set ID info.", e7);
        }
    }
}
