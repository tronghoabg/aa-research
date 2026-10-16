package com.waze.main_screen.i.a;

import android.content.Context;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.authentication.at;
import com.waze.bv.s;
import com.waze.c.e.t;
import com.waze.location.aa;
import com.waze.main_screen.g.j;
import com.waze.strings.DisplayStrings;
import com.waze.t.c.g;
import com.waze.t.c.h;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {
    public static /* synthetic */ ab b(State state, com.waze.main_screen.g.d dVar) {
        x.f(dVar, "it");
        dVar.e(f(state));
        return ab.f48028a;
    }

    public static final void c(final e eVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> gVar;
        x.f(eVar, "floatingNotificationState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-782882393);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(eVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-782882393, i3, -1, "com.waze.main_screen.floating_notification.presentation.FloatingNotification (FloatingNotification.kt:54)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(eVar.a(), null, composerStartRestartGroup, 0, 1);
            j jVarF = f(stateCollectAsState);
            int i5 = i3 & 14;
            boolean zChanged = (i5 == 4) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (p) new b(eVar, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.LaunchedEffect(jVarF, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (f(stateCollectAsState) == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    gVar = new t(eVar, modifier, i2, 20);
                    scopeUpdateScopeEndRestartGroup.updateScope(gVar);
                }
                return;
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cW, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i5 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: com.waze.main_screen.i.a.a
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        x.f(context, "context");
                        com.waze.main_screen.g.d dVar = new com.waze.main_screen.g.d(context);
                        dVar.i(new c(eVar));
                        return dVar;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            l lVar = (l) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new at(stateCollectAsState, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierA, (l) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            gVar = new g(eVar, modifier, i2, 1, null);
            scopeUpdateScopeEndRestartGroup.updateScope(gVar);
        }
    }

    public static final e d(com.waze.main_screen.h.a.a aVar, Composer composer) {
        x.f(aVar, "floatingNotificationStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(667370440, 0, -1, "com.waze.main_screen.floating_notification.presentation.rememberFloatingNotificationState (FloatingNotification.kt:44)");
        }
        boolean zChanged = composer.changed(aVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new f(aVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        f fVar = (f) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fVar;
    }

    public static final void e(Modifier modifier, s sVar, boolean z, Composer composer, int i2) {
        int i3;
        x.f(sVar, "speedometerStateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(709383960);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = 16;
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(sVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(709383960, i3, -1, "com.waze.main_screen.floating_buttons.speedometer.presentation.Speedometer (Speedometer.kt:31)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(sVar.a(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierM2714offsetVpY3zN4 = OffsetKt.m2714offsetVpY3zN4(com.waze.ui.r.a.d.d.a(modifier, com.waze.ui.r.a.d.c.cI, null), -18.0f, -12.0f);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new aa(i6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            l lVar = (l) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.main_screen.c.c.b(stateCollectAsState, z, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierM2714offsetVpY3zN4, (l) objRememberedValue2, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, sVar, z, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j f(State state) {
        return (j) state.getValue();
    }
}
