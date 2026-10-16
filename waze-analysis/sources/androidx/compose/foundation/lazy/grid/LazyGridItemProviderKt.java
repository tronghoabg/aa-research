package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.ah;
import h.l.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyGridItemProviderKt {
    public static final a<LazyGridItemProvider> rememberLazyGridItemProviderLambda(final LazyGridState lazyGridState, l<? super LazyGridScope, ab> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898306282, i2, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(lazyGridState)) && (i2 & 6) != 4) {
            z = false;
        }
        ah ahVarRememberedValue = composer.rememberedValue();
        if (z || ahVarRememberedValue == Composer.Companion.getEmpty()) {
            final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$0(stateRememberUpdatedState);
                }
            });
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyGridItemProviderKt.rememberLazyGridItemProviderLambda$lambda$0$1(stateDerivedStateOf, lazyGridState);
                }
            });
            ahVarRememberedValue = new ah(stateDerivedStateOf2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
                @Override // h.g.b.ah, h.l.n
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(ahVarRememberedValue);
        }
        n nVar = (n) ahVarRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridIntervalContent rememberLazyGridItemProviderLambda$lambda$0$0(State state) {
        return new LazyGridIntervalContent((l) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyGridItemProviderImpl rememberLazyGridItemProviderLambda$lambda$0$1(State state, LazyGridState lazyGridState) {
        LazyGridIntervalContent lazyGridIntervalContent = (LazyGridIntervalContent) state.getValue();
        return new LazyGridItemProviderImpl(lazyGridState, lazyGridIntervalContent, new NearestRangeKeyIndexMap(lazyGridState.getNearestRange$foundation(), lazyGridIntervalContent));
    }
}
