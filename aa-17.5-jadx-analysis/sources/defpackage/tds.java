package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class tds implements Future {
    private final Future a;
    private final Thread b;
    private boolean c;

    public tds(Future future, Thread thread) {
        this.a = future;
        this.b = thread;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!Thread.currentThread().equals(this.b)) {
            throw new IllegalStateException("Called from wrong thread");
        }
        if (this.c) {
            return false;
        }
        this.c = true;
        this.a.cancel(z);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (!Thread.currentThread().equals(this.b)) {
            throw new IllegalStateException("Called from wrong thread");
        }
        if (this.c) {
            throw new CancellationException("Future was previously canceled");
        }
        return this.a.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        if (Thread.currentThread().equals(this.b)) {
            return this.c;
        }
        throw new IllegalStateException("Called from wrong thread");
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (Thread.currentThread().equals(this.b)) {
            return this.c || this.a.isDone();
        }
        throw new IllegalStateException("Called from wrong thread");
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        if (!Thread.currentThread().equals(this.b)) {
            throw new IllegalStateException("Called from wrong thread");
        }
        if (!this.c) {
            return this.a.get();
        }
        throw new CancellationException("Future was previously canceled");
    }
}
