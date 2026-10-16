package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class uxx extends zeu implements Runnable, zgr {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ uxz f;

    public uxx(uxz uxzVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = uxzVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - this.f.a.a());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return uxz.a(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            Runnable runnable = this.e;
            runnable.getClass();
            runnable.run();
            boolean z = this.c;
            uxz uxzVar = this.f;
            if (z) {
                uxzVar.b.postDelayed(this, d());
            } else {
                uxzVar.b.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            p(th);
        }
    }
}
