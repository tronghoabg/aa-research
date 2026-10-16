package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import q7.BinderC3877b;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
final class zzeny implements zzdnw {
    private final zzfkn zza;
    private final zzbxi zzb;
    private final EnumC4471b zzc;
    private zzddr zzd = null;

    public zzeny(zzfkn zzfknVar, zzbxi zzbxiVar, EnumC4471b enumC4471b) {
        this.zza = zzfknVar;
        this.zzb = zzbxiVar;
        this.zzc = enumC4471b;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(boolean z2, Context context, zzddm zzddmVar) throws zzdnv {
        boolean zZzk;
        try {
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzk = this.zzb.zzk(new BinderC3877b(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzk = this.zzb.zzt(new BinderC3877b(context));
                    }
                    throw new zzdnv("Adapter failed to show.");
                }
                zZzk = this.zzb.zzm(new BinderC3877b(context));
            }
            if (zZzk) {
                zzddr zzddrVar = this.zzd;
                if (zzddrVar == null) {
                    return;
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcm)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzddrVar.zza();
                return;
            }
            throw new zzdnv("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdnv(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzfkn zzb() {
        return this.zza;
    }

    public final void zzc(zzddr zzddrVar) {
        this.zzd = zzddrVar;
    }
}
