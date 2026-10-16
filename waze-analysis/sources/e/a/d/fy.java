package e.a.d;

import androidx.credentials.provider.CredentialEntry;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fy extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f46975a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", CredentialEntry.TRUE_STRING));

    /* renamed from: b, reason: collision with root package name */
    private static final RuntimeException f46976b;

    /* renamed from: c, reason: collision with root package name */
    private final ReferenceQueue f46977c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap f46978d;

    /* renamed from: e, reason: collision with root package name */
    private final String f46979e;

    /* renamed from: f, reason: collision with root package name */
    private final Reference f46980f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f46981g;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f46976b = runtimeException;
    }

    fy(fz fzVar, e.a.bx bxVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(fzVar, referenceQueue);
        this.f46981g = new AtomicBoolean();
        this.f46980f = new SoftReference(f46975a ? new RuntimeException("ManagedChannel allocation site") : f46976b);
        this.f46979e = bxVar.toString();
        this.f46977c = referenceQueue;
        this.f46978d = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            fy fyVar = (fy) referenceQueue.poll();
            if (fyVar == null) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) fyVar.f46980f.get();
            boolean z = fyVar.f46981g.get();
            fyVar.b();
            if (!z) {
                Level level = Level.SEVERE;
                if (fz.f46984c.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(fz.f46984c.getName());
                    logRecord.setParameters(new Object[]{fyVar.f46979e});
                    logRecord.setThrown(runtimeException);
                    fz.f46984c.log(logRecord);
                }
            }
        }
    }

    private final void b() {
        super.clear();
        this.f46978d.remove(this);
        this.f46980f.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.f46977c);
    }
}
