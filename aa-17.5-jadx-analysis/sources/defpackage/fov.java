package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class fov implements Executor {
    private final Executor c;
    private Runnable d;
    private final ArrayDeque b = new ArrayDeque();
    public final Object a = new Object();

    public fov(Executor executor) {
        this.c = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.b.poll();
        this.d = runnable;
        if (runnable != null) {
            this.c.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.a) {
            this.b.add(new fku(this, runnable, 2));
            if (this.d == null) {
                a();
            }
        }
    }
}
