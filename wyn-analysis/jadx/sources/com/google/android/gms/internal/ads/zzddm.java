package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzddm extends zzdix implements zzddd {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzddm(zzddi zzddiVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzq(zzddiVar, executor);
    }

    public final synchronized void zza() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzb() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf();
            }
        }, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzmp)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzc(final K0 k02) {
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddl
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzddd) obj).zzc(k02);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzd(final zzdnv zzdnvVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzddj
            @Override // com.google.android.gms.internal.ads.zzdiw
            public final /* synthetic */ void zza(Object obj) {
                ((zzddd) obj).zzd(zzdnvVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zze() {
        zzs(zzdde.zza);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            int i5 = G6.L.f4523b;
            H6.l.c("Timeout waiting for show call succeed to be called.");
            zzd(new zzdnv("Timeout for show call succeed."));
            this.zzd = true;
        }
    }
}
