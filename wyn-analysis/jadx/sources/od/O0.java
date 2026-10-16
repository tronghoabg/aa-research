package od;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class O0 extends WeakReference {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f41763f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* renamed from: g, reason: collision with root package name */
    public static final RuntimeException f41764g;

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f41765a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f41766b;

    /* renamed from: c, reason: collision with root package name */
    public final String f41767c;

    /* renamed from: d, reason: collision with root package name */
    public final SoftReference f41768d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f41769e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f41764g = runtimeException;
    }

    public O0(P0 p02, M0 m02, ReferenceQueue referenceQueue, ConcurrentHashMap concurrentHashMap) {
        super(p02, referenceQueue);
        this.f41769e = new AtomicBoolean();
        this.f41768d = new SoftReference(f41763f ? new RuntimeException("ManagedChannel allocation site") : f41764g);
        this.f41767c = m02.toString();
        this.f41765a = referenceQueue;
        this.f41766b = concurrentHashMap;
        concurrentHashMap.put(this, this);
        a(referenceQueue);
    }

    public static void a(ReferenceQueue referenceQueue) {
        while (true) {
            O0 o02 = (O0) referenceQueue.poll();
            if (o02 == null) {
                return;
            }
            SoftReference softReference = o02.f41768d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            o02.f41766b.remove(o02);
            softReference.clear();
            if (!o02.f41769e.get()) {
                Level level = Level.SEVERE;
                Logger logger = P0.f41773e;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{o02.f41767c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f41766b.remove(this);
        this.f41768d.clear();
        a(this.f41765a);
    }
}
