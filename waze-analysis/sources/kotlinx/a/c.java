package kotlinx.a;

import h.g.b.x;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f50888a = AtomicLongFieldUpdater.newUpdater(c.class, "b");

    /* renamed from: b, reason: collision with root package name */
    private volatile long f50889b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f50890c;

    public c(long j2, aj ajVar) {
        x.f(ajVar, "trace");
        this.f50890c = ajVar;
        this.f50889b = j2;
    }

    public final long a(long j2) {
        long jAddAndGet = f50888a.addAndGet(this, j2);
        if (this.f50890c != e.f50894a) {
            aj.F("addAndGet(" + j2 + "):" + jAddAndGet);
        }
        return jAddAndGet;
    }

    public final long b() {
        long andDecrement = f50888a.getAndDecrement(this);
        if (this.f50890c != e.f50894a) {
            aj.F("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final long c() {
        long andIncrement = f50888a.getAndIncrement(this);
        if (this.f50890c != e.f50894a) {
            aj.F("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final long d() {
        return this.f50889b;
    }

    public final long e() {
        long jIncrementAndGet = f50888a.incrementAndGet(this);
        if (this.f50890c != e.f50894a) {
            aj.F("incAndGet():" + jIncrementAndGet);
        }
        return jIncrementAndGet;
    }

    public final void f(long j2) {
        this.f50889b = j2;
        if (this.f50890c != e.f50894a) {
            aj.F("set(" + j2 + ")");
        }
    }

    public final boolean g(long j2, long j3) {
        boolean zCompareAndSet = f50888a.compareAndSet(this, j2, j3);
        if (!zCompareAndSet || this.f50890c == e.f50894a) {
            return zCompareAndSet;
        }
        aj.F("CAS(" + j2 + ", " + j3 + ")");
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f50889b);
    }
}
