package We;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends He.m {

    /* renamed from: b, reason: collision with root package name */
    public static final b f15473b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f15474c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f15475d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f15476e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f15477a;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f15475d = iAvailableProcessors;
        c cVar = new c(new l("RxComputationShutdown"));
        f15476e = cVar;
        cVar.dispose();
        l lVar = new l("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f15474c = lVar;
        b bVar = new b(0, lVar);
        f15473b = bVar;
        for (c cVar2 : bVar.f15471b) {
            cVar2.dispose();
        }
    }

    public d() {
        AtomicReference atomicReference;
        l lVar = f15474c;
        b bVar = f15473b;
        this.f15477a = new AtomicReference(bVar);
        b bVar2 = new b(f15475d, lVar);
        do {
            atomicReference = this.f15477a;
            if (atomicReference.compareAndSet(bVar, bVar2)) {
                return;
            }
        } while (atomicReference.get() == bVar);
        for (c cVar : bVar2.f15471b) {
            cVar.dispose();
        }
    }

    @Override // He.m
    public final He.l a() {
        c cVar;
        b bVar = (b) this.f15477a.get();
        int i5 = bVar.f15470a;
        if (i5 == 0) {
            cVar = f15476e;
        } else {
            long j8 = bVar.f15472c;
            bVar.f15472c = 1 + j8;
            cVar = bVar.f15471b[(int) (j8 % i5)];
        }
        return new a(cVar);
    }

    @Override // He.m
    public final Je.b c(Runnable runnable) {
        c cVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        b bVar = (b) this.f15477a.get();
        int i5 = bVar.f15470a;
        if (i5 == 0) {
            cVar = f15476e;
        } else {
            long j8 = bVar.f15472c;
            bVar.f15472c = 1 + j8;
            cVar = bVar.f15471b[(int) (j8 % i5)];
        }
        cVar.getClass();
        m mVar = new m(runnable);
        try {
            mVar.a(cVar.f15497a.submit(mVar));
            return mVar;
        } catch (RejectedExecutionException e7) {
            S3.f.A(e7);
            return Me.b.f7635a;
        }
    }
}
