package androidx.lifecycle.viewmodel.compose;

import android.os.Bundle;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelStoreOwnerDefaults;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelStoreProvider;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import com.waze.strings.DisplayStrings;
import h.a.r;
import h.g.a.l;
import h.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RememberViewModelStoreOwnerKt {
    public static final ViewModelStoreOwner rememberViewModelStoreOwner(ViewModelStoreOwner viewModelStoreOwner, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, CreationExtras creationExtras, ViewModelProvider.Factory factory, Composer composer, int i2, int i3) {
        k[] kVarArr;
        if ((i3 & 1) != 0 && (viewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new IllegalStateException("CompositionLocal LocalViewModelStoreOwner not present");
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i3 & 2) != 0) {
            savedStateRegistryOwner = (SavedStateRegistryOwner) composer.consume(LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner());
        }
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
            ComposerKt.traceEventStart(1044293547, i2, -1, "androidx.lifecycle.viewmodel.compose.rememberViewModelStoreOwner (RememberViewModelStoreOwner.kt:81)");
        }
        Long lValueOf = Long.valueOf(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
        int i4 = i2 << 3;
        ViewModelStoreOwner viewModelStoreOwnerRememberViewModelStoreOwner = rememberViewModelStoreOwner(lValueOf, RememberViewModelStoreProviderKt.rememberViewModelStoreProvider(lValueOf, viewModelStoreOwner2, bundle2, creationExtras2, factory2, composer, (i4 & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 7168) | (i2 & 57344), 0), savedStateRegistryOwner, composer, i4 & DisplayStrings.DS_TAP_TO_VERIFY, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwnerRememberViewModelStoreOwner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult rememberViewModelStoreOwner$lambda$2$0(ViewModelStoreProvider viewModelStoreProvider, Object obj, DisposableEffectScope disposableEffectScope) {
        final ViewModelStoreProvider.ReferenceToken referenceTokenAcquireToken = viewModelStoreProvider.acquireToken(obj);
        return new DisposableEffectResult() { // from class: androidx.lifecycle.viewmodel.compose.RememberViewModelStoreOwnerKt$rememberViewModelStoreOwner$lambda$2$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() throws Exception {
                RememberViewModelStoreOwnerKt$rememberViewModelStoreOwner$lambda$2$0$$inlined$onDispose$1$$ExternalSyntheticAutoCloseableDispatcher0.m(referenceTokenAcquireToken);
            }
        };
    }

    public static final ViewModelStoreOwner rememberViewModelStoreOwner(ViewModelStoreProvider viewModelStoreProvider, SavedStateRegistryOwner savedStateRegistryOwner, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            savedStateRegistryOwner = (SavedStateRegistryOwner) composer.consume(LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner());
        }
        SavedStateRegistryOwner savedStateRegistryOwner2 = savedStateRegistryOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1200276663, i2, -1, "androidx.lifecycle.viewmodel.compose.rememberViewModelStoreOwner (RememberViewModelStoreOwner.kt:120)");
        }
        ViewModelStoreOwner viewModelStoreOwnerRememberViewModelStoreOwner = rememberViewModelStoreOwner(Long.valueOf(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0)), viewModelStoreProvider, savedStateRegistryOwner2, composer, (i2 << 3) & 1008, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwnerRememberViewModelStoreOwner;
    }

    public static final ViewModelStoreOwner rememberViewModelStoreOwner(Object obj, ViewModelStoreProvider viewModelStoreProvider, SavedStateRegistryOwner savedStateRegistryOwner, Composer composer, int i2, int i3) {
        final Object obj2;
        final ViewModelStoreProvider viewModelStoreProvider2;
        if ((i3 & 4) != 0) {
            savedStateRegistryOwner = (SavedStateRegistryOwner) composer.consume(LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner());
        }
        SavedStateRegistryOwner savedStateRegistryOwner2 = savedStateRegistryOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-878166185, i2, -1, "androidx.lifecycle.viewmodel.compose.rememberViewModelStoreOwner (RememberViewModelStoreOwner.kt:161)");
        }
        boolean zChanged = composer.changed(viewModelStoreProvider) | composer.changed(obj) | composer.changed(savedStateRegistryOwner2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            obj2 = obj;
            viewModelStoreProvider2 = viewModelStoreProvider;
            objRememberedValue = ViewModelStoreProvider.getOrCreateOwner$default(viewModelStoreProvider2, obj2, savedStateRegistryOwner2, null, null, null, 28, null);
            composer.updateRememberedValue(objRememberedValue);
        } else {
            obj2 = obj;
            viewModelStoreProvider2 = viewModelStoreProvider;
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) objRememberedValue;
        boolean zChangedInstance = composer.changedInstance(viewModelStoreProvider2) | composer.changedInstance(obj2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new l() { // from class: androidx.lifecycle.viewmodel.compose.RememberViewModelStoreOwnerKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj3) {
                    return RememberViewModelStoreOwnerKt.rememberViewModelStoreOwner$lambda$2$0(viewModelStoreProvider2, obj2, (DisposableEffectScope) obj3);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        EffectsKt.DisposableEffect(viewModelStoreOwner, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return viewModelStoreOwner;
    }
}
