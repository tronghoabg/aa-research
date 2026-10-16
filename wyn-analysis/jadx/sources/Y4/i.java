package Y4;

import android.os.SystemClock;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final double f16693a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16694b = 0;

    public static double a(long j8) {
        return (SystemClock.elapsedRealtimeNanos() - j8) * f16693a;
    }
}
