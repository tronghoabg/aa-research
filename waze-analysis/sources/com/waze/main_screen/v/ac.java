package com.waze.main_screen.v;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ac {
    public static final m a(o oVar, Composer composer) {
        h.g.b.x.f(oVar, "promotionalChipStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1865895554, 0, -1, "com.waze.main_screen.promotional_chip.rememberPromotionalChipState (PromotionalChipState.kt:43)");
        }
        n nVar = (n) SnapshotStateKt.collectAsState(oVar.c(), null, composer, 0, 1).getValue();
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableState mutableState = (MutableState) objRememberedValue;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new MutableTransitionState(false);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue2;
        Object value = mutableState.getValue();
        boolean zChangedInstance = composer.changedInstance(mutableTransitionState) | composer.changed(nVar);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
            objRememberedValue3 = (h.g.a.p) new ab(mutableTransitionState, mutableState, nVar, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        EffectsKt.LaunchedEffect(nVar, value, (h.g.a.p) objRememberedValue3, composer, 0);
        boolean zChanged = composer.changed(nVar) | composer.changed(mutableTransitionState);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
            objRememberedValue4 = new aa(nVar, mutableTransitionState, mutableState);
            composer.updateRememberedValue(objRememberedValue4);
        }
        aa aaVar = (aa) objRememberedValue4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aaVar;
    }

    public static final void b(n nVar, TransitionState transitionState, o oVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(transitionState, "visibleState");
        h.g.b.x.f(oVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1414578394);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(nVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? composerStartRestartGroup.changed(transitionState) : composerStartRestartGroup.changedInstance(transitionState)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(oVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1414578394, i3, -1, "com.waze.main_screen.promotional_chip.PromotionalChip (PromotionalChipCompat.kt:91)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Ref ref = (Ref) objRememberedValue;
            ref.setValue(nVar == null ? (n) ref.getValue() : nVar);
            n nVar2 = (n) ref.getValue();
            if (nVar2 == null) {
                composerStartRestartGroup.startReplaceGroup(514535647);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(514535648);
                Object[] objArr = {nVar2.c()};
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.main_screen.c.g.a(15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 48);
                Boolean boolValueOf = Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue());
                String strC = nVar2.c();
                boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(nVar2);
                boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
                g gVarRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((z | zChanged) || gVarRememberedValue == Composer.Companion.getEmpty()) {
                    gVarRememberedValue = new g(nVar2, mutableState, oVar, null);
                    composerStartRestartGroup.updateRememberedValue(gVarRememberedValue);
                }
                EffectsKt.LaunchedEffect(boolValueOf, strC, (h.g.a.p) gVarRememberedValue, composerStartRestartGroup, 0);
                com.waze.ui.q.g.c(com.waze.ui.q.h.f43256a, nVar2.d(), transitionState, PaddingKt.m2759paddingqDBjuR0$default(modifier, 4.0f, 0.0f, 12.0f, 0.0f, 10, null), nVar2.b(), nVar2.a(), nVar2.f(), composerStartRestartGroup, (TransitionState.$stable << 9) | DisplayStrings.DS_DICTATION_BOTTOM_SHEET_SPEECH_TIMEOUT | ((i3 << 6) & 7168));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(nVar, transitionState, oVar, modifier, i2, 8));
        }
    }

    public static final void c(m mVar, o oVar, Composer composer, int i2) {
        h.g.b.x.f(mVar, "promotionalChipState");
        h.g.b.x.f(oVar, "promotionalChipStateHolder");
        Composer composerStartRestartGroup = composer.startRestartGroup(926656696);
        Modifier.Companion companion = Modifier.Companion;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(926656696, i2, -1, "com.waze.main_screen.promotional_chip.PromotionalChip (PromotionalChipCompat.kt:76)");
        }
        int i3 = i2 << 3;
        b(mVar.b(), mVar.a(), oVar, companion, composerStartRestartGroup, (TransitionState.$stable << 3) | (i3 & DisplayStrings.DS_TAP_TO_VERIFY) | (i3 & 7168));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(mVar, oVar, i2, 5));
        }
    }
}
