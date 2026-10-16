package com.google.android.gms.internal.ads;

import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzbqm implements zzbqn {
    final /* synthetic */ zzcgd zza;

    public zzbqm(zzbqo zzbqoVar, zzcgd zzcgdVar) {
        this.zza = zzcgdVar;
        Objects.requireNonNull(zzbqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqn
    public final void zzb(String str) {
        this.zza.zzd(new zzbue(str));
    }
}
