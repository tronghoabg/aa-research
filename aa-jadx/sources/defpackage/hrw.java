package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hrw implements java.util.concurrent.Future, defpackage.hrh, defpackage.hrg {
    private boolean a = false;
    private java.lang.Object b;
    private defpackage.hrl c;

    private final synchronized java.lang.Object c(java.lang.Long l) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        if (this.c != null) {
            throw new java.util.concurrent.ExecutionException(this.c);
        }
        if (!this.a) {
            if (l == null) {
                while (!isDone()) {
                    wait(0L);
                }
            } else if (l.longValue() > 0) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                long jLongValue = l.longValue() + jUptimeMillis;
                while (!isDone() && jUptimeMillis < jLongValue) {
                    wait(jLongValue - jUptimeMillis);
                    jUptimeMillis = android.os.SystemClock.uptimeMillis();
                }
            }
            if (this.c != null) {
                throw new java.util.concurrent.ExecutionException(this.c);
            }
            if (!this.a) {
                throw new java.util.concurrent.TimeoutException();
            }
        }
        return this.b;
    }

    @Override // defpackage.hrg
    public final synchronized void a(defpackage.hrl hrlVar) {
        this.c = hrlVar;
        notifyAll();
    }

    @Override // defpackage.hrh
    public final synchronized void b(java.lang.Object obj) {
        this.a = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        return c(java.lang.Long.valueOf(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        return this.a || this.c != null;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        try {
            return c(null);
        } catch (java.util.concurrent.TimeoutException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
