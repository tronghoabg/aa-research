package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class rbx implements java.lang.Runnable {
    public final java.util.concurrent.CountDownLatch a = new java.util.concurrent.CountDownLatch(1);
    public java.lang.Object b;
    public java.lang.IllegalStateException c;
    private final java.util.concurrent.Callable d;

    public rbx(java.util.concurrent.Callable callable) {
        this.d = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b = this.d.call();
        } catch (java.lang.IllegalStateException e) {
            this.c = e;
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
        this.a.countDown();
    }
}
