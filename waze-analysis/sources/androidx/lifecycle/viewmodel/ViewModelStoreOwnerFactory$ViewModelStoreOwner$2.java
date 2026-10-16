package androidx.lifecycle.viewmodel;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelStoreOwnerFactory$ViewModelStoreOwner$2 implements ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    final /* synthetic */ Bundle $defaultArgs;
    final /* synthetic */ CreationExtras $defaultCreationExtras;
    final /* synthetic */ ViewModelProvider.Factory $defaultFactory;
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ SavedStateRegistry $savedStateRegistry;
    final /* synthetic */ ViewModelStore $viewModelStore;

    ViewModelStoreOwnerFactory$ViewModelStoreOwner$2(SavedStateRegistry savedStateRegistry, ViewModelStore viewModelStore, Lifecycle lifecycle, ViewModelProvider.Factory factory, CreationExtras creationExtras, Bundle bundle) {
        this.$savedStateRegistry = savedStateRegistry;
        this.$viewModelStore = viewModelStore;
        this.$lifecycle = lifecycle;
        this.$defaultFactory = factory;
        this.$defaultCreationExtras = creationExtras;
        this.$defaultArgs = bundle;
        if (savedStateRegistry.getSavedStateProvider(SavedStateHandleSupport.SAVED_STATE_KEY) == null) {
            SavedStateHandleSupport.enableSavedStateHandles(this);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public CreationExtras getDefaultViewModelCreationExtras() {
        k[] kVarArr;
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.$defaultCreationExtras);
        CreationExtras.Key<Bundle> key = SavedStateHandleSupport.DEFAULT_ARGS_KEY;
        Map mapJ = r.j();
        if (mapJ.isEmpty()) {
            kVarArr = new k[0];
        } else {
            ArrayList arrayList = new ArrayList(mapJ.size());
            for (Map.Entry entry : mapJ.entrySet()) {
                arrayList.add(new k((String) entry.getKey(), entry.getValue()));
            }
            kVarArr = (k[]) arrayList.toArray(new k[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
        SavedStateWriter.m13355constructorimpl(bundleBundleOf);
        Bundle bundle = (Bundle) mutableCreationExtras.get(SavedStateHandleSupport.DEFAULT_ARGS_KEY);
        if (bundle != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
        }
        SavedStateWriter.m13359putAllimpl(bundleBundleOf, this.$defaultArgs);
        mutableCreationExtras.set(key, bundleBundleOf);
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.$defaultFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.$lifecycle;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.$savedStateRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return this.$viewModelStore;
    }
}
