package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfks {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    public zzfks(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectY = Fe.e.Y(jsonReader);
        this.zzd = jSONObjectY;
        this.zza = jSONObjectY.optString("ad_html", null);
        this.zzb = jSONObjectY.optString("ad_base_url", null);
        this.zzc = jSONObjectY.optJSONObject("ad_json");
    }
}
