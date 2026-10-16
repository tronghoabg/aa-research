package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class rqj {
    private final long a;
    private long b = Long.MIN_VALUE;

    public rqj(TimeUnit timeUnit) {
        this.a = timeUnit.toMillis(60L);
    }

    public final synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b + this.a > jElapsedRealtime) {
            return false;
        }
        this.b = jElapsedRealtime;
        return true;
    }
}
