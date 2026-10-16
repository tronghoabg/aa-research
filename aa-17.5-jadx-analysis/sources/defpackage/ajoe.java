package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ajoe {
    public static final ajoe k = new ajod();
    private boolean a;
    private long b;
    public long l;

    public void f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public ajoe i() {
        this.l = 0L;
        return this;
    }

    public ajoe j(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public ajoe k(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.l = timeUnit.toNanos(j);
        return this;
    }

    public ajoe l() {
        this.a = false;
        return this;
    }
}
