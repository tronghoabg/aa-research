package kotlinx.a;

import h.g.b.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f50891a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "b");

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f50892b;

    /* renamed from: c, reason: collision with root package name */
    private final aj f50893c;

    public d(Object obj, aj ajVar) {
        x.f(ajVar, "trace");
        this.f50893c = ajVar;
        this.f50892b = obj;
    }

    public final Object a(Object obj) {
        Object andSet = f50891a.getAndSet(this, obj);
        if (this.f50893c != e.f50894a) {
            aj.F("getAndSet(" + obj + "):" + andSet);
        }
        return andSet;
    }

    public final Object b() {
        return this.f50892b;
    }

    public final void c(Object obj) {
        f50891a.lazySet(this, obj);
        if (this.f50893c != e.f50894a) {
            aj.F("lazySet(" + obj + ")");
        }
    }

    public final void d(Object obj) {
        this.f50892b = obj;
        if (this.f50893c != e.f50894a) {
            aj.F("set(" + obj + ")");
        }
    }

    public final boolean e(Object obj, Object obj2) {
        boolean zD = a.a.d(f50891a, this, obj, obj2);
        if (!zD || this.f50893c == e.f50894a) {
            return zD;
        }
        aj.F("CAS(" + obj + ", " + obj2 + ")");
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f50892b);
    }
}
