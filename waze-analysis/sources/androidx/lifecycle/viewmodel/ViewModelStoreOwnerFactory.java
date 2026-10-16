package androidx.lifecycle.viewmodel;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelStoreOwnerFactory {
    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(lifecycle, "lifecycle");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
        return new ViewModelStoreOwnerFactory$ViewModelStoreOwner$2(savedStateRegistry, viewModelStore, lifecycle, factory, creationExtras, bundle);
    }

    public static /* synthetic */ ViewModelStoreOwner create$default(ViewModelStore viewModelStore, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, int i2, Object obj) {
        k[] kVarArr;
        if ((i2 & 8) != 0) {
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
            bundle = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            SavedStateWriter.m13355constructorimpl(bundle);
        }
        Bundle bundle2 = bundle;
        if ((i2 & 16) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        CreationExtras creationExtras2 = creationExtras;
        if ((i2 & 32) != 0) {
            factory = new SavedStateViewModelFactory();
        }
        return create(viewModelStore, savedStateRegistry, lifecycle, bundle2, creationExtras2, factory);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, Bundle bundle) {
        x.f(viewModelStore, "viewModelStore");
        x.f(bundle, "defaultArgs");
        return create$default(viewModelStore, bundle, null, null, 12, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, Bundle bundle, CreationExtras creationExtras) {
        x.f(viewModelStore, "viewModelStore");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        return create$default(viewModelStore, bundle, creationExtras, null, 8, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(lifecycle, "lifecycle");
        return create$default(viewModelStore, savedStateRegistry, lifecycle, null, null, null, 56, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(lifecycle, "lifecycle");
        x.f(bundle, "defaultArgs");
        return create$default(viewModelStore, savedStateRegistry, lifecycle, bundle, null, null, 48, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, Bundle bundle, CreationExtras creationExtras) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(lifecycle, "lifecycle");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        return create$default(viewModelStore, savedStateRegistry, lifecycle, bundle, creationExtras, null, 32, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistryOwner, "savedStateRegistryOwner");
        return create$default(viewModelStore, savedStateRegistryOwner, null, null, null, 28, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistryOwner, "savedStateRegistryOwner");
        x.f(bundle, "defaultArgs");
        return create$default(viewModelStore, savedStateRegistryOwner, bundle, null, null, 24, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistryOwner, "savedStateRegistryOwner");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        return create$default(viewModelStore, savedStateRegistryOwner, bundle, creationExtras, null, 16, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        x.f(viewModelStore, "viewModelStore");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
        return new ViewModelStoreOwnerFactory$ViewModelStoreOwner$1(viewModelStore, factory, creationExtras, bundle);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore) {
        x.f(viewModelStore, "viewModelStore");
        return create$default(viewModelStore, null, null, null, 14, null);
    }

    public static final ViewModelStoreOwner create(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        x.f(viewModelStore, "viewModelStore");
        x.f(savedStateRegistryOwner, "savedStateRegistryOwner");
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
        return create(viewModelStore, savedStateRegistryOwner.getSavedStateRegistry(), savedStateRegistryOwner.getLifecycle(), bundle, creationExtras, factory);
    }

    public static /* synthetic */ ViewModelStoreOwner create$default(ViewModelStore viewModelStore, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, int i2, Object obj) {
        k[] kVarArr;
        if ((i2 & 2) != 0) {
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
            bundle = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            SavedStateWriter.m13355constructorimpl(bundle);
        }
        if ((i2 & 4) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            factory = new SavedStateViewModelFactory();
        }
        return create(viewModelStore, bundle, creationExtras, factory);
    }

    public static /* synthetic */ ViewModelStoreOwner create$default(ViewModelStore viewModelStore, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, int i2, Object obj) {
        k[] kVarArr;
        if ((i2 & 4) != 0) {
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
            bundle = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            SavedStateWriter.m13355constructorimpl(bundle);
        }
        if ((i2 & 8) != 0) {
            creationExtras = CreationExtras.Empty.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            factory = new SavedStateViewModelFactory();
        }
        return create(viewModelStore, savedStateRegistryOwner, bundle, creationExtras, factory);
    }
}
