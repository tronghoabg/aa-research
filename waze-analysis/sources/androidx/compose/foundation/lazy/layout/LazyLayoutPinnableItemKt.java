package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    public static final void LazyLayoutPinnableItem(final Object obj, final int i2, final LazyLayoutPinnedItemList lazyLayoutPinnedItemList, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(872548579);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(obj) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lazyLayoutPinnedItemList) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872548579, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(lazyLayoutPinnedItemList);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) objRememberedValue;
            lazyLayoutPinnableItem.setIndex(i2);
            lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) composerStartRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
            boolean zChanged2 = composerStartRestartGroup.changed(lazyLayoutPinnableItem);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$1$0(lazyLayoutPinnableItem, (DisposableEffectScope) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), pVar, composerStartRestartGroup, ((i4 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return LazyLayoutPinnableItemKt.LazyLayoutPinnableItem$lambda$2(obj, i2, lazyLayoutPinnedItemList, pVar, i3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult LazyLayoutPinnableItem$lambda$1$0(final LazyLayoutPinnableItem lazyLayoutPinnableItem, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lazyLayoutPinnableItem.onDisposed();
            }
        };
    }

    static final ab LazyLayoutPinnableItem$lambda$2(Object obj, int i2, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, p pVar, int i3, Composer composer, int i4) {
        LazyLayoutPinnableItem(obj, i2, lazyLayoutPinnedItemList, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }
}
