package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.ReorderListTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final ListItemDefaults INSTANCE = new ListItemDefaults();
    private static final PaddingValues ContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(ListItemKt.getInteractiveListStartPadding(), ListItemKt.getInteractiveListTopPadding(), ListItemKt.getInteractiveListEndPadding(), ListItemKt.getInteractiveListBottomPadding());
    private static final float Elevation = ListTokens.INSTANCE.m6820getItemContainerElevationD9Ej5fM();
    private static final float SegmentedGap = ListTokens.INSTANCE.m6840getSegmentedGapD9Ej5fM();

    private ListItemDefaults() {
    }

    /* renamed from: elevation-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ ListItemElevation m5128elevationYgX7TsA$default(ListItemDefaults listItemDefaults, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = ListTokens.INSTANCE.m6820getItemContainerElevationD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            f3 = ListTokens.INSTANCE.m6821getItemDraggedContainerElevationD9Ej5fM();
        }
        return listItemDefaults.m5132elevationYgX7TsA(f2, f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int verticalAlignment$lambda$0$0(Density density, int i2, int i3) {
        return (i3 < density.mo2121roundToPx0680j_4(ListItemKt.getInteractiveListVerticalAlignmentBreakpoint()) ? Alignment.Companion.getCenterVertically() : Alignment.Companion.getTop()).align(i2, i3);
    }

    public final ListItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-138071106, i2, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItemDefaults.kt:68)");
        }
        ListItemColors defaultListItemColors$material3 = getDefaultListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultListItemColors$material3;
    }

    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final ListItemColors m5130colorsJ08w3E(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long jM8264getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1193261595, i2, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItemDefaults.kt:553)");
        }
        ListItemColors listItemColorsM5079copyKKJ9vVU$default = ListItemColors.m5079copyKKJ9vVU$default(getDefaultListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)), jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, 0L, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 16776256, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemColorsM5079copyKKJ9vVU$default;
    }

    /* renamed from: colors-LIdIuno, reason: not valid java name */
    public final ListItemColors m5131colorsLIdIuno(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, Composer composer, int i2, int i3, int i4, int i5) {
        long j26;
        long j27;
        long jM8264getUnspecified0d7_KjU = (i5 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i5 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i5 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i5 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i5 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i5 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i5 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i5 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long j28 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU9 = (i5 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i5 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        long jM8264getUnspecified0d7_KjU11 = (i5 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i5 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        long jM8264getUnspecified0d7_KjU13 = (i5 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j14;
        long jM8264getUnspecified0d7_KjU14 = (i5 & 8192) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j15;
        long jM8264getUnspecified0d7_KjU15 = (i5 & 16384) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j16;
        long jM8264getUnspecified0d7_KjU16 = (i5 & 32768) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j17;
        long jM8264getUnspecified0d7_KjU17 = (i5 & 65536) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j18;
        long jM8264getUnspecified0d7_KjU18 = (i5 & 131072) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j19;
        long jM8264getUnspecified0d7_KjU19 = (i5 & 262144) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j20;
        long jM8264getUnspecified0d7_KjU20 = (i5 & 524288) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j21;
        long jM8264getUnspecified0d7_KjU21 = (i5 & 1048576) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j22;
        long jM8264getUnspecified0d7_KjU22 = (i5 & 2097152) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j23;
        long jM8264getUnspecified0d7_KjU23 = (i5 & 4194304) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j24;
        long jM8264getUnspecified0d7_KjU24 = (i5 & 8388608) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j25;
        if (ComposerKt.isTraceInProgress()) {
            j26 = jM8264getUnspecified0d7_KjU15;
            j27 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(1918472318, i2, i3, "androidx.compose.material3.ListItemDefaults.colors (ListItemDefaults.kt:136)");
        } else {
            j26 = jM8264getUnspecified0d7_KjU15;
            j27 = jM8264getUnspecified0d7_KjU2;
        }
        ListItemColors listItemColorsM5091copyKKJ9vVU = getDefaultListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5091copyKKJ9vVU(j28, j27, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, jM8264getUnspecified0d7_KjU11, jM8264getUnspecified0d7_KjU12, jM8264getUnspecified0d7_KjU13, jM8264getUnspecified0d7_KjU14, j26, jM8264getUnspecified0d7_KjU16, jM8264getUnspecified0d7_KjU17, jM8264getUnspecified0d7_KjU18, jM8264getUnspecified0d7_KjU19, jM8264getUnspecified0d7_KjU20, jM8264getUnspecified0d7_KjU21, jM8264getUnspecified0d7_KjU22, jM8264getUnspecified0d7_KjU23, jM8264getUnspecified0d7_KjU24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemColorsM5091copyKKJ9vVU;
    }

    /* renamed from: elevation-YgX7TsA, reason: not valid java name */
    public final ListItemElevation m5132elevationYgX7TsA(float f2, float f3) {
        return new ListItemElevation(f2, f3, null);
    }

    public final long getContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(316428213, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItemDefaults.kt:58)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getItemContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1754491957, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItemDefaults.kt:62)");
        }
        long value = ColorSchemeKt.getValue(ListTokens.INSTANCE.getItemLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ListItemColors getDefaultListItemColors$material3(ColorScheme colorScheme) {
        ListItemColors defaultListItemColorsCached$material3 = colorScheme.getDefaultListItemColorsCached$material3();
        if (defaultListItemColorsCached$material3 != null) {
            return defaultListItemColorsCached$material3;
        }
        ListItemColors listItemColors = new ListItemColors(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemContainerColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledLabelTextColor()), ListTokens.INSTANCE.getItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledLeadingIconColor()), ListTokens.INSTANCE.getItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledTrailingIconColor()), ListTokens.INSTANCE.getItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledOverlineColor()), ListTokens.INSTANCE.getItemDisabledOverlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledSupportingTextColor()), ListTokens.INSTANCE.getItemDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemContainerColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemSupportingTextColor()), null);
        colorScheme.setDefaultListItemColorsCached$material3(listItemColors);
        return listItemColors;
    }

    public final ListItemShapes getDefaultListItemShapes$material3(Shapes shapes) {
        ListItemShapes defaultListItemShapesCached$material3 = shapes.getDefaultListItemShapesCached$material3();
        if (defaultListItemShapesCached$material3 != null) {
            return defaultListItemShapesCached$material3;
        }
        ListItemShapes listItemShapes = new ListItemShapes(ShapesKt.fromToken(shapes, ListTokens.INSTANCE.getItemContainerExpressiveShape()), ShapesKt.fromToken(shapes, ListTokens.INSTANCE.getItemSelectedContainerExpressiveShape()), ShapesKt.fromToken(shapes, ListTokens.INSTANCE.getItemPressedContainerExpressiveShape()), ShapesKt.fromToken(shapes, ListTokens.INSTANCE.getItemFocusedContainerExpressiveShape()), ShapesKt.fromToken(shapes, ListTokens.INSTANCE.getItemHoveredContainerExpressiveShape()), ShapesKt.fromToken(shapes, ReorderListTokens.INSTANCE.getItemShape()));
        shapes.setDefaultListItemShapesCached$material3(listItemShapes);
        return listItemShapes;
    }

    public final ListItemColors getDefaultSegmentedListItemColors$material3(ColorScheme colorScheme) {
        ListItemColors defaultSegmentedListItemColorsCached$material3 = colorScheme.getDefaultSegmentedListItemColorsCached$material3();
        if (defaultSegmentedListItemColorsCached$material3 != null) {
            return defaultSegmentedListItemColorsCached$material3;
        }
        ListItemColors listItemColors = new ListItemColors(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSegmentedContainerColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSegmentedContainerColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledLabelTextColor()), ListTokens.INSTANCE.getItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledLeadingIconColor()), ListTokens.INSTANCE.getItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledTrailingIconColor()), ListTokens.INSTANCE.getItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledOverlineColor()), ListTokens.INSTANCE.getItemDisabledOverlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemDisabledSupportingTextColor()), ListTokens.INSTANCE.getItemDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ListTokens.INSTANCE.getItemSelectedSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemContainerColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemOverlineColor()), ColorSchemeKt.fromToken(colorScheme, ReorderListTokens.INSTANCE.getItemSupportingTextColor()), null);
        colorScheme.setDefaultSegmentedListItemColorsCached$material3(listItemColors);
        return listItemColors;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m5133getElevationD9Ej5fM() {
        return Elevation;
    }

    /* renamed from: getSegmentedGap-D9Ej5fM, reason: not valid java name */
    public final float m5134getSegmentedGapD9Ej5fM() {
        return SegmentedGap;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-219539551, i2, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItemDefaults.kt:54)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getItemContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final ListItemColors segmentedColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1088456616, i2, -1, "androidx.compose.material3.ListItemDefaults.segmentedColors (ListItemDefaults.kt:225)");
        }
        ListItemColors defaultSegmentedListItemColors$material3 = getDefaultSegmentedListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSegmentedListItemColors$material3;
    }

    /* renamed from: segmentedColors-LIdIuno, reason: not valid java name */
    public final ListItemColors m5135segmentedColorsLIdIuno(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, Composer composer, int i2, int i3, int i4, int i5) {
        long j26;
        long j27;
        long jM8264getUnspecified0d7_KjU = (i5 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i5 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i5 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i5 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i5 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i5 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i5 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i5 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long j28 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU9 = (i5 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i5 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        long jM8264getUnspecified0d7_KjU11 = (i5 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i5 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        long jM8264getUnspecified0d7_KjU13 = (i5 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j14;
        long jM8264getUnspecified0d7_KjU14 = (i5 & 8192) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j15;
        long jM8264getUnspecified0d7_KjU15 = (i5 & 16384) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j16;
        long jM8264getUnspecified0d7_KjU16 = (i5 & 32768) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j17;
        long jM8264getUnspecified0d7_KjU17 = (i5 & 65536) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j18;
        long jM8264getUnspecified0d7_KjU18 = (i5 & 131072) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j19;
        long jM8264getUnspecified0d7_KjU19 = (i5 & 262144) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j20;
        long jM8264getUnspecified0d7_KjU20 = (i5 & 524288) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j21;
        long jM8264getUnspecified0d7_KjU21 = (i5 & 1048576) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j22;
        long jM8264getUnspecified0d7_KjU22 = (i5 & 2097152) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j23;
        long jM8264getUnspecified0d7_KjU23 = (i5 & 4194304) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j24;
        long jM8264getUnspecified0d7_KjU24 = (i5 & 8388608) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j25;
        if (ComposerKt.isTraceInProgress()) {
            j26 = jM8264getUnspecified0d7_KjU15;
            j27 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(538921812, i2, i3, "androidx.compose.material3.ListItemDefaults.segmentedColors (ListItemDefaults.kt:294)");
        } else {
            j26 = jM8264getUnspecified0d7_KjU15;
            j27 = jM8264getUnspecified0d7_KjU2;
        }
        ListItemColors listItemColorsM5091copyKKJ9vVU = getDefaultSegmentedListItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5091copyKKJ9vVU(j28, j27, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, jM8264getUnspecified0d7_KjU11, jM8264getUnspecified0d7_KjU12, jM8264getUnspecified0d7_KjU13, jM8264getUnspecified0d7_KjU14, j26, jM8264getUnspecified0d7_KjU16, jM8264getUnspecified0d7_KjU17, jM8264getUnspecified0d7_KjU18, jM8264getUnspecified0d7_KjU19, jM8264getUnspecified0d7_KjU20, jM8264getUnspecified0d7_KjU21, jM8264getUnspecified0d7_KjU22, jM8264getUnspecified0d7_KjU23, jM8264getUnspecified0d7_KjU24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemColorsM5091copyKKJ9vVU;
    }

    public final ListItemShapes segmentedShapes(int i2, int i3, ListItemShapes listItemShapes, Composer composer, int i4, int i5) {
        ListItemShapes listItemShapesShapes = (i5 & 4) != 0 ? shapes(composer, (i4 >> 9) & 14) : listItemShapes;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1855526817, i4, -1, "androidx.compose.material3.ListItemDefaults.segmentedShapes (ListItemDefaults.kt:430)");
        }
        Shape value = ShapesKt.getValue(ListTokens.INSTANCE.getContainerShape(), composer, 6);
        boolean zChanged = (((6 ^ (i4 & 14)) > 4 && composer.changed(i2)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(i3)) || (i4 & 48) == 32) | ((((i4 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(listItemShapesShapes)) || (i4 & 384) == 256) | composer.changed(value);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            if (i3 != 1) {
                if (i2 == 0) {
                    Shape shape = listItemShapesShapes.getShape();
                    if ((shape instanceof CornerBasedShape) && (value instanceof CornerBasedShape)) {
                        CornerBasedShape cornerBasedShape = (CornerBasedShape) value;
                        listItemShapesShapes = ListItemShapes.copy$default(listItemShapesShapes, CornerBasedShape.copy$default((CornerBasedShape) shape, cornerBasedShape.getTopStart(), cornerBasedShape.getTopEnd(), null, null, 12, null), null, null, null, null, null, 62, null);
                    }
                } else if (i2 == i3 - 1) {
                    Shape shape2 = listItemShapesShapes.getShape();
                    if ((shape2 instanceof CornerBasedShape) && (value instanceof CornerBasedShape)) {
                        CornerBasedShape cornerBasedShape2 = (CornerBasedShape) value;
                        listItemShapesShapes = ListItemShapes.copy$default(listItemShapesShapes, CornerBasedShape.copy$default((CornerBasedShape) shape2, null, null, cornerBasedShape2.getBottomEnd(), cornerBasedShape2.getBottomStart(), 3, null), null, null, null, null, null, 62, null);
                    }
                }
            }
            composer.updateRememberedValue(listItemShapesShapes);
            objRememberedValue = listItemShapesShapes;
        }
        ListItemShapes listItemShapes2 = (ListItemShapes) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemShapes2;
    }

    public final ListItemShapes shapes(Shape shape, Shape shape2, Shape shape3, Shape shape4, Shape shape5, Shape shape6, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(867485652, i2, -1, "androidx.compose.material3.ListItemDefaults.shapes (ListItemDefaults.kt:406)");
        }
        int i4 = i3 & 32;
        int i5 = i3 & 16;
        int i6 = i3 & 8;
        int i7 = i3 & 4;
        int i8 = i3 & 2;
        int i9 = i3 & 1;
        if (i4 != 0) {
            shape6 = null;
        }
        if (i5 != 0) {
            shape5 = null;
        }
        if (i6 != 0) {
            shape4 = null;
        }
        if (i7 != 0) {
            shape3 = null;
        }
        if (i8 != 0) {
            shape2 = null;
        }
        if (1 == i9) {
            shape = null;
        }
        ListItemShapes listItemShapesCopy = getDefaultListItemShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2, shape3, shape4, shape5, shape6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return listItemShapesCopy;
    }

    public final Alignment.Vertical verticalAlignment(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1840604264, i2, -1, "androidx.compose.material3.ListItemDefaults.verticalAlignment (ListItemDefaults.kt:510)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new Alignment.Vertical() { // from class: androidx.compose.material3.ListItemDefaults$$ExternalSyntheticLambda0
                @Override // androidx.compose.ui.Alignment.Vertical
                public final int align(int i3, int i4) {
                    return ListItemDefaults.verticalAlignment$lambda$0$0(density, i3, i4);
                }

                @Override // androidx.compose.ui.Alignment.Vertical
                public /* synthetic */ Alignment plus(Alignment.Horizontal horizontal) {
                    return Alignment.Vertical.CC.$default$plus(this, horizontal);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Alignment.Vertical vertical = (Alignment.Vertical) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return vertical;
    }

    /* renamed from: getSegmentedGap-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m5129getSegmentedGapD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getDefaultListItemShapes$material3$annotations(Shapes shapes) {
    }

    public final ListItemShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568481222, i2, -1, "androidx.compose.material3.ListItemDefaults.shapes (ListItemDefaults.kt:383)");
        }
        ListItemShapes defaultListItemShapes$material3 = getDefaultListItemShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultListItemShapes$material3;
    }
}
