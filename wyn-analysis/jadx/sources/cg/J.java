package cg;

import A7.AbstractC0279p0;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class J {

    /* renamed from: d, reason: collision with root package name */
    public static final I f19879d = new I();

    /* renamed from: a, reason: collision with root package name */
    public boolean f19880a;

    /* renamed from: b, reason: collision with root package name */
    public long f19881b;

    /* renamed from: c, reason: collision with root package name */
    public long f19882c;

    public J a() {
        this.f19880a = false;
        return this;
    }

    public J b() {
        this.f19882c = 0L;
        return this;
    }

    public long c() {
        if (this.f19880a) {
            return this.f19881b;
        }
        throw new IllegalStateException("No deadline");
    }

    public J d(long j8) {
        this.f19880a = true;
        this.f19881b = j8;
        return this;
    }

    public boolean e() {
        return this.f19880a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f19880a && this.f19881b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public J g(long j8, TimeUnit unit) {
        AbstractC3340k.e(unit, "unit");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "timeout < 0: ").toString());
        }
        this.f19882c = unit.toNanos(j8);
        return this;
    }
}
