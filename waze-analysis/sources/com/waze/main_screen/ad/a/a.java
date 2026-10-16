package com.waze.main_screen.ad.a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.main_screen.g.m;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a {
    public /* synthetic */ a(byte[] bArr) {
    }

    public static /* synthetic */ ab a(State state, m mVar) {
        x.f(mVar, "it");
        mVar.c(c(state).b());
        com.waze.main_screen.ae.a.c cVarA = c(state).a();
        if (cVarA != null) {
            mVar.b(cVarA.a(), cVarA.b());
        } else {
            mVar.a();
        }
        return ab.f48028a;
    }

    public static final void b(Modifier modifier, com.waze.main_screen.ae.a.d dVar, Composer composer, int i2) {
        x.f(dVar, "transportSdkButtonStateHolder");
        Composer composerStartRestartGroup = composer.startRestartGroup(209903045);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(dVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            modifier = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(209903045, i3, -1, "com.waze.main_screen.transport_sdk.presentation.TransportSdkButton (TransportSdkButton.kt:15)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(dVar.a(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cT, null);
            int i4 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i4 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.beacons.a.b(dVar, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l lVar = (l) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.beacons.a.b(stateCollectAsState, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierA, (l) objRememberedValue2, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(modifier, dVar, i2, 7));
        }
    }

    private static final com.waze.main_screen.ae.a.b c(State state) {
        return (com.waze.main_screen.ae.a.b) state.getValue();
    }

    private a() {
        throw null;
    }
}
