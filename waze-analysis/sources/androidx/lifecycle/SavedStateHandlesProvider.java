package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.f;
import h.g;
import h.g.a.a;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private Bundle restoredState;
    private final SavedStateRegistry savedStateRegistry;
    private final f viewModel$delegate;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, final ViewModelStoreOwner viewModelStoreOwner) {
        x.f(savedStateRegistry, "savedStateRegistry");
        x.f(viewModelStoreOwner, "viewModelStoreOwner");
        this.savedStateRegistry = savedStateRegistry;
        this.viewModel$delegate = g.a(new a() { // from class: androidx.lifecycle.SavedStateHandlesProvider$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return SavedStateHandleSupport.getSavedStateHandlesVM(viewModelStoreOwner);
            }
        });
    }

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        k[] kVarArr;
        x.f(str, "key");
        performRestore();
        Bundle bundle = this.restoredState;
        if (bundle == null) {
            return null;
        }
        SavedStateReader.m13269constructorimpl(bundle);
        if (!SavedStateReader.m13270containsimpl(bundle, str)) {
            return null;
        }
        SavedStateReader.m13269constructorimpl(bundle);
        Bundle bundleM13331getSavedStateOrNullimpl = SavedStateReader.m13331getSavedStateOrNullimpl(bundle, str);
        if (bundleM13331getSavedStateOrNullimpl == null) {
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
            bundleM13331getSavedStateOrNullimpl = BundleKt.bundleOf((k[]) Arrays.copyOf(kVarArr, kVarArr.length));
            SavedStateWriter.m13355constructorimpl(bundleM13331getSavedStateOrNullimpl);
        }
        SavedStateWriter.m13355constructorimpl(bundle);
        SavedStateWriter.m13391removeimpl(bundle, str);
        SavedStateReader.m13269constructorimpl(bundle);
        if (SavedStateReader.m13347isEmptyimpl(bundle)) {
            this.restoredState = null;
        }
        return bundleM13331getSavedStateOrNullimpl;
    }

    public final void performRestore() {
        k[] kVarArr;
        if (this.restored) {
            return;
        }
        Bundle bundleConsumeRestoredStateForKey = this.savedStateRegistry.consumeRestoredStateForKey(SavedStateHandleSupport.SAVED_STATE_KEY);
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
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
        }
        if (bundleConsumeRestoredStateForKey != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundleConsumeRestoredStateForKey);
        }
        this.restoredState = bundleBundleOf;
        this.restored = true;
        getViewModel();
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public Bundle saveState() {
        k[] kVarArr;
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
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            SavedStateWriter.m13359putAllimpl(bundleBundleOf, bundle);
        }
        for (Map.Entry<String, SavedStateHandle> entry2 : getViewModel().getHandles().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleSaveState = entry2.getValue().savedStateProvider().saveState();
            SavedStateReader.m13269constructorimpl(bundleSaveState);
            if (!SavedStateReader.m13347isEmptyimpl(bundleSaveState)) {
                SavedStateWriter.m13382putSavedStateimpl(bundleBundleOf, key, bundleSaveState);
            }
        }
        this.restored = false;
        return bundleBundleOf;
    }
}
