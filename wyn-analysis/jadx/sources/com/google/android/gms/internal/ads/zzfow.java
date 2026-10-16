package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfow implements zzbfr {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    public zzfow(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i5);
            zzfov zzfovVar = (zzfov) map.get(scheduledFuture);
            if (zzfovVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                C6.n.f1857D.k.getClass();
                zzb(zzfovVar.zza, Math.max(0L, zzfovVar.zzb - System.currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z2) {
        if (z2) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfou
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j8, TimeUnit timeUnit) {
        try {
            if (!this.zzd) {
                C6.n.f1857D.f1867g.zzb(this);
                this.zzd = true;
            }
            C6.n.f1857D.k.getClass();
            final zzfov zzfovVar = new zzfov(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j8));
            ScheduledFuture<?> scheduledFutureSchedule = this.zza.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfot
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfov zzfovVar2;
                    zzfov zzfovVar3 = zzfovVar;
                    zzfow zzfowVar = zzfovVar3.zzd;
                    synchronized (zzfowVar) {
                        try {
                            ScheduledFuture scheduledFuture = zzfovVar3.zzc;
                            zzfovVar2 = scheduledFuture != null ? (zzfov) zzfowVar.zze().remove(scheduledFuture) : null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (zzfovVar2 != null) {
                        zzfovVar3.zzd.zzd().execute(zzfovVar3.zza);
                    }
                }
            }, j8, timeUnit);
            zzfovVar.zzc = scheduledFutureSchedule;
            this.zzc.put(scheduledFutureSchedule, zzfovVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    public final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
