package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.l.c;
import h.m.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandleSupport {
    public static final String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    public static final String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final CreationExtras.Key<SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = new CreationExtras.Key<SavedStateRegistryOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$1
        public String toString() {
            int iHashCode = hashCode();
            k.y(16);
            String string = Integer.toString(iHashCode, 16);
            x.e(string, "toString(...)");
            int i2 = ar.f48106a;
            return "CreationExtras.Key@" + string + "<" + new m(SavedStateRegistryOwner.class).c() + ">";
        }
    };
    public static final CreationExtras.Key<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new CreationExtras.Key<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$2
        public String toString() {
            int iHashCode = hashCode();
            k.y(16);
            String string = Integer.toString(iHashCode, 16);
            x.e(string, "toString(...)");
            int i2 = ar.f48106a;
            return "CreationExtras.Key@" + string + "<" + new m(ViewModelStoreOwner.class).c() + ">";
        }
    };
    public static final CreationExtras.Key<Bundle> DEFAULT_ARGS_KEY = new CreationExtras.Key<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$3
        public String toString() {
            int iHashCode = hashCode();
            k.y(16);
            String string = Integer.toString(iHashCode, 16);
            x.e(string, "toString(...)");
            int i2 = ar.f48106a;
            return "CreationExtras.Key@" + string + "<" + new m(Bundle.class).c() + ">";
        }
    };

    public static final SavedStateHandle createSavedStateHandle(CreationExtras creationExtras) {
        x.f(creationExtras, "<this>");
        Object obj = creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (obj == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) obj;
        Object obj2 = creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (obj2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) obj2;
        Object obj3 = creationExtras.get(ViewModelProvider.VIEW_MODEL_KEY);
        if (obj3 != null) {
            return createSavedStateHandle(savedStateRegistryOwner, viewModelStoreOwner, (String) obj3, (Bundle) creationExtras.get(DEFAULT_ARGS_KEY));
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final <T extends SavedStateRegistryOwner & ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        x.f(t, "<this>");
        LifecycleOwner lifecycleOwner = (LifecycleOwner) t;
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState == Lifecycle.State.CREATED) {
            if (t.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY) == null) {
                SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().registerSavedStateProvider(SAVED_STATE_KEY, savedStateHandlesProvider);
                lifecycleOwner.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed to enable `SavedStateHandle` for `" + t + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + currentState + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(SavedStateRegistryOwner savedStateRegistryOwner) {
        x.f(savedStateRegistryOwner, "<this>");
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider(SAVED_STATE_KEY);
        if (savedStateProvider instanceof SavedStateHandlesProvider) {
            return (SavedStateHandlesProvider) savedStateProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        x.f(viewModelStoreOwner, "<this>");
        ViewModelProvider viewModelProviderCreate$default = ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(c<T> cVar, CreationExtras creationExtras) {
                x.f(cVar, "modelClass");
                x.f(creationExtras, "extras");
                return new SavedStateHandlesVM();
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
                return ViewModelProvider.Factory.CC.$default$create(this, cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public /* synthetic */ ViewModel create(Class cls) {
                return ViewModelProvider.Factory.CC.$default$create(this, cls);
            }
        }, (CreationExtras) null, 4, (Object) null);
        int i2 = ar.f48106a;
        return (SavedStateHandlesVM) viewModelProviderCreate$default.get(VIEWMODEL_KEY, new m(SavedStateHandlesVM.class));
    }

    private static final SavedStateHandle createSavedStateHandle(SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(savedStateRegistryOwner);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
        savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
        return savedStateHandleCreateHandle;
    }
}
