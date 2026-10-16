package com.google.android.gms.internal.ads;

import D6.C0392q;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfev implements zzfcq {
    private final Bundle zza;

    public zzfev(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                Fe.e.c0("play_store", Fe.e.c0("device", jSONObject)).put("parental_controls", C0392q.f2477g.f2478a.m(bundle));
            } catch (JSONException unused) {
                G6.L.k("Failed putting parental controls bundle.");
            }
        }
    }
}
