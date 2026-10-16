package androidx.compose.material3.internal;

import androidx.compose.material3.internal.BackEventProgress;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BasicEdgeToEdgeDialogKt {
    public static final void PredictiveBackStateHandler(final PredictiveBackState predictiveBackState, boolean z, final a<ab> aVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(698755635);
        boolean z2 = true;
        if (i5 == 0) {
            i4 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(predictiveBackState) : composerStartRestartGroup.changedInstance(predictiveBackState)) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        boolean z3 = i6 == 0;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            z |= !z3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(698755635, i4, -1, "androidx.compose.material3.internal.PredictiveBackStateHandler (BasicEdgeToEdgeDialog.kt:90)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composerStartRestartGroup, (i4 >> 6) & 14);
            composerStartRestartGroup.startMovableGroup(1489276313, predictiveBackState);
            x.d(predictiveBackState, "null cannot be cast to non-null type androidx.compose.material3.internal.PredictiveBackStateImpl");
            boolean z4 = z && !(((PredictiveBackStateImpl) predictiveBackState).getValue() instanceof BackEventProgress.Completed);
            if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !composerStartRestartGroup.changedInstance(predictiveBackState))) {
                z2 = false;
            }
            boolean zChanged = composerStartRestartGroup.changed(stateRememberUpdatedState) | z2;
            BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1RememberedValue == Composer.Companion.getEmpty()) {
                basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1RememberedValue = new BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(predictiveBackState, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1RememberedValue);
            }
            BackHandler_androidKt.PredictiveBackHandler(z4, (p) basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1RememberedValue, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z5 = z;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler$lambda$2(predictiveBackState, z5, aVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a<ab> PredictiveBackStateHandler$lambda$0(State<? extends a<ab>> state) {
        return state.getValue();
    }

    static final ab PredictiveBackStateHandler$lambda$2(PredictiveBackState predictiveBackState, boolean z, a aVar, int i2, int i3, Composer composer, int i4) {
        PredictiveBackStateHandler(predictiveBackState, z, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final PredictiveBackState rememberPredictiveBackState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1883443352, i2, -1, "androidx.compose.material3.internal.rememberPredictiveBackState (BasicEdgeToEdgeDialog.kt:77)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new PredictiveBackStateImpl();
            composer.updateRememberedValue(objRememberedValue);
        }
        PredictiveBackStateImpl predictiveBackStateImpl = (PredictiveBackStateImpl) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return predictiveBackStateImpl;
    }
}
