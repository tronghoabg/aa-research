package defpackage;

/* loaded from: classes2.dex */
final class ajms extends Thread {
    public ajms() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r8 = defpackage.ajmv.d     // Catch: java.lang.InterruptedException -> L0
            r8.lock()     // Catch: java.lang.InterruptedException -> L0
            ajnt r0 = defpackage.ajmv.b     // Catch: java.lang.Throwable -> L5e
            ajmv r1 = r0.a()     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            if (r1 != 0) goto L2f
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.locks.Condition r1 = defpackage.ajmv.e     // Catch: java.lang.Throwable -> L5e
            long r5 = defpackage.ajmv.f     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L5e
            r1.await(r5, r7)     // Catch: java.lang.Throwable -> L5e
            ajmv r0 = r0.a()     // Catch: java.lang.Throwable -> L5e
            if (r0 != 0) goto L43
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5e
            long r0 = r0 - r3
            long r3 = defpackage.ajmv.g     // Catch: java.lang.Throwable -> L5e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L43
            ajmv r1 = defpackage.ajmv.c     // Catch: java.lang.Throwable -> L5e
            goto L4b
        L2f:
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5e
            long r5 = r1.j     // Catch: java.lang.Throwable -> L5e
            long r5 = r5 - r3
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L45
            java.util.concurrent.locks.Condition r0 = defpackage.ajmv.e     // Catch: java.lang.Throwable -> L5e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L5e
            r0.await(r5, r1)     // Catch: java.lang.Throwable -> L5e
        L43:
            r1 = r2
            goto L4b
        L45:
            r0.c(r1)     // Catch: java.lang.Throwable -> L5e
            r0 = 2
            r1.h = r0     // Catch: java.lang.Throwable -> L5e
        L4b:
            ajmv r0 = defpackage.ajmv.c     // Catch: java.lang.Throwable -> L5e
            if (r1 != r0) goto L55
            defpackage.ajmv.c = r2     // Catch: java.lang.Throwable -> L5e
            r8.unlock()     // Catch: java.lang.InterruptedException -> L0
            return
        L55:
            r8.unlock()     // Catch: java.lang.InterruptedException -> L0
            if (r1 == 0) goto L0
            r1.a()     // Catch: java.lang.InterruptedException -> L0
            goto L0
        L5e:
            r0 = move-exception
            r8.unlock()     // Catch: java.lang.InterruptedException -> L0
            throw r0     // Catch: java.lang.InterruptedException -> L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajms.run():void");
    }
}
