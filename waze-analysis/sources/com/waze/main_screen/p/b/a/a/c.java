package com.waze.main_screen.p.b.a.a;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.waze.R;
import com.waze.c.e.w;
import com.waze.car_lib.screens.az;
import com.waze.main_screen.p.b.a.b.k;
import com.waze.main_screen.p.b.a.b.l;
import com.waze.main_screen.p.b.a.b.t;
import com.waze.main_screen.q.b.i;
import com.waze.navbar.f;
import com.waze.navbar.p;
import com.waze.strings.DisplayStrings;
import com.waze.t.c.h;
import com.waze.ui.r.a.d.d;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {
    public static /* synthetic */ f a(String str, k kVar, State state, Context context) throws Resources.NotFoundException {
        x.f(context, "context");
        f fVar = new f(context, str);
        fVar.l(new a());
        fVar.k(l.a(e(state), kVar));
        return fVar;
    }

    public static /* synthetic */ ab b(k kVar, com.waze.ui.r.a.e.b.a aVar, t tVar, String str, State state, f fVar) throws Resources.NotFoundException {
        x.f(fVar, "navBar");
        fVar.m(new b(aVar, tVar, fVar, str));
        fVar.k(l.a(e(state), kVar));
        return ab.f48028a;
    }

    public static final void c(t tVar, Modifier modifier, k kVar, Composer composer, int i2) {
        int i3;
        x.f(tVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1146438808);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(tVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(kVar == null ? -1 : kVar.ordinal()) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1146438808, i3, -1, "com.waze.main_screen.mid_drive.nav_instructions.presentation.compose.NavigationInstructionsBar (NavigationInstructionsBar.kt:32)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.AND_THEN, composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(tVar.b(), null, composerStartRestartGroup, 0, 1);
            com.waze.ui.r.a.e.b.a aVarF = com.waze.bz.a.f(composerStartRestartGroup);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.LOCK_SCREEN_NAVIGATION_DIRECTIONS_ETA_EXPAND_MESSAGE, composerStartRestartGroup, 0);
            Modifier modifierA = d.a(modifier, com.waze.ui.r.a.d.c.cZ, null);
            boolean zChanged = composerStartRestartGroup.changed(strB) | composerStartRestartGroup.changed(stateCollectAsState);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.ads.c cVar = new com.waze.ads.c(strB, kVar, stateCollectAsState, 9, (boolean[]) null);
                composerStartRestartGroup.updateRememberedValue(cVar);
                objRememberedValue = cVar;
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue;
            boolean zChanged2 = composerStartRestartGroup.changed(aVarF.ordinal()) | ((i3 & 14) == 4) | composerStartRestartGroup.changed(strB2) | composerStartRestartGroup.changed(stateCollectAsState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChanged2 | z) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                az azVar = new az(kVar, aVarF, tVar, strB2, stateCollectAsState, 3);
                composerStartRestartGroup.updateRememberedValue(azVar);
                objRememberedValue2 = azVar;
            }
            AndroidView_androidKt.AndroidView(lVar, modifierA, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(tVar, modifier, kVar, i2, 8));
        }
    }

    public static final void d(final i iVar, final boolean z, Modifier modifier, Composer composer, int i2) {
        int i3;
        x.f(iVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2019643725);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(iVar) ? 2 : 4) | i2;
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
                ComposerKt.traceEventStart(2019643725, i3, -1, "com.waze.main_screen.near_destination.presentation.NearDestination (NearDestination.kt:22)");
            }
            final com.waze.ui.r.a.e.b.a aVarF = com.waze.bz.a.f(composerStartRestartGroup);
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.main_screen.c.g.a(12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            Modifier modifierA = d.a(modifier, com.waze.ui.r.a.d.c.da, null);
            com.waze.ui.r.a.e.b.a aVar = aVarF;
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changed(aVar.ordinal());
            boolean z2 = (i3 & 112) == 32;
            boolean z3 = (i3 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z3 | zChanged | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new h.g.a.l() { // from class: com.waze.main_screen.q.b.c
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        x.f(context, "context");
                        p pVar = new p(context);
                        MutableState mutableState2 = mutableState;
                        pVar.z(((Boolean) mutableState2.getValue()).booleanValue());
                        pVar.A(aVarF);
                        pVar.y(new d(context, 0));
                        pVar.r();
                        pVar.u();
                        mutableState2.setValue(true);
                        pVar.p();
                        if (z) {
                            pVar.B();
                        } else {
                            pVar.C(true);
                        }
                        pVar.x(new e(pVar, iVar, 0));
                        return pVar;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue2;
            boolean zChanged2 = composerStartRestartGroup.changed(aVar.ordinal()) | z2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.main_screen.c.c.b(aVarF, z, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AndroidView_androidKt.AndroidView(lVar, modifierA, (h.g.a.l) objRememberedValue3, composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h((Object) iVar, z, modifier, i2, 5));
        }
    }

    private static final l e(State state) {
        return (l) state.getValue();
    }
}
