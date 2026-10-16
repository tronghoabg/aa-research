package h;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o<T> implements Serializable, f {

    /* renamed from: a, reason: collision with root package name */
    private h.g.a.a f48261a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f48262b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f48263c;

    public /* synthetic */ o(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "initializer");
        this.f48261a = aVar;
        this.f48262b = x.f48304a;
        this.f48263c = this;
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // h.f
    public final T getValue() {
        T t;
        T t2 = (T) this.f48262b;
        x xVar = x.f48304a;
        if (t2 != xVar) {
            return t2;
        }
        synchronized (this.f48263c) {
            t = (T) this.f48262b;
            if (t == xVar) {
                h.g.a.a aVar = this.f48261a;
                h.g.b.x.c(aVar);
                t = (T) aVar.invoke();
                this.f48262b = t;
                this.f48261a = null;
            }
        }
        return t;
    }

    @Override // h.f
    public final boolean isInitialized() {
        return this.f48262b != x.f48304a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
