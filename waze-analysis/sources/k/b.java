package k;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
final class b extends Thread {
    public b() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r7 = k.e.i()     // Catch: java.lang.InterruptedException -> L0
            java.util.concurrent.locks.Lock r7 = (java.util.concurrent.locks.Lock) r7     // Catch: java.lang.InterruptedException -> L0
            r7.lock()     // Catch: java.lang.InterruptedException -> L0
            k.ad r0 = k.e.k()     // Catch: java.lang.Throwable -> L7a
            k.e r0 = r0.a()     // Catch: java.lang.Throwable -> L7a
            r1 = 0
            if (r0 != 0) goto L41
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.locks.Condition r0 = k.e.h()     // Catch: java.lang.Throwable -> L7a
            long r4 = k.e.c()     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L7a
            r0.await(r4, r6)     // Catch: java.lang.Throwable -> L7a
            k.ad r0 = k.e.k()     // Catch: java.lang.Throwable -> L7a
            k.e r0 = r0.a()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L58
            long r4 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7a
            long r4 = r4 - r2
            long r2 = k.e.d()     // Catch: java.lang.Throwable -> L7a
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L58
            k.e r0 = k.e.j()     // Catch: java.lang.Throwable -> L7a
            goto L64
        L41:
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L7a
            long r2 = r0.f(r2)     // Catch: java.lang.Throwable -> L7a
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L5a
            java.util.concurrent.locks.Condition r0 = k.e.h()     // Catch: java.lang.Throwable -> L7a
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L7a
            r0.await(r2, r4)     // Catch: java.lang.Throwable -> L7a
        L58:
            r0 = r1
            goto L64
        L5a:
            k.ad r1 = k.e.k()     // Catch: java.lang.Throwable -> L7a
            r1.c(r0)     // Catch: java.lang.Throwable -> L7a
            k.e.n(r0)     // Catch: java.lang.Throwable -> L7a
        L64:
            k.e r1 = k.e.j()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r1) goto L71
            k.e.o()     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.InterruptedException -> L0
            return
        L71:
            r7.unlock()     // Catch: java.lang.InterruptedException -> L0
            if (r0 == 0) goto L0
            r0.a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L7a:
            r0 = move-exception
            r7.unlock()     // Catch: java.lang.InterruptedException -> L0
            throw r0     // Catch: java.lang.InterruptedException -> L0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.run():void");
    }
}
