package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateRegistry {
    private final SavedStateRegistryImpl impl;
    private Recreator.SavedStateProvider recreatorProvider;

    /* compiled from: WazeSource */
    public interface AutoRecreated {
        void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    /* compiled from: WazeSource */
    public interface SavedStateProvider {
        Bundle saveState();
    }

    public SavedStateRegistry(SavedStateRegistryImpl savedStateRegistryImpl) {
        x.f(savedStateRegistryImpl, "impl");
        this.impl = savedStateRegistryImpl;
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        x.f(str, "key");
        return this.impl.consumeRestoredStateForKey(str);
    }

    public final SavedStateProvider getSavedStateProvider(String str) {
        x.f(str, "key");
        return this.impl.getSavedStateProvider(str);
    }

    public final boolean isRestored() {
        return this.impl.isRestored();
    }

    public final void registerSavedStateProvider(String str, SavedStateProvider savedStateProvider) {
        x.f(str, "key");
        x.f(savedStateProvider, "provider");
        this.impl.registerSavedStateProvider(str, savedStateProvider);
    }

    public final void runOnNextRecreation(Class<? extends AutoRecreated> cls) throws NoSuchMethodException, SecurityException {
        x.f(cls, "clazz");
        if (!this.impl.isAllowingSavingState$savedstate()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            cls.getDeclaredConstructor(null);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                String name = cls.getName();
                x.e(name, "getName(...)");
                savedStateProvider2.add(name);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    public final void unregisterSavedStateProvider(String str) {
        x.f(str, "key");
        this.impl.unregisterSavedStateProvider(str);
    }
}
