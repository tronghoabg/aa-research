package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sto implements java.util.concurrent.ThreadFactory {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    public sto(int i, byte[] bArr) {
        this.a = i;
        this.b = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        if (this.a != 0) {
            java.lang.Thread thread = new java.lang.Thread(runnable);
            thread.setName("arch_disk_io_" + ((java.util.concurrent.atomic.AtomicInteger) this.b).getAndIncrement());
            return thread;
        }
        java.lang.Thread threadNewThread = this.b.newThread(runnable);
        if (threadNewThread == null) {
            throw new java.lang.NullPointerException("Default ThreadFactory returned null thread");
        }
        threadNewThread.setName("punch".concat(java.lang.String.valueOf(threadNewThread.getName())));
        return threadNewThread;
    }

    public sto(int i) {
        this.a = i;
        this.b = java.util.concurrent.Executors.defaultThreadFactory();
    }
}
