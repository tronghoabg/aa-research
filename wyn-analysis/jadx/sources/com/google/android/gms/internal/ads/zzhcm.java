package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes3.dex */
abstract class zzhcm extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzhcl(null);
    private static final Runnable zzb = new zzhcl(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzhck zzhckVar = null;
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            if (!(runnable instanceof zzhck)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzhckVar = (zzhck) runnable;
            }
            i5++;
            if (i5 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z2 = Thread.interrupted() || z2;
                    LockSupport.park(zzhckVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzhcx.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strT;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            strT = "running=[DONE]";
        } else if (runnable instanceof zzhck) {
            strT = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            strT = M6.t(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            strT = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        return M6.t(new StringBuilder(strT.length() + 2 + String.valueOf(strZzc).length()), strT, ", ", strZzc);
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzhck zzhckVar = new zzhck(this, null);
            zzhckVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzhckVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
