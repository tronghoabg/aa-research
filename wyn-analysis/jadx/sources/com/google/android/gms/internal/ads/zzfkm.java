package com.google.android.gms.internal.ads;

import D6.C0395s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzfkm {
    private final InterfaceC3596a zza;
    private final zzdzt zzb;
    private final Object zzc = new Object();
    private volatile int zze = 1;
    private volatile long zzd = 0;

    public zzfkm(InterfaceC3596a interfaceC3596a, zzdzt zzdztVar) {
        this.zza = interfaceC3596a;
        this.zzb = zzdztVar;
    }

    private final void zze() {
        ((C3597b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.zzc) {
            try {
                if (this.zze == 3) {
                    if (this.zzd + ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzha)).longValue() <= jCurrentTimeMillis) {
                        this.zze = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void zzf(int i5, int i10) {
        zze();
        Object obj = this.zzc;
        ((C3597b) this.zza).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.zze != i5) {
                    return;
                }
                this.zze = i10;
                if (this.zze == 3) {
                    this.zzd = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(boolean z2) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoM)).booleanValue()) {
            zzdzs zzdzsVarZza = this.zzb.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "mbs_state");
            zzdzsVarZza.zzc("mbs_state", true != z2 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            zzdzsVarZza.zzd();
        }
        if (z2) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzb() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 2;
        }
        return z2;
    }

    public final boolean zzc() {
        boolean z2;
        synchronized (this.zzc) {
            zze();
            z2 = this.zze == 3;
        }
        return z2;
    }

    public final void zzd() {
        zzf(2, 3);
    }
}
