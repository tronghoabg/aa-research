package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xxd {
    public static final defpackage.xzo a;

    static {
        defpackage.xzo xxcVar;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            xxcVar = new defpackage.xxb();
        } catch (java.lang.Throwable unused) {
            android.os.SystemClock.elapsedRealtime();
            xxcVar = new defpackage.xxc();
        }
        a = xxcVar;
    }
}
