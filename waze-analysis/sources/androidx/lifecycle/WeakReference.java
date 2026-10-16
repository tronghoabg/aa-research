package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class WeakReference<T> {
    private final java.lang.ref.WeakReference<T> delegate;

    public WeakReference(T t) {
        x.f(t, TypedValues.Custom.S_REFERENCE);
        this.delegate = new java.lang.ref.WeakReference<>(t);
    }

    public final T get() {
        return this.delegate.get();
    }
}
