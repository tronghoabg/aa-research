package androidx.lifecycle;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LifecycleOwnerFactory {
    public static final LifecycleOwner create(final Lifecycle lifecycle) {
        x.f(lifecycle, "lifecycle");
        return new LifecycleOwner() { // from class: androidx.lifecycle.LifecycleOwnerFactory$LifecycleOwner$1
            @Override // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                return lifecycle;
            }
        };
    }
}
