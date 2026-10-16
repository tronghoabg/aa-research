package defpackage;

/* loaded from: classes.dex */
final class zha implements Runnable {
    Runnable a;
    final /* synthetic */ zhb b;

    public zha(zhb zhbVar) {
        this.b = zhbVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        defpackage.zhb.a.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        r11.a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x002d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 1
            zhb r3 = r11.b     // Catch: java.lang.Throwable -> L46
            java.util.Deque r4 = r3.b     // Catch: java.lang.Throwable -> L46
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L23
            int r0 = r3.d     // Catch: java.lang.Throwable -> L78
            r5 = 4
            if (r0 != r5) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L35
        L12:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L85
            r0.interrupt()     // Catch: java.lang.Error -> L85
            goto L35
        L1a:
            long r6 = r3.c     // Catch: java.lang.Throwable -> L78
            r8 = 1
            long r6 = r6 + r8
            r3.c = r6     // Catch: java.lang.Throwable -> L78
            r3.d = r5     // Catch: java.lang.Throwable -> L78
        L23:
            java.lang.Object r0 = r4.poll()     // Catch: java.lang.Throwable -> L78
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L78
            r11.a = r0     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L36
            zhb r0 = r11.b     // Catch: java.lang.Throwable -> L78
            r0.d = r2     // Catch: java.lang.Throwable -> L78
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            if (r1 == 0) goto L35
            goto L12
        L35:
            return
        L36:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L46
            r1 = r1 | r0
            r3 = 0
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r0.run()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r11.a = r3     // Catch: java.lang.Throwable -> L46
        L44:
            r0 = r2
            goto L2
        L46:
            r0 = move-exception
            goto L7b
        L48:
            r0 = move-exception
            goto L75
        L4a:
            r0 = move-exception
            r9 = r0
            zgo r0 = defpackage.zhb.a     // Catch: java.lang.Throwable -> L48
            java.util.logging.Logger r4 = r0.a()     // Catch: java.lang.Throwable -> L48
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L48
            java.lang.String r6 = "com.google.common.util.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r0 = r11.a     // Catch: java.lang.Throwable -> L48
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48
            r8.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r10 = "Exception while executing runnable "
            r8.append(r10)     // Catch: java.lang.Throwable -> L48
            r8.append(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L48
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L48
            r11.a = r3     // Catch: java.lang.Throwable -> L46
            goto L44
        L75:
            r11.a = r3     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Throwable -> L46
        L78:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L78
            throw r0     // Catch: java.lang.Throwable -> L46
        L7b:
            if (r1 == 0) goto L84
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L85
            r1.interrupt()     // Catch: java.lang.Error -> L85
        L84:
            throw r0     // Catch: java.lang.Error -> L85
        L85:
            r0 = move-exception
            zhb r11 = r11.b
            java.util.Deque r1 = r11.b
            monitor-enter(r1)
            r11.d = r2     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            throw r0
        L8f:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zha.run():void");
    }

    public final String toString() {
        Runnable runnable = this.a;
        if (runnable != null) {
            return a.bW(runnable, "SequentialExecutorWorker{running=", "}");
        }
        int i = this.b.d;
        return a.bq(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE", "SequentialExecutorWorker{state=", "}");
    }
}
