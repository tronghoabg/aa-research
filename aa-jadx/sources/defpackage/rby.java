package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rby implements java.lang.Runnable {
    private final java.lang.Runnable a;
    private volatile boolean b = false;
    private java.lang.Exception c;

    public rby(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        synchronized (this) {
            while (!this.b) {
                try {
                    wait();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            java.lang.Exception exc = this.c;
            if (exc != null) {
                throw new java.lang.RuntimeException(exc);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (java.lang.Exception e) {
            this.c = e;
        }
        synchronized (this) {
            this.b = true;
            notifyAll();
        }
    }
}
