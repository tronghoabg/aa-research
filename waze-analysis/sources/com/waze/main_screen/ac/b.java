package com.waze.main_screen.ac;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {
    public static final Modifier a(Modifier modifier, h.g.a.a aVar) {
        x.f(modifier, "<this>");
        x.f(aVar, "onOutsideTouch");
        return modifier.then(new a(aVar));
    }

    public static /* synthetic */ ab b(State state, com.waze.view.navbar.i iVar) {
        x.f(iVar, "it");
        com.waze.view.navbar.c cVarD = d(state);
        iVar.f(cVarD.a(), cVarD.c(), h.a.i.aA(cVarD.f()), h.a.i.aA(cVarD.e()), cVarD.b());
        return ab.f48028a;
    }

    public static final void c(com.waze.main_screen.ad.a.h hVar, boolean z, Modifier modifier, Composer composer, int i2) {
        int i3;
        x.f(hVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1990322887);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1990322887, i3, -1, "com.waze.main_screen.traffic_bar.presentation.TrafficBar (TrafficBar.kt:21)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(hVar.b(), null, composerStartRestartGroup, 0, 1);
            if (d(stateCollectAsState).g() && z) {
                composerStartRestartGroup.startReplaceGroup(1685806250);
                Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cX, null);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.main_screen.s.a(18);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                h.g.a.l lVar = (h.g.a.l) objRememberedValue;
                boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.beacons.a.b(stateCollectAsState, 13);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                AndroidView_androidKt.AndroidView(lVar, modifierA, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 6, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1685980315);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.h((Object) hVar, z, modifier, i2, 6));
        }
    }

    private static final com.waze.view.navbar.c d(State state) {
        return (com.waze.view.navbar.c) state.getValue();
    }
}
