package defpackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class adyc implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ adyc(aitf aitfVar, aiwv aiwvVar, int i) {
        this.c = i;
        this.b = aitfVar;
        this.a = aiwvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [adzx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [aitf, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException, TimeoutException, BrokenBarrierException {
        int i = this.c;
        if (i == 0) {
            ((adyd) this.b).b.t((adye) this.a);
            return;
        }
        if (i == 1) {
            ((adyd) ((uze) this.b).b).b.t((adye) this.a);
            return;
        }
        if (i == 2) {
            ((adyd) this.b).b.w.d(this.a);
            return;
        }
        Object obj = this.a;
        if (i != 3) {
            this.b.f((aitu) obj, afak.a);
            return;
        }
        try {
            ((CyclicBarrier) obj).await(1000L, TimeUnit.MILLISECONDS);
            ((CountDownLatch) this.b).await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }

    public adyc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }

    public adyc(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch, int i) {
        this.c = i;
        this.a = cyclicBarrier;
        this.b = countDownLatch;
    }
}
