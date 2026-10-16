package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ajns extends java.lang.Thread {
    public ajns() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                java.util.concurrent.locks.ReentrantLock reentrantLock = defpackage.ajnv.d;
                reentrantLock.lock();
                try {
                    defpackage.ajot ajotVar = defpackage.ajnv.b;
                    defpackage.ajnv ajnvVarA = ajotVar.a();
                    if (ajnvVarA == null) {
                        long jNanoTime = java.lang.System.nanoTime();
                        defpackage.ajnv.e.await(defpackage.ajnv.f, java.util.concurrent.TimeUnit.MILLISECONDS);
                        ajnvVarA = (ajotVar.a() != null || java.lang.System.nanoTime() - jNanoTime < defpackage.ajnv.g) ? null : defpackage.ajnv.c;
                    } else {
                        long jNanoTime2 = ajnvVarA.j - java.lang.System.nanoTime();
                        if (jNanoTime2 > 0) {
                            defpackage.ajnv.e.await(jNanoTime2, java.util.concurrent.TimeUnit.NANOSECONDS);
                        } else {
                            ajotVar.c(ajnvVarA);
                            ajnvVarA.h = 2;
                        }
                    }
                    if (ajnvVarA == defpackage.ajnv.c) {
                        defpackage.ajnv.c = null;
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (ajnvVarA != null) {
                            ajnvVarA.a();
                        }
                    }
                } finally {
                    reentrantLock.unlock();
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
