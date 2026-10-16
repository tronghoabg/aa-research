package androidx.compose.foundation.lazy;

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
public final class LazyListItemProviderKt {
    public static final a<LazyListItemProvider> rememberLazyListItemProviderLambda(final LazyListState lazyListState, l<? super LazyListScope, ab> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-343736148, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i2 >> 3) & 14);
        boolean z = true;
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(lazyListState)) && (i2 & 6) != 4) {
            z = false;
        }
        ah ahVarRememberedValue = composer.rememberedValue();
        if (z || ahVarRememberedValue == Composer.Companion.getEmpty()) {
            final LazyItemScopeImpl lazyItemScopeImpl = new LazyItemScopeImpl();
            final State stateDerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$0(stateRememberUpdatedState);
                }
            });
            final State stateDerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new a() { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return LazyListItemProviderKt.rememberLazyListItemProviderLambda$lambda$0$1(stateDerivedStateOf, lazyListState, lazyItemScopeImpl);
                }
            });
            ahVarRememberedValue = new ah(stateDerivedStateOf2) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt$rememberLazyListItemProviderLambda$1$1
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
    public static final LazyListIntervalContent rememberLazyListItemProviderLambda$lambda$0$0(State state) {
        return new LazyListIntervalContent((l) state.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LazyListItemProviderImpl rememberLazyListItemProviderLambda$lambda$0$1(State state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
        LazyListIntervalContent lazyListIntervalContent = (LazyListIntervalContent) state.getValue();
        return new LazyListItemProviderImpl(lazyListState, lazyListIntervalContent, lazyItemScopeImpl, new NearestRangeKeyIndexMap(lazyListState.getNearestRange$foundation(), lazyListIntervalContent));
    }
}
