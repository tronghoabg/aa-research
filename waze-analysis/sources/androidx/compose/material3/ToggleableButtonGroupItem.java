package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ToggleableButtonGroupItem implements ButtonGroupItem {
    public static final int $stable = 8;
    private final AnimationSpec<Float> animationSpec;
    private final boolean checked;
    private final boolean enabled;
    private final p<Composer, Integer, ab> icon;
    private final String label;
    private final l<Boolean, ab> onCheckedChange;
    private final float weight;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableButtonGroupItem(boolean z, l<? super Boolean, ab> lVar, float f2, AnimationSpec<Float> animationSpec, p<? super Composer, ? super Integer, ab> pVar, boolean z2, String str) {
        this.checked = z;
        this.onCheckedChange = lVar;
        this.weight = f2;
        this.animationSpec = animationSpec;
        this.icon = pVar;
        this.enabled = z2;
        this.label = str;
    }

    static final ab ButtonGroupContent$lambda$1(ToggleableButtonGroupItem toggleableButtonGroupItem, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1213163004, i2, -1, "androidx.compose.material3.ToggleableButtonGroupItem.ButtonGroupContent.<anonymous> (ButtonGroup.kt:1251)");
            }
            p<Composer, Integer, ab> pVar = toggleableButtonGroupItem.icon;
            if (pVar == null) {
                composer.startReplaceGroup(-810720332);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-810720331);
                pVar.invoke(composer, 0);
                SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, ButtonDefaults.INSTANCE.m4438getIconSpacingD9Ej5fM()), composer, 6);
                composer.endReplaceGroup();
            }
            TextKt.m5817TextNvy7gAk(toggleableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ButtonGroupContent$lambda$2(ToggleableButtonGroupItem toggleableButtonGroupItem, int i2, Composer composer, int i3) {
        toggleableButtonGroupItem.ButtonGroupContent(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$0(ToggleableButtonGroupItem toggleableButtonGroupItem, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(572205757, i2, -1, "androidx.compose.material3.ToggleableButtonGroupItem.MenuContent.<anonymous> (ButtonGroup.kt:1264)");
            }
            TextKt.m5817TextNvy7gAk(toggleableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MenuContent$lambda$1$0(ToggleableButtonGroupItem toggleableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState) {
        toggleableButtonGroupItem.onCheckedChange.invoke(Boolean.valueOf(!toggleableButtonGroupItem.checked));
        buttonGroupMenuState.dismiss();
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$2(ToggleableButtonGroupItem toggleableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState, int i2, Composer composer, int i3) {
        toggleableButtonGroupItem.MenuContent(buttonGroupMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void ButtonGroupContent(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(803301594);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(803301594, i3, -1, "androidx.compose.material3.ToggleableButtonGroupItem.ButtonGroupContent (ButtonGroup.kt:1227)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            EnlargeOnPressElement enlargeOnPressElement = new EnlargeOnPressElement(mutableInteractionSource, this.animationSpec);
            companion.then(enlargeOnPressElement);
            ToggleButtonKt.ToggleButton(this.checked, this.onCheckedChange, enlargeOnPressElement.then(!Float.isNaN(this.weight) ? new ButtonGroupElement(n.f(this.weight, Float.MAX_VALUE)) : Modifier.Companion), this.enabled, null, null, null, null, null, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(1213163004, true, new q() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ToggleableButtonGroupItem.ButtonGroupContent$lambda$1(this.f$0, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 805306368, 6, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleableButtonGroupItem.ButtonGroupContent$lambda$2(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void MenuContent(final ButtonGroupMenuState buttonGroupMenuState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1089012595);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(buttonGroupMenuState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1089012595, i3, -1, "androidx.compose.material3.ToggleableButtonGroupItem.MenuContent (ButtonGroup.kt:1260)");
            }
            boolean z = this.enabled;
            p<Composer, Integer, ab> pVar = this.icon;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(572205757, true, new p() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleableButtonGroupItem.MenuContent$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(buttonGroupMenuState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda3
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ToggleableButtonGroupItem.MenuContent$lambda$1$0(this.f$0, buttonGroupMenuState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (a) objRememberedValue, null, pVar, null, z, null, null, null, composerStartRestartGroup, 6, DisplayStrings.DS_REPORT_MENU_MAP_ISSUE_MISSING_LANDMARK);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ToggleableButtonGroupItem$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ToggleableButtonGroupItem.MenuContent$lambda$2(this.f$0, buttonGroupMenuState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
