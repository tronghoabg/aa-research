package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.InputChipTokens;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InputChipDefaults {
    public static final int $stable = 0;
    public static final InputChipDefaults INSTANCE = new InputChipDefaults();
    private static final float Height = InputChipTokens.INSTANCE.m6789getContainerHeightD9Ej5fM();
    private static final float IconSize = InputChipTokens.INSTANCE.m6791getLeadingIconSizeD9Ej5fM();
    private static final float AvatarSize = InputChipTokens.INSTANCE.m6787getAvatarSizeD9Ej5fM();
    private static final float HorizontalSpacing = 8.0f;
    private static final float CompactHorizontalSpacing = 4.0f;

    private InputChipDefaults() {
    }

    public final PaddingValues contentPadding(boolean z, boolean z2, boolean z3) {
        return PaddingKt.m2752PaddingValuesa9UjIt4$default((z || !z2) ? 4.0f : 8.0f, 0.0f, true != z3 ? 4.0f : 8.0f, 0.0f, 10, null);
    }

    /* renamed from: getAvatarSize-D9Ej5fM, reason: not valid java name */
    public final float m5057getAvatarSizeD9Ej5fM() {
        return AvatarSize;
    }

    /* renamed from: getCompactHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m5058getCompactHorizontalSpacingD9Ej5fM() {
        return CompactHorizontalSpacing;
    }

    public final ChipShapes getDefaultChipShapes$material3(Shapes shapes) {
        ChipShapes defaultChipShapesCached$material3 = shapes.getDefaultChipShapesCached$material3();
        if (defaultChipShapesCached$material3 != null) {
            return defaultChipShapesCached$material3;
        }
        ChipShapes chipShapes = new ChipShapes(ShapeTokens.INSTANCE.getCornerMedium(), ShapeTokens.INSTANCE.getCornerFull(), ShapeTokens.INSTANCE.getCornerSmall());
        shapes.setDefaultChipShapesCached$material3(chipShapes);
        return chipShapes;
    }

    public final SelectableChipColors getDefaultInputChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultInputChipColorsCached$material3 = colorScheme.getDefaultInputChipColorsCached$material3();
        if (defaultInputChipColorsCached$material3 != null) {
            return defaultInputChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getUnselectedTrailingIconColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledLabelTextColor()), InputChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledLeadingIconColor()), InputChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledTrailingIconColor()), InputChipTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getDisabledSelectedContainerColor()), InputChipTokens.INSTANCE.getDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, InputChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultInputChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultTonalInputChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultTonalInputChipColorsCached$material3 = colorScheme.getDefaultTonalInputChipColorsCached$material3();
        if (defaultTonalInputChipColorsCached$material3 != null) {
            return defaultTonalInputChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColorsM5524copydaRQuJA$default = SelectableChipColors.m5524copydaRQuJA$default(getDefaultInputChipColors$material3(colorScheme), 0L, 0L, colorScheme.m4561getOnSurfaceVariant0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8187, null);
        colorScheme.setDefaultTonalInputChipColorsCached$material3(selectableChipColorsM5524copydaRQuJA$default);
        return selectableChipColorsM5524copydaRQuJA$default;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m5059getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m5060getHorizontalSpacingD9Ej5fM() {
        return HorizontalSpacing;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5061getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052444143, i2, -1, "androidx.compose.material3.InputChipDefaults.<get-shape> (Chip.kt:2854)");
        }
        Shape value = ShapesKt.getValue(InputChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Arrangement.Horizontal horizontalArrangement(boolean z, boolean z2, boolean z3) {
        return ((z || z2) && z3) ? new ChipArrangement(CompactHorizontalSpacing, (o) null) : (z || z2) ? new ChipArrangement(CompactHorizontalSpacing, HorizontalSpacing, null) : z3 ? new ChipArrangement(HorizontalSpacing, CompactHorizontalSpacing, null) : ChipKt.DefaultHorizontalArrangement;
    }

    /* renamed from: horizontalArrangement-0680j_4, reason: not valid java name */
    public final Arrangement.Horizontal m5062horizontalArrangement0680j_4(float f2) {
        return Dp.m11169equalsimpl0(f2, HorizontalSpacing) ? ChipKt.DefaultHorizontalArrangement : new ChipArrangement(f2, (o) null);
    }

    /* renamed from: inputChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m5063inputChipBorder_7El2pE(boolean z, boolean z2, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getUnselectedOutlineColor(), composer, 6) : j2;
        long jM8263getTransparent0d7_KjU = (i3 & 8) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j3;
        long jM8227copywmQWz5c$default = (i3 & 16) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(InputChipTokens.INSTANCE.getDisabledUnselectedOutlineColor(), composer, 6), InputChipTokens.INSTANCE.getDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM8263getTransparent0d7_KjU2 = (i3 & 32) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j5;
        float fM6794getUnselectedOutlineWidthD9Ej5fM = (i3 & 64) != 0 ? InputChipTokens.INSTANCE.m6794getUnselectedOutlineWidthD9Ej5fM() : f2;
        float fM6792getSelectedOutlineWidthD9Ej5fM = (i3 & 128) != 0 ? InputChipTokens.INSTANCE.m6792getSelectedOutlineWidthD9Ej5fM() : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2050575347, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipBorder (Chip.kt:2842)");
        }
        if (true != z) {
            value = jM8227copywmQWz5c$default;
        }
        if (true != z) {
            jM8263getTransparent0d7_KjU = jM8263getTransparent0d7_KjU2;
        }
        if (z2) {
            value = jM8263getTransparent0d7_KjU;
        }
        if (true == z2) {
            fM6794getUnselectedOutlineWidthD9Ej5fM = fM6792getSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(fM6794getUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final SelectableChipColors inputChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-770375587, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:2685)");
        }
        SelectableChipColors defaultInputChipColors$material3 = getDefaultInputChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultInputChipColors$material3;
    }

    /* renamed from: inputChipColors-kwJvTHA, reason: not valid java name */
    public final SelectableChipColors m5064inputChipColorskwJvTHA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        long j15;
        long j16;
        long jM8264getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long j17 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        long jM8264getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        long jM8264getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j14;
        if (ComposerKt.isTraceInProgress()) {
            j15 = jM8264getUnspecified0d7_KjU12;
            j16 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1312840646, i2, i3, "androidx.compose.material3.InputChipDefaults.inputChipColors (Chip.kt:2730)");
        } else {
            j15 = jM8264getUnspecified0d7_KjU12;
            j16 = jM8264getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM5526copydaRQuJA = getDefaultInputChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5526copydaRQuJA(j17, j16, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, jM8264getUnspecified0d7_KjU11, j15, jM8264getUnspecified0d7_KjU13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM5526copydaRQuJA;
    }

    /* renamed from: inputChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m5065inputChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = InputChipTokens.INSTANCE.m6788getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = f2;
        }
        if ((i3 & 4) != 0) {
            f4 = f2;
        }
        if ((i3 & 8) != 0) {
            f5 = f2;
        }
        if ((i3 & 16) != 0) {
            f6 = InputChipTokens.INSTANCE.m6790getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1745270109, i2, -1, "androidx.compose.material3.InputChipDefaults.inputChipElevation (Chip.kt:2805)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        SelectableChipElevation selectableChipElevation = new SelectableChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipElevation;
    }

    public final ChipShapes shapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1755774666, i2, -1, "androidx.compose.material3.InputChipDefaults.shapes (Chip.kt:2877)");
        }
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        int i6 = i3 & 1;
        if (i4 != 0) {
            shape3 = null;
        }
        if (i5 != 0) {
            shape2 = null;
        }
        if (1 == i6) {
            shape = null;
        }
        ChipShapes chipShapesCopy = getDefaultChipShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipShapesCopy;
    }

    public final SelectableChipColors tonalInputChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-46522853, i2, -1, "androidx.compose.material3.InputChipDefaults.tonalInputChipColors (Chip.kt:2693)");
        }
        SelectableChipColors defaultTonalInputChipColors$material3 = getDefaultTonalInputChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTonalInputChipColors$material3;
    }

    /* renamed from: getCompactHorizontalSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5056getCompactHorizontalSpacingD9Ej5fM$annotations() {
    }

    public final Arrangement.Horizontal horizontalArrangement() {
        return ChipKt.DefaultHorizontalArrangement;
    }

    public final ChipShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1954547407, i2, -1, "androidx.compose.material3.InputChipDefaults.shapes (Chip.kt:2860)");
        }
        ChipShapes defaultChipShapes$material3 = getDefaultChipShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultChipShapes$material3;
    }
}
