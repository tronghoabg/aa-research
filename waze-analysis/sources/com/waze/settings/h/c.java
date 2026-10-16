package com.waze.settings.h;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.bv;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.fragment.compose.AndroidFragmentKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.ad.a.j;
import com.waze.c.e.w;
import com.waze.car_lib.i.a.v;
import com.waze.settings.ao;
import com.waze.settings.ba;
import com.waze.share.i;
import com.waze.sharedrive.g.an;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.k;
import h.o.d;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    public static final void a(Modifier modifier, String str, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        x.f(modifier, "modifier");
        x.f(str, "pageId");
        x.f(aVar, "onClose");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1686195467);
        int i5 = 4;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1686195467, i3, -1, "com.waze.settings.ui.QuickSettings (QuickSettings.kt:26)");
            }
            Object[] objArr = new Object[0];
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ao(i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 48);
            String strI = a.a.i(mutableState);
            if (strI == null) {
                composerStartRestartGroup.startReplaceGroup(-488161406);
            } else {
                composerStartRestartGroup.startReplaceGroup(-488161405);
                i(strI, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i6 = ba.f36843a;
            x.f(str, "model");
            Bundle bundle = new Bundle();
            bundle.putString("model", str);
            bundle.putString(TtmlNode.ATTR_TTS_ORIGIN, "MAP");
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | ((i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new v(aVar, mutableState, 6, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AndroidFragmentKt.AndroidFragment(ba.class, modifier, null, bundle, (l) objRememberedValue2, composerStartRestartGroup, (i3 << 3) & 112, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new w(modifier, str, aVar, i2, 19, null));
        }
    }

    static final ab b(String str, int i2, Composer composer) {
        i(str, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static i c() {
        org.a.d.k.b bVarC;
        m mVar;
        org.a.d.a.a aVar = i.f37714a;
        if (aVar instanceof org.a.d.a.b) {
            bVarC = ((org.a.d.a.b) aVar).l();
            int i2 = ar.f48106a;
            mVar = new m(i.class);
        } else {
            bVarC = aVar.getKoin().a().c();
            int i3 = ar.f48106a;
            mVar = new m(i.class);
        }
        return (i) bVarC.a(mVar, null, null);
    }

    public static final com.waze.shared_infra.q.i d() {
        return new com.waze.shared_infra.q.i(System.currentTimeMillis());
    }

    public static final long e(long j2) {
        return h.o.a.p(j2) <= 0 ? h.o.c.i(1, d.f48274e) : h.o.a.p(j2) % 60 == 0 ? j2 : h.o.c.j(h.o.a.n(j2) + 1, d.f48274e);
    }

    public static final long f(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return j2 / 1000;
    }

    public static final long g(int i2) {
        return TimeUnit.SECONDS.toMillis(i2);
    }

    public static final long h(long j2) {
        return TimeUnit.SECONDS.toMillis(j2);
    }

    private static final void i(String str, Composer composer, final int i2) {
        int i3;
        Object anVar;
        final String str2 = str;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1962528381);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str2) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962528381, i3, -1, "com.waze.settings.ui.AndroidFragmentConfigurationChange (QuickSettings.kt:53)");
            }
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            boolean zChanged = composerStartRestartGroup.changed(view);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = bv.q(view);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            bv bvVar = (bv) objRememberedValue;
            k kVar = new k(Boolean.valueOf(j.t((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), Integer.valueOf(((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(kVar, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            WindowInsets safeDrawing = WindowInsets_androidKt.getSafeDrawing(WindowInsets.Companion, composerStartRestartGroup, 6);
            int bottom = safeDrawing.getBottom(density);
            int left = safeDrawing.getLeft(density, layoutDirection);
            int right = safeDrawing.getRight(density, layoutDirection);
            Integer numValueOf = Integer.valueOf(bottom);
            Integer numValueOf2 = Integer.valueOf(left);
            Integer numValueOf3 = Integer.valueOf(right);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(bvVar);
            boolean z = (i3 & 14) == 4;
            boolean zChanged2 = zChangedInstance | z | composerStartRestartGroup.changed(bottom) | composerStartRestartGroup.changed(left) | composerStartRestartGroup.changed(right);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (p) new b(bvVar, str2, bottom, left, right, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(numValueOf, numValueOf2, numValueOf3, (p) objRememberedValue3, composerStartRestartGroup, 0);
            boolean zChanged3 = composerStartRestartGroup.changed(kVar) | composerStartRestartGroup.changedInstance(bvVar);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if ((zChanged3 || z) || objRememberedValue4 == Composer.Companion.getEmpty()) {
                anVar = new an(mutableState, kVar, bvVar, str, 1);
                str2 = str;
                composerStartRestartGroup.updateRememberedValue(anVar);
            } else {
                anVar = objRememberedValue4;
                str2 = str;
            }
            EffectsKt.SideEffect((h.g.a.a) anVar, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.settings.h.a
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return c.b(str2, i2, (Composer) obj);
                }
            });
        }
    }
}
