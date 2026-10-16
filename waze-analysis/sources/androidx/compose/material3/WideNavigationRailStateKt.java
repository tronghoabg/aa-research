package androidx.compose.material3;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailStateKt {
    public static final boolean isExpanded(WideNavigationRailValue wideNavigationRailValue) {
        return wideNavigationRailValue == WideNavigationRailValue.Expanded;
    }

    public static final WideNavigationRailValue not(WideNavigationRailValue wideNavigationRailValue) {
        WideNavigationRailValue wideNavigationRailValue2 = WideNavigationRailValue.Collapsed;
        return wideNavigationRailValue == wideNavigationRailValue2 ? WideNavigationRailValue.Expanded : wideNavigationRailValue2;
    }

    public static final WideNavigationRailState rememberWideNavigationRailState(final WideNavigationRailValue wideNavigationRailValue, Composer composer, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            wideNavigationRailValue = WideNavigationRailValue.Collapsed;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595273472, i2, -1, "androidx.compose.material3.rememberWideNavigationRailState (WideNavigationRailState.kt:84)");
        }
        final FiniteAnimationSpec finiteAnimationSpecValue = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultSpatial, composer, 6);
        Object[] objArr = new Object[0];
        Saver<WideNavigationRailState, WideNavigationRailValue> Saver = WideNavigationRailStateImpl.Companion.Saver(finiteAnimationSpecValue);
        if ((((i2 & 14) ^ 6) <= 4 || !composer.changed(wideNavigationRailValue.ordinal())) && (i2 & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance = composer.changedInstance(finiteAnimationSpecValue) | z;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new a() { // from class: androidx.compose.material3.WideNavigationRailStateKt$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return WideNavigationRailStateKt.rememberWideNavigationRailState$lambda$0$0(wideNavigationRailValue, finiteAnimationSpecValue);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        WideNavigationRailState wideNavigationRailState = (WideNavigationRailState) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) Saver, (a) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wideNavigationRailState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WideNavigationRailState rememberWideNavigationRailState$lambda$0$0(WideNavigationRailValue wideNavigationRailValue, FiniteAnimationSpec finiteAnimationSpec) {
        return new WideNavigationRailStateImpl(wideNavigationRailValue, finiteAnimationSpec);
    }
}
