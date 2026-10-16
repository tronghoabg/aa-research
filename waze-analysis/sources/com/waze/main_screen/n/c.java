package com.waze.main_screen.n;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.waze.main_screen.m.p;
import com.waze.ui.p.g;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {
    public static final void a(p pVar, g gVar, Composer composer, int i2) {
        int i3;
        x.f(pVar, "portraitComponentsLayoutState");
        x.f(gVar, "mainMapState");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1687715832);
        int i5 = 2;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(gVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1687715832, i3, -1, "com.waze.main_screen.map.UpdateMapViewport (UpdateMapViewport.kt:19)");
            }
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            boolean zChangedInstance = ((i3 & 14) == 4) | composerStartRestartGroup.changedInstance(lifecycleOwner);
            boolean z = (i3 & 112) == 32;
            b bVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || bVarRememberedValue == Composer.Companion.getEmpty()) {
                bVarRememberedValue = new b(pVar, lifecycleOwner, gVar, null);
                composerStartRestartGroup.updateRememberedValue(bVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(pVar, gVar, (h.g.a.p) bVarRememberedValue, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.t.c.g(pVar, gVar, i2, i5));
        }
    }

    public static final float b(boolean z, boolean z2, boolean z3) {
        float f2 = 0.0f;
        if (!z3 && (z || z2)) {
            f2 = 30.0f;
        }
        return (true != z3 ? 100.0f : 72.0f) + f2;
    }
}
