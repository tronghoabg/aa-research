package kotlinx.a;

import androidx.core.internal.view.SupportMenu;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f50885a = AtomicIntegerFieldUpdater.newUpdater(b.class, "b");

    /* renamed from: b, reason: collision with root package name */
    private volatile int f50886b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f50887c;

    public b(int i2, aj ajVar) {
        x.f(ajVar, "trace");
        this.f50887c = ajVar;
        this.f50886b = i2;
    }

    public final int a() {
        int iDecrementAndGet = f50885a.decrementAndGet(this);
        if (this.f50887c != e.f50894a) {
            aj.F("decAndGet():" + iDecrementAndGet);
        }
        return iDecrementAndGet;
    }

    public final int b() {
        int andDecrement = f50885a.getAndDecrement(this);
        if (this.f50887c != e.f50894a) {
            aj.F("getAndDec():" + andDecrement);
        }
        return andDecrement;
    }

    public final int c() {
        int andIncrement = f50885a.getAndIncrement(this);
        if (this.f50887c != e.f50894a) {
            aj.F("getAndInc():" + andIncrement);
        }
        return andIncrement;
    }

    public final int d() {
        return this.f50886b;
    }

    public final int e() {
        int iIncrementAndGet = f50885a.incrementAndGet(this);
        if (this.f50887c != e.f50894a) {
            aj.F("incAndGet():" + iIncrementAndGet);
        }
        return iIncrementAndGet;
    }

    public final void f(int i2) {
        this.f50886b = i2;
        if (this.f50887c != e.f50894a) {
            aj.F("set(" + i2 + ")");
        }
    }

    public final boolean g(int i2, int i3) {
        boolean zCompareAndSet = f50885a.compareAndSet(this, i2, i3);
        if (!zCompareAndSet || this.f50887c == e.f50894a) {
            return zCompareAndSet;
        }
        aj.F("CAS(" + i2 + ", " + i3 + ")");
        return true;
    }

    public final int h() {
        int iAddAndGet = f50885a.addAndGet(this, SupportMenu.CATEGORY_MASK);
        if (this.f50887c != e.f50894a) {
            aj.F("addAndGet(-65536):" + iAddAndGet);
        }
        return iAddAndGet;
    }

    public final void i(int i2) {
        int andAdd = f50885a.getAndAdd(this, i2);
        if (this.f50887c != e.f50894a) {
            aj.F("getAndAdd(" + i2 + "):" + andAdd);
        }
    }

    public final int j() {
        int andSet = f50885a.getAndSet(this, Integer.MIN_VALUE);
        if (this.f50887c != e.f50894a) {
            aj.F("getAndSet(-2147483648):" + andSet);
        }
        return andSet;
    }

    public final String toString() {
        return String.valueOf(this.f50886b);
    }
}
