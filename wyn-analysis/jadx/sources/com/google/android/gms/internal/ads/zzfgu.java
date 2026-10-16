package com.google.android.gms.internal.ads;

import D6.A0;
import D6.A1;
import D6.C0369e0;
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
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.atomic.AtomicBoolean;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzfgu extends D6.K implements F6.o, zzbgk {
    protected zzcvm zza;
    private final zzcnq zzb;
    private final Context zzc;
    private final String zze;
    private final zzfgo zzf;
    private final zzfgm zzg;
    private final H6.a zzh;
    private final zzdzt zzi;
    private zzcuz zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzfgu(zzcnq zzcnqVar, Context context, String str, zzfgo zzfgoVar, zzfgm zzfgmVar, H6.a aVar, zzdzt zzdztVar) {
        this.zzb = zzcnqVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzfgoVar;
        this.zzg = zzfgmVar;
        this.zzh = aVar;
        this.zzi = zzdztVar;
        zzfgmVar.zzq(this);
    }

    private final synchronized void zzW(int i5) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzu();
                zzcuz zzcuzVar = this.zzk;
                if (zzcuzVar != null) {
                    C6.n.f1857D.f1867g.zzc(zzcuzVar);
                }
                if (this.zza != null) {
                    long jElapsedRealtime = -1;
                    if (this.zzj != -1) {
                        C6.n.f1857D.k.getClass();
                        jElapsedRealtime = SystemClock.elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(jElapsedRealtime, i5);
                }
                zzc();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // D6.L
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // D6.L
    public final synchronized boolean zzB() {
        return this.zzf.zzb();
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
        return null;
    }

    @Override // D6.L
    public final synchronized void zzG(r1 r1Var) {
    }

    @Override // D6.L
    public final void zzI(A1 a12) {
        this.zzf.zzd(a12);
    }

    @Override // D6.L
    public final void zzJ(zzbgt zzbgtVar) {
        this.zzg.zzo(zzbgtVar);
    }

    @Override // D6.L
    public final void zzK(boolean z2) {
    }

    public final void zzL(zzfti zzftiVar) {
        this.zzg.zzs(zzftiVar);
    }

    public final /* synthetic */ void zzM() {
        zzW(5);
    }

    public final /* synthetic */ void zzN() {
        this.zzb.zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgt
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzM();
            }
        });
    }

    public final /* synthetic */ zzfgm zzO() {
        return this.zzg;
    }

    @Override // D6.L
    public final void zzT(long j8) {
    }

    @Override // D6.L
    public final long zzU() {
        return 0L;
    }

    public final /* synthetic */ zzdzt zzV() {
        return this.zzi;
    }

    @Override // D6.L
    public final synchronized void zzY(C0369e0 c0369e0) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zza() {
        zzW(3);
    }

    @Override // D6.L
    public final InterfaceC3876a zzb() {
        return null;
    }

    @Override // D6.L
    public final synchronized void zzc() {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar != null) {
            zzcvmVar.zzd();
        }
    }

    @Override // D6.L
    public final boolean zzd() {
        return false;
    }

    @Override // F6.o
    public final void zzdT() {
    }

    @Override // F6.o
    public final void zzdU(int i5) {
        if (i5 == 0) {
            throw null;
        }
        int i10 = i5 - 1;
        if (i10 == 0) {
            zzW(2);
            return;
        }
        if (i10 == 1) {
            zzW(4);
        } else if (i10 != 2) {
            zzW(6);
        } else {
            zzW(3);
        }
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // F6.o
    public final synchronized void zzdv() {
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar != null) {
            C6.n.f1857D.k.getClass();
            zzcvmVar.zze(SystemClock.elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // F6.o
    public final void zzdw() {
    }

    @Override // F6.o
    public final void zzdx() {
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // D6.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean zze(D6.v1 r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.W()     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r0 == 0) goto L9
            goto L4c
        L9:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkv.zzd     // Catch: java.lang.Throwable -> L2d
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
            goto L93
        L2f:
            H6.a r2 = r5.zzh     // Catch: java.lang.Throwable -> L2d
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
            android.content.Context r0 = r5.zzc     // Catch: java.lang.Throwable -> L2d
            boolean r0 = G6.U.h(r0)     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L70
            D6.Q r0 = r6.f2521s     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L70
            int r6 = G6.L.f4523b     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            H6.l.c(r6)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgm r6 = r5.zzg     // Catch: java.lang.Throwable -> L2d
            r0 = 4
            r2 = 0
            D6.K0 r0 = com.google.android.gms.internal.ads.zzfmi.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L2d
            r6.zzdJ(r0)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r1
        L70:
            boolean r0 = r5.zzB()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L78
            monitor-exit(r5)
            return r1
        L78:
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean     // Catch: java.lang.Throwable -> L2d
            r0.<init>()     // Catch: java.lang.Throwable -> L2d
            r5.zzd = r0     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgq r0 = new com.google.android.gms.internal.ads.zzfgq     // Catch: java.lang.Throwable -> L2d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgo r1 = r5.zzf     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r5.zze     // Catch: java.lang.Throwable -> L2d
            com.google.android.gms.internal.ads.zzfgr r3 = new com.google.android.gms.internal.ads.zzfgr     // Catch: java.lang.Throwable -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r1.zza(r6, r2, r0, r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r5)
            return r6
        L93:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfgu.zze(D6.v1):boolean");
    }

    @Override // D6.L
    public final synchronized void zzf() {
        AbstractC1732v.e("pause must be called on the main UI thread.");
    }

    @Override // D6.L
    public final synchronized void zzg() {
        AbstractC1732v.e("resume must be called on the main UI thread.");
    }

    @Override // F6.o
    public final synchronized void zzh() {
        if (this.zza != null) {
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            this.zzj = SystemClock.elapsedRealtime();
            int iZzc = this.zza.zzc();
            if (iZzc > 0) {
                zzcuz zzcuzVar = new zzcuz(this.zzb.zzc(), nVar.k);
                this.zzk = zzcuzVar;
                zzcuzVar.zzb(iZzc, new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgs
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzN();
                    }
                });
            }
        }
    }

    @Override // D6.L
    public final Bundle zzk() {
        return new Bundle();
    }

    @Override // D6.L
    public final synchronized void zzl() {
    }

    @Override // D6.L
    public final synchronized void zzm() {
    }

    @Override // D6.L
    public final synchronized x1 zzn() {
        return null;
    }

    @Override // D6.L
    public final synchronized void zzo(x1 x1Var) {
        AbstractC1732v.e("setAdSize must be called on the main UI thread.");
    }

    @Override // D6.L
    public final void zzp(zzbzr zzbzrVar) {
    }

    @Override // D6.L
    public final void zzq(zzbzu zzbzuVar, String str) {
    }

    @Override // D6.L
    public final synchronized String zzr() {
        return null;
    }

    @Override // D6.L
    public final synchronized String zzs() {
        return null;
    }

    @Override // D6.L
    public final synchronized H0 zzt() {
        return null;
    }

    @Override // D6.L
    public final synchronized String zzu() {
        return this.zze;
    }

    @Override // D6.L
    public final InterfaceC0362b0 zzv() {
        return null;
    }

    @Override // D6.L
    public final InterfaceC0407y zzw() {
        return null;
    }

    @Override // D6.L
    public final synchronized void zzx(zzbjs zzbjsVar) {
    }

    @Override // D6.L
    public final synchronized void zzz(boolean z2) {
    }

    @Override // D6.L
    public final void zzH(O0 o02) {
    }

    @Override // D6.L
    public final void zzP(A0 a02) {
    }

    @Override // D6.L
    public final void zzR(InterfaceC3876a interfaceC3876a) {
    }

    @Override // D6.L
    public final void zzS(InterfaceC0373g0 interfaceC0373g0) {
    }

    @Override // D6.L
    public final void zzdS(InterfaceC0407y interfaceC0407y) {
    }

    @Override // D6.L
    public final void zzi(InterfaceC0362b0 interfaceC0362b0) {
    }

    @Override // D6.L
    public final void zzj(D6.O o7) {
    }

    @Override // D6.L
    public final void zzy(InterfaceC0401v interfaceC0401v) {
    }

    @Override // D6.L
    public final void zzQ(v1 v1Var, D6.B b5) {
    }
}
