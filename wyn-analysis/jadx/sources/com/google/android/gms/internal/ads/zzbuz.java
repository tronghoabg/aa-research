package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbuz implements zzbqn {
    private final zzcgd zza;

    public zzbuz(zzbvb zzbvbVar, zzcgd zzcgdVar) {
        Objects.requireNonNull(zzbvbVar);
        this.zza = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e7) {
            this.zza.zzd(e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbue());
            } else {
                this.zza.zzd(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
