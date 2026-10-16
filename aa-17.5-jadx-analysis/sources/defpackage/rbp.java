package defpackage;

import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
final class rbp extends rbn {
    public final Semaphore b;
    public boolean c;
    public boolean d;

    public rbp(Semaphore semaphore) {
        this.b = semaphore;
    }

    @Override // defpackage.rbn
    protected final synchronized void b() {
        this.c = true;
        notify();
    }

    @Override // defpackage.rbn
    protected final boolean c() {
        return false;
    }

    public final synchronized void d() {
        this.b.release();
        this.d = true;
        notify();
    }

    public final synchronized boolean e() throws InterruptedException {
        boolean zTryAcquire = false;
        while (!this.c && !(zTryAcquire = this.b.tryAcquire())) {
            this.d = false;
            wait();
        }
        if (!zTryAcquire) {
            if (!this.b.tryAcquire()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.rbn
    protected final void a() {
    }
}
