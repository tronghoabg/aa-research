package com.waze.z.a.e;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.fragment.compose.FragmentStateKt;
import com.airbnb.lottie.b.ab;
import com.airbnb.lottie.b.an;
import com.airbnb.lottie.b.o;
import com.airbnb.lottie.b.w;
import com.airbnb.lottie.h;
import com.waze.R;
import com.waze.beacons.m;
import com.waze.car_lib.b.n;
import com.waze.map.main.aa;
import com.waze.t.c.g;
import com.waze.ui.r.a.d.d;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.x;
import h.i;
import kotlinx.coroutines.af;
import l.a.aaj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    public static void a(c cVar, h.g.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        Object[] objArr;
        int i5;
        com.airbnb.lottie.b.b bVar;
        Object obj;
        x.f(cVar, "state");
        x.f(aVar, "onClick");
        int i6 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1136353110);
        if (i6 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1136353110, i3, -1, "com.waze.design_components_compose.components.search_mate_habub.SearchMateHabub (SearchMateHabub.kt:64)");
            }
            w wVarD = an.d(ab.b(R.raw.search_mate_agent_starting), composerStartRestartGroup);
            w wVarD2 = an.d(ab.b(R.raw.search_mate_agent_recording), composerStartRestartGroup);
            w wVarD3 = an.d(ab.b(R.raw.search_mate_agent_thinking), composerStartRestartGroup);
            w wVarD4 = an.d(ab.b(R.raw.search_mate_agent_idle_error), composerStartRestartGroup);
            w wVarD5 = an.d(ab.b(R.raw.search_mate_agent_speaking_to_user), composerStartRestartGroup);
            com.airbnb.lottie.b.b bVarG = o.g(composerStartRestartGroup);
            HapticFeedback hapticFeedback = (HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback());
            Object[] objArr2 = {cVar, a.a.G(wVarD), a.a.G(wVarD2), a.a.G(wVarD3), a.a.G(wVarD4), a.a.G(wVarD5)};
            int i7 = i3 & 14;
            boolean zChangedInstance = (i7 == 4) | composerStartRestartGroup.changedInstance(hapticFeedback) | composerStartRestartGroup.changed(wVarD) | composerStartRestartGroup.changed(bVarG) | composerStartRestartGroup.changed(wVarD2) | composerStartRestartGroup.changed(wVarD4) | composerStartRestartGroup.changed(wVarD5) | composerStartRestartGroup.changed(wVarD3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                i4 = i7;
                objArr = objArr2;
                i5 = 0;
                bVar = bVarG;
                obj = (p) new a(cVar, hapticFeedback, bVarG, wVarD, wVarD2, wVarD4, wVarD5, wVarD3, null);
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                i5 = 0;
                i4 = i7;
                obj = objRememberedValue;
                objArr = objArr2;
                bVar = bVarG;
            }
            EffectsKt.LaunchedEffect(objArr, (p<? super af, ? super e<? super h.ab>, ? extends Object>) obj, composerStartRestartGroup, i5);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i4 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                c cVar2 = c.f46025a;
                switch (cVar.ordinal()) {
                    case 0:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.eh;
                        break;
                    case 1:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.ed;
                        break;
                    case 2:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.ei;
                        break;
                    case 3:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.eg;
                        break;
                    case 4:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.ej;
                        break;
                    case 5:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.ef;
                        break;
                    case 6:
                        objRememberedValue2 = com.waze.ui.r.a.d.c.ek;
                        break;
                    default:
                        throw new i();
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierScale = ScaleKt.scale(d.a(BackgroundKt.m1971backgroundbw27NRU(modifier, Color.Companion.m8265getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), (com.waze.ui.r.a.d.c) objRememberedValue2, null), 1.15f);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM2003clickableO2vRcR0$default = ClickableKt.m2003clickableO2vRcR0$default(modifierScale, (MutableInteractionSource) objRememberedValue3, null, false, null, Role.m10309boximpl(Role.Companion.m10316getButtono7Vup1c()), aVar, 12, null);
            ContentScale fillBounds = ContentScale.Companion.getFillBounds();
            h hVarI = bVar.i();
            boolean zChanged = composerStartRestartGroup.changed(bVar);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new m(bVar, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composer2 = composerStartRestartGroup;
            o.c(hVarI, (h.g.a.a) objRememberedValue4, modifierM2003clickableO2vRcR0$default, null, null, null, fillBounds, false, null, composer2, 0, 6, 64504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w((Object) cVar, (Object) aVar, modifier, i2, 7));
        }
    }

    public static Object b(com.waze.z.a.f.e eVar, String str, e eVar2) {
        Object objShowSnackbar$default = SnackbarHostState.showSnackbar$default(eVar.a(), str, null, null, eVar2, 6, null);
        return objShowSnackbar$default == h.c.a.a.f48038a ? objShowSnackbar$default : h.ab.f48028a;
    }

    public static void c(com.waze.z.a.f.e eVar, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        x.f(eVar, "state");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(331626343);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(eVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(331626343, i4, -1, "com.waze.design_components_compose.components.snackbar.WazeSnackbarHost (WazeSnackbar.kt:35)");
            }
            SnackbarHostState snackbarHostStateA = eVar.a();
            int i7 = com.waze.z.a.f.c.f46038a;
            SnackbarHostKt.SnackbarHost(snackbarHostStateA, modifier3, com.waze.z.a.f.c.b(), composerStartRestartGroup, (i4 & 112) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.f.d(eVar, modifier2, i2, i3, 0));
        }
    }

    public static com.waze.z.a.f.e d(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1197423640, 0, -1, "com.waze.design_components_compose.components.snackbar.rememberWazeSnackbarState (WazeSnackbar.kt:30)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new com.waze.z.a.f.e();
            composer.updateRememberedValue(objRememberedValue);
        }
        com.waze.z.a.f.e eVar = (com.waze.z.a.f.e) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return eVar;
    }

    public static /* synthetic */ aaj e(String str) {
        if (true != h.n.o.ah(str, "and.opa.appinteg.waze")) {
            str = null;
        }
        if (str != null) {
            return aaj.MIC_INVOCATION;
        }
        return null;
    }

    public static com.waze.google_assistant.a.b f() {
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.a.a aVar = com.waze.google_assistant.a.b.f24058a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.google_assistant.a.b.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new h.g.b.m(com.waze.google_assistant.a.b.class);
        }
        return (com.waze.google_assistant.a.b) bVarC.a(mVar, null, null);
    }

    public static void g(Modifier modifier, com.waze.map.main.a aVar, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        x.f(aVar, "callbacks");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1354076029);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1354076029, i3, -1, "com.waze.map.main.MainMap (MainMap.kt:15)");
            }
            int i5 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i5 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new n(aVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.startReplaceableGroup(1765406104);
            modifier2 = modifier;
            AndroidFragmentKt.AndroidFragment(com.waze.map.main.p.class, modifier2, FragmentStateKt.rememberFragmentState(composerStartRestartGroup, 0), Bundle.EMPTY, (l) objRememberedValue, composerStartRestartGroup, ((i3 & 14) << 3) & 112, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new g(modifier2, aVar, i2, 9));
        }
    }

    public static Rect h(aa aaVar) {
        x.f(aaVar, "<this>");
        Rect rect = new Rect();
        rect.setEmpty();
        rect.bottom = aaVar.c();
        rect.right = aaVar.g();
        return rect;
    }

    public static /* synthetic */ Rect i(aa aaVar) {
        x.f(aaVar, "<this>");
        Rect rect = new Rect();
        rect.top = aaVar.f();
        rect.bottom = aaVar.c() - aaVar.a();
        rect.left = aaVar.d();
        rect.right = aaVar.g() - aaVar.e();
        return rect;
    }

    private b() {
        throw null;
    }
}
