package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.C3597b;
import n7.InterfaceC3596a;
import org.apache.tika.metadata.TikaCoreProperties;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzfsx {
    final AtomicBoolean zza = new AtomicBoolean(false);
    final Map zzb = new LinkedHashMap();
    final AtomicBoolean zzc = new AtomicBoolean(false);
    private final G6.N zzd;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzftn zzg;
    private final InterfaceC3596a zzh;

    public zzfsx(G6.N n10, ScheduledExecutorService scheduledExecutorService, zzftn zzftnVar, InterfaceC3596a interfaceC3596a) {
        this.zzd = n10;
        this.zzf = scheduledExecutorService;
        this.zzg = zzftnVar;
        this.zzh = interfaceC3596a;
    }

    private final boolean zzA(zzful zzfulVar) {
        if (this.zza.get() || zzfulVar.zzt() != 0 || !zzfulVar.zzu()) {
            return false;
        }
        zzfulVar.zze();
        return true;
    }

    private final int zzq() {
        int i5;
        G6.O o7 = (G6.O) this.zzd;
        o7.l();
        synchronized (o7.f4531a) {
            i5 = o7.f4529F;
        }
        zzbio zzbioVar = zzbix.zzS;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && i5 > 0) {
            return i5;
        }
        return ((Integer) c0395s.f2492c.zzd(zzbix.zzac)).intValue();
    }

    private static String zzr(String str, EnumC4471b enumC4471b) {
        return str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + enumC4471b;
    }

    private final void zzs(final zzful zzfulVar) {
        if (zzfulVar.zzt() > 0 || zzfulVar.zzw()) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfso
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(zzfulVar);
                }
            });
        }
        this.zza.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.zze;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.zze = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.zzc.set(true);
    }

    private final boolean zzt(zzful zzfulVar) {
        boolean z2;
        EnumC4471b enumC4471bZzq = zzfulVar.zzq();
        if (enumC4471bZzq == null) {
            return true;
        }
        Map map = this.zzb;
        synchronized (map) {
            z2 = !map.containsKey(zzr(zzfulVar.zzp(), enumC4471bZzq));
        }
        return z2;
    }

    private final boolean zzu() {
        zzgwt zzgwtVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwtVarZzq = zzgwt.zzq(map.values());
        }
        int size = zzgwtVarZzq.size();
        for (int i5 = 0; i5 < size; i5++) {
            zzful zzfulVar = (zzful) zzgwtVarZzq.get(i5);
            if (zzfulVar.zzt() == 0 && zzfulVar.zzu()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j8) {
        if (this.zzc.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j8 > 0) {
                        this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzl();
                            }
                        }, j8, TimeUnit.MILLISECONDS);
                    } else {
                        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzk();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        zzful zzfulVar;
        zzgwt zzgwtVarZzq;
        if (this.zza.get()) {
            return;
        }
        synchronized (this) {
            zzfulVar = null;
            this.zze = null;
        }
        int iZzq = zzq();
        if (zzg() < iZzq || zzu()) {
            Map map = this.zzb;
            synchronized (map) {
                zzgwtVarZzq = zzgwt.zzq(map.values());
            }
            int size = zzgwtVarZzq.size();
            double d3 = Double.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                zzful zzfulVar2 = (zzful) zzgwtVarZzq.get(i5);
                if (zzfulVar2.zzu()) {
                    double dZzt = zzfulVar2.zzt() / zzfulVar2.zzs();
                    if (dZzt < d3) {
                        d3 = dZzt;
                    }
                    if (dZzt < d3) {
                        zzfulVar = zzfulVar2;
                    }
                }
            }
            if (zzfulVar != null) {
                zzfulVar.zze();
                if (zzfulVar.zzt() > 0) {
                    zzftn zzftnVar = this.zzg;
                    ((C3597b) this.zzh).getClass();
                    zzftnVar.zzq(System.currentTimeMillis(), zzfulVar.zzp(), zzfulVar.zzr(), zzfulVar.zzq(), zzfulVar.zzs(), zzfulVar.zzt(), zzg(), iZzq);
                }
            }
            if (zzg() >= iZzq) {
                zzy();
            }
            if (zzg() < iZzq || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfss
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfst
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn();
                        }
                    }, ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzae)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzc.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zza.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        Map map = this.zzb;
        synchronized (map) {
            size = map.size();
        }
        zzftn zzftnVar = this.zzg;
        ((C3597b) this.zzh).getClass();
        zzftnVar.zzs(System.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzful zzfulVar, int i5) {
        InterfaceC3596a interfaceC3596a = this.zzh;
        zzftn zzftnVar = this.zzg;
        ((C3597b) interfaceC3596a).getClass();
        zzftnVar.zzr(System.currentTimeMillis(), zzfulVar.zzp(), zzfulVar.zzr(), zzfulVar.zzq(), zzfulVar.zzs(), zzfulVar.zzt(), i5, zzg(), zzq());
    }

    public final void zza(zzful zzfulVar) {
        int i5 = 1;
        if (zzfulVar.zzt() <= 0 && !zzfulVar.zzw()) {
            i5 = 0;
        }
        zzd(zzfulVar, i5);
    }

    public final void zzb(zzful zzfulVar) {
        if (zzt(zzfulVar)) {
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzY)).booleanValue()) {
            zzs(zzfulVar);
            return;
        }
        long jZzC = zzfulVar.zzC();
        if (jZzC <= 0) {
            zza(zzfulVar);
            return;
        }
        zzs(zzfulVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            }, jZzC, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzc(zzful zzfulVar, boolean z2) {
        if (z2) {
            this.zzg.zzu(((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzZ)).longValue(), zzfulVar.zzq(), zzfulVar.zzp(), zzfulVar.zzr());
        } else {
            zzftn zzftnVar = this.zzg;
            ((C3597b) this.zzh).getClass();
            zzftnVar.zzv(System.currentTimeMillis(), zzfulVar.zzq(), zzfulVar.zzp(), zzfulVar.zzr());
        }
        zzh();
    }

    public final void zzd(final zzful zzfulVar, final int i5) {
        if (zzt(zzfulVar)) {
            return;
        }
        if (i5 > 0) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzj(zzfulVar, i5);
                }
            });
        }
        if (!zzA(zzfulVar)) {
            zzv(0L);
        } else {
            zzv(((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzad)).longValue());
        }
    }

    public final void zze(String str, EnumC4471b enumC4471b, final zzful zzfulVar) {
        Map map = this.zzb;
        String strZzr = zzr(str, enumC4471b);
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                return;
            }
            map.put(strZzr, zzfulVar);
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzfulVar);
                }
            });
        }
    }

    public final void zzf(final zzful zzfulVar) {
        EnumC4471b enumC4471bZzq = zzfulVar.zzq();
        if (enumC4471bZzq == null) {
            return;
        }
        String strZzr = zzr(zzfulVar.zzp(), enumC4471bZzq);
        Map map = this.zzb;
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                map.remove(strZzr);
                final int iZzx = zzfulVar.zzx();
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzp(iZzx, zzfulVar);
                    }
                });
            }
        }
    }

    public final int zzg() {
        zzgwt zzgwtVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwtVarZzq = zzgwt.zzq(map.values());
        }
        int size = zzgwtVarZzq.size();
        int iZzx = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iZzx += ((zzful) zzgwtVarZzq.get(i5)).zzx();
        }
        return iZzx;
    }

    public final /* synthetic */ void zzi(zzful zzfulVar) {
        zzj(zzfulVar, 1);
    }

    public final void zzo(zzful zzfulVar) {
        zzA(zzfulVar);
        zzv(((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzad)).longValue());
    }

    public final /* synthetic */ void zzp(int i5, zzful zzfulVar) {
        if (i5 > 0) {
            zzj(zzfulVar, i5);
        }
        zzv(0L);
    }
}
