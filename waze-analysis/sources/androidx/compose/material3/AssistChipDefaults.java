package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.AssistChipTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AssistChipDefaults {
    public static final int $stable = 0;
    public static final AssistChipDefaults INSTANCE = new AssistChipDefaults();
    private static final float Height = AssistChipTokens.INSTANCE.m6444getContainerHeightD9Ej5fM();
    private static final float IconSize = AssistChipTokens.INSTANCE.m6453getIconSizeD9Ej5fM();
    private static final float HorizontalSpacing = 8.0f;
    private static final PaddingValues ContentPadding = PaddingKt.m2750PaddingValuesYgX7TsA$default(8.0f, 0.0f, 2, null);

    private AssistChipDefaults() {
    }

    /* renamed from: assistChipBorder-d_3_b6Q, reason: not valid java name */
    public final ChipBorder m4373assistChipBorderd_3_b6Q(long j2, long j3, float f2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6);
        }
        long j4 = j2;
        long jM8227copywmQWz5c$default = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        float fM6452getFlatOutlineWidthD9Ej5fM = (i3 & 4) != 0 ? AssistChipTokens.INSTANCE.m6452getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(382372847, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:2108)");
        }
        ChipBorder chipBorder = new ChipBorder(j4, jM8227copywmQWz5c$default, fM6452getFlatOutlineWidthD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipBorder;
    }

    /* renamed from: assistChipBorder-h1eT-Ww, reason: not valid java name */
    public final BorderStroke m4374assistChipBorderh1eTWw(boolean z, long j2, long j3, float f2, Composer composer, int i2, int i3) {
        long value = (i3 & 2) != 0 ? ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatOutlineColor(), composer, 6) : j2;
        long jM8227copywmQWz5c$default = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(AssistChipTokens.INSTANCE.getFlatDisabledOutlineColor(), composer, 6), AssistChipTokens.INSTANCE.getFlatDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        float fM6452getFlatOutlineWidthD9Ej5fM = (i3 & 8) != 0 ? AssistChipTokens.INSTANCE.m6452getFlatOutlineWidthD9Ej5fM() : f2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458649561, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipBorder (Chip.kt:2080)");
        }
        if (true != z) {
            value = jM8227copywmQWz5c$default;
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(fM6452getFlatOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final ChipColors assistChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1961061417, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:1975)");
        }
        ChipColors defaultAssistChipColors$material3 = getDefaultAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultAssistChipColors$material3;
    }

    /* renamed from: assistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m4375assistChipColorsoq7We08(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3) {
        long j10;
        long j11;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        if (ComposerKt.isTraceInProgress()) {
            j10 = jM8264getUnspecified0d7_KjU;
            j11 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-391745725, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipColors (Chip.kt:2001)");
        } else {
            j10 = jM8264getUnspecified0d7_KjU;
            j11 = jM8264getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM4498copyFD3wquc = getDefaultAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4498copyFD3wquc(j10, j11, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM4498copyFD3wquc;
    }

    /* renamed from: assistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m4376assistChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = AssistChipTokens.INSTANCE.m6451getFlatContainerElevationD9Ej5fM();
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
            f6 = AssistChipTokens.INSTANCE.m6445getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(245366099, i2, -1, "androidx.compose.material3.AssistChipDefaults.assistChipElevation (Chip.kt:2054)");
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

    public final ChipColors elevatedAssistChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(655175583, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:2119)");
        }
        ChipColors defaultElevatedAssistChipColors$material3 = getDefaultElevatedAssistChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedAssistChipColors$material3;
    }

    /* renamed from: elevatedAssistChipColors-oq7We08, reason: not valid java name */
    public final ChipColors m4377elevatedAssistChipColorsoq7We08(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3) {
        long j10;
        long j11;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        if (ComposerKt.isTraceInProgress()) {
            j10 = jM8264getUnspecified0d7_KjU;
            j11 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-535762675, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipColors (Chip.kt:2145)");
        } else {
            j10 = jM8264getUnspecified0d7_KjU;
            j11 = jM8264getUnspecified0d7_KjU2;
        }
        ChipColors chipColorsM4498copyFD3wquc = SuggestionChipDefaults.INSTANCE.getDefaultElevatedSuggestionChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4498copyFD3wquc(j10, j11, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return chipColorsM4498copyFD3wquc;
    }

    /* renamed from: elevatedAssistChipElevation-aqJV_2Y, reason: not valid java name */
    public final ChipElevation m4378elevatedAssistChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = AssistChipTokens.INSTANCE.m6446getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = AssistChipTokens.INSTANCE.m6450getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = AssistChipTokens.INSTANCE.m6448getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = AssistChipTokens.INSTANCE.m6449getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = AssistChipTokens.INSTANCE.m6445getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = AssistChipTokens.INSTANCE.m6447getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1457698077, i2, -1, "androidx.compose.material3.AssistChipDefaults.elevatedAssistChipElevation (Chip.kt:2200)");
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

    public final ChipColors getDefaultAssistChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultAssistChipColorsCached$material3 = colorScheme.getDefaultAssistChipColorsCached$material3();
        if (defaultAssistChipColorsCached$material3 != null) {
            return defaultAssistChipColorsCached$material3;
        }
        ChipColors chipColors = new ChipColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultAssistChipColorsCached$material3(chipColors);
        return chipColors;
    }

    public final ChipColors getDefaultElevatedAssistChipColors$material3(ColorScheme colorScheme) {
        ChipColors defaultElevatedAssistChipColorsCached$material3 = colorScheme.getDefaultElevatedAssistChipColorsCached$material3();
        if (defaultElevatedAssistChipColorsCached$material3 != null) {
            return defaultElevatedAssistChipColorsCached$material3;
        }
        ChipColors chipColors = new ChipColors(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getElevatedContainerColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getIconColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getElevatedDisabledContainerColor()), AssistChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledLabelTextColor()), AssistChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, AssistChipTokens.INSTANCE.getDisabledIconColor()), AssistChipTokens.INSTANCE.getDisabledIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedAssistChipColorsCached$material3(chipColors);
        return chipColors;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m4379getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4380getHorizontalSpacingD9Ej5fM() {
        return HorizontalSpacing;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4381getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1988153916, i2, -1, "androidx.compose.material3.AssistChipDefaults.<get-shape> (Chip.kt:2211)");
        }
        Shape value = ShapesKt.getValue(AssistChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Arrangement.Horizontal horizontalArrangement() {
        return ChipKt.DefaultHorizontalArrangement;
    }

    /* renamed from: horizontalArrangement-0680j_4, reason: not valid java name */
    public final Arrangement.Horizontal m4382horizontalArrangement0680j_4(float f2) {
        return Dp.m11169equalsimpl0(f2, HorizontalSpacing) ? ChipKt.DefaultHorizontalArrangement : new ChipArrangement(f2, (o) null);
    }
}
