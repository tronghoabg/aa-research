package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajpe {
    public static final defpackage.ajpe k = new defpackage.ajpd();
    private boolean a;
    private long b;
    public long l;

    public void f() throws java.io.IOException {
        if (java.lang.Thread.currentThread().isInterrupted()) {
            throw new java.io.InterruptedIOException("interrupted");
        }
        if (this.a && this.b - java.lang.System.nanoTime() <= 0) {
            throw new java.io.InterruptedIOException("deadline reached");
        }
    }

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new java.lang.IllegalStateException("No deadline");
    }

    public defpackage.ajpe i() {
        this.l = 0L;
        return this;
    }

    public defpackage.ajpe j(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public defpackage.ajpe k(long j, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        this.l = timeUnit.toNanos(j);
        return this;
    }

    public defpackage.ajpe l() {
        this.a = false;
        return this;
    }
}
