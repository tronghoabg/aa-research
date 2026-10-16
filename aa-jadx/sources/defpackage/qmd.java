package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class qmd implements java.util.concurrent.ThreadFactory {
    private static final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new defpackage.qme(runnable, "measurement-" + a.incrementAndGet());
    }
}
