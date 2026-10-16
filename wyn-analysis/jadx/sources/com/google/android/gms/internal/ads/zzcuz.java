package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzcuz implements zzbfr {
    private final ScheduledExecutorService zza;
    private final InterfaceC3596a zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcuz(ScheduledExecutorService scheduledExecutorService, InterfaceC3596a interfaceC3596a) {
        this.zza = scheduledExecutorService;
        this.zzb = interfaceC3596a;
        C6.n.f1857D.f1867g.zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z2) {
        if (z2) {
            zzd();
        } else {
            zzc();
        }
    }

    public final synchronized void zzb(int i5, Runnable runnable) {
        this.zzf = runnable;
        ((C3597b) this.zzb).getClass();
        long j8 = i5;
        this.zzd = SystemClock.elapsedRealtime() + j8;
        this.zzc = this.zza.schedule(runnable, j8, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zzc() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                long j8 = this.zzd;
                ((C3597b) this.zzb).getClass();
                this.zze = j8 - SystemClock.elapsedRealtime();
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
