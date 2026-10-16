package com.google.android.gms.internal.ads;

import D6.A0;
import D6.A1;
import D6.C0369e0;
import D6.C0395s;
import D6.H0;
import D6.InterfaceC0362b0;
import D6.InterfaceC0373g0;
import D6.InterfaceC0401v;
import D6.InterfaceC0407y;
import D6.L0;
import D6.O0;
import D6.r1;
import D6.v1;
import D6.x1;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzets extends D6.K {
    private final x1 zza;
    private final Context zzb;
    private final zzfiq zzc;
    private final String zzd;
    private final H6.a zze;
    private final zzetk zzf;
    private final zzfjr zzg;
    private final zzbaw zzh;
    private final zzdzt zzi;
    private zzdmh zzj;
    private boolean zzk;

    public zzets(Context context, x1 x1Var, String str, zzfiq zzfiqVar, zzetk zzetkVar, zzfjr zzfjrVar, H6.a aVar, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.zza = x1Var;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfiqVar;
        this.zzf = zzetkVar;
        this.zzg = zzfjrVar;
        this.zze = aVar;
        zzbio zzbioVar = zzbix.zzbv;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzk = ((Boolean) c0395s.f2492c.zzd(zzbix.zzbu)).booleanValue();
        } else {
            this.zzk = true;
        }
        this.zzh = zzbawVar;
        this.zzi = zzdztVar;
    }

    private final synchronized boolean zzO() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            if (!zzdmhVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    @Override // D6.L
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // D6.L
    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    @Override // D6.L
    public final void zzC(zzccc zzcccVar) {
        this.zzg.zzn(zzcccVar);
    }

    @Override // D6.L
    public final void zzD(String str) {
    }

    @Override // D6.L
    public final void zzE(String str) {
    }

    @Override // D6.L
    public final L0 zzF() {
        return null;
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) {
    }

    @Override // D6.L
    public final synchronized void zzK(boolean z2) {
        AbstractC1732v.e("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z2;
    }

    public final void zzL(zzfti zzftiVar) {
        this.zzf.zzn(zzftiVar);
    }

    public final /* synthetic */ zzdmh zzM() {
        return this.zzj;
    }

    public final /* synthetic */ void zzN(zzdmh zzdmhVar) {
        this.zzj = zzdmhVar;
    }

    @Override // D6.L
    public final void zzP(A0 a02) {
        AbstractC1732v.e("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!a02.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzf.zzp(a02);
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, D6.B b5) throws RemoteException {
        this.zzf.zzq(b5);
        zze(v1Var);
    }

    @Override // D6.L
    public final synchronized void zzR(InterfaceC3876a interfaceC3876a) {
        if (this.zzj == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) {
        this.zzf.zzr(interfaceC0373g0);
    }

    @Override // D6.L
    public final synchronized void zzT(long j8) {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzo() == null) {
            return;
        }
        zzdmhVar.zzo().zzb(j8);
    }

    @Override // D6.L
    public final synchronized long zzU() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzo() == null) {
            return 0L;
        }
        return zzdmhVar.zzo().zza();
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() {
        return null;
    }

    @Override // D6.L
    public final synchronized void zzc() {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zzc(null);
        }
    }

    @Override // D6.L
    public final synchronized boolean zzd() {
        AbstractC1732v.e("isLoaded must be called on the main UI thread.");
        return zzO();
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) {
        AbstractC1732v.e("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(interfaceC0407y);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // D6.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zze(D6.v1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.W()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zzi     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzmO     // Catch: java.lang.Throwable -> L2d
            D6.s r2 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2f
        L2b:
            r0 = r1
            goto L2f
        L2d:
            r6 = move-exception
            goto L96
        L2f:
            H6.a r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            int r2 = r2.f4929c     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbio r3 = com.google.android.gms.internal.ads.zzbix.zzmP     // Catch: java.lang.Throwable -> L2d
            D6.s r4 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzbiv r4 = r4.f2492c     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r3 = r4.zzd(r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L2d
            if (r2 < r3) goto L47
            if (r0 != 0) goto L4c
        L47:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.AbstractC1732v.e(r0)     // Catch: java.lang.Throwable -> L2d
        L4c:
            C6.n r0 = C6.n.f1857D     // Catch: java.lang.Throwable -> L2d
            G6.U r0 = r0.f1863c     // Catch: java.lang.Throwable -> L2d
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L2d
            boolean r2 = G6.U.h(r0)     // Catch: java.lang.Throwable -> L2d
            r3 = 0
            if (r2 == 0) goto L71
            D6.Q r2 = r6.f2521s     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L71
            int r6 = G6.L.f4523b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            H6.l.c(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzetk r6 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L94
            r0 = 4
            D6.K0 r0 = com.google.android.gms.internal.ads.zzfmi.zzd(r0, r3, r3)     // Catch: java.lang.Throwable -> L2d
            r6.zzdJ(r0)     // Catch: java.lang.Throwable -> L2d
            goto L94
        L71:
            boolean r2 = r5.zzO()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L94
            boolean r1 = r6.f2509f     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfmd.zzb(r0, r1)     // Catch: java.lang.Throwable -> L2d
            r5.zzj = r3     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfiq r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L2d
            D6.x1 r2 = r5.zza     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfij r3 = new com.google.android.gms.internal.ads.zzfij     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzetr r2 = new com.google.android.gms.internal.ads.zzetr     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r0.zza(r6, r1, r3, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L94:
            monitor-exit(r5)
            return r1
        L96:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzets.zze(D6.v1):boolean");
    }

    @Override // D6.L
    public final synchronized void zzf() {
        AbstractC1732v.e("pause must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zza(null);
        }
    }

    @Override // D6.L
    public final synchronized void zzg() {
        AbstractC1732v.e("resume must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zzb(null);
        }
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) {
        AbstractC1732v.e("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzo(interfaceC0362b0);
    }

    @Override // D6.L
    public final void zzj(D6.O o7) {
        AbstractC1732v.e("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // D6.L
    public final Bundle zzk() {
        AbstractC1732v.e("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // D6.L
    public final synchronized void zzl() {
        AbstractC1732v.e("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // D6.L
    public final void zzm() {
    }

    @Override // D6.L
    public final x1 zzn() {
        return null;
    }

    @Override // D6.L
    public final void zzp(zzbzr zzbzrVar) {
    }

    @Override // D6.L
    public final void zzq(zzbzu zzbzuVar, String str) {
    }

    @Override // D6.L
    public final synchronized String zzr() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzn() == null) {
            return null;
        }
        return zzdmhVar.zzn().zze();
    }

    @Override // D6.L
    public final synchronized String zzs() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzn() == null) {
            return null;
        }
        return zzdmhVar.zzn().zze();
    }

    @Override // D6.L
    public final synchronized H0 zzt() {
        zzdmh zzdmhVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue() && (zzdmhVar = this.zzj) != null) {
            return zzdmhVar.zzn();
        }
        return null;
    }

    @Override // D6.L
    public final synchronized String zzu() {
        return this.zzd;
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() {
        return this.zzf.zzk();
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() {
        return this.zzf.zzi();
    }

    @Override // D6.L
    public final synchronized void zzx(zzbjs zzbjsVar) {
        AbstractC1732v.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbjsVar);
    }

    @Override // D6.L
    public final void zzz(boolean z2) {
    }

    @Override // D6.L
    public final void zzG(r1 r1Var) {
    }

    @Override // D6.L
    public final void zzH(O0 o02) {
    }

    @Override // D6.L
    public final void zzI(A1 a12) {
    }

    @Override // D6.L
    public final void zzY(C0369e0 c0369e0) {
    }

    @Override // D6.L
    public final void zzo(x1 x1Var) {
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) {
    }
}
