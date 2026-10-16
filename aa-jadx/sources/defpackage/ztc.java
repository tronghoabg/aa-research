package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ztc implements java.util.concurrent.ThreadFactory {
    private final java.lang.String a;
    private final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger(0);
    private final int c;

    public ztc(java.lang.String str, int i) {
        this.a = str;
        this.c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.a + "-" + this.b.incrementAndGet());
        thread.setPriority(this.c);
        return thread;
    }
}
