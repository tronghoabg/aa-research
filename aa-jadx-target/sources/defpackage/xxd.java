package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xxd {
    public static final defpackage.xzo a;

    static {
        defpackage.xxb xxcVar;
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            xxcVar = new defpackage.xxb();
        } catch (java.lang.Throwable unused) {
            android.os.SystemClock.elapsedRealtime();
            xxcVar = new xxc();
        }
        a = xxcVar;
    }
}
