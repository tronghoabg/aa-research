package kotlinx.a;

import h.g.b.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f50882a = AtomicIntegerFieldUpdater.newUpdater(a.class, "b");

    /* renamed from: b, reason: collision with root package name */
    private volatile int f50883b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f50884c;

    public a(boolean z, aj ajVar) {
        x.f(ajVar, "trace");
        this.f50884c = ajVar;
        this.f50883b = z ? 1 : 0;
    }

    public final void a(boolean z) {
        this.f50883b = z ? 1 : 0;
        if (this.f50884c != e.f50894a) {
            aj.F("set(" + z + ")");
        }
    }

    public final boolean b(boolean z, boolean z2) {
        boolean zCompareAndSet = f50882a.compareAndSet(this, z ? 1 : 0, z2 ? 1 : 0);
        if (!zCompareAndSet || this.f50884c == e.f50894a) {
            return zCompareAndSet;
        }
        aj.F("CAS(" + z + ", " + z2 + ")");
        return true;
    }

    public final boolean c() {
        return this.f50883b != 0;
    }

    public final boolean d() {
        int andSet = f50882a.getAndSet(this, 1);
        if (this.f50884c != e.f50894a) {
            aj.F("getAndSet(true):" + andSet);
        }
        return andSet == 1;
    }

    public final String toString() {
        return String.valueOf(c());
    }
}
