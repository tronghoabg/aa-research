package defpackage;

/* JADX INFO: loaded from: classes3.dex */
class tep implements java.util.concurrent.Future {
    private final java.util.concurrent.Future a;
    private final java.lang.Thread b;
    private boolean c;

    public tep(java.util.concurrent.Future future, java.lang.Thread thread) {
        this.a = future;
        this.b = thread;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!java.lang.Thread.currentThread().equals(this.b)) {
            throw new java.lang.IllegalStateException("Called from wrong thread");
        }
        if (this.c) {
            return false;
        }
        this.c = true;
        this.a.cancel(z);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        if (!java.lang.Thread.currentThread().equals(this.b)) {
            throw new java.lang.IllegalStateException("Called from wrong thread");
        }
        if (this.c) {
            throw new java.util.concurrent.CancellationException("Future was previously canceled");
        }
        return this.a.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (java.lang.Thread.currentThread().equals(this.b)) {
            return this.c;
        }
        throw new java.lang.IllegalStateException("Called from wrong thread");
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (java.lang.Thread.currentThread().equals(this.b)) {
            return this.c || this.a.isDone();
        }
        throw new java.lang.IllegalStateException("Called from wrong thread");
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        if (!java.lang.Thread.currentThread().equals(this.b)) {
            throw new java.lang.IllegalStateException("Called from wrong thread");
        }
        if (!this.c) {
            return this.a.get();
        }
        throw new java.util.concurrent.CancellationException("Future was previously canceled");
    }
}
