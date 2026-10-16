package h;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac<T> implements Serializable, f {

    /* renamed from: a, reason: collision with root package name */
    private h.g.a.a f48029a;

    /* renamed from: b, reason: collision with root package name */
    private Object f48030b;

    public ac(h.g.a.a aVar) {
        h.g.b.x.f(aVar, "initializer");
        this.f48029a = aVar;
        this.f48030b = x.f48304a;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d(getValue());
    }

    @Override // h.f
    public final T getValue() {
        if (this.f48030b == x.f48304a) {
            h.g.a.a aVar = this.f48029a;
            h.g.b.x.c(aVar);
            this.f48030b = aVar.invoke();
            this.f48029a = null;
        }
        return (T) this.f48030b;
    }

    @Override // h.f
    public final boolean isInitialized() {
        return this.f48030b != x.f48304a;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
