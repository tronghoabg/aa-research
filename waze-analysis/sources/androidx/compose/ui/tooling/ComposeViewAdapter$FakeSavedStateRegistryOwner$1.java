package androidx.compose.ui.tooling;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposeViewAdapter$FakeSavedStateRegistryOwner$1 implements SavedStateRegistryOwner {
    private final SavedStateRegistryController controller;
    private final LifecycleRegistry lifecycleRegistry;

    ComposeViewAdapter$FakeSavedStateRegistryOwner$1() {
        LifecycleRegistry lifecycleRegistryCreateUnsafe = LifecycleRegistry.Companion.createUnsafe(this);
        this.lifecycleRegistry = lifecycleRegistryCreateUnsafe;
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.Companion.create(this);
        savedStateRegistryControllerCreate.performRestore(new Bundle());
        this.controller = savedStateRegistryControllerCreate;
        lifecycleRegistryCreateUnsafe.setCurrentState(Lifecycle.State.RESUMED);
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.controller.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return this.lifecycleRegistry;
    }
}
