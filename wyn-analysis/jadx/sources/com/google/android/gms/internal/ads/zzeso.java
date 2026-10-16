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
import G6.U;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzeso extends D6.K implements zzdfv {
    private final Context zza;
    private final zzfha zzb;
    private final String zzc;
    private final zzetk zzd;
    private x1 zze;
    private final zzflf zzf;
    private final H6.a zzg;
    private final zzdzt zzh;
    private zzcvs zzi;

    public zzeso(Context context, x1 x1Var, String str, zzfha zzfhaVar, zzetk zzetkVar, H6.a aVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzfhaVar;
        this.zze = x1Var;
        this.zzc = str;
        this.zzd = zzetkVar;
        this.zzf = zzfhaVar.zzg();
        this.zzg = aVar;
        this.zzh = zzdztVar;
        zzfhaVar.zzi(this);
    }

    private final synchronized void zzO(x1 x1Var) {
        zzflf zzflfVar = this.zzf;
        zzflfVar.zzc(x1Var);
        zzflfVar.zze(this.zze.f2542n);
    }

    private final synchronized boolean zzV(v1 v1Var) throws RemoteException {
        try {
            if (zzW()) {
                AbstractC1732v.e("loadAd must be called on the main UI thread.");
            }
            U u10 = C6.n.f1857D.f1863c;
            Context context = this.zza;
            if (!U.h(context) || v1Var.f2521s != null) {
                zzfmd.zzb(context, v1Var.f2509f);
                return this.zzb.zza(v1Var, this.zzc, null, new zzesn(this));
            }
            int i5 = G6.L.f4523b;
            H6.l.c("Failed to load the ad because app ID is missing.");
            zzetk zzetkVar = this.zzd;
            if (zzetkVar != null) {
                zzetkVar.zzdJ(zzfmi.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzW() {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zzf
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzmO
            D6.s r3 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r3 = r3.f2492c
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L24
            r0 = r1
            goto L25
        L24:
            r0 = r2
        L25:
            H6.a r3 = r6.zzg
            int r3 = r3.f4929c
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zzmP
            D6.s r5 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r5 = r5.f2492c
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L3f
            if (r0 != 0) goto L3e
            goto L3f
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeso.zzW():boolean");
    }

    @Override // D6.L
    public final synchronized boolean zzA() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            if (zzcvsVar.zzs()) {
                return true;
            }
        }
        return false;
    }

    @Override // D6.L
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // D6.L
    public final void zzC(zzccc zzcccVar) {
    }

    @Override // D6.L
    public final void zzD(String str) {
    }

    @Override // D6.L
    public final void zzE(String str) {
    }

    @Override // D6.L
    public final synchronized L0 zzF() {
        AbstractC1732v.e("getVideoController must be called from the main thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null) {
            return null;
        }
        return zzcvsVar.zzc();
    }

    @Override // D6.L
    public final synchronized void zzG(r1 r1Var) {
        try {
            if (zzW()) {
                AbstractC1732v.e("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzi(r1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) {
    }

    @Override // D6.L
    public final void zzK(boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfha zzfhaVar = this.zzb;
        if (zzfhaVar.zzh()) {
            zzfhaVar.zzc();
        } else {
            zzfhaVar.zzk();
        }
    }

    public final /* synthetic */ zzcvs zzM() {
        return this.zzi;
    }

    public final /* synthetic */ void zzN(zzcvs zzcvsVar) {
        this.zzi = zzcvsVar;
    }

    @Override // D6.L
    public final void zzP(A0 a02) {
        if (zzW()) {
            AbstractC1732v.e("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!a02.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Error in making CSI ping for reporting paid event callback", e7);
        }
        this.zzd.zzp(a02);
    }

    @Override // D6.L
    public final synchronized void zzT(long j8) {
        this.zzf.zzx(j8);
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzo() == null) {
            return;
        }
        zzcvsVar.zzo().zzb(j8);
    }

    @Override // D6.L
    public final synchronized long zzU() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcvsVar.zzo().zza();
    }

    @Override // D6.L
    public final synchronized void zzY(C0369e0 c0369e0) {
        AbstractC1732v.e("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzab(c0369e0);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzh()) {
                this.zzb.zzj();
                return;
            }
            zzflf zzflfVar = this.zzf;
            x1 x1VarZzf = zzflfVar.zzf();
            if (this.zzi != null && zzflfVar.zzD()) {
                x1VarZzf = zzflm.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
            }
            zzO(x1VarZzf);
            zzflfVar.zzd(true);
            try {
                zzV(zzflfVar.zzb());
            } catch (RemoteException unused) {
                int i5 = G6.L.f4523b;
                H6.l.f("Failed to refresh the banner ad.");
            }
            this.zzf.zzd(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() {
        if (zzW()) {
            AbstractC1732v.e("getAdFrame must be called on the main UI thread.");
        }
        return new BinderC3877b(this.zzb.zzd());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // D6.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzc() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zze     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzmL     // Catch: java.lang.Throwable -> L36
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r2 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            H6.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4929c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzmQ     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzd(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L48
        L38:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.AbstractC1732v.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcvs r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L46
            r0.zzd()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L46:
            monitor-exit(r3)
            return
        L48:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeso.zzc():void");
    }

    @Override // D6.L
    public final boolean zzd() {
        return false;
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) {
        if (zzW()) {
            AbstractC1732v.e("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(interfaceC0407y);
    }

    @Override // D6.L
    public final synchronized boolean zze(v1 v1Var) throws RemoteException {
        zzO(this.zze);
        return zzV(v1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // D6.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzf() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zzg     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzmM     // Catch: java.lang.Throwable -> L36
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r2 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            H6.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4929c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzmQ     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzd(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L4d
        L38:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.AbstractC1732v.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcvs r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzddy r0 = r0.zzl()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r0.zza(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L4b:
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeso.zzf():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003d, B:15:0x0041, B:12:0x0038), top: B:22:0x0001 }] */
    @Override // D6.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzg() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zzh     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzmK     // Catch: java.lang.Throwable -> L36
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r2 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r2.zzd(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L36
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L38
            H6.a r0 = r3.zzg     // Catch: java.lang.Throwable -> L36
            int r0 = r0.f4929c     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzmQ     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.zzd(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L36
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L36
            if (r0 >= r1) goto L3d
            goto L38
        L36:
            r0 = move-exception
            goto L4d
        L38:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.AbstractC1732v.e(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            com.google.android.gms.internal.ads.zzcvs r0 = r3.zzi     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.ads.zzddy r0 = r0.zzl()     // Catch: java.lang.Throwable -> L36
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return
        L4b:
            monitor-exit(r3)
            return
        L4d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L36
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeso.zzg():void");
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) {
        if (zzW()) {
            AbstractC1732v.e("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzo(interfaceC0362b0);
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
    public final void zzl() {
    }

    @Override // D6.L
    public final synchronized void zzm() {
        AbstractC1732v.e("recordManualImpression must be called on the main UI thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzi();
        }
    }

    @Override // D6.L
    public final synchronized x1 zzn() {
        AbstractC1732v.e("getAdSize must be called on the main UI thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            return zzflm.zza(this.zza, Collections.singletonList(zzcvsVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // D6.L
    public final synchronized void zzo(x1 x1Var) {
        AbstractC1732v.e("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(x1Var);
        this.zze = x1Var;
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzb(this.zzb.zzd(), x1Var);
        }
    }

    @Override // D6.L
    public final void zzp(zzbzr zzbzrVar) {
    }

    @Override // D6.L
    public final void zzq(zzbzu zzbzuVar, String str) {
    }

    @Override // D6.L
    public final synchronized String zzr() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzn() == null) {
            return null;
        }
        return zzcvsVar.zzn().zze();
    }

    @Override // D6.L
    public final synchronized String zzs() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzn() == null) {
            return null;
        }
        return zzcvsVar.zzn().zze();
    }

    @Override // D6.L
    public final synchronized H0 zzt() {
        zzcvs zzcvsVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue() && (zzcvsVar = this.zzi) != null) {
            return zzcvsVar.zzn();
        }
        return null;
    }

    @Override // D6.L
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() {
        return this.zzd.zzk();
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() {
        return this.zzd.zzi();
    }

    @Override // D6.L
    public final synchronized void zzx(zzbjs zzbjsVar) {
        AbstractC1732v.e("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbjsVar);
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) {
        if (zzW()) {
            AbstractC1732v.e("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(interfaceC0401v);
    }

    @Override // D6.L
    public final synchronized void zzz(boolean z2) {
        try {
            if (zzW()) {
                AbstractC1732v.e("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzk(z2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D6.L
    public final void zzH(O0 o02) {
    }

    @Override // D6.L
    public final void zzI(A1 a12) {
    }

    @Override // D6.L
    public final void zzR(InterfaceC3876a interfaceC3876a) {
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) {
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, D6.B b5) {
    }
}
