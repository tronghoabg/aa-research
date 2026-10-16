package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ButtonLargeTokens;
import androidx.compose.material3.tokens.ButtonMediumTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ButtonXLargeTokens;
import androidx.compose.material3.tokens.ButtonXSmallTokens;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TonalButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ToggleButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ContentPadding;
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float ToggleButtonEndPadding;
    private static final float ToggleButtonStartPadding;
    public static final ToggleButtonDefaults INSTANCE = new ToggleButtonDefaults();
    private static final float MinHeight = ButtonSmallTokens.INSTANCE.m6482getContainerHeightD9Ej5fM();

    static {
        float fM6485getLeadingSpaceD9Ej5fM = ButtonSmallTokens.INSTANCE.m6485getLeadingSpaceD9Ej5fM();
        ToggleButtonStartPadding = fM6485getLeadingSpaceD9Ej5fM;
        float fM6487getTrailingSpaceD9Ej5fM = ButtonSmallTokens.INSTANCE.m6487getTrailingSpaceD9Ej5fM();
        ToggleButtonEndPadding = fM6487getTrailingSpaceD9Ej5fM;
        ButtonVerticalPadding = 8.0f;
        IconSpacing = ButtonSmallTokens.INSTANCE.m6483getIconLabelSpaceD9Ej5fM();
        IconSize = ButtonSmallTokens.INSTANCE.m6484getIconSizeD9Ej5fM();
        ContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(fM6485getLeadingSpaceD9Ej5fM, 8.0f, fM6487getTrailingSpaceD9Ej5fM, 8.0f);
    }

    private ToggleButtonDefaults() {
    }

    public final ToggleButtonColors elevatedToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388157941, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.elevatedToggleButtonColors (ToggleButton.kt:571)");
        }
        ToggleButtonColors defaultElevatedToggleButtonColors$material3 = getDefaultElevatedToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedToggleButtonColors$material3;
    }

    /* renamed from: elevatedToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final ToggleButtonColors m5917elevatedToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1621927923, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.elevatedToggleButtonColors (ToggleButton.kt:595)");
        }
        ToggleButtonColors toggleButtonColorsM5910copytNS2XkQ = getDefaultElevatedToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5910copytNS2XkQ(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonColorsM5910copytNS2XkQ;
    }

    public final Shape getCheckedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1560635515, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-checkedShape> (ToggleButton.kt:460)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ToggleButtonColors getDefaultElevatedToggleButtonColors$material3(ColorScheme colorScheme) {
        ToggleButtonColors defaultElevatedToggleButtonColorsCached$material3 = colorScheme.getDefaultElevatedToggleButtonColorsCached$material3();
        if (defaultElevatedToggleButtonColorsCached$material3 != null) {
            return defaultElevatedToggleButtonColorsCached$material3;
        }
        ToggleButtonColors toggleButtonColors = new ToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getUnselectedPressedLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), ElevatedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ElevatedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getSelectedPressedLabelTextColor()), null);
        colorScheme.setDefaultElevatedToggleButtonColorsCached$material3(toggleButtonColors);
        return toggleButtonColors;
    }

    public final ToggleButtonColors getDefaultOutlinedToggleButtonColors$material3(ColorScheme colorScheme) {
        ToggleButtonColors defaultOutlinedToggleButtonColorsCached$material3 = colorScheme.getDefaultOutlinedToggleButtonColorsCached$material3();
        if (defaultOutlinedToggleButtonColorsCached$material3 != null) {
            return defaultOutlinedToggleButtonColorsCached$material3;
        }
        ToggleButtonColors toggleButtonColors = new ToggleButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getUnselectedLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getDisabledOutlineColor()), OutlinedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getSelectedLabelTextColor()), null);
        colorScheme.setDefaultOutlinedToggleButtonColorsCached$material3(toggleButtonColors);
        return toggleButtonColors;
    }

    public final ToggleButtonColors getDefaultToggleButtonColors$material3(ColorScheme colorScheme) {
        ToggleButtonColors defaultToggleButtonColorsCached$material3 = colorScheme.getDefaultToggleButtonColorsCached$material3();
        if (defaultToggleButtonColorsCached$material3 != null) {
            return defaultToggleButtonColorsCached$material3;
        }
        ToggleButtonColors toggleButtonColors = new ToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getUnselectedPressedLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), FilledButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), FilledButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getSelectedPressedLabelTextColor()), null);
        colorScheme.setDefaultToggleButtonColorsCached$material3(toggleButtonColors);
        return toggleButtonColors;
    }

    public final ToggleButtonShapes getDefaultToggleButtonShapes$material3(Shapes shapes) {
        ToggleButtonShapes defaultToggleButtonShapesCached$material3 = shapes.getDefaultToggleButtonShapesCached$material3();
        if (defaultToggleButtonShapesCached$material3 != null) {
            return defaultToggleButtonShapesCached$material3;
        }
        ToggleButtonShapes toggleButtonShapes = new ToggleButtonShapes(ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getContainerShapeRound()), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(6.0f), ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getSelectedContainerShapeSquare()));
        shapes.setDefaultToggleButtonShapesCached$material3(toggleButtonShapes);
        return toggleButtonShapes;
    }

    public final ToggleButtonColors getDefaultTonalToggleButtonColors$material3(ColorScheme colorScheme) {
        ToggleButtonColors defaultTonalToggleButtonColorsCached$material3 = colorScheme.getDefaultTonalToggleButtonColorsCached$material3();
        if (defaultTonalToggleButtonColorsCached$material3 != null) {
            return defaultTonalToggleButtonColorsCached$material3;
        }
        ToggleButtonColors toggleButtonColors = new ToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getUnselectedLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getDisabledContainerColor()), TonalButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), TonalButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TonalButtonTokens.INSTANCE.getSelectedLabelTextColor()), null);
        colorScheme.setDefaultTonalToggleButtonColorsCached$material3(toggleButtonColors);
        return toggleButtonColors;
    }

    public final Shape getExtraLargeCheckedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-812664635, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraLargeCheckedSquareShape> (ToggleButton.kt:508)");
        }
        Shape value = ShapesKt.getValue(ButtonXLargeTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1887476091, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraLargePressedShape> (ToggleButton.kt:492)");
        }
        Shape value = ShapesKt.getValue(ButtonXLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargeSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1619300349, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraLargeSquareShape> (ToggleButton.kt:476)");
        }
        Shape value = ShapesKt.getValue(ButtonXLargeTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallCheckedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1161276741, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraSmallCheckedSquareShape> (ToggleButton.kt:496)");
        }
        Shape value = ShapesKt.getValue(ButtonXSmallTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1550187515, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraSmallPressedShape> (ToggleButton.kt:480)");
        }
        Shape value = ShapesKt.getValue(ButtonXSmallTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2098062181, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-extraSmallSquareShape> (ToggleButton.kt:464)");
        }
        Shape value = ShapesKt.getValue(ButtonXSmallTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5918getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m5919getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    public final Shape getLargeCheckedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2008029189, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-largeCheckedSquareShape> (ToggleButton.kt:504)");
        }
        Shape value = ShapesKt.getValue(ButtonLargeTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(811908737, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-largePressedShape> (ToggleButton.kt:488)");
        }
        Shape value = ShapesKt.getValue(ButtonLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-872190043, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-largeSquareShape> (ToggleButton.kt:472)");
        }
        Shape value = ShapesKt.getValue(ButtonLargeTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumCheckedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-163559803, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-mediumCheckedSquareShape> (ToggleButton.kt:500)");
        }
        Shape value = ShapesKt.getValue(ButtonMediumTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(186887365, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-mediumPressedShape> (ToggleButton.kt:484)");
        }
        Shape value = ShapesKt.getValue(ButtonMediumTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(904721879, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-mediumSquareShape> (ToggleButton.kt:468)");
        }
        Shape value = ShapesKt.getValue(ButtonMediumTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m5920getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    public final Shape getPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1385815397, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-pressedShape> (ToggleButton.kt:456)");
        }
        RoundedCornerShape roundedCornerShapeM3086RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(6.0f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return roundedCornerShapeM3086RoundedCornerShape0680j_4;
    }

    public final Shape getRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1185355301, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-roundShape> (ToggleButton.kt:444)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(613821363, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-shape> (ToggleButton.kt:452)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(72021741, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.<get-squareShape> (ToggleButton.kt:448)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final ToggleButtonColors outlinedToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-188416429, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.outlinedToggleButtonColors (ToggleButton.kt:685)");
        }
        ToggleButtonColors defaultOutlinedToggleButtonColors$material3 = getDefaultOutlinedToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedToggleButtonColors$material3;
    }

    /* renamed from: outlinedToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final ToggleButtonColors m5921outlinedToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1380079813, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.outlinedToggleButtonColors (ToggleButton.kt:709)");
        }
        ToggleButtonColors toggleButtonColorsM5910copytNS2XkQ = getDefaultOutlinedToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5910copytNS2XkQ(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonColorsM5910copytNS2XkQ;
    }

    public final ToggleButtonShapes shapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(708154610, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.shapes (ToggleButton.kt:425)");
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
        ToggleButtonShapes toggleButtonShapesCopy = getDefaultToggleButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonShapesCopy;
    }

    /* renamed from: shapesFor-8Feqmps, reason: not valid java name */
    public final ToggleButtonShapes m5922shapesFor8Feqmps(float f2, Composer composer, int i2) {
        ToggleButtonShapes toggleButtonShapesShapes;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(176948154, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.shapesFor (ToggleButton.kt:743)");
        }
        float fM4434getExtraSmallContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m4434getExtraSmallContainerHeightD9Ej5fM();
        float fM4445getMinHeightD9Ej5fM = ButtonDefaults.INSTANCE.m4445getMinHeightD9Ej5fM();
        float fM4442getMediumContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m4442getMediumContainerHeightD9Ej5fM();
        float fM4439getLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m4439getLargeContainerHeightD9Ej5fM();
        float fM4431getExtraLargeContainerHeightD9Ej5fM = ButtonDefaults.INSTANCE.m4431getExtraLargeContainerHeightD9Ej5fM();
        int i3 = (i2 >> 3) & 14;
        if (Dp.m11163compareTo0680j_4(f2, (fM4434getExtraSmallContainerHeightD9Ej5fM + fM4445getMinHeightD9Ej5fM) / 2.0f) <= 0) {
            composer.startReplaceGroup(-1751500654);
            toggleButtonShapesShapes = shapes(getShape(composer, i3), getExtraSmallPressedShape(composer, i3), getExtraSmallCheckedSquareShape(composer, i3), composer, (i2 << 6) & 7168, 0);
            composer.endReplaceGroup();
        } else if (Dp.m11163compareTo0680j_4(f2, (fM4445getMinHeightD9Ej5fM + fM4442getMediumContainerHeightD9Ej5fM) / 2.0f) <= 0) {
            composer.startReplaceGroup(-1751492862);
            toggleButtonShapesShapes = shapes(composer, i3);
            composer.endReplaceGroup();
        } else {
            int i4 = (i2 << 6) & 7168;
            if (Dp.m11163compareTo0680j_4(f2, (fM4442getMediumContainerHeightD9Ej5fM + fM4439getLargeContainerHeightD9Ej5fM) / 2.0f) <= 0) {
                composer.startReplaceGroup(-1751489846);
                toggleButtonShapesShapes = shapes(getShape(composer, i3), getMediumPressedShape(composer, i3), getMediumCheckedSquareShape(composer, i3), composer, i4, 0);
                composer.endReplaceGroup();
            } else if (Dp.m11163compareTo0680j_4(f2, (fM4439getLargeContainerHeightD9Ej5fM + fM4431getExtraLargeContainerHeightD9Ej5fM) / 2.0f) <= 0) {
                composer.startReplaceGroup(-1751481624);
                toggleButtonShapesShapes = shapes(getShape(composer, i3), getLargePressedShape(composer, i3), getLargeCheckedSquareShape(composer, i3), composer, i4, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1751474862);
                toggleButtonShapesShapes = shapes(getShape(composer, i3), getExtraLargePressedShape(composer, i3), getExtraLargeCheckedSquareShape(composer, i3), composer, i4, 0);
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonShapesShapes;
    }

    public final ToggleButtonColors toggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1477900181, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.toggleButtonColors (ToggleButton.kt:514)");
        }
        ToggleButtonColors defaultToggleButtonColors$material3 = getDefaultToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultToggleButtonColors$material3;
    }

    /* renamed from: toggleButtonColors-5tl4gsc, reason: not valid java name */
    public final ToggleButtonColors m5923toggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1534216259, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.toggleButtonColors (ToggleButton.kt:536)");
        }
        ToggleButtonColors toggleButtonColorsM5910copytNS2XkQ = getDefaultToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5910copytNS2XkQ(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonColorsM5910copytNS2XkQ;
    }

    public final ToggleButtonColors tonalToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-793286573, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.tonalToggleButtonColors (ToggleButton.kt:630)");
        }
        ToggleButtonColors defaultTonalToggleButtonColors$material3 = getDefaultTonalToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTonalToggleButtonColors$material3;
    }

    /* renamed from: tonalToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final ToggleButtonColors m5924tonalToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(241675973, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.tonalToggleButtonColors (ToggleButton.kt:653)");
        }
        ToggleButtonColors toggleButtonColorsM5910copytNS2XkQ = getDefaultTonalToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5910copytNS2XkQ(jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return toggleButtonColorsM5910copytNS2XkQ;
    }

    public final ToggleButtonShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-908956393, i2, -1, "androidx.compose.material3.ToggleButtonDefaults.shapes (ToggleButton.kt:409)");
        }
        ToggleButtonShapes defaultToggleButtonShapes$material3 = getDefaultToggleButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultToggleButtonShapes$material3;
    }
}
