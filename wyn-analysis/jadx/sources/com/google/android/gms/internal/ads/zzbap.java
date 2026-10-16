package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbaq zza;

    public zzbap(zzbaq zzbaqVar) {
        Objects.requireNonNull(zzbaqVar);
        this.zza = zzbaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzbaq zzbaqVar = this.zza;
        if (zzbaqVar.zzb != null) {
            return;
        }
        synchronized (zzbaq.zzd) {
            if (zzbaqVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                zBooleanValue = ((Boolean) zzbix.zzdz.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzbaq.zza = zzfzm.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                    z2 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z2 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z2);
            zzbaq.zzd.open();
        }
    }
}
