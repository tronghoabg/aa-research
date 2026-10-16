package androidx.compose.material3;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SegmentedButtonDefaults {
    public static final int $stable = 0;
    public static final SegmentedButtonDefaults INSTANCE = new SegmentedButtonDefaults();
    private static final float BorderWidth = OutlinedSegmentedButtonTokens.INSTANCE.m6917getOutlineWidthD9Ej5fM();
    private static final float IconSize = OutlinedSegmentedButtonTokens.INSTANCE.m6916getIconSizeD9Ej5fM();
    private static final PaddingValues ContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(12.0f, ButtonDefaults.INSTANCE.getContentPadding().mo2707calculateTopPaddingD9Ej5fM(), 12.0f, ButtonDefaults.INSTANCE.getContentPadding().mo2704calculateBottomPaddingD9Ej5fM());

    private SegmentedButtonDefaults() {
    }

    static final ab ActiveIcon$lambda$0(SegmentedButtonDefaults segmentedButtonDefaults, int i2, Composer composer, int i3) {
        segmentedButtonDefaults.ActiveIcon(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab Icon$lambda$0(p pVar, AnimatedVisibilityScope animatedVisibilityScope, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2059591811, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:655)");
        }
        pVar.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab Icon$lambda$1(p pVar, p pVar2, boolean z, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(z) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1785818285, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.Icon.<anonymous> (SegmentedButton.kt:663)");
            }
            if (z) {
                composer.startReplaceGroup(1815547362);
                pVar.invoke(composer, 0);
            } else {
                composer.startReplaceGroup(1815548036);
                pVar2.invoke(composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Icon$lambda$2(SegmentedButtonDefaults segmentedButtonDefaults, boolean z, p pVar, p pVar2, int i2, int i3, Composer composer, int i4) {
        segmentedButtonDefaults.Icon(z, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* renamed from: borderStroke-l07J4OM$default, reason: not valid java name */
    public static /* synthetic */ BorderStroke m5517borderStrokel07J4OM$default(SegmentedButtonDefaults segmentedButtonDefaults, long j2, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = BorderWidth;
        }
        return segmentedButtonDefaults.m5518borderStrokel07J4OM(j2, f2);
    }

    public final void ActiveIcon(Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1273041460);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(this) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273041460, i3, -1, "androidx.compose.material3.SegmentedButtonDefaults.ActiveIcon (SegmentedButton.kt:620)");
            }
            IconKt.m5039Iconww6aTOc(Icons.Filled.INSTANCE.getCheck$material3(), (String) null, SizeKt.m2822size3ABfNKs(Modifier.Companion, IconSize), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.SegmentedButtonDefaults$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SegmentedButtonDefaults.ActiveIcon$lambda$0(this.f$0, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Icon(final boolean r17, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r18, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SegmentedButtonDefaults.Icon(boolean, h.g.a.p, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: borderStroke-l07J4OM, reason: not valid java name */
    public final BorderStroke m5518borderStrokel07J4OM(long j2, float f2) {
        return BorderStrokeKt.m1998BorderStrokecXLIe8U(f2, j2);
    }

    public final SegmentedButtonColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(679457321, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:494)");
        }
        SegmentedButtonColors defaultSegmentedButtonColors$material3 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSegmentedButtonColors$material3;
    }

    /* renamed from: colors-XqyqHi0, reason: not valid java name */
    public final SegmentedButtonColors m5519colorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
        long j14;
        long j15;
        long jM8264getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long j16 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        long jM8264getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        if (ComposerKt.isTraceInProgress()) {
            j14 = jM8264getUnspecified0d7_KjU11;
            j15 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(132526205, i2, i3, "androidx.compose.material3.SegmentedButtonDefaults.colors (SegmentedButton.kt:530)");
        } else {
            j14 = jM8264getUnspecified0d7_KjU11;
            j15 = jM8264getUnspecified0d7_KjU2;
        }
        SegmentedButtonColors segmentedButtonColorsM5504copy2qZNXz8 = getDefaultSegmentedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5504copy2qZNXz8(j16, j15, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, j14, jM8264getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return segmentedButtonColorsM5504copy2qZNXz8;
    }

    public final CornerBasedShape getBaseShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1264240381, i2, -1, "androidx.compose.material3.SegmentedButtonDefaults.<get-baseShape> (SegmentedButton.kt:578)");
        }
        Shape value = ShapesKt.getValue(OutlinedSegmentedButtonTokens.INSTANCE.getShape(), composer, 6);
        x.d(value, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShape;
    }

    /* renamed from: getBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m5520getBorderWidthD9Ej5fM() {
        return BorderWidth;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final SegmentedButtonColors getDefaultSegmentedButtonColors$material3(ColorScheme colorScheme) {
        SegmentedButtonColors defaultSegmentedButtonColorsCached$material3 = colorScheme.getDefaultSegmentedButtonColorsCached$material3();
        if (defaultSegmentedButtonColorsCached$material3 != null) {
            return defaultSegmentedButtonColorsCached$material3;
        }
        SegmentedButtonColors segmentedButtonColors = new SegmentedButtonColors(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getSelectedContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedSegmentedButtonTokens.INSTANCE.getOutlineColor()), OutlinedSegmentedButtonTokens.INSTANCE.getDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSegmentedButtonColorsCached$material3(segmentedButtonColors);
        return segmentedButtonColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5521getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape itemShape(int i2, int i3, CornerBasedShape cornerBasedShape, Composer composer, int i4, int i5) {
        if ((i5 & 4) != 0) {
            cornerBasedShape = getBaseShape(composer, (i4 >> 9) & 14);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-942072063, i4, -1, "androidx.compose.material3.SegmentedButtonDefaults.itemShape (SegmentedButton.kt:594)");
        }
        if (i3 == 1) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return cornerBasedShape;
        }
        CornerBasedShape cornerBasedShapeStart$default = i2 == 0 ? ShapesKt.start$default(cornerBasedShape, null, 1, null) : i2 == i3 + (-1) ? ShapesKt.end$default(cornerBasedShape, null, 1, null) : RectangleShapeKt.getRectangleShape();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeStart$default;
    }
}
