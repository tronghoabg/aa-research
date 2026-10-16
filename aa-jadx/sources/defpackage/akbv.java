package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class akbv {
    private final java.lang.String a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public volatile java.lang.Object d;
    private long e;

    public akbv(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aguw.e(timeUnit, "Time unit");
        this.a = str;
        this.b = obj;
        this.c = obj2;
        java.lang.System.currentTimeMillis();
        this.e = Long.MAX_VALUE;
    }

    public synchronized boolean c(long j) {
        return j >= this.e;
    }

    public final synchronized long d() {
        return this.e;
    }

    public final synchronized void e(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aguw.e(timeUnit, "Time unit");
        this.e = java.lang.Math.min(j > 0 ? java.lang.System.currentTimeMillis() + timeUnit.toMillis(j) : Long.MAX_VALUE, Long.MAX_VALUE);
    }

    public final java.lang.String toString() {
        return "[id:" + this.a + "][route:" + this.b + "][state:" + this.d + "]";
    }
}
