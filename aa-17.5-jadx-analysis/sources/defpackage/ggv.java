package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ggv {
    public static final yob a = yob.c("com/android/car/libraries/apphost/contentmoderation/ContentRateLimiter");
    public final long b;
    public float c;
    public long d;
    public boolean e;

    public ggv() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = 5000L;
        this.c = 6.0f;
        this.d = SystemClock.elapsedRealtime();
        this.e = true;
    }

    public final void a(float f, long j) {
        this.c = Math.min(6.0f, f);
        this.d = j;
    }
}
