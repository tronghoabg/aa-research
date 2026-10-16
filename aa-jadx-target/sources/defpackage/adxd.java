package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adxd extends java.lang.ref.WeakReference {
    public static final /* synthetic */ int b = 0;
    private static final boolean c = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final java.lang.RuntimeException d;
    public final java.util.concurrent.atomic.AtomicBoolean a;
    private final java.lang.ref.ReferenceQueue e;
    private final java.util.concurrent.ConcurrentMap f;
    private final java.lang.String g;
    private final java.lang.ref.Reference h;

    static {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new java.lang.StackTraceElement[0]);
        d = runtimeException;
    }

    public adxd(defpackage.adxe adxeVar, defpackage.admn admnVar, java.lang.ref.ReferenceQueue referenceQueue, java.util.concurrent.ConcurrentMap concurrentMap) {
        super(adxeVar, referenceQueue);
        this.a = new java.util.concurrent.atomic.AtomicBoolean();
        this.h = new java.lang.ref.SoftReference(c ? new java.lang.RuntimeException("ManagedChannel allocation site") : d);
        this.g = admnVar.toString();
        this.e = referenceQueue;
        this.f = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    static void a(java.lang.ref.ReferenceQueue referenceQueue) {
        while (true) {
            defpackage.adxd adxdVar = (defpackage.adxd) referenceQueue.poll();
            if (adxdVar == null) {
                return;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) adxdVar.h.get();
            boolean z = adxdVar.a.get();
            adxdVar.b();
            if (!z) {
                java.util.logging.Level level = java.util.logging.Level.SEVERE;
                java.util.logging.Logger logger = defpackage.adxe.b;
                if (logger.isLoggable(level)) {
                    java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + java.lang.System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new java.lang.Object[]{adxdVar.g});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    private final void b() {
        super.clear();
        this.f.remove(this);
        this.h.clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        b();
        a(this.e);
    }
}
