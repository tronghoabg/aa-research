package android.support.v4.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cr implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* renamed from: a, reason: collision with root package name */
    private final ar f284a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewModelStore f285b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f286c;

    /* renamed from: d, reason: collision with root package name */
    private ViewModelProvider.Factory f287d;

    /* renamed from: e, reason: collision with root package name */
    private LifecycleRegistry f288e = null;

    /* renamed from: f, reason: collision with root package name */
    private SavedStateRegistryController f289f = null;

    cr(ar arVar, ViewModelStore viewModelStore, Runnable runnable) {
        this.f284a = arVar;
        this.f285b = viewModelStore;
        this.f286c = runnable;
    }

    final void a(Lifecycle.Event event) {
        this.f288e.handleLifecycleEvent(event);
    }

    final void b() {
        if (this.f288e == null) {
            this.f288e = new LifecycleRegistry(this);
            SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
            this.f289f = savedStateRegistryControllerCreate;
            savedStateRegistryControllerCreate.performAttach();
            this.f286c.run();
        }
    }

    final void c(Bundle bundle) {
        this.f289f.performRestore(bundle);
    }

    final void d(Bundle bundle) {
        this.f289f.performSave(bundle);
    }

    final void e(Lifecycle.State state) {
        this.f288e.setCurrentState(state);
    }

    final boolean f() {
        return this.f288e != null;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        ar arVar = this.f284a;
        Context applicationContext = arVar.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (application != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, arVar);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (arVar.getArguments() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arVar.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ar arVar = this.f284a;
        ViewModelProvider.Factory defaultViewModelProviderFactory = arVar.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(arVar.mDefaultFactory)) {
            this.f287d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f287d == null) {
            Context applicationContext = arVar.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f287d = new SavedStateViewModelFactory(application, arVar, arVar.getArguments());
        }
        return this.f287d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        b();
        return this.f288e;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.f289f.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.f285b;
    }
}
