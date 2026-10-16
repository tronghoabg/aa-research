package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class zzatf extends Thread {
    private final BlockingQueue zza;
    private final zzate zzb;
    private final zzasv zzc;
    private volatile boolean zzd = false;
    private final zzatc zze;

    public zzatf(BlockingQueue blockingQueue, zzate zzateVar, zzasv zzasvVar, zzatc zzatcVar) {
        this.zza = blockingQueue;
        this.zzb = zzateVar;
        this.zzc = zzasvVar;
        this.zze = zzatcVar;
    }

    private void zzb() throws InterruptedException {
        zzatl zzatlVar = (zzatl) this.zza.take();
        SystemClock.elapsedRealtime();
        zzatlVar.zze(3);
        try {
            try {
                zzatlVar.zzc("network-queue-take");
                zzatlVar.zzl();
                TrafficStats.setThreadStatsTag(zzatlVar.zzb());
                zzath zzathVarZza = this.zzb.zza(zzatlVar);
                zzatlVar.zzc("network-http-complete");
                if (zzathVarZza.zze && zzatlVar.zzq()) {
                    zzatlVar.zzd("not-modified");
                    zzatlVar.zzw();
                } else {
                    zzatr zzatrVarZzr = zzatlVar.zzr(zzathVarZza);
                    zzatlVar.zzc("network-parse-complete");
                    zzasu zzasuVar = zzatrVarZzr.zzb;
                    if (zzasuVar != null) {
                        this.zzc.zzb(zzatlVar.zzi(), zzasuVar);
                        zzatlVar.zzc("network-cache-written");
                    }
                    zzatlVar.zzp();
                    this.zze.zza(zzatlVar, zzatrVarZzr, null);
                    zzatlVar.zzv(zzatrVarZzr);
                }
            } catch (zzatu e7) {
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatlVar, e7);
                zzatlVar.zzw();
            } catch (Exception e10) {
                zzatx.zzd(e10, "Unhandled exception %s", e10.toString());
                zzatu zzatuVar = new zzatu(e10);
                SystemClock.elapsedRealtime();
                this.zze.zzb(zzatlVar, zzatuVar);
                zzatlVar.zzw();
            }
            zzatlVar.zze(4);
        } catch (Throwable th) {
            zzatlVar.zze(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatx.zzc("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
