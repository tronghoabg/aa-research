package Lf;

import Jf.t;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7128a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f7129b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7130c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7131d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f7132e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f7133f;

    static {
        String property;
        int i5 = t.f6138a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7128a = property;
        f7129b = Jf.b.k("kotlinx.coroutines.scheduler.resolution.ns", PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH, 1L, Long.MAX_VALUE);
        int i10 = t.f6138a;
        if (i10 < 2) {
            i10 = 2;
        }
        f7130c = Jf.b.l(i10, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f7131d = Jf.b.l(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f7132e = TimeUnit.SECONDS.toNanos(Jf.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f7133f = g.f7123a;
    }
}
