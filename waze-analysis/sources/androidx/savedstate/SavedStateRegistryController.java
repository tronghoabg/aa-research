package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateRegistryController {
    public static final Companion Companion = new Companion(null);
    private final SavedStateRegistryImpl impl;
    private final SavedStateRegistry savedStateRegistry;

    private SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.impl = savedStateRegistryImpl;
        this.savedStateRegistry = new SavedStateRegistry(savedStateRegistryImpl);
    }

    public static final SavedStateRegistryController create(SavedStateRegistryOwner savedStateRegistryOwner) {
        return Companion.create(savedStateRegistryOwner);
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    public final void performAttach() {
        this.impl.performAttach();
    }

    public final void performRestore(Bundle bundle) {
        this.impl.performRestore$savedstate(bundle);
    }

    public final void performSave(Bundle bundle) {
        x.f(bundle, "outBundle");
        this.impl.performSave$savedstate(bundle);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final ab create$lambda$0(SavedStateRegistryOwner savedStateRegistryOwner) {
            savedStateRegistryOwner.getLifecycle().addObserver(new Recreator(savedStateRegistryOwner));
            return ab.f48028a;
        }

        public final SavedStateRegistryController create(final SavedStateRegistryOwner savedStateRegistryOwner) {
            x.f(savedStateRegistryOwner, "owner");
            return new SavedStateRegistryController(new SavedStateRegistryImpl(savedStateRegistryOwner, new a() { // from class: androidx.savedstate.SavedStateRegistryController$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return SavedStateRegistryController.Companion.create$lambda$0(savedStateRegistryOwner);
                }
            }), null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl, o oVar) {
        this(savedStateRegistryImpl);
    }
}
