package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.lang.reflect.Constructor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateViewModelFactory implements ViewModelProvider.Factory {
    private final Application application;
    private final Bundle defaultArgs;
    private final ViewModelProvider.Factory factory;
    private final SavedStateRegistryOwner owner;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        x.f(savedStateRegistryOwner, "owner");
        this.owner = savedStateRegistryOwner;
        this.defaultArgs = bundle;
        this.application = application;
        this.factory = application != null ? ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application) : new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        x.f(cls, "modelClass");
        x.f(creationExtras, "extras");
        Object obj = creationExtras.get(ViewModelProvider.VIEW_MODEL_KEY);
        if (obj == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        String str = (String) obj;
        if (creationExtras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || creationExtras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.owner != null) {
                return (T) create(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY and VIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras to successfully create a ViewModel.");
        }
        Application application = (Application) creationExtras.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorFindMatchingConstructor = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE) : SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE);
        if (constructorFindMatchingConstructor == null) {
            return (T) this.factory.create(cls, creationExtras);
        }
        SavedStateHandle savedStateHandleCreateSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(creationExtras);
        return (!zIsAssignableFrom || application == null) ? (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, savedStateHandleCreateSavedStateHandle) : (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, application, savedStateHandleCreateSavedStateHandle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner) {
        this(application, savedStateRegistryOwner, null);
        x.f(savedStateRegistryOwner, "owner");
    }

    public SavedStateViewModelFactory() {
        this.application = null;
        this.owner = null;
        this.defaultArgs = null;
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
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

    public final <T extends ViewModel> T create(String str, Class<T> cls) {
        T t;
        x.f(str, "key");
        x.f(cls, "modelClass");
        if (this.owner != null) {
            boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            boolean z = this.application != null;
            Constructor constructorFindMatchingConstructor = (zIsAssignableFrom && z) ? SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE) : SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE);
            if (constructorFindMatchingConstructor == null) {
                if (z) {
                    return (T) this.factory.create(cls);
                }
                return (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(cls);
            }
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, this.owner, this.defaultArgs);
            if (zIsAssignableFrom && z) {
                t = (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, this.application, savedStateHandleController.getHandle());
            } else {
                t = (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, savedStateHandleController.getHandle());
            }
            t.addCloseable(SavedStateHandleController.TAG, savedStateHandleController);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(c<T> cVar, CreationExtras creationExtras) {
        x.f(cVar, "modelClass");
        x.f(creationExtras, "extras");
        return (T) create(o.w(cVar), creationExtras);
    }
}
