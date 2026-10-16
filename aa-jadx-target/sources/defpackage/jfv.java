package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfv {
    public final java.lang.Runnable a;
    public java.util.concurrent.ScheduledExecutorService b;
    public long c = 0;
    public long d = 0;
    public java.util.concurrent.TimeUnit e;

    public jfv(java.lang.Runnable runnable) {
        this.a = runnable;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.jfx a() {
        this.b.getClass();
        defpackage.ysr.bk(this.d > 0, "period is required");
        this.e.getClass();
        return new defpackage.jfx(this);
    }

    public final void b(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c = j;
    }

    public final void c(long j) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException();
        }
        this.d = j;
    }
}
