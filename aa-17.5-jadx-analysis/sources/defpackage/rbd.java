package defpackage;

/* loaded from: classes.dex */
final class rbd implements Runnable {
    private final Runnable a;
    private volatile boolean b = false;
    private Exception c;

    public rbd(Runnable runnable) {
        this.a = runnable;
    }

    public final void a() {
        synchronized (this) {
            while (!this.b) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            Exception exc = this.c;
            if (exc != null) {
                throw new RuntimeException(exc);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Exception e) {
            this.c = e;
        }
        synchronized (this) {
            this.b = true;
            notifyAll();
        }
    }
}
