package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import h.g.b.x;
import h.l.c;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class AbstractSavedStateViewModelFactory implements ViewModelProvider.Factory {
    private final Bundle defaultArgs;
    private final SavedStateRegistryOwner owner;

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        x.f(savedStateRegistryOwner, "owner");
        this.owner = savedStateRegistryOwner;
        this.defaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        x.f(cls, "modelClass");
        x.f(creationExtras, "extras");
        Object obj = creationExtras.get(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (obj == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        String str = (String) obj;
        return this.owner != null ? (T) create(str, cls) : (T) create(str, cls, SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    protected abstract <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle);

    public AbstractSavedStateViewModelFactory() {
        this.owner = null;
        this.defaultArgs = null;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        x.f(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(c cVar, CreationExtras creationExtras) {
        return ViewModelProvider.Factory.CC.$default$create(this, cVar, creationExtras);
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateRegistryOwner savedStateRegistryOwner = this.owner;
        if (savedStateRegistryOwner != null) {
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, savedStateRegistryOwner, this.defaultArgs);
            T t = (T) create(str, cls, savedStateHandleController.getHandle());
            t.addCloseable(SavedStateHandleController.TAG, savedStateHandleController);
            return t;
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }
}
