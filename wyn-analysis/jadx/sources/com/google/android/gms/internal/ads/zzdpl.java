package com.google.android.gms.internal.ads;

import D6.C0395s;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzdpl implements zzbex {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdpw zzb;

    public zzdpl(zzdpw zzdpwVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdpwVar);
        this.zzb = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcz)).booleanValue()) {
            synchronized (this) {
                try {
                    if (zzbewVar.zzj) {
                        zzdpw zzdpwVar = this.zzb;
                        if (zzdpwVar.zzaa() != null) {
                            zzdpwVar.zzab().put(this.zza, Boolean.TRUE);
                            if (zzdpwVar.zzaa() == null) {
                                return;
                            } else {
                                zzdpwVar.zzu(zzdpwVar.zzaa().zzdF(), zzdpwVar.zzaa().zzi(), zzdpwVar.zzaa().zzj(), true);
                            }
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (zzbewVar.zzj) {
            zzdpw zzdpwVar2 = this.zzb;
            if (zzdpwVar2.zzaa() != null) {
                zzdpwVar2.zzab().put(this.zza, Boolean.TRUE);
                if (zzdpwVar2.zzaa() == null) {
                    return;
                }
                zzdpwVar2.zzu(zzdpwVar2.zzaa().zzdF(), zzdpwVar2.zzaa().zzi(), zzdpwVar2.zzaa().zzj(), true);
            }
        }
    }
}
