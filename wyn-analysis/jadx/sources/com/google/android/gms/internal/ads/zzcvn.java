package com.google.android.gms.internal.ads;

import D6.A0;
import D6.C0395s;
import D6.H0;
import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzcvn extends zzbgp {
    private final zzcvm zza;
    private final D6.L zzb;
    private final zzfgm zzc;
    private boolean zzd;
    private final zzdzt zze;

    public zzcvn(zzcvm zzcvmVar, D6.L l10, zzfgm zzfgmVar, zzdzt zzdztVar) {
        this.zza = zzcvmVar;
        this.zzb = l10;
        this.zzc = zzfgmVar;
        this.zze = zzdztVar;
        zzbio zzbioVar = zzbix.zzbv;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.zzd = true;
        } else {
            this.zzd = ((Boolean) c0395s.f2492c.zzd(zzbix.zzbw)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final D6.L zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(InterfaceC3876a interfaceC3876a, zzbgx zzbgxVar) {
        try {
            this.zzc.zzp(zzbgxVar);
            this.zza.zzb((Activity) BinderC3877b.S(interfaceC3876a), zzbgxVar, this.zzd);
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final H0 zzg() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzh(boolean z2) {
        this.zzd = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(A0 a02) {
        AbstractC1732v.e("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!a02.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
            }
            this.zzc.zzr(a02);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final long zzk() {
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar == null || zzcvmVar.zzo() == null) {
            return 0L;
        }
        return zzcvmVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl(long j8) {
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar == null || zzcvmVar.zzo() == null) {
            return;
        }
        zzcvmVar.zzo().zzb(j8);
    }
}
