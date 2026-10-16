package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zgu extends defpackage.zge {
    private final defpackage.xwo c = new defpackage.xwo(null);
    private int a = 0;
    private boolean b = false;

    private final void a() {
        defpackage.xwo xwoVar = this.c;
        synchronized (xwoVar) {
            int i = this.a - 1;
            this.a = i;
            if (i == 0) {
                xwoVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) throws java.lang.InterruptedException {
        defpackage.xwo xwoVar = this.c;
        long nanos = timeUnit.toNanos(j);
        synchronized (xwoVar) {
            while (true) {
                if (this.b && this.a == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = java.lang.System.nanoTime();
                java.util.concurrent.TimeUnit.NANOSECONDS.timedWait(xwoVar, nanos);
                nanos -= java.lang.System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.c) {
            if (this.b) {
                throw new java.util.concurrent.RejectedExecutionException("Executor already shutdown");
            }
            this.a++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.b && this.a == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        defpackage.xwo xwoVar = this.c;
        synchronized (xwoVar) {
            this.b = true;
            if (this.a == 0) {
                xwoVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        shutdown();
        int i = defpackage.ygw.d;
        return defpackage.ymx.a;
    }
}
