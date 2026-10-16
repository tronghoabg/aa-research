package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class zho implements defpackage.zhs {
    public static final defpackage.zhs a = new defpackage.zho(null);
    private static final defpackage.zhr b = new defpackage.zhr(defpackage.zho.class);
    private final java.lang.Object c;

    public zho(java.lang.Object obj) {
        this.c = obj;
    }

    @Override // defpackage.zhs
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e) {
            b.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + runnable.toString() + " with executor " + executor.toString(), (java.lang.Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.c;
        return super.toString() + "[status=SUCCESS, result=[" + java.lang.String.valueOf(obj) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.c;
    }
}
