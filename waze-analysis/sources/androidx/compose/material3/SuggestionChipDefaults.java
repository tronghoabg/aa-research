package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.material3.tokens.SuggestionChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SuggestionChipDefaults {
    public static final int $stable = 0;
    public static final SuggestionChipDefaults INSTANCE = new SuggestionChipDefaults();
    private static final float Height = SuggestionChipTokens.INSTANCE.m7127getContainerHeightD9Ej5fM();
    private static final float IconSize = SuggestionChipTokens.INSTANCE.m7136getLeadingIconSizeD9Ej5fM();
    private static final PaddingValues ContentPadding = PaddingKt.m2750PaddingValuesYgX7TsA$default(8.0f, 0.0f, 2, null);
    private static final float HorizontalSpacing = 8.0f;

    private SuggestionChipDefaults() {
    }

    public final ChipColors elevatedSuggestionChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1671233087, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:3049)");
        }
        ChipColors defaultElevatedSuggestionChipColors$material3 = getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedSuggestionChipColors$material3;
    }

    /* renamed from: elevatedSuggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m5657elevatedSuggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1269423125, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipColors (Chip.kt:3071)");
        }
        ChipColors chipColorsM4498copyFD3wquc = getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4498copyFD3wquc(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, Color.Companion.m8264getUnspecified0d7_KjU(), jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, Color.Companion.m8264getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM4498copyFD3wquc;
    }

    /* renamed from: elevatedSuggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m5658elevatedSuggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m7129getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = SuggestionChipTokens.INSTANCE.m7133getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = SuggestionChipTokens.INSTANCE.m7131getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = SuggestionChipTokens.INSTANCE.m7132getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = SuggestionChipTokens.INSTANCE.m7128getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = SuggestionChipTokens.INSTANCE.m7130getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1118088467, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.elevatedSuggestionChipElevation (Chip.kt:3124)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        ChipElevation chipElevation = new ChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ChipColors getDefaultElevatedSuggestionChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultElevatedSuggestionChipColorsCached$material3 = colorScheme.getDefaultElevatedSuggestionChipColorsCached$material3();
        if (defaultElevatedSuggestionChipColorsCached$material3 != null) {
            return defaultElevatedSuggestionChipColorsCached$material3;
        }
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getLeadingIconColor()), Color.Companion.m8264getUnspecified0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SuggestionChipTokens.INSTANCE.getDisabledLabelTextColor()), SuggestionChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8264getUnspecified0d7_KjU(), null);
        colorScheme.setDefaultElevatedSuggestionChipColorsCached$material3(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m5659getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m5660getHorizontalSpacingD9Ej5fM() {
        return HorizontalSpacing;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5661getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(641188183, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.<get-shape> (Chip.kt:3135)");
        }
        Shape value = ShapesKt.getValue(SuggestionChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Arrangement.Horizontal horizontalArrangement() {
        return ChipKt.DefaultHorizontalArrangement;
    }

    /* renamed from: horizontalArrangement-0680j_4, reason: not valid java name */
    public final Arrangement.Horizontal m5662horizontalArrangement0680j_4(float f2) {
        return Dp.m11169equalsimpl0(f2, HorizontalSpacing) ? ChipKt.DefaultHorizontalArrangement : new ChipArrangement(f2, (o) null);
    }

    /* renamed from: suggestionChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m5663suggestionChipBorderd_3_b6Q(long j2, long j3, float f2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        long j4 = j2;
        long jM8227copywmQWz5c$default = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        float fM7135getFlatOutlineWidthD9Ej5fM = (i3 & 4) != 0 ? SuggestionChipTokens.INSTANCE.m7135getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(439283919, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:3037)");
        }
        ChipBorder chipBorder = new ChipBorder(j4, jM8227copywmQWz5c$default, fM7135getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    /* renamed from: suggestionChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m5664suggestionChipBorderh1eTWw(boolean z, long j2, long j3, float f2, Composer composer, int i2, int i3) {
        long value = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j2;
        long jM8227copywmQWz5c$default = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), SuggestionChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        float fM7135getFlatOutlineWidthD9Ej5fM = (i3 & 8) != 0 ? SuggestionChipTokens.INSTANCE.m7135getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-637354809, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipBorder (Chip.kt:3010)");
        }
        if (true != z) {
            value = jM8227copywmQWz5c$default;
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(fM7135getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final ChipColors suggestionChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1918570697, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:2931)");
        }
        ChipColors defaultSuggestionChipColors = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSuggestionChipColors;
    }

    /* renamed from: suggestionChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m5665suggestionChipColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1882647883, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipColors (Chip.kt:2953)");
        }
        ChipColors chipColorsM4498copyFD3wquc = ChipKt.getDefaultSuggestionChipColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4498copyFD3wquc(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, Color.Companion.m8264getUnspecified0d7_KjU(), jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, Color.Companion.m8264getUnspecified0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM4498copyFD3wquc;
    }

    /* renamed from: suggestionChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m5666suggestionChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = SuggestionChipTokens.INSTANCE.m7134getFlatContainerElevationD9Ej5fM();
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
            f6 = SuggestionChipTokens.INSTANCE.m7128getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1929994057, i2, -1, "androidx.compose.material3.SuggestionChipDefaults.suggestionChipElevation (Chip.kt:2984)");
        }
        float f9 = f7;
        float f10 = f4;
        float f11 = f2;
        ChipElevation chipElevation = new ChipElevation(f11, f3, f10, f5, f8, f9, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipElevation;
    }
}
