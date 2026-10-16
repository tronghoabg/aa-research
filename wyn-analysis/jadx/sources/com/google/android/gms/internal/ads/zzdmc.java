package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdmc extends zzdix {
    private boolean zzb;

    public zzdmc(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdmb.zza);
    }

    public final void zzb() {
        zzs(zzdlx.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdly.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdma.zza);
                this.zzb = true;
            }
            zzs(zzdlz.zza);
        } catch (Throwable th) {
            throw th;
        }
    }
}
