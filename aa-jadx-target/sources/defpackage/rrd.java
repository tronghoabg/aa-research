package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rrd {
    private final long a;
    private long b = Long.MIN_VALUE;

    public rrd(java.util.concurrent.TimeUnit timeUnit) {
        this.a = timeUnit.toMillis(60L);
    }

    public final synchronized boolean a() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (this.b + this.a > jElapsedRealtime) {
            return false;
        }
        this.b = jElapsedRealtime;
        return true;
    }
}
