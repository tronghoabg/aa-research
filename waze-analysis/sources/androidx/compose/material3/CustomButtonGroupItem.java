package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.ab;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CustomButtonGroupItem implements ButtonGroupItem {
    public static final int $stable = 0;
    private final p<Composer, Integer, ab> buttonGroupContent;
    private final q<ButtonGroupMenuState, Composer, Integer, ab> menuContent;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomButtonGroupItem(p<? super Composer, ? super Integer, ab> pVar, q<? super ButtonGroupMenuState, ? super Composer, ? super Integer, ab> qVar) {
        this.buttonGroupContent = pVar;
        this.menuContent = qVar;
    }

    static final ab ButtonGroupContent$lambda$0(CustomButtonGroupItem customButtonGroupItem, int i2, Composer composer, int i3) {
        customButtonGroupItem.ButtonGroupContent(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$0(CustomButtonGroupItem customButtonGroupItem, ButtonGroupMenuState buttonGroupMenuState, int i2, Composer composer, int i3) {
        customButtonGroupItem.MenuContent(buttonGroupMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void ButtonGroupContent(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2102125731);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2102125731, i3, -1, "androidx.compose.material3.CustomButtonGroupItem.ButtonGroupContent (ButtonGroup.kt:1280)");
            }
            this.buttonGroupContent.invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CustomButtonGroupItem$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CustomButtonGroupItem.ButtonGroupContent$lambda$0(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.ButtonGroupItem
    public void MenuContent(final ButtonGroupMenuState buttonGroupMenuState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(945127568);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(buttonGroupMenuState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(945127568, i3, -1, "androidx.compose.material3.CustomButtonGroupItem.MenuContent (ButtonGroup.kt:1285)");
            }
            this.menuContent.invoke(buttonGroupMenuState, composerStartRestartGroup, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CustomButtonGroupItem$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CustomButtonGroupItem.MenuContent$lambda$0(this.f$0, buttonGroupMenuState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
