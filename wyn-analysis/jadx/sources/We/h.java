package We;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class h extends He.m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f15489b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f15490c;

    /* renamed from: d, reason: collision with root package name */
    public static final TimeUnit f15491d = TimeUnit.SECONDS;

    /* renamed from: e, reason: collision with root package name */
    public static final g f15492e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f15493f;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f15494a;

    static {
        g gVar = new g(new l("RxCachedThreadSchedulerShutdown"));
        f15492e = gVar;
        gVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        l lVar = new l("RxCachedThreadScheduler", iMax, false);
        f15489b = lVar;
        f15490c = new l("RxCachedWorkerPoolEvictor", iMax, false);
        e eVar = new e(0L, null, lVar);
        f15493f = eVar;
        eVar.f15480c.dispose();
        ScheduledFuture scheduledFuture = eVar.f15482e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar.f15481d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public h() {
        AtomicReference atomicReference;
        l lVar = f15489b;
        e eVar = f15493f;
        this.f15494a = new AtomicReference(eVar);
        e eVar2 = new e(60L, f15491d, lVar);
        do {
            atomicReference = this.f15494a;
            if (atomicReference.compareAndSet(eVar, eVar2)) {
                return;
            }
        } while (atomicReference.get() == eVar);
        eVar2.f15480c.dispose();
        ScheduledFuture scheduledFuture = eVar2.f15482e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = eVar2.f15481d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // He.m
    public final He.l a() {
        return new f((e) this.f15494a.get());
    }
}
