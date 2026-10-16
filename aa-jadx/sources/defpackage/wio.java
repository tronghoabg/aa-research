package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wio implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.atomic.AtomicInteger a = new java.util.concurrent.atomic.AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        return new java.lang.Thread(runnable, "Survey #" + this.a.getAndIncrement());
    }
}
