package com.waze.an.c;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.waze.ui.l.cg;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class q {
    public /* synthetic */ q(byte[] bArr) {
    }

    public static cg a(com.waze.main_screen.k.a.u uVar, Composer composer) {
        h.g.b.x.f(uVar, "insightComponentStateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-53092846, 0, -1, "com.waze.insight.presentation.rememberInsightState (InsightState.kt:16)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new cg();
            composer.updateRememberedValue(objRememberedValue);
        }
        cg cgVar = (cg) objRememberedValue;
        boolean zChanged = composer.changed(uVar);
        n nVarRememberedValue = composer.rememberedValue();
        if (zChanged || nVarRememberedValue == Composer.Companion.getEmpty()) {
            nVarRememberedValue = new n(cgVar, uVar, (h.c.e) null, 1);
            composer.updateRememberedValue(nVarRememberedValue);
        }
        EffectsKt.LaunchedEffect(uVar, cgVar, (h.g.a.p) nVarRememberedValue, composer, 48);
        boolean zChanged2 = composer.changed(uVar);
        p pVarRememberedValue = composer.rememberedValue();
        if (zChanged2 || pVarRememberedValue == Composer.Companion.getEmpty()) {
            pVarRememberedValue = new p(cgVar, uVar, null);
            composer.updateRememberedValue(pVarRememberedValue);
        }
        EffectsKt.LaunchedEffect(uVar, cgVar, (h.g.a.p) pVarRememberedValue, composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cgVar;
    }

    public static /* synthetic */ boolean b(com.waze.an.d.b bVar, com.waze.an.a.u uVar, com.waze.an.a.k kVar, h.g.a.a aVar, h.g.a.a aVar2, int i2) {
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        if ((i2 & 8) != 0) {
            aVar2 = null;
        }
        return bVar.b(uVar, kVar, aVar, aVar2, null);
    }

    private q() {
        throw null;
    }
}
