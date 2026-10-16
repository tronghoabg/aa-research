package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesKt;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultHorizontalFloatingToolbarOverride implements HorizontalFloatingToolbarOverride {
    public static final int $stable = 0;
    public static final DefaultHorizontalFloatingToolbarOverride INSTANCE = new DefaultHorizontalFloatingToolbarOverride();

    private DefaultHorizontalFloatingToolbarOverride() {
    }

    private static final boolean HorizontalFloatingToolbar$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState HorizontalFloatingToolbar$lambda$1$0() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean HorizontalFloatingToolbar$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HorizontalFloatingToolbar$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HorizontalFloatingToolbar$lambda$4$0(HorizontalFloatingToolbarOverrideScope horizontalFloatingToolbarOverrideScope) {
        FloatingToolbarState state;
        FloatingToolbarScrollBehavior scrollBehavior = horizontalFloatingToolbarOverrideScope.getScrollBehavior();
        return ((scrollBehavior == null || (state = scrollBehavior.getState()) == null) ? 0.0f : state.getOffset()) == 0.0f;
    }

    private static final boolean HorizontalFloatingToolbar$lambda$5(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbar$lambda$6$0(FocusProperties focusProperties) {
        focusProperties.setCanFocus(false);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab HorizontalFloatingToolbar$lambda$7$0(MutableState mutableState, boolean z) {
        HorizontalFloatingToolbar$lambda$3(mutableState, z);
        return ab.f48028a;
    }

    static final ab HorizontalFloatingToolbar$lambda$8(DefaultHorizontalFloatingToolbarOverride defaultHorizontalFloatingToolbarOverride, HorizontalFloatingToolbarOverrideScope horizontalFloatingToolbarOverrideScope, int i2, Composer composer, int i3) {
        defaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar(horizontalFloatingToolbarOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.HorizontalFloatingToolbarOverride
    public void HorizontalFloatingToolbar(final HorizontalFloatingToolbarOverrideScope horizontalFloatingToolbarOverrideScope, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Modifier.Companion companionFocusProperties;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(949705644);
        boolean z = true;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(horizontalFloatingToolbarOverrideScope) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(949705644, i3, -1, "androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar (FloatingToolbar.kt:209)");
            }
            State stateRememberTouchExplorationService = FloatingToolbarKt.rememberTouchExplorationService(composerStartRestartGroup, 0);
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar$lambda$1$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (a) objRememberedValue, composerStartRestartGroup, 48);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return Boolean.valueOf(DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar$lambda$4$0(horizontalFloatingToolbarOverrideScope));
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifier = horizontalFloatingToolbarOverrideScope.getModifier();
            if (HorizontalFloatingToolbar$lambda$5((State) objRememberedValue2)) {
                composerStartRestartGroup.startReplaceGroup(2134075252);
                composerStartRestartGroup.endReplaceGroup();
                companionFocusProperties = Modifier.Companion;
            } else {
                composerStartRestartGroup.startReplaceGroup(2134076016);
                Modifier.Companion companion = Modifier.Companion;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new l() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride$$ExternalSyntheticLambda2
                        @Override // h.g.a.l
                        public final Object invoke(Object obj) {
                            return DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar$lambda$6$0((FocusProperties) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                companionFocusProperties = FocusPropertiesKt.focusProperties(companion, (l) objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierThen = modifier.then(companionFocusProperties);
            if (HorizontalFloatingToolbar$lambda$2(mutableState) || (!HorizontalFloatingToolbar$lambda$0(stateRememberTouchExplorationService) && !horizontalFloatingToolbarOverrideScope.isExpanded())) {
                z = false;
            }
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride$$ExternalSyntheticLambda3
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar$lambda$7$0(mutableState, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composer2 = composerStartRestartGroup;
            FloatingToolbarKt.m4949HorizontalFloatingToolbarLayoutyndP2WQ(modifierThen, z, (l) objRememberedValue4, horizontalFloatingToolbarOverrideScope.getColors(), horizontalFloatingToolbarOverrideScope.getContentPadding(), !HorizontalFloatingToolbar$lambda$0(stateRememberTouchExplorationService) ? horizontalFloatingToolbarOverrideScope.getScrollBehavior() : null, horizontalFloatingToolbarOverrideScope.getShape(), horizontalFloatingToolbarOverrideScope.getLeadingContent(), horizontalFloatingToolbarOverrideScope.getTrailingContent(), horizontalFloatingToolbarOverrideScope.m4976getExpandedShadowElevationD9Ej5fM(), horizontalFloatingToolbarOverrideScope.m4975getCollapsedShadowElevationD9Ej5fM(), horizontalFloatingToolbarOverrideScope.getContent(), composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DefaultHorizontalFloatingToolbarOverride$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultHorizontalFloatingToolbarOverride.HorizontalFloatingToolbar$lambda$8(this.f$0, horizontalFloatingToolbarOverrideScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
