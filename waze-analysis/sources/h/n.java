package h;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n<T> implements Serializable, f {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f48217a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "c");

    /* renamed from: b, reason: collision with root package name */
    private volatile h.g.a.a f48218b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f48219c;

    public n(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "initializer");
        this.f48218b = aVar;
        this.f48219c = x.f48304a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // h.f
    public final T getValue() {
        T t = (T) this.f48219c;
        x xVar = x.f48304a;
        if (t != xVar) {
            return t;
        }
        h.g.a.a aVar = this.f48218b;
        if (aVar != null) {
            T t2 = (T) aVar.invoke();
            if (a.a.d(f48217a, this, xVar, t2)) {
                this.f48218b = null;
                return t2;
            }
        }
        return (T) this.f48219c;
    }

    @Override // h.f
    public final boolean isInitialized() {
        return this.f48219c != x.f48304a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
