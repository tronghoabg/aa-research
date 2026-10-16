package androidx.lifecycle.viewmodel;

import android.os.Bundle;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.ab;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewModelStoreProvider {
    private final Bundle defaultArgs;
    private final CreationExtras defaultCreationExtras;
    private final ViewModelProvider.Factory defaultFactory;
    private final Object parentKey;
    private final ViewModelStore parentStore;
    private final f stateHolder$delegate;

    /* compiled from: WazeSource */
    public final class ProviderMarkerKey {
        public static final ProviderMarkerKey INSTANCE = new ProviderMarkerKey();

        private ProviderMarkerKey() {
        }
    }

    /* compiled from: WazeSource */
    public interface ReferenceToken extends AutoCloseable {
    }

    /* compiled from: WazeSource */
    final class StateHolder extends ViewModel {
        private final MutableScatterMap<Object, Entry> entries = ScatterMapKt.mutableScatterMapOf();

        public final void clearKey(Object obj) {
            Entry entry = this.entries.get(obj);
            if (entry == null) {
                return;
            }
            entry.setDisposable(true);
            if (!entry.isDisposable() || entry.getRefCount() > 0) {
                return;
            }
            remove(obj);
        }

        public final MutableScatterMap<Object, Entry> getEntries() {
            return this.entries;
        }

        public final Entry getOrCreate(Object obj) {
            MutableScatterMap<Object, Entry> mutableScatterMap = this.entries;
            Entry entry = mutableScatterMap.get(obj);
            if (entry == null) {
                Entry entry2 = new Entry(obj, null, 0, false, 14, null);
                mutableScatterMap.set(obj, entry2);
                entry = entry2;
            }
            return entry;
        }

        @Override // androidx.lifecycle.ViewModel
        public void onCleared() {
            int i2;
            ScatterMap scatterMap = ViewModelStoreProviderKt.toScatterMap(this.entries);
            Object[] objArr = scatterMap.values;
            long[] jArr = scatterMap.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        i2 = 8 - ((~i4) >>> 31);
                        if (i5 >= i2) {
                            break;
                        }
                        if ((255 & j2) < 128) {
                            Entry entry = (Entry) objArr[(i3 << 3) + i5];
                            entry.setDisposable(true);
                            if (entry.getRefCount() <= 0) {
                                remove(entry.getKey());
                            }
                        }
                        j2 >>= 8;
                        i5++;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i3 == length) {
                    return;
                } else {
                    i3++;
                }
            }
        }

        public final ab remove(Object obj) {
            ViewModelStore store;
            Entry entryRemove = this.entries.remove(obj);
            if (entryRemove == null || (store = entryRemove.getStore()) == null) {
                return null;
            }
            store.clear();
            return ab.f48028a;
        }
    }

    public /* synthetic */ ViewModelStoreProvider(ViewModelStore viewModelStore, Object obj, Bundle bundle, CreationExtras.Empty empty, SavedStateViewModelFactory savedStateViewModelFactory, int i2, o oVar) {
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
        this(viewModelStore, (i2 & 2) != 0 ? null : obj, bundle, (i2 & 8) != 0 ? CreationExtras.Empty.INSTANCE : empty, (i2 & 16) != 0 ? new SavedStateViewModelFactory() : savedStateViewModelFactory);
    }

    static final void acquireToken$lambda$0(Entry entry, ViewModelStoreProvider viewModelStoreProvider, Object obj) {
        entry.setRefCount(entry.getRefCount() - 1);
        if (!entry.isDisposable() || entry.getRefCount() > 0) {
            return;
        }
        viewModelStoreProvider.getStateHolder().remove(obj);
    }

    public static /* synthetic */ ViewModelStoreOwner getOrCreateOwner$default(ViewModelStoreProvider viewModelStoreProvider, Object obj, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            bundle = viewModelStoreProvider.defaultArgs;
        }
        Bundle bundle2 = bundle;
        if ((i2 & 8) != 0) {
            creationExtras = viewModelStoreProvider.defaultCreationExtras;
        }
        CreationExtras creationExtras2 = creationExtras;
        if ((i2 & 16) != 0) {
            factory = viewModelStoreProvider.defaultFactory;
        }
        ViewModelProvider.Factory factory2 = factory;
        if ((i2 & 2) != 0) {
            savedStateRegistryOwner = null;
        }
        return viewModelStoreProvider.getOrCreateOwner(obj, savedStateRegistryOwner, bundle2, creationExtras2, factory2);
    }

    private final StateHolder getStateHolder() {
        return (StateHolder) this.stateHolder$delegate.getValue();
    }

    static final StateHolder stateHolder_delegate$lambda$0(ViewModelStoreProvider viewModelStoreProvider) {
        StateHolder stateHolder;
        ViewModelStore viewModelStore = viewModelStoreProvider.parentStore;
        return (viewModelStore == null || (stateHolder = (StateHolder) viewModelStore.getOrPut(viewModelStoreProvider.parentKey, new a() { // from class: androidx.lifecycle.viewmodel.ViewModelStoreProvider$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return ViewModelStoreProvider.stateHolder_delegate$lambda$0$0();
            }
        })) == null) ? new StateHolder() : stateHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateHolder stateHolder_delegate$lambda$0$0() {
        return new StateHolder();
    }

    public final ReferenceToken acquireToken(final Object obj) {
        final Entry orCreate = getStateHolder().getOrCreate(obj);
        orCreate.setRefCount(orCreate.getRefCount() + 1);
        return new ReferenceToken() { // from class: androidx.lifecycle.viewmodel.ViewModelStoreProvider$$ExternalSyntheticLambda1
            @Override // java.lang.AutoCloseable
            public final void close() {
                ViewModelStoreProvider.acquireToken$lambda$0(orCreate, this, obj);
            }
        };
    }

    public final void clearAllKeys() {
        Entry entry = getStateHolder().getEntries().get(ProviderMarkerKey.INSTANCE);
        if (entry == null || entry.getRefCount() <= 0) {
            getStateHolder().onCleared();
        }
    }

    public final void clearKey(Object obj) {
        getStateHolder().clearKey(obj);
    }

    public final ViewModelStore getOrCreate(Object obj) {
        return getStateHolder().getOrCreate(obj).getStore();
    }

    public final ViewModelStoreOwner getOrCreateOwner(Object obj, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
        ViewModelStore orCreate = getOrCreate(obj);
        return savedStateRegistryOwner == null ? ViewModelStoreOwnerFactory.create(orCreate, bundle, creationExtras, factory) : ViewModelStoreOwnerFactory.create(orCreate, savedStateRegistryOwner, bundle, creationExtras, factory);
    }

    /* compiled from: WazeSource */
    final class Entry {
        private boolean isDisposable;
        private final Object key;
        private int refCount;
        private final ViewModelStore store;

        public /* synthetic */ Entry(Object obj, ViewModelStore viewModelStore, int i2, boolean z, int i3, o oVar) {
            this(obj, (i3 & 2) != 0 ? new ViewModelStore() : viewModelStore, (i3 & 4) != 0 ? 0 : i2, z & ((i3 & 8) == 0));
        }

        public static /* synthetic */ Entry copy$default(Entry entry, Object obj, ViewModelStore viewModelStore, int i2, boolean z, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = entry.key;
            }
            if ((i3 & 2) != 0) {
                viewModelStore = entry.store;
            }
            if ((i3 & 4) != 0) {
                i2 = entry.refCount;
            }
            if ((i3 & 8) != 0) {
                z = entry.isDisposable;
            }
            return entry.copy(obj, viewModelStore, i2, z);
        }

        public final Object component1() {
            return this.key;
        }

        public final ViewModelStore component2() {
            return this.store;
        }

        public final int component3() {
            return this.refCount;
        }

        public final boolean component4() {
            return this.isDisposable;
        }

        public final Entry copy(Object obj, ViewModelStore viewModelStore, int i2, boolean z) {
            x.f(viewModelStore, "store");
            return new Entry(obj, viewModelStore, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return x.n(this.key, entry.key) && x.n(this.store, entry.store) && this.refCount == entry.refCount && this.isDisposable == entry.isDisposable;
        }

        public final Object getKey() {
            return this.key;
        }

        public final int getRefCount() {
            return this.refCount;
        }

        public final ViewModelStore getStore() {
            return this.store;
        }

        public int hashCode() {
            Object obj = this.key;
            return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.store.hashCode()) * 31) + this.refCount) * 31) + ViewModelStoreProvider$Entry$$ExternalSyntheticBackport0.m(this.isDisposable);
        }

        public final boolean isDisposable() {
            return this.isDisposable;
        }

        public final void setDisposable(boolean z) {
            this.isDisposable = z;
        }

        public final void setRefCount(int i2) {
            this.refCount = i2;
        }

        public String toString() {
            return "Entry(key=" + this.key + ", store=" + this.store + ", refCount=" + this.refCount + ", isDisposable=" + this.isDisposable + ")";
        }

        public Entry(Object obj, ViewModelStore viewModelStore, int i2, boolean z) {
            x.f(viewModelStore, "store");
            this.key = obj;
            this.store = viewModelStore;
            this.refCount = i2;
            this.isDisposable = z;
        }
    }

    public final ViewModelStoreOwner getOrCreateOwner(Object obj, SavedStateRegistryOwner savedStateRegistryOwner) {
        return getOrCreateOwner$default(this, obj, savedStateRegistryOwner, null, null, null, 28, null);
    }

    public final ViewModelStoreOwner getOrCreateOwner(Object obj, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        x.f(bundle, "defaultArgs");
        return getOrCreateOwner$default(this, obj, savedStateRegistryOwner, bundle, null, null, 24, null);
    }

    public final ViewModelStoreOwner getOrCreateOwner(Object obj, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras) {
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        return getOrCreateOwner$default(this, obj, savedStateRegistryOwner, bundle, creationExtras, null, 16, null);
    }

    public final ViewModelStoreOwner getOrCreateOwner(Object obj) {
        return getOrCreateOwner$default(this, obj, null, null, null, null, 30, null);
    }

    public ViewModelStoreProvider(ViewModelStore viewModelStore, Object obj) {
        this(viewModelStore, obj, (Bundle) null, (CreationExtras) null, (ViewModelProvider.Factory) null, 28, (o) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreProvider(ViewModelStore viewModelStore, Object obj, Bundle bundle) {
        this(viewModelStore, obj, bundle, (CreationExtras) null, (ViewModelProvider.Factory) null, 24, (o) null);
        x.f(bundle, "defaultArgs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreProvider(ViewModelStore viewModelStore, Object obj, Bundle bundle, CreationExtras creationExtras) {
        this(viewModelStore, obj, bundle, creationExtras, (ViewModelProvider.Factory) null, 16, (o) null);
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
    }

    public ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner, (Object) null, (Bundle) null, (CreationExtras) null, (ViewModelProvider.Factory) null, 30, (o) null);
    }

    public ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Object obj) {
        this(viewModelStoreOwner, obj, (Bundle) null, (CreationExtras) null, (ViewModelProvider.Factory) null, 28, (o) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Object obj, Bundle bundle) {
        this(viewModelStoreOwner, obj, bundle, (CreationExtras) null, (ViewModelProvider.Factory) null, 24, (o) null);
        x.f(bundle, "defaultArgs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Object obj, Bundle bundle, CreationExtras creationExtras) {
        this(viewModelStoreOwner, obj, bundle, creationExtras, (ViewModelProvider.Factory) null, 16, (o) null);
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
    }

    public ViewModelStoreProvider(ViewModelStore viewModelStore, Object obj, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
        this.parentStore = viewModelStore;
        this.parentKey = obj;
        this.defaultArgs = bundle;
        this.defaultCreationExtras = creationExtras;
        this.defaultFactory = factory;
        this.stateHolder$delegate = g.a(new a() { // from class: androidx.lifecycle.viewmodel.ViewModelStoreProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ViewModelStoreProvider.stateHolder_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Object obj, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory) {
        this(viewModelStoreOwner != null ? viewModelStoreOwner.getViewModelStore() : null, obj, bundle, creationExtras, factory);
        x.f(bundle, "defaultArgs");
        x.f(creationExtras, "defaultCreationExtras");
        x.f(factory, "defaultFactory");
    }

    public ViewModelStoreProvider(ViewModelStore viewModelStore) {
        this(viewModelStore, (Object) null, (Bundle) null, (CreationExtras) null, (ViewModelProvider.Factory) null, 30, (o) null);
    }

    public /* synthetic */ ViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Object obj, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, int i2, o oVar) {
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
        this(viewModelStoreOwner, (i2 & 2) != 0 ? null : obj, bundle, (i2 & 8) != 0 ? ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner) : creationExtras, (i2 & 16) != 0 ? ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner) : factory);
    }
}
