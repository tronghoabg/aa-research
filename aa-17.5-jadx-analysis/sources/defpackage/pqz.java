package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class pqz extends zeu implements RunnableScheduledFuture, zgr {
    Callable b;
    private final boolean d;
    private final prb e;
    private final long f;
    private final long g;
    private final long h;
    private final AtomicLong i;
    private static final yob c = yob.c("com/google/android/apps/gmm/systems/concurrent/AbstractScheduledExecutor$Task");
    static final AtomicLong a = new AtomicLong();

    public pqz(Callable callable, boolean z, prb prbVar, long j, long j2, long j3, TimeUnit timeUnit) {
        Callable callable2;
        long j4;
        long j5;
        long j6;
        boolean z2;
        if (j != 0) {
            callable2 = callable;
            j4 = j;
            j5 = j2;
            j6 = j3;
        } else if (j2 != 0) {
            callable2 = callable;
            j5 = j2;
            j6 = j3;
            j4 = 0;
        } else if (j3 == 0) {
            callable2 = callable;
            j4 = 0;
            j5 = 0;
            j6 = 0;
        } else {
            callable2 = callable;
            j6 = j3;
            j4 = 0;
            j5 = 0;
        }
        this.b = callable2;
        this.d = z;
        this.e = prbVar;
        this.f = a.getAndIncrement();
        woy.O(j5 >= 0, "'period' must not be negative");
        woy.O(j6 >= 0, "'delay' must not be negative");
        if (j6 == 0) {
            z2 = true;
        } else if (j5 == 0) {
            j5 = 0;
            z2 = true;
        } else {
            z2 = false;
        }
        woy.O(z2, "One of 'delay' or 'period' must be zero.");
        long nanos = timeUnit.toNanos(j5 <= 0 ? -j6 : j5);
        this.g = nanos;
        long jB = prbVar.b.b() + timeUnit.toNanos(Math.max(0L, j4));
        this.h = jB;
        this.i = nanos != 0 ? new AtomicLong(jB) : null;
    }

    final long a() {
        AtomicLong atomicLong = this.i;
        return atomicLong != null ? atomicLong.get() : this.h;
    }

    @Override // defpackage.zeu
    protected final void b() {
        this.b = null;
        this.e.o(this);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        Delayed delayed2 = delayed;
        if (!(delayed2 instanceof pqz)) {
            return Long.compare(getDelay(TimeUnit.NANOSECONDS), delayed2.getDelay(TimeUnit.NANOSECONDS));
        }
        pqz pqzVar = (pqz) delayed2;
        return yde.b.d(a(), pqzVar.a()).d(this.f, pqzVar.f).a();
    }

    final void d() {
        AtomicLong atomicLong = this.i;
        atomicLong.getClass();
        long j = this.g;
        if (j > 0) {
            atomicLong.addAndGet(j);
        } else {
            atomicLong.set(this.e.b.b() - j);
        }
        try {
            this.e.m(this);
        } catch (RejectedExecutionException e) {
            ((ynz) ((ynz) ((ynz) c.h()).p(e)).ai(6848)).y("Repeating task rejected on  %s", this.e);
        }
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(a() - this.e.b.b(), TimeUnit.NANOSECONDS);
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return this.g != 0;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        boolean z;
        RuntimeException runtimeException;
        Callable callable = this.b;
        if (callable == null || isDone()) {
            return;
        }
        int i = prh.a;
        try {
            Object objCall = callable.call();
            if (!isPeriodic() || isDone()) {
                o(objCall);
            } else {
                d();
            }
        } finally {
            if (z) {
            }
        }
    }
}
