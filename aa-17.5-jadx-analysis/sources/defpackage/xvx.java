package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class xvx {
    public static final xyi a;

    static {
        xyi xvwVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            xvwVar = new xvv();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            xvwVar = new xvw();
        }
        a = xvwVar;
    }
}
