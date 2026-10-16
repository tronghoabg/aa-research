package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zig implements java.util.concurrent.ThreadFactory {
    final /* synthetic */ java.util.concurrent.ThreadFactory a;
    final /* synthetic */ java.lang.String b;
    final /* synthetic */ java.util.concurrent.atomic.AtomicLong c;
    final /* synthetic */ java.lang.Boolean d;

    public zig(java.util.concurrent.ThreadFactory threadFactory, java.lang.String str, java.util.concurrent.atomic.AtomicLong atomicLong, java.lang.Boolean bool) {
        this.a = threadFactory;
        this.b = str;
        this.c = atomicLong;
        this.d = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread threadNewThread = this.a.newThread(runnable);
        threadNewThread.getClass();
        java.lang.String str = this.b;
        if (str != null) {
            java.util.concurrent.atomic.AtomicLong atomicLong = this.c;
            atomicLong.getClass();
            threadNewThread.setName(defpackage.adrn.d(str, java.lang.Long.valueOf(atomicLong.getAndIncrement())));
        }
        java.lang.Boolean bool = this.d;
        if (bool != null) {
            bool.booleanValue();
            threadNewThread.setDaemon(true);
        }
        return threadNewThread;
    }
}
