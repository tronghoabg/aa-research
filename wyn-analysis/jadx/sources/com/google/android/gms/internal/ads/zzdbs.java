package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzdbs implements zzdcz, zzdkl, zzdib, zzddp, zzbex {
    private final zzddr zza;
    private final zzdfs zzb;
    private final zzfkn zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzhcy zzf = zzhcy.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    public zzdbs(zzddr zzddrVar, zzfkn zzfknVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdfs zzdfsVar) {
        this.zza = zzddrVar;
        this.zzc = zzfknVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdfsVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final synchronized void zzdH() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhcy zzhcyVar = this.zzf;
        if (zzhcyVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcyVar.zza(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzng)).booleanValue() && zzl() && zzbewVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            G6.L.k("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzfkn zzfknVar = this.zzc;
        if (zzfknVar.zze == 3) {
            return;
        }
        int i5 = zzfknVar.zzY;
        if (i5 == 0 || i5 == 1) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzng)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
        zzfkn zzfknVar = this.zzc;
        int i5 = zzfknVar.zze;
        if (i5 == 3) {
            return;
        }
        if (i5 == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcm)).booleanValue() && zzfknVar.zzY == 2) {
            int i10 = zzfknVar.zzq;
            if (i10 == 0) {
                this.zza.zza();
            } else {
                zzhcf.zzr(this.zzf, new zzdbq(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i10, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
    }

    public final /* synthetic */ void zzi() {
        synchronized (this) {
            try {
                zzhcy zzhcyVar = this.zzf;
                if (zzhcyVar.isDone()) {
                    return;
                }
                zzhcyVar.zza(Boolean.TRUE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final synchronized void zzj(K0 k02) {
        try {
            zzhcy zzhcyVar = this.zzf;
            if (zzhcyVar.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzg;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzhcyVar.zzb(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ zzddr zzk() {
        return this.zza;
    }
}
