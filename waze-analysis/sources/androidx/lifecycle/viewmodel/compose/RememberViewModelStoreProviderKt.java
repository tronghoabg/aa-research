package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelStoreProvider;
import androidx.savedstate.SavedStateWriter;
import h.a.r;
import h.g.a.l;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RememberViewModelStoreProviderKt {
    public static final ViewModelStoreProvider rememberViewModelStoreProvider(Object obj, ViewModelStoreOwner viewModelStoreOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, Composer composer, int i2, int i3) {
        k[] kVarArr;
        if ((i3 & 2) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("CompositionLocal LocalViewModelStoreOwner not present");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i3 & 4) != 0) {
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
        if ((i3 & 8) != 0) {
            creationExtras = ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner2);
        }
        CreationExtras creationExtras2 = creationExtras;
        if ((i3 & 16) != 0) {
            factory = ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner2);
        }
        ViewModelProvider.Factory factory2 = factory;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-839328819, i2, -1, "androidx.lifecycle.viewmodel.compose.rememberViewModelStoreProvider (RememberViewModelStoreProvider.kt:136)");
        }
        boolean zChanged = composer.changed(viewModelStoreOwner2) | composer.changed(obj);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            Object viewModelStoreProvider = new ViewModelStoreProvider(viewModelStoreOwner2, obj, bundle2, creationExtras2, factory2);
            composer.updateRememberedValue(viewModelStoreProvider);
            objRememberedValue = viewModelStoreProvider;
        }
        final ViewModelStoreProvider viewModelStoreProvider2 = (ViewModelStoreProvider) objRememberedValue;
        final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
        boolean zChangedInstance = composer.changedInstance(viewModelStoreProvider2) | composer.changedInstance(lifecycle);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.lifecycle.viewmodel.compose.RememberViewModelStoreProviderKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return RememberViewModelStoreProviderKt.rememberViewModelStoreProvider$lambda$3$0(viewModelStoreProvider2, lifecycle, (DisposableEffectScope) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(viewModelStoreProvider2, lifecycle, (l) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreProvider2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberViewModelStoreProvider$lambda$3$0(final ViewModelStoreProvider viewModelStoreProvider, final Lifecycle lifecycle, DisposableEffectScope disposableEffectScope) {
        final ViewModelStoreProvider.ReferenceToken referenceTokenAcquireToken = viewModelStoreProvider.acquireToken(ViewModelStoreProvider.ProviderMarkerKey.INSTANCE);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.viewmodel.compose.RememberViewModelStoreProviderKt$rememberViewModelStoreProvider$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() throws Exception {
                RememberViewModelStoreProviderKt$rememberViewModelStoreProvider$lambda$3$0$$inlined$onDispose$1$$ExternalSyntheticAutoCloseableDispatcher0.m(referenceTokenAcquireToken);
                if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                    viewModelStoreProvider.clearAllKeys();
                }
            }
        };
    }

    public static final ViewModelStoreProvider rememberViewModelStoreProvider(ViewModelStoreOwner viewModelStoreOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, Composer composer, int i2, int i3) {
        k[] kVarArr;
        if ((i3 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("CompositionLocal LocalViewModelStoreOwner not present");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i3 & 2) != 0) {
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
        if ((i3 & 4) != 0) {
            creationExtras = ViewModelStoreOwnerDefaults.getViewModelCreationExtras(viewModelStoreOwner2);
        }
        CreationExtras creationExtras2 = creationExtras;
        if ((i3 & 8) != 0) {
            factory = ViewModelStoreOwnerDefaults.getViewModelProviderFactory(viewModelStoreOwner2);
        }
        ViewModelProvider.Factory factory2 = factory;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1996266349, i2, -1, "androidx.lifecycle.viewmodel.compose.rememberViewModelStoreProvider (RememberViewModelStoreProvider.kt:75)");
        }
        ViewModelStoreProvider viewModelStoreProviderRememberViewModelStoreProvider = rememberViewModelStoreProvider(Long.valueOf(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0)), viewModelStoreOwner2, bundle2, creationExtras2, factory2, composer, (i2 << 3) & 65520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreProviderRememberViewModelStoreProvider;
    }
}
