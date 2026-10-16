package k;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class ao {

    /* renamed from: c, reason: collision with root package name */
    public static final ao f50818c = new an();

    /* renamed from: a, reason: collision with root package name */
    private boolean f50819a;

    /* renamed from: b, reason: collision with root package name */
    private long f50820b;

    /* renamed from: d, reason: collision with root package name */
    private long f50821d;

    public final long p() {
        return this.f50821d;
    }

    public long q() {
        if (this.f50819a) {
            return this.f50820b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ao r() {
        this.f50821d = 0L;
        return this;
    }

    public ao s(long j2) {
        this.f50819a = true;
        this.f50820b = j2;
        return this;
    }

    public ao t(long j2, TimeUnit timeUnit) {
        h.g.b.x.f(timeUnit, "unit");
        if (j2 < 0) {
            throw new IllegalArgumentException(o.b(j2, "timeout < 0: "));
        }
        this.f50821d = timeUnit.toNanos(j2);
        return this;
    }

    public void u() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f50819a && this.f50820b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean v() {
        return this.f50819a;
    }

    public ao w() {
        this.f50819a = false;
        return this;
    }
}
