package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzeqr implements zzdnw {
    final /* synthetic */ zzemd zza;
    final /* synthetic */ zzfkn zzb;

    public zzeqr(zzeqt zzeqtVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.zza = zzemdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzeqtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.zza.zzb;
            zzfmeVar.zzs(z2);
            zzfmeVar.zzm();
        } catch (zzfln e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Cannot show rewarded video.", e7);
            throw new zzdnv(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
