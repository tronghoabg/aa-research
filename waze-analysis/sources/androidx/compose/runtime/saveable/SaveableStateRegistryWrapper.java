package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.a.a;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SaveableStateRegistryWrapper implements SaveableStateRegistry, SavedStateRegistryOwner {
    public static final int $stable = 8;
    private final /* synthetic */ SaveableStateRegistry $$delegate_0;
    private SavedStateRegistryController _controller;
    private LifecycleRegistry _lifecycle;

    public SaveableStateRegistryWrapper(SaveableStateRegistry saveableStateRegistry) {
        this.$$delegate_0 = saveableStateRegistry;
        Object objConsumeRestored = consumeRestored("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objConsumeRestored instanceof Bundle ? (Bundle) objConsumeRestored : null;
        if (bundle != null) {
            getOrInitController(bundle);
        }
        registerProvider("androidx.savedstate.SavedStateRegistry", new a() { // from class: androidx.compose.runtime.saveable.SaveableStateRegistryWrapper$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SaveableStateRegistryWrapper._init_$lambda$0(this.f$0);
            }
        });
    }

    static final Object _init_$lambda$0(SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        k[] kVarArr;
        SavedStateRegistryController savedStateRegistryController = saveableStateRegistryWrapper._controller;
        if (savedStateRegistryController == null) {
            return null;
        }
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
        savedStateRegistryController.performSave(bundleBundleOf);
        SavedStateReader.m13269constructorimpl(bundleBundleOf);
        if (SavedStateReader.m13347isEmptyimpl(bundleBundleOf)) {
            return null;
        }
        return bundleBundleOf;
    }

    private final SavedStateRegistryController getController() {
        return getOrInitController(null);
    }

    private final SavedStateRegistryController getOrInitController(Bundle bundle) {
        SavedStateRegistryController savedStateRegistryController = this._controller;
        if (savedStateRegistryController != null) {
            return savedStateRegistryController;
        }
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.Companion.create(this);
        this._controller = savedStateRegistryControllerCreate;
        savedStateRegistryControllerCreate.performRestore(bundle);
        return savedStateRegistryControllerCreate;
    }

    private final LifecycleRegistry getOrInitLifecycle() {
        LifecycleRegistry lifecycleRegistry = this._lifecycle;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistryCreateUnsafe = LifecycleRegistry.Companion.createUnsafe(this);
        this._lifecycle = lifecycleRegistryCreateUnsafe;
        return lifecycleRegistryCreateUnsafe;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return getController().getSavedStateRegistry();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public Map<String, List<Object>> performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public SaveableStateRegistry.Entry registerProvider(String str, a<? extends Object> aVar) {
        return this.$$delegate_0.registerProvider(str, aVar);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public LifecycleRegistry getLifecycle() {
        return getOrInitLifecycle();
    }
}
