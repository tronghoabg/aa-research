package com.waze.o.d.b.b;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.waze.c.e.t;
import com.waze.car_lib.r;
import com.waze.car_lib.screens.at;
import com.waze.fa;
import com.waze.strings.DisplayStrings;
import com.waze.t.c.k;
import com.waze.t.c.n;
import com.waze.ui.f.ac;
import com.waze.ui.f.ad;
import com.waze.ui.f.ae;
import com.waze.ui.f.ag;
import com.waze.ui.f.ah;
import com.waze.ui.f.ai;
import com.waze.ui.f.aj;
import com.waze.ui.f.ak;
import h.ab;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class c {
    public static void e(h hVar, Composer composer, int i2) {
        int i3;
        x.f(hVar, "stateHolder");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1832090383);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(hVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1832090383, i3, -1, "com.waze.companinio.ui.mobile.overlay.CompaninioOverlay (CompaninioOverlay.kt:13)");
            }
            k kVarG = n.g(hVar.a(), composerStartRestartGroup);
            ak akVarA = ((i) FlowExtKt.collectAsStateWithLifecycle(hVar.b(), (LifecycleOwner) null, (Lifecycle.State) null, (j) null, composerStartRestartGroup, 0, 7).getValue()).a();
            AnimatedVisibilityKt.AnimatedVisibility(!(akVarA instanceof ad) && kVarG.f(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(339943911, true, new b(akVarA, hVar, i5), composerStartRestartGroup, 54), composerStartRestartGroup, 200064, 18);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(hVar, i2, 5));
        }
    }

    public static void f(ak akVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        Composer composer2;
        x.f(akVar, "state");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-731425652);
        if (i5 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(akVar) : composerStartRestartGroup.changedInstance(akVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731425652, i3, -1, "com.waze.companinio.ui.mobile.overlay.CompaninioAnimatedHalo (CompaninioAnimatedHalo.kt:46)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = AndroidPath_androidKt.Path();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Path path = (Path) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue2;
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                Paint Paint = AndroidPaint_androidKt.Paint();
                Paint.setAntiAlias(true);
                composerStartRestartGroup.updateRememberedValue(Paint);
                obj = Paint;
            }
            Paint paint = (Paint) obj;
            i4 = 8;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 360.0f, AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(4000, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, composerStartRestartGroup, (InfiniteRepeatableSpec.$stable << 9) | InfiniteTransition.$stable | DisplayStrings.DS_DIRT_ROADS, 8);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            float f2 = 0.0f;
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int i6 = i3 & 14;
            Animatable animatable = (Animatable) objRememberedValue3;
            boolean zChangedInstance = (i6 == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(akVar))) | composerStartRestartGroup.changedInstance(animatable);
            a aVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || aVarRememberedValue == Composer.Companion.getEmpty()) {
                aVarRememberedValue = new a(akVar, animatable, null);
                composerStartRestartGroup.updateRememberedValue(aVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(akVar, (p<? super af, ? super h.c.e<? super ab>, ? extends Object>) aVarRememberedValue, composerStartRestartGroup, i6);
            if (akVar instanceof ai) {
                f2 = 5.0f;
            } else if ((akVar instanceof ac) || (akVar instanceof aj) || (akVar instanceof ae)) {
                f2 = 4.0f;
            } else if (akVar instanceof ah) {
                f2 = 3.0f;
            } else if (!x.n(akVar, ad.f42276a) && !x.n(akVar, com.waze.ui.f.af.f42278a) && !(akVar instanceof ag) && !(akVar instanceof com.waze.ui.f.ab)) {
                throw new h.i();
            }
            State<Dp> stateM1867animateDpAsStateAjpBEmI = AnimateAsStateKt.m1867animateDpAsStateAjpBEmI(f2, AnimationSpecKt.tween$default(500, 0, null, 6, null), null, null, composerStartRestartGroup, 48, 12);
            composer2 = composerStartRestartGroup;
            int i7 = 3;
            List listI = h.a.i.i(Color.m8218boximpl(ColorKt.Color(3007481332L)), Color.m8218boximpl(ColorKt.Color(3013309131L)), Color.m8218boximpl(ColorKt.Color(3005441209L)), Color.m8218boximpl(ColorKt.Color(3019227726L)));
            Object objRememberedValue4 = composer2.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new r(i7);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, (l) objRememberedValue4);
            boolean zChanged = composer2.changed(stateM1867animateDpAsStateAjpBEmI) | composer2.changedInstance(animatable) | composer2.changed(stateAnimateFloat) | composer2.changedInstance(paint) | composer2.changedInstance(path);
            Object objRememberedValue5 = composer2.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new at(animatable, stateM1867animateDpAsStateAjpBEmI, stateAnimateFloat, listI, paint, path, 4);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            BoxKt.Box(DrawModifierKt.drawBehind(modifierGraphicsLayer, (l) objRememberedValue5), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 8;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(akVar, modifier, i2, i4));
        }
    }
}
