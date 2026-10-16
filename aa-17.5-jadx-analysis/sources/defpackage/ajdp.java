package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ajdp {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;

    static {
        String property;
        int i = ajda.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = afuq.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, Long.MAX_VALUE);
        c = afuq.d("kotlinx.coroutines.scheduler.core.pool.size", afpt.e(ajda.a, 2), Alert.DURATION_SHOW_INDEFINITELY);
        d = afuq.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150);
        e = TimeUnit.SECONDS.toNanos(afuq.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, Long.MAX_VALUE));
    }
}
