package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;

/* loaded from: classes3.dex */
public final class zzejj implements zzden, zzddc {
    private static final Object zza = new Object();
    private static int zzb;
    private final G6.N zzc;
    private final zzejt zzd;

    public zzejj(zzejt zzejtVar, G6.N n10) {
        this.zzd = zzejtVar;
        this.zzc = n10;
    }

    private final void zzb(boolean z2) {
        int i5;
        int iIntValue;
        zzbio zzbioVar = zzbix.zzhn;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && !((G6.O) this.zzc).D()) {
            Object obj = zza;
            synchronized (obj) {
                i5 = zzb;
                iIntValue = ((Integer) c0395s.f2492c.zzd(zzbix.zzho)).intValue();
            }
            if (i5 < iIntValue) {
                this.zzd.zza(z2);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(K0 k02) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzb(true);
    }
}
