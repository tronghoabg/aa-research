package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
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
import androidx.compose.ui.graphics.Shape;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ClickableButtonGroupItem implements ButtonGroupItem {
    public static final int $stable = 8;
    private final AnimationSpec<Float> animationSpec;
    private final boolean enabled;
    private final p<Composer, Integer, ab> icon;
    private final String label;
    private final a<ab> onClick;
    private final float weight;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableButtonGroupItem(a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, float f2, AnimationSpec<Float> animationSpec, boolean z, String str) {
        this.onClick = aVar;
        this.icon = pVar;
        this.weight = f2;
        this.animationSpec = animationSpec;
        this.enabled = z;
        this.label = str;
    }

    static final ab ButtonGroupContent$lambda$1(ClickableButtonGroupItem clickableButtonGroupItem, RowScope rowScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(241841908, i2, -1, "androidx.compose.material3.ClickableButtonGroupItem.ButtonGroupContent.<anonymous> (ButtonGroup.kt:1192)");
            }
            p<Composer, Integer, ab> pVar = clickableButtonGroupItem.icon;
            if (pVar == null) {
                composer.startReplaceGroup(2052149180);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2052149181);
                pVar.invoke(composer, 0);
                SpacerKt.Spacer(SizeKt.m2822size3ABfNKs(Modifier.Companion, ButtonDefaults.INSTANCE.m4438getIconSpacingD9Ej5fM()), composer, 6);
                composer.endReplaceGroup();
            }
            TextKt.m5817TextNvy7gAk(clickableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ButtonGroupContent$lambda$2(ClickableButtonGroupItem clickableButtonGroupItem, int i2, Composer composer, int i3) {
        clickableButtonGroupItem.ButtonGroupContent(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$0(ClickableButtonGroupItem clickableButtonGroupItem, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-808296799, i2, -1, "androidx.compose.material3.ClickableButtonGroupItem.MenuContent.<anonymous> (ButtonGroup.kt:1205)");
            }
            TextKt.m5817TextNvy7gAk(clickableButtonGroupItem.label, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MenuContent$lambda$1$0(ClickableButtonGroupItem clickableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState) {
        clickableButtonGroupItem.onClick.invoke();
        buttonGroupMenuState.dismiss();
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$2(ClickableButtonGroupItem clickableButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState, int i2, Composer composer, int i3) {
        clickableButtonGroupItem.MenuContent(buttonGroupMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void ButtonGroupContent(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1970104548);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970104548, i3, -1, "androidx.compose.material3.ClickableButtonGroupItem.ButtonGroupContent (ButtonGroup.kt:1170)");
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
            ButtonKt.Button(this.onClick, enlargeOnPressElement.then(!Float.isNaN(this.weight) ? new ButtonGroupElement(n.f(this.weight, Float.MAX_VALUE)) : Modifier.Companion), this.enabled, (Shape) null, (ButtonColors) null, (ButtonElevation) null, (BorderStroke) null, (PaddingValues) null, mutableInteractionSource, ComposableLambdaKt.rememberComposableLambda(241841908, true, new q() { // from class: androidx.compose.material3.ClickableButtonGroupItem$$ExternalSyntheticLambda3
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ClickableButtonGroupItem.ButtonGroupContent$lambda$1(this.f$0, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 905969664, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ClickableButtonGroupItem$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableButtonGroupItem.ButtonGroupContent$lambda$2(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void MenuContent(final ButtonGroupMenuState buttonGroupMenuState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-30600495);
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
                ComposerKt.traceEventStart(-30600495, i3, -1, "androidx.compose.material3.ClickableButtonGroupItem.MenuContent (ButtonGroup.kt:1201)");
            }
            boolean z = this.enabled;
            p<Composer, Integer, ab> pVar = this.icon;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-808296799, true, new p() { // from class: androidx.compose.material3.ClickableButtonGroupItem$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableButtonGroupItem.MenuContent$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changedInstance(buttonGroupMenuState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.material3.ClickableButtonGroupItem$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ClickableButtonGroupItem.MenuContent$lambda$1$0(this.f$0, buttonGroupMenuState);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.ClickableButtonGroupItem$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ClickableButtonGroupItem.MenuContent$lambda$2(this.f$0, buttonGroupMenuState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
