package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import j$.util.Objects;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class zzdun implements zzbly {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzduo zzb;

    public zzdun(zzduo zzduoVar, String str) {
        Objects.requireNonNull(zzduoVar);
        this.zzb = zzduoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza() {
        zzduo zzduoVar = this.zzb;
        if (zzduoVar.zzc() != null) {
            zzduoVar.zzc().zza(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final JSONObject zzd() {
        return null;
    }
}
