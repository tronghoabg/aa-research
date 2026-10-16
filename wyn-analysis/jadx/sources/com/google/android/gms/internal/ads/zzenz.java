package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzenz implements zzdnw {
    final /* synthetic */ zzemd zza;
    final /* synthetic */ zzfkn zzb;
    final /* synthetic */ zzeoa zzc;

    public zzenz(zzeoa zzeoaVar, zzemd zzemdVar, zzfkn zzfknVar) {
        this.zza = zzemdVar;
        this.zzb = zzfknVar;
        Objects.requireNonNull(zzeoaVar);
        this.zzc = zzeoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) throws zzdnv {
        try {
            zzfme zzfmeVar = (zzfme) this.zza.zzb;
            zzfmeVar.zzs(z2);
            if (this.zzc.zzc().f4929c < ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzbx)).intValue()) {
                zzfmeVar.zzd();
            } else {
                zzfmeVar.zze(context);
            }
        } catch (zzfln e7) {
            int i5 = G6.L.f4523b;
            H6.l.e("Cannot show interstitial.");
            throw new zzdnv(e7.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zzb;
    }
}
