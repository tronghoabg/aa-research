package e.c.c.b;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l extends e.c.k {

    /* renamed from: b, reason: collision with root package name */
    static final i f47898b;

    /* renamed from: c, reason: collision with root package name */
    static final ScheduledExecutorService f47899c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f47900d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f47899c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f47898b = new i("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public l() {
        i iVar = f47898b;
        AtomicReference atomicReference = new AtomicReference();
        this.f47900d = atomicReference;
        atomicReference.lazySet(k.a(iVar));
    }
}
