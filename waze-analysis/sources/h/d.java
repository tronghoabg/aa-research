package h;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d<T> implements Serializable, f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f48063a;

    public d(Object obj) {
        this.f48063a = obj;
    }

    @Override // h.f
    public final T getValue() {
        return (T) this.f48063a;
    }

    @Override // h.f
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.f48063a);
    }
}
