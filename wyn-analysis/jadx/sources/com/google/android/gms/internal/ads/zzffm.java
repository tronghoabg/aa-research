package com.google.android.gms.internal.ads;

import D6.C0392q;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzffm implements zzfcq {
    private final Map zza;

    public zzffm(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).put("video_decoders", C0392q.f2477g.f2478a.l(this.zza));
        } catch (JSONException e7) {
            G6.L.k("Could not encode video decoder properties: ".concat(String.valueOf(e7.getMessage())));
        }
    }
}
