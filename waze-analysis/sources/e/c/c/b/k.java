package e.c.c.b;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f47894a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f47895b;

    /* renamed from: c, reason: collision with root package name */
    static final AtomicReference f47896c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    static final Map f47897d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[LOOP:0: B:14:0x003f->B:21:0x006a, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[PHI: r1
  0x0026: PHI (r1v7 boolean) = (r1v2 boolean), (r1v2 boolean), (r1v9 boolean) binds: [B:10:0x002f, B:23:0x0026, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            e.c.c.b.k.f47896c = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            e.c.c.b.k.f47897d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L28
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            if (r1 == 0) goto L26
            goto L29
        L26:
            r0 = r3
            goto L39
        L28:
            r1 = r3
        L29:
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L26
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L26
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L26
        L39:
            e.c.c.b.k.f47894a = r1
            e.c.c.b.k.f47895b = r0
            if (r1 == 0) goto L6e
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = e.c.c.b.k.f47896c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L4a
            goto L6e
        L4a:
            e.c.c.b.i r1 = new e.c.c.b.i
            java.lang.String r2 = "RxSchedulerPurge"
            r1.<init>(r2)
            java.util.concurrent.ScheduledExecutorService r4 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r1)
            boolean r0 = a.a.g(r0, r4)
            if (r0 == 0) goto L6a
            e.c.c.b.j r5 = new e.c.c.b.j
            r5.<init>()
            int r0 = e.c.c.b.k.f47895b
            long r6 = (long) r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r8 = r6
            r4.scheduleAtFixedRate(r5, r6, r8, r10)
            return
        L6a:
            r4.shutdownNow()
            goto L3f
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.c.c.b.k.<clinit>():void");
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (f47894a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            f47897d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
