package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tnb {
    private static final boolean a;

    static {
        boolean z;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            z = true;
        } catch (java.lang.Throwable unused) {
            z = false;
        }
        a = z;
    }

    public static long a() {
        return a ? android.os.SystemClock.elapsedRealtimeNanos() : android.os.SystemClock.elapsedRealtime() * 1000000;
    }
}
