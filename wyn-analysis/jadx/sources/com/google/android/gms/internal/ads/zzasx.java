package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class zzasx extends Thread {
    private static final boolean zza = zzatx.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzasv zzd;
    private volatile boolean zze = false;
    private final zzaty zzf;
    private final zzatc zzg;

    public zzasx(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzasv zzasvVar, zzatc zzatcVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzasvVar;
        this.zzg = zzatcVar;
        this.zzf = new zzaty(this, blockingQueue2, zzatcVar);
    }

    private void zzc() throws InterruptedException {
        zzatl zzatlVar = (zzatl) this.zzb.take();
        zzatlVar.zzc("cache-queue-take");
        zzatlVar.zze(1);
        try {
            zzatlVar.zzl();
            zzasv zzasvVar = this.zzd;
            zzasu zzasuVarZza = zzasvVar.zza(zzatlVar.zzi());
            if (zzasuVarZza == null) {
                zzatlVar.zzc("cache-miss");
                if (!this.zzf.zzc(zzatlVar)) {
                    this.zzc.put(zzatlVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzasuVarZza.zza(jCurrentTimeMillis)) {
                    zzatlVar.zzc("cache-hit-expired");
                    zzatlVar.zzj(zzasuVarZza);
                    if (!this.zzf.zzc(zzatlVar)) {
                        this.zzc.put(zzatlVar);
                    }
                } else {
                    zzatlVar.zzc("cache-hit");
                    zzatr zzatrVarZzr = zzatlVar.zzr(new zzath(zzasuVarZza.zza, zzasuVarZza.zzg));
                    zzatlVar.zzc("cache-hit-parsed");
                    if (!zzatrVarZzr.zzc()) {
                        zzatlVar.zzc("cache-parsing-failed");
                        zzasvVar.zzd(zzatlVar.zzi(), true);
                        zzatlVar.zzj(null);
                        if (!this.zzf.zzc(zzatlVar)) {
                            this.zzc.put(zzatlVar);
                        }
                    } else if (zzasuVarZza.zzf < jCurrentTimeMillis) {
                        zzatlVar.zzc("cache-hit-refresh-needed");
                        zzatlVar.zzj(zzasuVarZza);
                        zzatrVarZzr.zzd = true;
                        if (this.zzf.zzc(zzatlVar)) {
                            this.zzg.zza(zzatlVar, zzatrVarZzr, null);
                        } else {
                            this.zzg.zza(zzatlVar, zzatrVarZzr, new zzasw(this, zzatlVar));
                        }
                    } else {
                        this.zzg.zza(zzatlVar, zzatrVarZzr, null);
                    }
                }
            }
            zzatlVar.zze(2);
        } catch (Throwable th) {
            zzatlVar.zze(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        if (zza) {
            zzatx.zza("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzc();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzatx.zzc("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zze = true;
        interrupt();
    }

    public final /* synthetic */ BlockingQueue zzb() {
        return this.zzc;
    }
}
