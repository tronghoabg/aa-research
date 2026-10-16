package com.google.android.gms.internal.ads;

import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzepx implements zzdnw {
    final /* synthetic */ zzemd zza;
    final /* synthetic */ zzfkn zzb;

    public zzepx(zzepy zzepyVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.zza = zzemdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzepyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.zza.zzb;
            zzfmeVar.zzs(z2);
            zzfmeVar.zzw(context);
        } catch (zzfln e7) {
            throw new zzdnv(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
