package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbus implements zzbqn {
    final /* synthetic */ zzbut zza;
    private final zzbtv zzb;
    private final zzcgd zzc;

    public zzbus(zzbut zzbutVar, zzbtv zzbtvVar, zzcgd zzcgdVar) {
        Objects.requireNonNull(zzbutVar);
        this.zza = zzbutVar;
        this.zzb = zzbtvVar;
        this.zzc = zzcgdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e7) {
                this.zzc.zzd(e7);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbue());
            } else {
                this.zzc.zzd(new zzbue(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zza();
            throw th;
        }
        this.zzb.zza();
    }
}
