package android.support.v7.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class r implements Executor {

    /* renamed from: b, reason: collision with root package name */
    final Executor f619b;

    /* renamed from: c, reason: collision with root package name */
    Runnable f620c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f621d = new Object();

    /* renamed from: a, reason: collision with root package name */
    final Queue f618a = new ArrayDeque();

    r(Executor executor) {
        this.f619b = executor;
    }

    protected final void a() {
        synchronized (this.f621d) {
            Runnable runnable = (Runnable) this.f618a.poll();
            this.f620c = runnable;
            if (runnable != null) {
                this.f619b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.f621d) {
            this.f618a.add(new Runnable() { // from class: android.support.v7.app.q
                @Override // java.lang.Runnable
                public final void run() {
                    r rVar = this.f616a;
                    try {
                        runnable.run();
                    } finally {
                        rVar.a();
                    }
                }
            });
            if (this.f620c == null) {
                a();
            }
        }
    }
}
