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
public final class CustomAppBarItem implements AppBarItem {
    public static final int $stable = 0;
    private final p<Composer, Integer, ab> appbarContent;
    private final q<AppBarMenuState, Composer, Integer, ab> menuContent;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomAppBarItem(p<? super Composer, ? super Integer, ab> pVar, q<? super AppBarMenuState, ? super Composer, ? super Integer, ab> qVar) {
        this.appbarContent = pVar;
        this.menuContent = qVar;
    }

    static final ab AppbarContent$lambda$0(CustomAppBarItem customAppBarItem, int i2, Composer composer, int i3) {
        customAppBarItem.AppbarContent(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab MenuContent$lambda$0(CustomAppBarItem customAppBarItem, AppBarMenuState appBarMenuState, int i2, Composer composer, int i3) {
        customAppBarItem.MenuContent(appBarMenuState, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.AppBarItem
    public void AppbarContent(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1121775917);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121775917, i3, -1, "androidx.compose.material3.CustomAppBarItem.AppbarContent (AppBarDsl.kt:234)");
            }
            this.appbarContent.invoke(composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CustomAppBarItem$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CustomAppBarItem.AppbarContent$lambda$0(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.material3.AppBarItem
    public void MenuContent(final AppBarMenuState appBarMenuState, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1853735176);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(appBarMenuState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1853735176, i3, -1, "androidx.compose.material3.CustomAppBarItem.MenuContent (AppBarDsl.kt:239)");
            }
            this.menuContent.invoke(appBarMenuState, composerStartRestartGroup, Integer.valueOf(i3 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CustomAppBarItem$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CustomAppBarItem.MenuContent$lambda$0(this.f$0, appBarMenuState, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
