package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfki implements zzetz {
    final /* synthetic */ zzfkk zza;

    public zzfki(zzfkk zzfkkVar) {
        Objects.requireNonNull(zzfkkVar);
        this.zza = zzfkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfkk zzfkkVar = this.zza;
        synchronized (zzfkkVar) {
            zzfkkVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zzb(Object obj) {
        zzfkk zzfkkVar = this.zza;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkkVar) {
            try {
                zzfkkVar.zzx(zzdvuVar);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeC)).booleanValue()) {
                    zzdvuVar.zzh().zza = zzfkkVar.zzv();
                }
                zzfkkVar.zzw().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
