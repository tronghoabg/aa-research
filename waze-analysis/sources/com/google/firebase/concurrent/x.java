package com.google.firebase.concurrent;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    Runnable f9040a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f9041b;

    /* synthetic */ x(y yVar) {
        Objects.requireNonNull(yVar);
        this.f9041b = yVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r1 == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r11.f9040a.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        com.google.firebase.concurrent.y.f9042a.logp(java.util.logging.Level.SEVERE, "com.google.firebase.concurrent.SequentialExecutor$QueueWorker", "workOnQueue", "Exception while executing runnable " + java.lang.String.valueOf(r11.f9040a), (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r11.f9040a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        r11.f9040a = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0039 A[SYNTHETIC] */
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
            com.google.firebase.concurrent.y r3 = r11.f9041b     // Catch: java.lang.Throwable -> L53
            java.util.Deque r4 = com.google.firebase.concurrent.y.b(r3)     // Catch: java.lang.Throwable -> L53
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L53
            if (r0 != 0) goto L2b
            int r0 = com.google.firebase.concurrent.y.e(r3)     // Catch: java.lang.Throwable -> L83
            r5 = 4
            if (r0 != r5) goto L1e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L42
        L16:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L90
            r0.interrupt()     // Catch: java.lang.Error -> L90
            goto L42
        L1e:
            long r6 = com.google.firebase.concurrent.y.a(r3)     // Catch: java.lang.Throwable -> L83
            r8 = 1
            long r6 = r6 + r8
            com.google.firebase.concurrent.y.d(r3, r6)     // Catch: java.lang.Throwable -> L83
            com.google.firebase.concurrent.y.f(r3, r5)     // Catch: java.lang.Throwable -> L83
        L2b:
            java.util.Deque r0 = com.google.firebase.concurrent.y.b(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L83
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch: java.lang.Throwable -> L83
            r11.f9040a = r0     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L43
            com.google.firebase.concurrent.y r0 = r11.f9041b     // Catch: java.lang.Throwable -> L83
            com.google.firebase.concurrent.y.f(r0, r2)     // Catch: java.lang.Throwable -> L83
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L42
            goto L16
        L42:
            return
        L43:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L53
            r1 = r1 | r0
            r3 = 0
            java.lang.Runnable r0 = r11.f9040a     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            r0.run()     // Catch: java.lang.Throwable -> L55 java.lang.RuntimeException -> L57
            r11.f9040a = r3     // Catch: java.lang.Throwable -> L53
        L51:
            r0 = r2
            goto L2
        L53:
            r0 = move-exception
            goto L86
        L55:
            r0 = move-exception
            goto L80
        L57:
            r0 = move-exception
            r9 = r0
            java.util.logging.Logger r4 = com.google.firebase.concurrent.y.c()     // Catch: java.lang.Throwable -> L55
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "com.google.firebase.concurrent.SequentialExecutor$QueueWorker"
            java.lang.String r7 = "workOnQueue"
            java.lang.Runnable r0 = r11.f9040a     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r8.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = "Exception while executing runnable "
            r8.append(r10)     // Catch: java.lang.Throwable -> L55
            r8.append(r0)     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L55
            r4.logp(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L55
            r11.f9040a = r3     // Catch: java.lang.Throwable -> L53
            goto L51
        L80:
            r11.f9040a = r3     // Catch: java.lang.Throwable -> L53
            throw r0     // Catch: java.lang.Throwable -> L53
        L83:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L53
        L86:
            if (r1 == 0) goto L8f
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Error -> L90
            r1.interrupt()     // Catch: java.lang.Error -> L90
        L8f:
            throw r0     // Catch: java.lang.Error -> L90
        L90:
            r0 = move-exception
            com.google.firebase.concurrent.y r11 = r11.f9041b
            java.util.Deque r1 = com.google.firebase.concurrent.y.b(r11)
            monitor-enter(r1)
            com.google.firebase.concurrent.y.f(r11, r2)     // Catch: java.lang.Throwable -> L9d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r0
        L9d:
            r0 = move-exception
            r11 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.x.run():void");
    }

    public final String toString() {
        Runnable runnable = this.f9040a;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable.toString() + "}";
        }
        int i2 = this.f9041b.f9047f;
        return "SequentialExecutorWorker{state=" + (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE") + "}";
    }
}
