package e.c.c.b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends e.c.k {

    /* renamed from: b, reason: collision with root package name */
    static final i f47883b;

    /* renamed from: c, reason: collision with root package name */
    static final d f47884c;

    /* renamed from: e, reason: collision with root package name */
    static final g f47885e;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f47888d;

    /* renamed from: g, reason: collision with root package name */
    private static final TimeUnit f47887g = TimeUnit.SECONDS;

    /* renamed from: f, reason: collision with root package name */
    private static final long f47886f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        g gVar = new g(new i("RxCachedThreadSchedulerShutdown"));
        f47885e = gVar;
        gVar.a();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        new i("RxCachedThreadScheduler", iMax);
        f47883b = new i("RxCachedWorkerPoolEvictor", iMax);
        d dVar = new d(0L, null);
        f47884c = dVar;
        dVar.a();
    }

    public e() {
        d dVar = f47884c;
        AtomicReference atomicReference = new AtomicReference(dVar);
        this.f47888d = atomicReference;
        d dVar2 = new d(f47886f, f47887g);
        if (a.a.c(atomicReference, dVar, dVar2)) {
            return;
        }
        dVar2.a();
    }
}
