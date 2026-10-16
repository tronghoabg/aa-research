package e.c.c.b;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends e.c.k {

    /* renamed from: b, reason: collision with root package name */
    static final a f47872b;

    /* renamed from: c, reason: collision with root package name */
    static final i f47873c;

    /* renamed from: d, reason: collision with root package name */
    static final int f47874d;

    /* renamed from: g, reason: collision with root package name */
    static final g f47875g;

    /* renamed from: e, reason: collision with root package name */
    final ThreadFactory f47876e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicReference f47877f;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f47874d = iAvailableProcessors;
        g gVar = new g(new i("RxComputationShutdown"));
        f47875g = gVar;
        gVar.a();
        i iVar = new i("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f47873c = iVar;
        a aVar = new a(0, iVar);
        f47872b = aVar;
        aVar.a();
    }

    public b() {
        i iVar = f47873c;
        this.f47876e = iVar;
        a aVar = f47872b;
        AtomicReference atomicReference = new AtomicReference(aVar);
        this.f47877f = atomicReference;
        a aVar2 = new a(f47874d, iVar);
        if (a.a.c(atomicReference, aVar, aVar2)) {
            return;
        }
        aVar2.a();
    }
}
