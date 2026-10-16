package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzfti {
    private final zzfsx zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private volatile ScheduledFuture zzc;
    private final zzful zzd;

    public zzfti(final zzfsx zzfsxVar, ScheduledExecutorService scheduledExecutorService, long j8, final zzful zzfulVar) {
        this.zzd = zzfulVar;
        this.zza = zzfsxVar;
        if (j8 > 0) {
            this.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(zzfsxVar, zzfulVar);
                }
            }, j8, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        if (this.zzb.compareAndSet(false, true)) {
            if (this.zzc != null) {
                this.zzc.cancel(false);
            }
            this.zza.zzc(this.zzd, false);
        }
    }

    public final /* synthetic */ void zzb(zzfsx zzfsxVar, zzful zzfulVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzfsxVar.zzc(zzfulVar, true);
        }
    }
}
