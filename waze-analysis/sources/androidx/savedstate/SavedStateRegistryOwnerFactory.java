package androidx.savedstate;

import androidx.lifecycle.Lifecycle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateRegistryOwnerFactory {
    public static final SavedStateRegistryOwner create(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) {
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(lifecycle, "lifecycle");
        return new SavedStateRegistryOwner() { // from class: androidx.savedstate.SavedStateRegistryOwnerFactory$SavedStateRegistryOwner$1
            @Override // androidx.lifecycle.LifecycleOwner
            public Lifecycle getLifecycle() {
                return lifecycle;
            }

            @Override // androidx.savedstate.SavedStateRegistryOwner
            public SavedStateRegistry getSavedStateRegistry() {
                return savedStateRegistry;
            }
        };
    }
}
