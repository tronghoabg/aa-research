package androidx.compose.runtime.retain;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetainedValuesStoreRegistryKt {
    public static final RetainedValuesStoreRegistry retainRetainedValuesStoreRegistry(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1800021473, i2, -1, "androidx.compose.runtime.retain.retainRetainedValuesStoreRegistry (RetainedValuesStoreRegistry.kt:145)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.runtime.retain.RetainedValuesStoreRegistryKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return RetainedValuesStoreRegistryKt.retainRetainedValuesStoreRegistry$lambda$0$0();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        RetainedValuesStoreRegistry retainedValuesStoreRegistry = ((RetainedValuesStoreRegistryWrapper) RetainKt.retain(-285137363, (a) objRememberedValue, composer, 48)).getRetainedValuesStoreRegistry();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return retainedValuesStoreRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RetainedValuesStoreRegistryWrapper retainRetainedValuesStoreRegistry$lambda$0$0() {
        return new RetainedValuesStoreRegistryWrapper();
    }
}
