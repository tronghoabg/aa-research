package com.waze.search;

import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import com.waze.fa;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final CubicBezierEasing f35528a = new CubicBezierEasing(0.65f, 0.05f, 0.36f, 1.0f);

    public static final void a(PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(paddingValues, "paddingValues");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2113363865);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(paddingValues) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2113363865, i3, -1, "com.waze.search.DestinationCellLoader (DestinationCellLoader.kt:21)");
            }
            BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(PaddingKt.padding(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 96.0f), paddingValues), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(12.0f)), TransitionKt.m1858animateColorDTcfvLk(InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), com.waze.bz.a.d(composerStartRestartGroup, 0).O(), AnimationSpecKt.m1878infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(DisplayStrings.DS_STREETSROAD_WITHOUT_A_NAME, 0, f35528a, 2, null), RepeatMode.Reverse, 0L, 4, null), null, composerStartRestartGroup, InfiniteTransition.$stable | (InfiniteRepeatableSpec.$stable << 9), 8).getValue().m8238unboximpl(), null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fa(paddingValues, i2, 18));
        }
    }
}
