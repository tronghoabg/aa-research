package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfww {
    private JSONObject zza;
    private final zzfxf zzb;

    public zzfww(zzfxf zzfxfVar) {
        this.zzb = zzfxfVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.zzb.zza(new zzfxi(this, hashSet, jSONObject, j8));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.zzb.zza(new zzfxh(this, hashSet, jSONObject, j8));
    }

    public final void zzc() {
        this.zzb.zza(new zzfxg(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
