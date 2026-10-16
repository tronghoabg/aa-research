package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wge implements java.io.Closeable {
    public java.util.concurrent.Semaphore a;

    public wge(java.util.concurrent.Semaphore semaphore) {
        this.a = semaphore;
    }

    public final java.util.concurrent.Semaphore a() {
        java.util.concurrent.Semaphore semaphore = this.a;
        this.a = null;
        return semaphore;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.util.concurrent.Semaphore semaphore = this.a;
        if (semaphore != null) {
            semaphore.release();
            this.a = null;
        }
    }
}
