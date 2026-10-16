package w9;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* renamed from: w9.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ExecutorC4387f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Semaphore f47430a = new Semaphore(0);

    /* renamed from: b, reason: collision with root package name */
    public int f47431b = 0;

    public final void b() {
        try {
            this.f47430a.acquire(this.f47431b);
            this.f47431b = 0;
        } catch (InterruptedException e7) {
            Thread.currentThread().interrupt();
            A6.c.s("Interrupted while waiting for background task", e7);
            throw null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47431b++;
        AbstractC4392k.f47446c.execute(new ng.a(26, this, runnable));
    }
}
