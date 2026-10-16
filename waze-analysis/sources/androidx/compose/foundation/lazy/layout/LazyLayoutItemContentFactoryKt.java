package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m2949SkippableItemJVlU9Rs(final LazyLayoutItemProvider lazyLayoutItemProvider, final Object obj, final int i2, final Object obj2, Composer composer, final int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1439843069);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(lazyLayoutItemProvider) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(obj) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(obj2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i4, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.rememberComposableLambda(980966366, true, new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$0(lazyLayoutItemProvider, i2, obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj3, Object obj4) {
                    return LazyLayoutItemContentFactoryKt.SkippableItem_JVlU9Rs$lambda$1(lazyLayoutItemProvider, obj, i2, obj2, i3, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    static final ab SkippableItem_JVlU9Rs$lambda$0(LazyLayoutItemProvider lazyLayoutItemProvider, int i2, Object obj, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(980966366, i3, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            lazyLayoutItemProvider.Item(i2, obj, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab SkippableItem_JVlU9Rs$lambda$1(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i2, Object obj2, int i3, Composer composer, int i4) {
        m2949SkippableItemJVlU9Rs(lazyLayoutItemProvider, obj, i2, obj2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }
}
