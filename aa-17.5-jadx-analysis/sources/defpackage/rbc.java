package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class rbc implements Runnable {
    public final CountDownLatch a = new CountDownLatch(1);
    public Object b;
    public IllegalStateException c;
    private final Callable d;

    public rbc(Callable callable) {
        this.d = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b = this.d.call();
        } catch (IllegalStateException e) {
            this.c = e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
        this.a.countDown();
    }
}
