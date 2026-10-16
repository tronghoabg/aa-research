package com.waze.ui;

import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f42379a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ProvidableCompositionLocal f42380b = CompositionLocalKt.staticCompositionLocalOf(new com.waze.bx.a(18));

    public static final ProvidableCompositionLocal a() {
        return f42380b;
    }

    public static final Modifier b(Modifier modifier) {
        h.g.b.x.f(modifier, "<this>");
        return ComposedModifierKt.composed$default(modifier, null, new g(0), 1, null);
    }

    static final Modifier c(Modifier modifier, Composer composer, int i2) {
        h.g.b.x.f(modifier, "$this$composed");
        composer.startReplaceGroup(-1439661566);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439661566, i2, -1, "com.waze.ui.sheetModifier.<anonymous> (BottomSheet.kt:32)");
        }
        float f2 = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? 20.0f : 0.0f;
        Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(com.waze.design_components.d.b.j(PaddingKt.m2759paddingqDBjuR0$default(modifier, 0.0f, ((Dp) composer.consume(f42380b)).m11178unboximpl(), 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m3088RoundedCornerShapea9UjIt4$default(f2, f2, 0.0f, 0.0f, 12, null)), RoundedCornerShapeKt.m3088RoundedCornerShapea9UjIt4$default(f2, f2, 0.0f, 0.0f, 12, null)), com.waze.bz.a.d(composer, 0).h(), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierM1972backgroundbw27NRU$default;
    }

    public static final void d(Modifier modifier, Composer composer, int i2) {
        int i3;
        h.g.b.x.f(modifier, "modifier");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(99634361);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99634361, i3, -1, "com.waze.ui.Handle (BottomSheet.kt:42)");
            }
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                composerStartRestartGroup.startReplaceGroup(384906971);
                BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.m2824sizeVpY3zN4(modifier, 48.0f, 6.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(8.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).z(), null, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(385135689);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.s(modifier, i2, 3));
        }
    }

    public static final float e(Composer composer) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1425375530, 0, -1, "com.waze.ui.getBottomSheetTopPadding (BottomSheet.kt:28)");
        }
        float f2 = ((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1 ? 4.0f : 0.0f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f2;
    }
}
