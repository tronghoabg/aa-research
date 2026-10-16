package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ghb {
    public static final defpackage.ypg a = defpackage.ypg.c("com/android/car/libraries/apphost/contentmoderation/ContentRateLimiter");
    public final long b;
    public float c;
    public long d;
    public boolean e;

    public ghb() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.b = 5000L;
        this.c = 6.0f;
        this.d = android.os.SystemClock.elapsedRealtime();
        this.e = true;
    }

    public final void a(float f, long j) {
        this.c = java.lang.Math.min(6.0f, f);
        this.d = j;
    }
}
