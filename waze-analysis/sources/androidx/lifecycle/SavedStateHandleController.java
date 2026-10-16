package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandleController implements AutoCloseable {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "androidx.lifecycle.savedstate.vm.tag";
    private final SavedStateHandle handle;
    private boolean isAttached;
    private final String key;

    /* compiled from: WazeSource */
    final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner) throws NoSuchMethodException, SecurityException {
            SavedStateHandleController savedStateHandleController;
            x.f(savedStateRegistryOwner, "owner");
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                Objects.toString(savedStateRegistryOwner);
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(String.valueOf(savedStateRegistryOwner)));
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) savedStateRegistryOwner;
            Set<Object> setKeys = viewModelStoreOwner.getViewModelStore().keys();
            Iterator<Object> it = setKeys.iterator();
            while (it.hasNext()) {
                ViewModel viewModel = viewModelStoreOwner.getViewModelStore().get(it.next());
                if (viewModel != null && (savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable(SavedStateHandleController.TAG)) != null) {
                    savedStateHandleController.attachHandleIfNeeded(savedStateRegistryOwner.getSavedStateRegistry(), savedStateRegistryOwner.getLifecycle());
                }
            }
            if (setKeys.isEmpty()) {
                return;
            }
            savedStateRegistryOwner.getSavedStateRegistry().runOnNextRecreation(OnRecreation.class);
        }
    }

    public SavedStateHandleController(String str, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle) throws NoSuchMethodException, SecurityException {
        x.f(str, "key");
        x.f(savedStateRegistry, "registry");
        x.f(lifecycle, "lifecycle");
        this.key = str;
        this.handle = SavedStateHandle.Companion.createHandle(savedStateRegistry.consumeRestoredStateForKey(str), bundle);
        attachHandleIfNeeded(savedStateRegistry, lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachHandleIfNeeded(final SavedStateRegistry savedStateRegistry, final Lifecycle lifecycle) throws NoSuchMethodException, SecurityException {
        if (this.isAttached || savedStateRegistry == null || lifecycle == null) {
            return;
        }
        this.isAttached = true;
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.SavedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                x.f(lifecycleOwner, "source");
                x.f(event, NotificationCompat.CATEGORY_EVENT);
                SavedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$1 savedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$1 = this;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    this.this$0.isAttached = false;
                    lifecycle.removeObserver(savedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$1);
                }
            }
        });
        savedStateRegistry.registerSavedStateProvider(this.key, this.handle.savedStateProvider());
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            savedStateRegistry.runOnNextRecreation(OnRecreation.class);
        } else {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.SavedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$2
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws NoSuchMethodException, SecurityException {
                    x.f(lifecycleOwner, "source");
                    x.f(event, NotificationCompat.CATEGORY_EVENT);
                    SavedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$2 savedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$2 = this;
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(savedStateHandleController$attachHandleIfNeeded$$inlined$addObserver$2);
                        savedStateRegistry.runOnNextRecreation(SavedStateHandleController.OnRecreation.class);
                    }
                }
            });
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    public final SavedStateHandle getHandle() {
        return this.handle;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ SavedStateHandleController(String str, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle, int i2, o oVar) {
        this(str, savedStateRegistry, lifecycle, (i2 & 8) != 0 ? null : bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SavedStateHandleController(String str, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        this(str, savedStateRegistryOwner.getSavedStateRegistry(), savedStateRegistryOwner.getLifecycle(), bundle);
        x.f(str, "key");
        x.f(savedStateRegistryOwner, "owner");
    }
}
