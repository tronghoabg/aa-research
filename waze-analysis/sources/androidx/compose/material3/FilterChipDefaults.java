package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.FilterChipTokens;
import androidx.compose.material3.tokens.ShapeTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FilterChipDefaults {
    public static final int $stable = 0;
    public static final FilterChipDefaults INSTANCE = new FilterChipDefaults();
    private static final float Height = FilterChipTokens.INSTANCE.m6765getContainerHeightD9Ej5fM();
    private static final float IconSize = FilterChipTokens.INSTANCE.m6781getIconSizeD9Ej5fM();
    private static final float HorizontalSpacing = 8.0f;
    private static final float CompactHorizontalSpacing = 4.0f;
    private static final PaddingValues ContentPadding = PaddingKt.m2750PaddingValuesYgX7TsA$default(8.0f, 0.0f, 2, null);

    private FilterChipDefaults() {
    }

    public final SelectableChipColors elevatedFilterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1082953289, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:2440)");
        }
        SelectableChipColors defaultElevatedFilterChipColors$material3 = getDefaultElevatedFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedFilterChipColors$material3;
    }

    /* renamed from: elevatedFilterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m4847elevatedFilterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
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
            ComposerKt.traceEventStart(-915841711, i2, i3, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipColors (Chip.kt:2484)");
        } else {
            j14 = jM8264getUnspecified0d7_KjU11;
            j15 = jM8264getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM5526copydaRQuJA = getDefaultElevatedFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5526copydaRQuJA(j16, j15, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, j14, jM8264getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM5526copydaRQuJA;
    }

    /* renamed from: elevatedFilterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m4848elevatedFilterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilterChipTokens.INSTANCE.m6767getElevatedContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilterChipTokens.INSTANCE.m6771getElevatedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilterChipTokens.INSTANCE.m6769getElevatedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilterChipTokens.INSTANCE.m6770getElevatedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilterChipTokens.INSTANCE.m6766getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = FilterChipTokens.INSTANCE.m6768getElevatedDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(684803697, i2, -1, "androidx.compose.material3.FilterChipDefaults.elevatedFilterChipElevation (Chip.kt:2563)");
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

    /* renamed from: filterChipBorder-_7El2pE, reason: not valid java name */
    public final BorderStroke m4849filterChipBorder_7El2pE(boolean z, boolean z2, long j2, long j3, long j4, long j5, float f2, float f3, Composer composer, int i2, int i3) {
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatUnselectedOutlineColor(), composer, 6) : j2;
        long jM8263getTransparent0d7_KjU = (i3 & 8) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j3;
        long jM8227copywmQWz5c$default = (i3 & 16) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineColor(), composer, 6), FilterChipTokens.INSTANCE.getFlatDisabledUnselectedOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM8263getTransparent0d7_KjU2 = (i3 & 32) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j5;
        float fM6779getFlatUnselectedOutlineWidthD9Ej5fM = (i3 & 64) != 0 ? FilterChipTokens.INSTANCE.m6779getFlatUnselectedOutlineWidthD9Ej5fM() : f2;
        float fM6775getFlatSelectedOutlineWidthD9Ej5fM = (i3 & 128) != 0 ? FilterChipTokens.INSTANCE.m6775getFlatSelectedOutlineWidthD9Ej5fM() : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1138342447, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipBorder (Chip.kt:2425)");
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
            fM6779getFlatUnselectedOutlineWidthD9Ej5fM = fM6775getFlatSelectedOutlineWidthD9Ej5fM;
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(fM6779getFlatUnselectedOutlineWidthD9Ej5fM, value);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final SelectableChipColors filterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1743772077, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:2267)");
        }
        SelectableChipColors defaultFilterChipColors$material3 = getDefaultFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilterChipColors$material3;
    }

    /* renamed from: filterChipColors-XqyqHi0, reason: not valid java name */
    public final SelectableChipColors m4850filterChipColorsXqyqHi0(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, Composer composer, int i2, int i3, int i4) {
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
            ComposerKt.traceEventStart(-1831479801, i2, i3, "androidx.compose.material3.FilterChipDefaults.filterChipColors (Chip.kt:2310)");
        } else {
            j14 = jM8264getUnspecified0d7_KjU11;
            j15 = jM8264getUnspecified0d7_KjU2;
        }
        SelectableChipColors selectableChipColorsM5526copydaRQuJA = getDefaultFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5526copydaRQuJA(j16, j15, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, j14, jM8264getUnspecified0d7_KjU12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return selectableChipColorsM5526copydaRQuJA;
    }

    /* renamed from: filterChipElevation-aqJV_2Y, reason: not valid java name */
    public final SelectableChipElevation m4851filterChipElevationaqJV_2Y(float f2, float f3, float f4, float f5, float f6, float f7, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilterChipTokens.INSTANCE.m6772getFlatContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilterChipTokens.INSTANCE.m6776getFlatSelectedPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilterChipTokens.INSTANCE.m6773getFlatSelectedFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilterChipTokens.INSTANCE.m6774getFlatSelectedHoverContainerElevationD9Ej5fM();
        }
        if ((i3 & 16) != 0) {
            f6 = FilterChipTokens.INSTANCE.m6766getDraggedContainerElevationD9Ej5fM();
        }
        float f8 = f6;
        if ((i3 & 32) != 0) {
            f7 = f2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-757972185, i2, -1, "androidx.compose.material3.FilterChipDefaults.filterChipElevation (Chip.kt:2388)");
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

    /* renamed from: getCompactHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4852getCompactHorizontalSpacingD9Ej5fM() {
        return CompactHorizontalSpacing;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
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

    public final SelectableChipColors getDefaultElevatedFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultElevatedFilterChipColorsCached$material3 = colorScheme.getDefaultElevatedFilterChipColorsCached$material3();
        if (defaultElevatedFilterChipColorsCached$material3 != null) {
            return defaultElevatedFilterChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedTrailingIconColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledTrailingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedSelectedContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getElevatedDisabledContainerColor()), FilterChipTokens.INSTANCE.getElevatedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultElevatedFilterChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultFilterChipColorsCached$material3 = colorScheme.getDefaultFilterChipColorsCached$material3();
        if (defaultFilterChipColorsCached$material3 != null) {
            return defaultFilterChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColors = new SelectableChipColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getUnselectedTrailingIconColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLabelTextColor()), FilterChipTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledLeadingIconColor()), FilterChipTokens.INSTANCE.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getDisabledTrailingIconColor()), FilterChipTokens.INSTANCE.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getFlatSelectedContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerColor()), FilterChipTokens.INSTANCE.getFlatDisabledSelectedContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, FilterChipTokens.INSTANCE.getSelectedTrailingIconColor()), null);
        colorScheme.setDefaultFilterChipColorsCached$material3(selectableChipColors);
        return selectableChipColors;
    }

    public final SelectableChipColors getDefaultTonalElevatedFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultTonalElevatedFilterChipColorsCached$material3 = colorScheme.getDefaultTonalElevatedFilterChipColorsCached$material3();
        if (defaultTonalElevatedFilterChipColorsCached$material3 != null) {
            return defaultTonalElevatedFilterChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColorsM5524copydaRQuJA$default = SelectableChipColors.m5524copydaRQuJA$default(getDefaultElevatedFilterChipColors$material3(colorScheme), 0L, 0L, colorScheme.m4561getOnSurfaceVariant0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8187, null);
        colorScheme.setDefaultTonalElevatedFilterChipColorsCached$material3(selectableChipColorsM5524copydaRQuJA$default);
        return selectableChipColorsM5524copydaRQuJA$default;
    }

    public final SelectableChipColors getDefaultTonalFilterChipColors$material3(ColorScheme colorScheme) {
        SelectableChipColors defaultTonalFilterChipColorsCached$material3 = colorScheme.getDefaultTonalFilterChipColorsCached$material3();
        if (defaultTonalFilterChipColorsCached$material3 != null) {
            return defaultTonalFilterChipColorsCached$material3;
        }
        SelectableChipColors selectableChipColorsM5524copydaRQuJA$default = SelectableChipColors.m5524copydaRQuJA$default(getDefaultFilterChipColors$material3(colorScheme), 0L, 0L, colorScheme.m4561getOnSurfaceVariant0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8187, null);
        colorScheme.setDefaultTonalFilterChipColorsCached$material3(selectableChipColorsM5524copydaRQuJA$default);
        return selectableChipColorsM5524copydaRQuJA$default;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public final float m4853getHeightD9Ej5fM() {
        return Height;
    }

    /* renamed from: getHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4854getHorizontalSpacingD9Ej5fM() {
        return HorizontalSpacing;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4855getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1598643637, i2, -1, "androidx.compose.material3.FilterChipDefaults.<get-shape> (Chip.kt:2574)");
        }
        Shape value = ShapesKt.getValue(FilterChipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Arrangement.Horizontal horizontalArrangement(boolean z, boolean z2) {
        return (z && z2) ? new ChipArrangement(CompactHorizontalSpacing, (o) null) : z ? new ChipArrangement(CompactHorizontalSpacing, HorizontalSpacing, null) : z2 ? new ChipArrangement(HorizontalSpacing, CompactHorizontalSpacing, null) : ChipKt.DefaultHorizontalArrangement;
    }

    /* renamed from: horizontalArrangement-0680j_4, reason: not valid java name */
    public final Arrangement.Horizontal m4856horizontalArrangement0680j_4(float f2) {
        return Dp.m11169equalsimpl0(f2, HorizontalSpacing) ? ChipKt.DefaultHorizontalArrangement : new ChipArrangement(f2, (o) null);
    }

    public final ChipShapes shapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1540886500, i2, -1, "androidx.compose.material3.FilterChipDefaults.shapes (Chip.kt:2597)");
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

    public final SelectableChipColors tonalElevatedFilterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-345106809, i2, -1, "androidx.compose.material3.FilterChipDefaults.tonalElevatedFilterChipColors (Chip.kt:2449)");
        }
        SelectableChipColors defaultTonalElevatedFilterChipColors$material3 = getDefaultTonalElevatedFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTonalElevatedFilterChipColors$material3;
    }

    public final SelectableChipColors tonalFilterChipColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1905996655, i2, -1, "androidx.compose.material3.FilterChipDefaults.tonalFilterChipColors (Chip.kt:2275)");
        }
        SelectableChipColors defaultTonalFilterChipColors$material3 = getDefaultTonalFilterChipColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTonalFilterChipColors$material3;
    }

    /* renamed from: getCompactHorizontalSpacing-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4846getCompactHorizontalSpacingD9Ej5fM$annotations() {
    }

    public final Arrangement.Horizontal horizontalArrangement() {
        return ChipKt.DefaultHorizontalArrangement;
    }

    public final ChipShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-326101175, i2, -1, "androidx.compose.material3.FilterChipDefaults.shapes (Chip.kt:2580)");
        }
        ChipShapes defaultChipShapes$material3 = getDefaultChipShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultChipShapes$material3;
    }
}
