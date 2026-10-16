package e.a.d;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fz extends cy {

    /* renamed from: a, reason: collision with root package name */
    private static final ReferenceQueue f46982a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap f46983b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f46984c = Logger.getLogger(fz.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(e.a.bx bxVar) {
        super(bxVar);
        ReferenceQueue referenceQueue = f46982a;
        ConcurrentMap concurrentMap = f46983b;
        new fy(this, bxVar, referenceQueue, concurrentMap);
    }
}
