package e.a.f;

import j$.util.Objects;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CyclicBarrier f47746a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CountDownLatch f47747b;

    y(ac acVar, CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.f47746a = cyclicBarrier;
        this.f47747b = countDownLatch;
        Objects.requireNonNull(acVar);
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        try {
            this.f47746a.await(1000L, TimeUnit.MILLISECONDS);
            this.f47747b.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }
}
