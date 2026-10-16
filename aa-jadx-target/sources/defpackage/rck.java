package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class rck extends defpackage.rci {
    public final java.util.concurrent.Semaphore b;
    public boolean c;
    public boolean d;

    public rck(java.util.concurrent.Semaphore semaphore) {
        this.b = semaphore;
    }

    @Override // defpackage.rci
    protected final synchronized void b() {
        this.c = true;
        notify();
    }

    @Override // defpackage.rci
    protected final boolean c() {
        return false;
    }

    public final synchronized void d() {
        this.b.release();
        this.d = true;
        notify();
    }

    public final synchronized boolean e() throws java.lang.InterruptedException {
        boolean zTryAcquire = false;
        while (!this.c && !(zTryAcquire = this.b.tryAcquire())) {
            this.d = false;
            wait();
        }
        return zTryAcquire || this.b.tryAcquire();
    }

    @Override // defpackage.rci
    protected final void a() {
    }
}
