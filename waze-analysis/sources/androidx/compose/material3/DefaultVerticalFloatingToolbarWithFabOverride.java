package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultVerticalFloatingToolbarWithFabOverride implements VerticalFloatingToolbarWithFabOverride {
    public static final int $stable = 0;
    public static final DefaultVerticalFloatingToolbarWithFabOverride INSTANCE = new DefaultVerticalFloatingToolbarWithFabOverride();

    private DefaultVerticalFloatingToolbarWithFabOverride() {
    }

    private static final boolean VerticalFloatingToolbarWithFab$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState VerticalFloatingToolbarWithFab$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean VerticalFloatingToolbarWithFab$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void VerticalFloatingToolbarWithFab$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab VerticalFloatingToolbarWithFab$lambda$4$0(MutableState mutableState, boolean z) {
        VerticalFloatingToolbarWithFab$lambda$3(mutableState, z);
        return ab.f48028a;
    }

    static final ab VerticalFloatingToolbarWithFab$lambda$5(DefaultVerticalFloatingToolbarWithFabOverride defaultVerticalFloatingToolbarWithFabOverride, VerticalFloatingToolbarWithFabOverrideScope verticalFloatingToolbarWithFabOverrideScope, int i2, Composer composer, int i3) {
        defaultVerticalFloatingToolbarWithFabOverride.VerticalFloatingToolbarWithFab(verticalFloatingToolbarWithFabOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.VerticalFloatingToolbarWithFabOverride
    public void VerticalFloatingToolbarWithFab(final VerticalFloatingToolbarWithFabOverrideScope verticalFloatingToolbarWithFabOverrideScope, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1450582729);
        boolean z = true;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(verticalFloatingToolbarWithFabOverrideScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1450582729, i3, -1, "androidx.compose.material3.DefaultVerticalFloatingToolbarWithFabOverride.VerticalFloatingToolbarWithFab (FloatingToolbar.kt:566)");
            }
            State stateRememberTouchExplorationService = FloatingToolbarKt.rememberTouchExplorationService(composerStartRestartGroup, 0);
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DefaultVerticalFloatingToolbarWithFabOverride.VerticalFloatingToolbarWithFab$lambda$1$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (a) objRememberedValue, composerStartRestartGroup, 48);
            Modifier modifier = verticalFloatingToolbarWithFabOverrideScope.getModifier();
            if (VerticalFloatingToolbarWithFab$lambda$2(mutableState) || (!VerticalFloatingToolbarWithFab$lambda$0(stateRememberTouchExplorationService) && !verticalFloatingToolbarWithFabOverrideScope.isExpanded())) {
                z = false;
            }
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DefaultVerticalFloatingToolbarWithFabOverride.VerticalFloatingToolbarWithFab$lambda$4$0(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composer2 = composerStartRestartGroup;
            FloatingToolbarKt.m4954VerticalFloatingToolbarWithFabLayoutNur2B3k(modifier, z, (l) objRememberedValue2, verticalFloatingToolbarWithFabOverrideScope.getColors(), FloatingToolbarDefaults.INSTANCE.m4908getToolbarToFabGapD9Ej5fM$material3(), verticalFloatingToolbarWithFabOverrideScope.getContentPadding(), !VerticalFloatingToolbarWithFab$lambda$0(stateRememberTouchExplorationService) ? verticalFloatingToolbarWithFabOverrideScope.getScrollBehavior() : null, verticalFloatingToolbarWithFabOverrideScope.getShape(), verticalFloatingToolbarWithFabOverrideScope.getAnimationSpec(), verticalFloatingToolbarWithFabOverrideScope.getFloatingActionButton(), verticalFloatingToolbarWithFabOverrideScope.m6107getFloatingActionButtonPositiondDJPGzU(), verticalFloatingToolbarWithFabOverrideScope.m6106getExpandedShadowElevationD9Ej5fM(), verticalFloatingToolbarWithFabOverrideScope.m6105getCollapsedShadowElevationD9Ej5fM(), verticalFloatingToolbarWithFabOverrideScope.getContent(), composer2, 24576, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DefaultVerticalFloatingToolbarWithFabOverride$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultVerticalFloatingToolbarWithFabOverride.VerticalFloatingToolbarWithFab$lambda$5(this.f$0, verticalFloatingToolbarWithFabOverrideScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
