package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfkd implements zzetz {
    final /* synthetic */ zzfke zza;

    public zzfkd(zzfke zzfkeVar) {
        Objects.requireNonNull(zzfkeVar);
        this.zza = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfke zzfkeVar = this.zza;
        synchronized (zzfkeVar) {
            zzfkeVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zzb(Object obj) {
        zzfke zzfkeVar = this.zza;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkeVar) {
            try {
                zzfkeVar.zzx(zzdvuVar);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeC)).booleanValue()) {
                    zzdvuVar.zzh().zza = zzfkeVar.zzv();
                }
                zzfkeVar.zzw().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
