package He;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class m {
    static {
        TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue());
    }

    public abstract l a();

    public Je.b b(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        return c(runnable);
    }

    public Je.b c(Runnable runnable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        l lVarA = a();
        k kVar = new k(runnable, lVarA);
        lVarA.a(kVar, timeUnit);
        return kVar;
    }
}
