package com.waze.main_screen.u.b;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import com.waze.c.e.w;
import com.waze.main_screen.u.o;
import com.waze.main_screen.y.h;
import com.waze.navigate.ek;
import com.waze.strings.DisplayStrings;
import com.waze.ui.u.ag;
import com.waze.ui.u.aj;
import com.waze.ui.u.g;
import com.waze.ui.u.i;
import com.waze.ui.u.j;
import com.waze.ui.u.p;
import com.waze.ui.u.s;
import com.waze.ui.u.t;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class f {
    public static /* synthetic */ ab b(a aVar, l lVar, State state, p pVar) {
        aj ajVarA;
        x.f(pVar, "it");
        aVar.b(pVar);
        if (x.n(pVar, j.f43459a)) {
            aVar.c();
        } else if (x.n(pVar, i.f43458a)) {
            t tVarG = g(state);
            ag agVarD = null;
            s sVar = tVarG instanceof s ? (s) tVarG : null;
            if (sVar != null && (ajVarA = sVar.a()) != null) {
                agVarD = ajVarA.d();
            }
            if (agVarD != null) {
                lVar.invoke(agVarD);
            }
        }
        return ab.f48028a;
    }

    public static final void c(a aVar, l lVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        x.f(aVar, "predictionCardState");
        x.f(lVar, "onCtaButtonClicked");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1851609139);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        int i5 = i3;
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1851609139, i5, -1, "com.waze.main_screen.prediction_card.presentation.PredictionCard (PredictionCardWrapper.kt:63)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(aVar.a(), null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(false);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableTransitionState mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState$animation_core(Boolean.valueOf(g(stateCollectAsState) instanceof s));
            t tVarG = g(stateCollectAsState);
            s sVar = tVarG instanceof s ? (s) tVarG : null;
            aj ajVarA = sVar != null ? sVar.a() : null;
            boolean z = (i5 & 14) == 4;
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState) | z;
            boolean z2 = (i5 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((zChanged | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                com.waze.ads.c cVar = new com.waze.ads.c((Object) aVar, (Object) lVar, (Object) stateCollectAsState, 10, (short[]) null);
                composerStartRestartGroup.updateRememberedValue(cVar);
                objRememberedValue2 = cVar;
            }
            g.b(ajVarA, (l) objRememberedValue2, modifier, mutableTransitionState, composerStartRestartGroup, (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | (MutableTransitionState.$stable << 9));
            t tVarG2 = g(stateCollectAsState);
            boolean zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | z;
            e eVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || eVarRememberedValue == Composer.Companion.getEmpty()) {
                eVarRememberedValue = new e(aVar, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(eVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(tVarG2, (h.g.a.p<? super af, ? super h.c.e<? super ab>, ? extends Object>) eVarRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w((Object) aVar, (Object) lVar, modifier, i2, 9));
        }
    }

    public static final a d(o oVar, c cVar, Composer composer) {
        x.f(oVar, "predictionCardStateHolder");
        x.f(cVar, "predictionCardUIActions");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-863889095, 0, -1, "com.waze.main_screen.prediction_card.presentation.rememberPredictionCardState (PredictionCardWrapper.kt:49)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new b(oVar, cVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        b bVar = (b) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    public static final com.waze.main_screen.y.f e(ek ekVar) {
        x.f(ekVar, "<this>");
        ek ekVar2 = ek.f31314a;
        switch (ekVar.ordinal()) {
            case 0:
                return com.waze.main_screen.y.f.f27875a;
            case 1:
                return com.waze.main_screen.y.f.f27876b;
            case 2:
            case 3:
            case 4:
            case 5:
                return com.waze.main_screen.y.f.f27879e;
            case 6:
                return com.waze.main_screen.y.f.f27877c;
            case 7:
                return com.waze.main_screen.y.f.f27878d;
            case 8:
            case 9:
                return null;
            default:
                throw new h.i();
        }
    }

    public static final String f(com.waze.main_screen.y.i iVar) throws UnsupportedEncodingException {
        x.f(iVar, "<this>");
        if (iVar instanceof com.waze.main_screen.y.b) {
            return h.n.o.ac("alternateRoutesV2/{safeRoutesEnabled}", "{safeRoutesEnabled}", String.valueOf(((com.waze.main_screen.y.b) iVar).a()));
        }
        if (x.n(iVar, com.waze.main_screen.y.d.f27873a)) {
            return "liveShareDrive";
        }
        if (iVar instanceof com.waze.main_screen.y.e) {
            return h.n.o.ac("midDrive/{resumeDrive}", "{resumeDrive}", String.valueOf(((com.waze.main_screen.y.e) iVar).a()));
        }
        if (iVar instanceof com.waze.main_screen.y.g) {
            return h.n.o.ac("preDrive/{preDriveTriggerReason}", "{preDriveTriggerReason}", ((com.waze.main_screen.y.g) iVar).a().name());
        }
        if (iVar instanceof h) {
            h hVar = (h) iVar;
            return h.n.o.ac(h.n.o.ac("updateParking/{latitude}/{longitude}", "{latitude}", String.valueOf(hVar.a().c())), "{longitude}", String.valueOf(hVar.a().d()));
        }
        if (x.n(iVar, com.waze.main_screen.y.c.f27872a)) {
            return "legacyReportMenu";
        }
        if (!(iVar instanceof com.waze.main_screen.y.a)) {
            throw new h.i();
        }
        String strEncode = URLEncoder.encode(((com.waze.main_screen.y.a) iVar).a(), "UTF-8");
        x.e(strEncode, "encode(...)");
        return h.n.o.ac("ad/{adId}", "{adId}", strEncode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t g(State state) {
        return (t) state.getValue();
    }
}
