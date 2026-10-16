package com.google.android.gms.internal.ads;

import D6.A0;
import D6.C0395s;
import D6.H0;
import D6.InterfaceC0408y0;
import D6.v1;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzfke extends zzcco {
    private final zzfka zza;
    private final zzfjr zzb;
    private final String zzc;
    private final zzfkz zzd;
    private final Context zze;
    private final H6.a zzf;
    private final zzbaw zzg;
    private final zzdzt zzh;
    private zzdvu zzi;
    private boolean zzj;

    public zzfke(String str, zzfka zzfkaVar, Context context, zzfjr zzfjrVar, zzfkz zzfkzVar, H6.a aVar, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.zzc = str;
        this.zza = zzfkaVar;
        this.zzb = zzfjrVar;
        this.zzd = zzfkzVar;
        this.zze = context;
        this.zzf = aVar;
        zzbio zzbioVar = zzbix.zzbv;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzj = ((Boolean) c0395s.f2492c.zzd(zzbix.zzbu)).booleanValue();
        } else {
            this.zzj = true;
        }
        this.zzg = zzbawVar;
        this.zzh = zzdztVar;
    }

    private final synchronized void zzy(v1 v1Var, zzccw zzccwVar, int i5) throws RemoteException {
        try {
            if (!v1Var.W()) {
                boolean z2 = false;
                if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
                    if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmO)).booleanValue()) {
                        z2 = true;
                    }
                }
                if (this.zzf.f4929c < ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzmP)).intValue() || !z2) {
                    AbstractC1732v.e("#008 Must be called on the main UI thread.");
                }
            }
            zzfjr zzfjrVar = this.zzb;
            zzfjrVar.zzh(zzccwVar);
            U u10 = C6.n.f1857D.f1863c;
            if (U.h(this.zze) && v1Var.f2521s == null) {
                int i10 = G6.L.f4523b;
                H6.l.c("Failed to load the ad because app ID is missing.");
                zzfjrVar.zzdJ(zzfmi.zzd(4, null, null));
            } else {
                if (this.zzi != null) {
                    return;
                }
                zzfjt zzfjtVar = new zzfjt(null);
                zzfka zzfkaVar = this.zza;
                zzfkaVar.zzj(i5);
                zzfkaVar.zza(v1Var, this.zzc, zzfjtVar, new zzfkd(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzb(InterfaceC3876a interfaceC3876a) throws RemoteException {
        zzk(interfaceC3876a, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzc(v1 v1Var, zzccw zzccwVar) throws RemoteException {
        zzy(v1Var, zzccwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzd(v1 v1Var, zzccw zzccwVar) throws RemoteException {
        zzy(v1Var, zzccwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze(zzccs zzccsVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(InterfaceC0408y0 interfaceC0408y0) {
        if (interfaceC0408y0 == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfkc(this, interfaceC0408y0));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final Bundle zzg() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        return zzdvuVar != null ? zzdvuVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzh(zzcdd zzcddVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzfkz zzfkzVar = this.zzd;
        zzfkzVar.zza = zzcddVar.zza;
        zzfkzVar.zzb = zzcddVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        return (zzdvuVar == null || zzdvuVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized String zzj() throws RemoteException {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzn() == null) {
            return null;
        }
        return zzdvuVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzk(InterfaceC3876a interfaceC3876a, boolean z2) throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdL)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z2, (Activity) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar != null) {
            return zzdvuVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final H0 zzm() {
        zzdvu zzdvuVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue() && (zzdvuVar = this.zzi) != null) {
            return zzdvuVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzo(A0 a02) {
        AbstractC1732v.e("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!a02.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzb.zzl(a02);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzp(boolean z2) {
        AbstractC1732v.e("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized long zzq() {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzo() == null) {
            return 0L;
        }
        return zzdvuVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzr(long j8) {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzo() == null) {
            return;
        }
        zzdvuVar.zzo().zzb(j8);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzs(zzccx zzccxVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        this.zzb.zzp(zzccxVar);
    }

    public final void zzu(zzfti zzftiVar) {
        this.zzb.zzo(zzftiVar);
    }

    public final /* synthetic */ zzfkz zzv() {
        return this.zzd;
    }

    public final /* synthetic */ zzdvu zzw() {
        return this.zzi;
    }

    public final /* synthetic */ void zzx(zzdvu zzdvuVar) {
        this.zzi = zzdvuVar;
    }
}
