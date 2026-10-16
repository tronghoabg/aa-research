package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class uxy extends zeu implements Runnable, zgr {
    final /* synthetic */ uxz a;
    private Callable b;
    private final long c;

    public uxy(uxz uxzVar, Callable callable, long j) {
        this.a = uxzVar;
        this.b = callable;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return uxz.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return Math.max(0L, TimeUnit.MILLISECONDS.convert(this.c - this.a.a.a(), timeUnit));
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        try {
            Callable callable = this.b;
            callable.getClass();
            this.b = null;
            o(callable.call());
        } catch (Throwable th) {
            p(th);
            throw new RuntimeException(th);
        }
    }
}
