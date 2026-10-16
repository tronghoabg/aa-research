package com.google.android.gms.internal.ads;

import D6.C0395s;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzflj {
    private final JSONObject zza;

    public zzflj(JSONObject jSONObject) {
        this.zza = jSONObject;
    }

    public final String zza() {
        if (zzc() - 1 != 1) {
            return "javascript";
        }
        return null;
    }

    public final boolean zzb() {
        return this.zza.optBoolean((String) C0395s.f2489e.f2492c.zzd(zzbix.zzgv), true);
    }

    public final int zzc() {
        int iOptInt = this.zza.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
