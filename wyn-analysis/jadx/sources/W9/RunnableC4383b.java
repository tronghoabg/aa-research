package w9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadFactory;

/* renamed from: w9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC4383b implements Runnable, ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f47410a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public Runnable f47411b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ExecutorC4384c f47412c;

    public RunnableC4383b(ExecutorC4384c executorC4384c) {
        this.f47412c = executorC4384c;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        A6.c.z(this.f47411b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
        this.f47411b = runnable;
        this.f47410a.countDown();
        return this.f47412c.f47415c;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.f47410a.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.f47411b.run();
    }
}
