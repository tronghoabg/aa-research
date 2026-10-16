package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.H0;
import D6.K0;
import D6.T;
import D6.U;
import D6.o1;
import D6.v1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import n7.C3597b;
import n7.InterfaceC3596a;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public abstract class zzful {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfmc zzd;
    protected AtomicReference zze;
    protected final zzfsx zzf;
    protected AtomicBoolean zzg;
    protected U zzh;
    protected final ScheduledExecutorService zzi;
    private D6.S zzj;
    private final Queue zzk;
    private final zzftg zzl;
    private final String zzm;
    private AtomicBoolean zzn;
    private final zzfow zzo;
    private AtomicBoolean zzp;
    private zzftn zzq;
    private final InterfaceC3596a zzr;
    private final zzftu zzs;

    public zzful(ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, D6.S s10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a) {
        this("none", clientApi, context, i5, zzfmcVar, o1Var, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a, null);
        this.zzj = s10;
    }

    private final void zzR(boolean z2) {
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            if (z2) {
                this.zzl.zzc();
            }
            zzfsxVar.zza(this);
        } else {
            zzftg zzftgVar = this.zzl;
            if (zzftgVar.zze()) {
                return;
            }
            if (z2) {
                zzftgVar.zzc();
            }
            this.zzi.schedule(new zzftz(this), zzftgVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzF() {
        boolean z2;
        int i5;
        int i10;
        Queue queue = this.zzk;
        synchronized (queue) {
            try {
                Iterator it = queue.iterator();
                z2 = false;
                i5 = 0;
                while (it.hasNext()) {
                    if (((zzftw) it.next()).zzb()) {
                        it.remove();
                        i5++;
                    }
                }
                if (i5 > 0 && queue.isEmpty()) {
                    z2 = true;
                }
                i10 = (i5 <= 0 || !queue.isEmpty()) ? i5 : i5 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null && i5 > 0) {
            zzfsxVar.zzd(this, i10);
        }
        if (z2) {
            zzT();
        }
    }

    private final void zzT() {
        if (this.zzp.get()) {
            G6.U.f4562l.post(new zzfud(this));
        }
        this.zzi.execute(new zzfue(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final String zzM() {
        return true != "none".equals(this.zzm) ? CommonGetHeaderBiddingToken.HB_TOKEN_VERSION : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzV(H0 h02) {
        if (h02 instanceof zzdcs) {
            return ((zzdcs) h02).zzk();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzA(final int r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 <= 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            com.google.android.gms.common.internal.AbstractC1732v.b(r2)
            java.util.concurrent.atomic.AtomicReference r2 = r10.zze
            com.google.android.gms.internal.ads.zzfug r3 = new com.google.android.gms.internal.ads.zzfug
            r3.<init>()
            java.lang.Object r2 = j$.util.concurrent.atomic.DesugarAtomicReference.getAndUpdate(r2, r3)
            D6.o1 r2 = (D6.o1) r2
            int r3 = r2.f2470b
            x6.b r3 = x6.EnumC4471b.a(r3)
            int r5 = r2.f2472d
            java.util.Queue r2 = r10.zzk
            monitor-enter(r2)
            int r4 = r2.size()     // Catch: java.lang.Throwable -> L51
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L51
            if (r6 <= r11) goto L62
            com.google.android.gms.internal.ads.zzbio r6 = com.google.android.gms.internal.ads.zzbix.zzB     // Catch: java.lang.Throwable -> L51
            D6.s r7 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.zzbiv r7 = r7.f2492c     // Catch: java.lang.Throwable -> L51
            java.lang.Object r6 = r7.zzd(r6)     // Catch: java.lang.Throwable -> L51
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L51
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L51
            if (r6 == 0) goto L62
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r6.<init>()     // Catch: java.lang.Throwable -> L51
        L43:
            if (r1 >= r11) goto L57
            java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.ads.zzftw r7 = (com.google.android.gms.internal.ads.zzftw) r7     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L54
            r6.add(r7)     // Catch: java.lang.Throwable -> L51
            goto L54
        L51:
            r0 = move-exception
            r11 = r0
            goto L9f
        L54:
            int r1 = r1 + 1
            goto L43
        L57:
            r2.clear()     // Catch: java.lang.Throwable -> L51
            r2.addAll(r6)     // Catch: java.lang.Throwable -> L51
            int r1 = r6.size()     // Catch: java.lang.Throwable -> L51
            goto L63
        L62:
            r0 = r1
        L63:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L74
            if (r4 <= r1) goto L74
            com.google.android.gms.internal.ads.zzfsx r0 = r10.zzf
            if (r0 == 0) goto L74
            int r4 = r4 - r1
            if (r1 != 0) goto L71
            int r4 = r4 + (-1)
        L71:
            r0.zzd(r10, r4)
        L74:
            com.google.android.gms.internal.ads.zzftn r4 = r10.zzq
            if (r4 == 0) goto L9e
            if (r3 == 0) goto L9e
            n7.a r0 = r10.zzr
            n7.b r0 = (n7.C3597b) r0
            r0.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzftt r0 = new com.google.android.gms.internal.ads.zzftt
            java.util.concurrent.atomic.AtomicReference r1 = r10.zze
            java.lang.Object r1 = r1.get()
            D6.o1 r1 = (D6.o1) r1
            java.lang.String r1 = r1.f2469a
            r0.<init>(r1, r3)
            com.google.android.gms.internal.ads.zzftu r9 = new com.google.android.gms.internal.ads.zzftu
            r1 = 0
            r9.<init>(r0, r1)
            r6 = r11
            r4.zzc(r5, r6, r7, r9)
        L9e:
            return
        L9f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L51
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzful.zzA(int):void");
    }

    public final void zzB(v1 v1Var) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzG)).booleanValue()) {
            Bundle bundle = v1Var.f2503C;
            bundle.putInt("plcs", zzt());
            bundle.putInt("plbs", zzs());
            bundle.putString("plid", this.zzm);
        }
    }

    public final long zzC() {
        long jZzb = zzb();
        if (jZzb >= 0) {
            return jZzb;
        }
        return ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzU)).longValue();
    }

    public final void zzD(int i5, zzftw zzftwVar, zzftw zzftwVar2, long j8, int i10, int i11, boolean z2) {
        zzbio zzbioVar = zzbix.zzQ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzP)).booleanValue() || i5 == 1) {
                this.zzl.zza();
            }
        }
        if (zzftwVar != null && zzftwVar2 != null) {
            EnumC4471b enumC4471bA = EnumC4471b.a(((o1) this.zze.get()).f2470b);
            String strZzV = zzV(zzc(zzftwVar.zza()));
            if (enumC4471bA != null && strZzV != null && zzftwVar2.zzd() < zzftwVar.zzd()) {
                this.zzq.zzg(j8, i10, i11, strZzV, this.zzs, zzM());
            }
        }
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            zzfsxVar.zzb(this);
        } else {
            long jZzC = zzC();
            if (jZzC > 0) {
                this.zzi.schedule(new zzftz(this), jZzC, TimeUnit.MILLISECONDS);
            } else {
                zzy();
            }
        }
        if (z2) {
            zzT();
        }
    }

    public final void zzG(Object obj) {
        Object obj2;
        if (obj != null) {
            this.zzl.zza();
            H0 h0Zzc = zzc(obj);
            double dZzl = !(h0Zzc instanceof zzdcs) ? 0.0d : ((zzdcs) h0Zzc).zzl();
            H0 h0Zzc2 = zzc(obj);
            obj2 = obj;
            zzftw zzftwVar = new zzftw(obj2, this.zzr, dZzl, h0Zzc2 instanceof zzdcs ? ((zzdcs) h0Zzc2).zzm() : 2);
            Queue queue = this.zzk;
            synchronized (queue) {
                queue.add(zzftwVar);
            }
            H0 h0Zzc3 = zzc(obj2);
            ((C3597b) this.zzr).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.zzp.get()) {
                G6.U.f4562l.post(new zzfua(this, h0Zzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzi;
            scheduledExecutorService.execute(new zzfub(this, jCurrentTimeMillis, h0Zzc3));
            if (this.zzf != null) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzI)).booleanValue()) {
                    this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuj
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzF();
                        }
                    }, zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfui
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzE();
                        }
                    }, zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                }
            } else {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzI)).booleanValue()) {
                    this.zzo.zzb(new zzftz(this), zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                } else {
                    scheduledExecutorService.schedule(new zzftz(this), zzftwVar.zzc(), TimeUnit.MILLISECONDS);
                }
            }
        } else {
            obj2 = obj;
        }
        this.zzn.set(false);
        if (obj2 == null || this.zzf == null) {
            zzR(obj2 == null);
        }
    }

    public final /* synthetic */ void zzH(Throwable th) {
        this.zzn.set(false);
        if ((th instanceof zzfsy) && ((zzfsy) th).zza() == 0) {
            throw null;
        }
        zzR(true);
    }

    public final void zzI(K0 k02) {
        if (this.zzp.get()) {
            G6.U.f4562l.post(new zzfuc(this, k02));
        }
        this.zzn.set(false);
        int i5 = k02.f2338a;
        if (i5 != 1 && i5 != 8 && i5 != 10 && i5 != 11) {
            zzR(true);
            return;
        }
        int i10 = ((o1) this.zze.get()).f2470b;
        String str = ((o1) this.zze.get()).f2469a;
        int length = String.valueOf(i10).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 26 + 61);
        sb2.append("Preloading ");
        sb2.append(i10);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb2.toString();
        int i11 = G6.L.f4523b;
        H6.l.e(string);
        this.zzg.set(false);
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar != null) {
            zzfsxVar.zza(this);
        }
        zzftt zzfttVar = new zzftt(((o1) this.zze.get()).f2469a, zzq());
        zzfttVar.zza(this.zzm);
        zzftu zzftuVar = new zzftu(zzfttVar, null);
        zzftn zzftnVar = this.zzq;
        ((C3597b) this.zzr).getClass();
        zzftnVar.zzk(System.currentTimeMillis(), zzftuVar, k02, zzs(), zzt(), zzM());
    }

    public final void zzJ(K0 k02) {
        U u10 = this.zzh;
        if (u10 != null) {
            try {
                String str = this.zzm;
                T t10 = (T) u10;
                Parcel parcelZza = t10.zza();
                parcelZza.writeString(str);
                zzben.zzc(parcelZza, k02);
                t10.zzda(3, parcelZza);
            } catch (RemoteException unused) {
                int i5 = G6.L.f4523b;
                H6.l.f("Failed to call onAdFailedToPreload");
            }
        }
    }

    public final void zzK(H0 h02) {
        D6.S s10 = this.zzj;
        if (s10 != null) {
            try {
                s10.z((o1) this.zze.get());
            } catch (RemoteException unused) {
                int i5 = G6.L.f4523b;
                H6.l.f("Failed to call onAdsAvailable");
            }
        }
        U u10 = this.zzh;
        if (u10 != null) {
            try {
                String str = this.zzm;
                T t10 = (T) u10;
                Parcel parcelZza = t10.zza();
                parcelZza.writeString(str);
                zzben.zze(parcelZza, h02);
                t10.zzda(1, parcelZza);
            } catch (RemoteException unused2) {
                int i10 = G6.L.f4523b;
                H6.l.f("Failed to call onAdPreloaded");
            }
        }
    }

    public final void zzL() {
        D6.S s10 = this.zzj;
        if (s10 != null) {
            try {
                s10.x((o1) this.zze.get());
            } catch (RemoteException unused) {
                int i5 = G6.L.f4523b;
                H6.l.f("Failed to call onAdsExhausted");
            }
        }
        U u10 = this.zzh;
        if (u10 != null) {
            try {
                String str = this.zzm;
                T t10 = (T) u10;
                Parcel parcelZza = t10.zza();
                parcelZza.writeString(str);
                t10.zzda(2, parcelZza);
            } catch (RemoteException unused2) {
                int i10 = G6.L.f4523b;
                H6.l.f("Failed to call onAdsExhausted");
            }
        }
    }

    public final /* synthetic */ zzftn zzN() {
        return this.zzq;
    }

    public final /* synthetic */ InterfaceC3596a zzO() {
        return this.zzr;
    }

    public final /* synthetic */ zzftu zzP() {
        return this.zzs;
    }

    public abstract p8.p zza(Context context);

    public long zzb() {
        throw null;
    }

    public abstract H0 zzc(Object obj);

    public final zzful zzd() {
        this.zzi.submit(new zzftz(this));
        return this;
    }

    public final void zze() {
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((o1) this.zze.get()).f2472d) {
                this.zzn.set(false);
            } else {
                this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzz();
                    }
                });
            }
        }
    }

    public final boolean zzf() {
        boolean zIsEmpty;
        zzbio zzbioVar = zzbix.zzO;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            this.zzl.zza();
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzH)).booleanValue() && this.zzf == null) {
            zzy();
        } else {
            zzF();
        }
        Queue queue = this.zzk;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
        }
        return !zIsEmpty;
    }

    public final Object zzg() {
        final zzftw zzftwVar;
        final boolean z2;
        final zzftw zzftwVar2;
        Queue queue = this.zzk;
        final int iZzt = zzt();
        synchronized (queue) {
            try {
                zzftwVar = (zzftw) queue.poll();
                boolean z10 = false;
                if (zzftwVar != null && queue.isEmpty()) {
                    z10 = true;
                }
                z2 = z10;
                zzftwVar2 = (zzftwVar == null || queue.isEmpty()) ? null : (zzftw) queue.peek();
            } catch (Throwable th) {
                throw th;
            }
        }
        ((C3597b) this.zzr).getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int iZzs = zzs();
        final int iZzt2 = zzt();
        this.zzi.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzD(iZzt, zzftwVar, zzftwVar2, jCurrentTimeMillis, iZzs, iZzt2, z2);
            }
        });
        if (zzftwVar == null) {
            return null;
        }
        return zzftwVar.zza();
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        zzfsx zzfsxVar = this.zzf;
        if (zzfsxVar == null) {
            this.zzi.submit(new zzftz(this));
        } else {
            zzfsxVar.zzd(this, 0);
        }
    }

    public final boolean zzk(o1 o1Var) {
        return ((o1) this.zze.get()).equals(o1Var);
    }

    public final String zzl() {
        zzftw zzftwVar;
        Queue queue = this.zzk;
        synchronized (queue) {
            zzftwVar = (zzftw) queue.peek();
        }
        Object objZza = zzftwVar == null ? null : zzftwVar.zza();
        return zzV(objZza != null ? zzc(objZza) : null);
    }

    public final void zzm(zzftn zzftnVar) {
        this.zzq = zzftnVar;
    }

    public final void zzn(int i5) {
        AbstractC1732v.b(i5 >= 5);
        this.zzl.zzf(i5);
    }

    public final o1 zzo() {
        return (o1) this.zze.get();
    }

    public final String zzp() {
        return this.zzm;
    }

    public final EnumC4471b zzq() {
        return EnumC4471b.a(((o1) this.zze.get()).f2470b);
    }

    public final String zzr() {
        return ((o1) this.zze.get()).f2469a;
    }

    public final int zzs() {
        return ((o1) this.zze.get()).f2472d;
    }

    public final int zzt() {
        int size;
        Queue queue = this.zzk;
        synchronized (queue) {
            size = queue.size();
        }
        return size;
    }

    public final boolean zzu() {
        if (!this.zzg.get() || this.zzn.get() || zzt() >= zzs()) {
            return false;
        }
        zzftg zzftgVar = this.zzl;
        return (zzftgVar.zzd() || zzftgVar.zze()) ? false : true;
    }

    public final void zzv() {
        Queue queue = this.zzk;
        synchronized (queue) {
            queue.clear();
        }
    }

    public final boolean zzw() {
        return this.zzn.get();
    }

    public final int zzx() {
        int iZzt = zzt();
        int i5 = iZzt - 1;
        if (!this.zzn.get()) {
            iZzt = i5;
        }
        return Math.max(iZzt, 0);
    }

    public final void zzy() {
        zzF();
        if (this.zzn.compareAndSet(false, true)) {
            if (!this.zzg.get() || zzt() >= ((o1) this.zze.get()).f2472d) {
                this.zzn.set(false);
            } else {
                zzz();
            }
        }
    }

    public final void zzz() {
        p8.p pVarZza;
        Activity activityZzd = C6.n.f1857D.f1867g.zzd();
        if (activityZzd == null) {
            String strValueOf = String.valueOf(((o1) this.zze.get()).f2469a);
            int i5 = G6.L.f4523b;
            H6.l.f("Empty activity context at preloading: ".concat(strValueOf));
            pVarZza = zza(this.zzb);
        } else {
            pVarZza = zza(activityZzd);
        }
        zzhcf.zzr(pVarZza, new zzftx(this), this.zzi);
    }

    public zzful(String str, ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, U u10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar) {
        this(str, clientApi, context, i5, zzfmcVar, o1Var, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a, zzfsxVar);
        this.zzh = u10;
    }

    private zzful(String str, ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar) {
        Queue priorityQueue;
        this.zzm = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i5;
        this.zzd = zzfmcVar;
        this.zze = new AtomicReference(o1Var);
        int iMax = Math.max(1, o1Var.f2472d);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzag)).booleanValue()) {
            priorityQueue = new zzfuo();
        } else {
            priorityQueue = new PriorityQueue(iMax, zzfuh.zza);
        }
        this.zzk = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzn = new AtomicBoolean(false);
        this.zzi = scheduledExecutorService;
        this.zzo = zzfowVar;
        this.zzl = zzftgVar;
        this.zzp = new AtomicBoolean(true);
        this.zzr = interfaceC3596a;
        zzftt zzfttVar = new zzftt(o1Var.f2469a, EnumC4471b.a(((o1) this.zze.get()).f2470b));
        zzfttVar.zza(str);
        this.zzs = new zzftu(zzfttVar, null);
        this.zzf = zzfsxVar;
    }
}
