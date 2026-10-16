package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DefaultWideNavigationRailOverride implements WideNavigationRailOverride {
    public static final int $stable = 0;
    public static final DefaultWideNavigationRailOverride INSTANCE = new DefaultWideNavigationRailOverride();

    private DefaultWideNavigationRailOverride() {
    }

    static final ab WideNavigationRail$lambda$0(DefaultWideNavigationRailOverride defaultWideNavigationRailOverride, WideNavigationRailOverrideScope wideNavigationRailOverrideScope, int i2, Composer composer, int i3) {
        defaultWideNavigationRailOverride.WideNavigationRail(wideNavigationRailOverrideScope, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.material3.WideNavigationRailOverride
    public void WideNavigationRail(final WideNavigationRailOverrideScope wideNavigationRailOverrideScope, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1829525426);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(wideNavigationRailOverrideScope) : composerStartRestartGroup.changedInstance(wideNavigationRailOverrideScope)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829525426, i3, -1, "androidx.compose.material3.DefaultWideNavigationRailOverride.WideNavigationRail (WideNavigationRail.kt:257)");
            }
            WideNavigationRailKt.WideNavigationRailLayout(wideNavigationRailOverrideScope.getModifier(), false, WideNavigationRailStateKt.isExpanded(wideNavigationRailOverrideScope.getState().getTargetValue()), wideNavigationRailOverrideScope.getColors(), wideNavigationRailOverrideScope.getShape(), wideNavigationRailOverrideScope.getHeader(), wideNavigationRailOverrideScope.getWindowInsets(), wideNavigationRailOverrideScope.getArrangement(), wideNavigationRailOverrideScope.getContentPadding(), wideNavigationRailOverrideScope.getContent(), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.DefaultWideNavigationRailOverride$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return DefaultWideNavigationRailOverride.WideNavigationRail$lambda$0(this.f$0, wideNavigationRailOverrideScope, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
