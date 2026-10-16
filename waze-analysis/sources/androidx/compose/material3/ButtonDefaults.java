package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.BaselineButtonTokens;
import androidx.compose.material3.tokens.ButtonLargeTokens;
import androidx.compose.material3.tokens.ButtonMediumTokens;
import androidx.compose.material3.tokens.ButtonSmallTokens;
import androidx.compose.material3.tokens.ButtonXLargeTokens;
import androidx.compose.material3.tokens.ButtonXSmallTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonLeadingSpace;
    private static final float ButtonTrailingSpace;
    private static final float ButtonVerticalPadding;
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconStartpadding;
    private static final PaddingValues ContentPadding;
    private static final float ExtraLargeContainerHeight;
    private static final float ExtraLargeIconSize;
    private static final float ExtraLargeIconSpacing;
    private static final float ExtraSmallContainerHeight;
    private static final float ExtraSmallIconSize;
    private static final float ExtraSmallIconSpacing;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconLargeLeadingPadding;
    private static final float IconLargeTrailingPadding;
    private static final float IconMediumLeadingPadding;
    private static final float IconMediumTrailingPadding;
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float LargeContainerHeight;
    private static final float LargeIconSize;
    private static final float LargeIconSpacing;
    private static final float LargeLeadingPadding;
    private static final float LargeTrailingPadding;
    private static final float LargeVerticalPadding;
    private static final float MediumContainerHeight;
    private static final float MediumIconSize;
    private static final float MediumIconSpacing;
    private static final float MediumLeadingPadding;
    private static final float MediumTrailingPadding;
    private static final float MediumVerticalPadding;
    private static final float MinWidth;
    private static final float SmallEndPadding;
    private static final float SmallIconSize;
    private static final float SmallStartPadding;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    static {
        float fM6463getLeadingSpaceD9Ej5fM = BaselineButtonTokens.INSTANCE.m6463getLeadingSpaceD9Ej5fM();
        ButtonLeadingSpace = fM6463getLeadingSpaceD9Ej5fM;
        float fM6465getTrailingSpaceD9Ej5fM = BaselineButtonTokens.INSTANCE.m6465getTrailingSpaceD9Ej5fM();
        ButtonTrailingSpace = fM6465getTrailingSpaceD9Ej5fM;
        ButtonWithIconStartpadding = 16.0f;
        SmallStartPadding = ButtonSmallTokens.INSTANCE.m6485getLeadingSpaceD9Ej5fM();
        SmallEndPadding = ButtonSmallTokens.INSTANCE.m6487getTrailingSpaceD9Ej5fM();
        ButtonVerticalPadding = 8.0f;
        PaddingValues paddingValuesM2751PaddingValuesa9UjIt4 = PaddingKt.m2751PaddingValuesa9UjIt4(fM6463getLeadingSpaceD9Ej5fM, 8.0f, fM6465getTrailingSpaceD9Ej5fM, 8.0f);
        ContentPadding = paddingValuesM2751PaddingValuesa9UjIt4;
        ButtonWithIconContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 8.0f, fM6465getTrailingSpaceD9Ej5fM, 8.0f);
        TextButtonHorizontalPadding = 12.0f;
        TextButtonContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(12.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2707calculateTopPaddingD9Ej5fM(), 12.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2704calculateBottomPaddingD9Ej5fM());
        TextButtonWithIconHorizontalEndPadding = 16.0f;
        TextButtonWithIconContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(12.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2707calculateTopPaddingD9Ej5fM(), 16.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2704calculateBottomPaddingD9Ej5fM());
        MinWidth = 58.0f;
        ExtraSmallContainerHeight = ButtonXSmallTokens.INSTANCE.m6494getContainerHeightD9Ej5fM();
        MediumContainerHeight = ButtonMediumTokens.INSTANCE.m6476getContainerHeightD9Ej5fM();
        LargeContainerHeight = ButtonLargeTokens.INSTANCE.m6470getContainerHeightD9Ej5fM();
        ExtraLargeContainerHeight = ButtonXLargeTokens.INSTANCE.m6488getContainerHeightD9Ej5fM();
        IconSize = 18.0f;
        ExtraSmallIconSize = ButtonXSmallTokens.INSTANCE.m6496getIconSizeD9Ej5fM();
        SmallIconSize = ButtonSmallTokens.INSTANCE.m6484getIconSizeD9Ej5fM();
        MediumIconSize = ButtonMediumTokens.INSTANCE.m6478getIconSizeD9Ej5fM();
        LargeIconSize = ButtonLargeTokens.INSTANCE.m6472getIconSizeD9Ej5fM();
        ExtraLargeIconSize = ButtonXLargeTokens.INSTANCE.m6490getIconSizeD9Ej5fM();
        IconSpacing = ButtonSmallTokens.INSTANCE.m6483getIconLabelSpaceD9Ej5fM();
        ExtraSmallIconSpacing = 4.0f;
        MediumIconSpacing = ButtonMediumTokens.INSTANCE.m6477getIconLabelSpaceD9Ej5fM();
        LargeIconSpacing = ButtonLargeTokens.INSTANCE.m6471getIconLabelSpaceD9Ej5fM();
        ExtraLargeIconSpacing = ButtonXLargeTokens.INSTANCE.m6489getIconLabelSpaceD9Ej5fM();
        MediumLeadingPadding = ButtonMediumTokens.INSTANCE.m6479getLeadingSpaceD9Ej5fM();
        MediumTrailingPadding = ButtonMediumTokens.INSTANCE.m6481getTrailingSpaceD9Ej5fM();
        MediumVerticalPadding = 16.0f;
        IconMediumLeadingPadding = ButtonMediumTokens.INSTANCE.m6479getLeadingSpaceD9Ej5fM();
        IconMediumTrailingPadding = ButtonMediumTokens.INSTANCE.m6481getTrailingSpaceD9Ej5fM();
        LargeVerticalPadding = 32.0f;
        LargeLeadingPadding = ButtonLargeTokens.INSTANCE.m6473getLeadingSpaceD9Ej5fM();
        LargeTrailingPadding = ButtonLargeTokens.INSTANCE.m6475getTrailingSpaceD9Ej5fM();
        IconLargeLeadingPadding = ButtonLargeTokens.INSTANCE.m6473getLeadingSpaceD9Ej5fM();
        IconLargeTrailingPadding = ButtonLargeTokens.INSTANCE.m6475getTrailingSpaceD9Ej5fM();
    }

    private ButtonDefaults() {
    }

    /* renamed from: getIconSmallHorizontalPadding-D9Ej5fM, reason: not valid java name */
    private final float m4421getIconSmallHorizontalPaddingD9Ej5fM() {
        if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            return 12.0f;
        }
        return SmallStartPadding;
    }

    private final PaddingValues getLargeContentPadding(boolean z, boolean z2) {
        float f2 = z ? IconLargeLeadingPadding : LargeLeadingPadding;
        float f3 = LargeVerticalPadding;
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, z2 ? IconLargeTrailingPadding : LargeTrailingPadding, f3);
    }

    private final PaddingValues getMediumContentPadding(boolean z, boolean z2) {
        float f2 = z ? IconMediumLeadingPadding : MediumLeadingPadding;
        float f3 = MediumVerticalPadding;
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, z2 ? IconMediumTrailingPadding : MediumTrailingPadding, f3);
    }

    private final PaddingValues getSmallContentPadding(boolean z, boolean z2) {
        return PaddingKt.m2751PaddingValuesa9UjIt4(z ? m4421getIconSmallHorizontalPaddingD9Ej5fM() : SmallStartPadding, m4422getSmallVerticalPaddingD9Ej5fM(), z2 ? m4421getIconSmallHorizontalPaddingD9Ej5fM() : SmallEndPadding, m4422getSmallVerticalPaddingD9Ej5fM());
    }

    /* renamed from: getSmallVerticalPadding-D9Ej5fM, reason: not valid java name */
    private final float m4422getSmallVerticalPaddingD9Ej5fM() {
        return PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue() ? 8.0f : 10.0f;
    }

    public final ButtonColors buttonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1190)");
        }
        ButtonColors defaultButtonColors$material3 = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors$material3;
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m4423buttonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:1208)");
        }
        long j6 = j3;
        long j7 = j2;
        ButtonColors buttonColorsM4415copyjRlVdoo = getDefaultButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4415copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM4415copyjRlVdoo;
    }

    /* renamed from: buttonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m4424buttonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledButtonTokens.INSTANCE.m6740getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledButtonTokens.INSTANCE.m6744getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledButtonTokens.INSTANCE.m6742getFocusedContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledButtonTokens.INSTANCE.m6743getHoveredContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = FilledButtonTokens.INSTANCE.m6741getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i2, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:1429)");
        }
        float f8 = f6;
        float f9 = f4;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f9, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    /* renamed from: contentPaddingFor-0680j_4, reason: not valid java name */
    public final /* synthetic */ PaddingValues m4425contentPaddingFor0680j_4(float f2) {
        return Dp.m11163compareTo0680j_4(f2, m4445getMinHeightD9Ej5fM()) < 0 ? getExtraSmallContentPadding() : Dp.m11163compareTo0680j_4(f2, MediumContainerHeight) < 0 ? getSmallContentPadding() : Dp.m11163compareTo0680j_4(f2, LargeContainerHeight) < 0 ? getMediumContentPadding() : Dp.m11163compareTo0680j_4(f2, ExtraLargeContainerHeight) < 0 ? getLargeContentPadding() : getExtraLargeContentPadding();
    }

    /* renamed from: contentPaddingFor-8Feqmps, reason: not valid java name */
    public final PaddingValues m4426contentPaddingFor8Feqmps(float f2, boolean z, boolean z2) {
        return Dp.m11163compareTo0680j_4(f2, m4445getMinHeightD9Ej5fM()) < 0 ? getExtraSmallContentPadding() : Dp.m11163compareTo0680j_4(f2, MediumContainerHeight) < 0 ? getSmallContentPadding(z, z2) : Dp.m11163compareTo0680j_4(f2, LargeContainerHeight) < 0 ? getMediumContentPadding(z, z2) : Dp.m11163compareTo0680j_4(f2, ExtraLargeContainerHeight) < 0 ? getLargeContentPadding(z, z2) : getExtraLargeContentPadding();
    }

    public final ButtonColors elevatedButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:1235)");
        }
        ButtonColors defaultElevatedButtonColors$material3 = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultElevatedButtonColors$material3;
    }

    /* renamed from: elevatedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m4427elevatedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:1253)");
        }
        long j6 = j3;
        long j7 = j2;
        ButtonColors buttonColorsM4415copyjRlVdoo = getDefaultElevatedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4415copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM4415copyjRlVdoo;
    }

    /* renamed from: elevatedButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m4428elevatedButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = ElevatedButtonTokens.INSTANCE.m6658getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = ElevatedButtonTokens.INSTANCE.m6662getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = ElevatedButtonTokens.INSTANCE.m6660getFocusedContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = ElevatedButtonTokens.INSTANCE.m6661getHoveredContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = ElevatedButtonTokens.INSTANCE.m6659getDisabledContainerElevationD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i2, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:1456)");
        }
        float f8 = f6;
        float f9 = f4;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f9, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final ButtonColors filledTonalButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:1281)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3 = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalButtonColors$material3;
    }

    /* renamed from: filledTonalButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m4429filledTonalButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:1300)");
        }
        long j6 = j3;
        long j7 = j2;
        ButtonColors buttonColorsM4415copyjRlVdoo = getDefaultFilledTonalButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4415copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM4415copyjRlVdoo;
    }

    /* renamed from: filledTonalButtonElevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m4430filledTonalButtonElevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            f2 = FilledTonalButtonTokens.INSTANCE.m6758getContainerElevationD9Ej5fM();
        }
        if ((i3 & 2) != 0) {
            f3 = FilledTonalButtonTokens.INSTANCE.m6764getPressedContainerElevationD9Ej5fM();
        }
        if ((i3 & 4) != 0) {
            f4 = FilledTonalButtonTokens.INSTANCE.m6761getFocusContainerElevationD9Ej5fM();
        }
        if ((i3 & 8) != 0) {
            f5 = FilledTonalButtonTokens.INSTANCE.m6762getHoverContainerElevationD9Ej5fM();
        }
        float f7 = f5;
        if ((i3 & 16) != 0) {
            f6 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i2, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:1486)");
        }
        float f8 = f6;
        float f9 = f4;
        ButtonElevation buttonElevation = new ButtonElevation(f2, f3, f9, f7, f8, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevation;
    }

    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final ButtonColors getDefaultButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached$material3 = colorScheme.getDefaultButtonColorsCached$material3();
        if (defaultButtonColorsCached$material3 != null) {
            return defaultButtonColorsCached$material3;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledContainerColor()), FilledButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledButtonTokens.INSTANCE.getDisabledLabelTextColor()), FilledButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonShapes getDefaultButtonShapes$material3(Shapes shapes) {
        ButtonShapes defaultButtonShapesCached$material3 = shapes.getDefaultButtonShapesCached$material3();
        if (defaultButtonShapesCached$material3 != null) {
            return defaultButtonShapesCached$material3;
        }
        ButtonShapes buttonShapes = new ButtonShapes(ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getContainerShapeRound()), ShapesKt.fromToken(shapes, ButtonSmallTokens.INSTANCE.getPressedContainerShape()));
        shapes.setDefaultButtonShapesCached$material3(buttonShapes);
        return buttonShapes;
    }

    public final ButtonColors getDefaultElevatedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached$material3 = colorScheme.getDefaultElevatedButtonColorsCached$material3();
        if (defaultElevatedButtonColorsCached$material3 != null) {
            return defaultElevatedButtonColorsCached$material3;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledContainerColor()), ElevatedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, ElevatedButtonTokens.INSTANCE.getDisabledLabelTextColor()), ElevatedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultFilledTonalButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalButtonColorsCached$material3();
        if (defaultFilledTonalButtonColorsCached$material3 != null) {
            return defaultFilledTonalButtonColorsCached$material3;
        }
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalButtonTokens.INSTANCE.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultOutlinedButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached$material3 = colorScheme.getDefaultOutlinedButtonColorsCached$material3();
        if (defaultOutlinedButtonColorsCached$material3 != null) {
            return defaultOutlinedButtonColorsCached$material3;
        }
        ButtonColors buttonColors = new ButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getLabelTextColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedButtonTokens.INSTANCE.getDisabledLabelTextColor()), OutlinedButtonTokens.INSTANCE.getDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final ButtonColors getDefaultTextButtonColors$material3(ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached$material3 = colorScheme.getDefaultTextButtonColorsCached$material3();
        if (defaultTextButtonColorsCached$material3 != null) {
            return defaultTextButtonColorsCached$material3;
        }
        ButtonColors buttonColors = new ButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, ColorSchemeKeyTokens.Primary), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, TextButtonTokens.INSTANCE.getDisabledLabelColor()), TextButtonTokens.INSTANCE.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3(buttonColors);
        return buttonColors;
    }

    public final Shape getElevatedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:1145)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getExtraLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4431getExtraLargeContainerHeightD9Ej5fM() {
        return ExtraLargeContainerHeight;
    }

    public final PaddingValues getExtraLargeContentPadding() {
        return PaddingKt.m2751PaddingValuesa9UjIt4(ButtonXLargeTokens.INSTANCE.m6491getLeadingSpaceD9Ej5fM(), 48.0f, ButtonXLargeTokens.INSTANCE.m6493getTrailingSpaceD9Ej5fM(), 48.0f);
    }

    /* renamed from: getExtraLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4432getExtraLargeIconSizeD9Ej5fM() {
        return ExtraLargeIconSize;
    }

    /* renamed from: getExtraLargeIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4433getExtraLargeIconSpacingD9Ej5fM() {
        return ExtraLargeIconSpacing;
    }

    public final Shape getExtraLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339609659, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-extraLargePressedShape> (Button.kt:1137)");
        }
        Shape value = ShapesKt.getValue(ButtonXLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getExtraSmallContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4434getExtraSmallContainerHeightD9Ej5fM() {
        return ExtraSmallContainerHeight;
    }

    public final PaddingValues getExtraSmallContentPadding() {
        return PaddingKt.m2751PaddingValuesa9UjIt4(12.0f, 6.0f, 12.0f, 6.0f);
    }

    /* renamed from: getExtraSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4435getExtraSmallIconSizeD9Ej5fM() {
        return ExtraSmallIconSize;
    }

    /* renamed from: getExtraSmallIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4436getExtraSmallIconSpacingD9Ej5fM() {
        return ExtraSmallIconSpacing;
    }

    public final Shape getExtraSmallPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1220334917, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-extraSmallPressedShape> (Button.kt:1125)");
        }
        Shape value = ShapesKt.getValue(ButtonXSmallTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getFilledTonalShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:1149)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4437getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4438getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getLargeContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4439getLargeContainerHeightD9Ej5fM() {
        return LargeContainerHeight;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4440getLargeIconSizeD9Ej5fM() {
        return LargeIconSize;
    }

    /* renamed from: getLargeIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4441getLargeIconSpacingD9Ej5fM() {
        return LargeIconSpacing;
    }

    public final Shape getLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1613862463, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-largePressedShape> (Button.kt:1133)");
        }
        Shape value = ShapesKt.getValue(ButtonLargeTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMediumContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4442getMediumContainerHeightD9Ej5fM() {
        return MediumContainerHeight;
    }

    /* renamed from: getMediumIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4443getMediumIconSizeD9Ej5fM() {
        return MediumIconSize;
    }

    /* renamed from: getMediumIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m4444getMediumIconSpacingD9Ej5fM() {
        return MediumIconSpacing;
    }

    public final Shape getMediumPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(955096581, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-mediumPressedShape> (Button.kt:1129)");
        }
        Shape value = ShapesKt.getValue(ButtonMediumTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m4445getMinHeightD9Ej5fM() {
        if (PrecisionPointer.getShouldUsePrecisionPointerComponentSizing().getValue().booleanValue()) {
            return 36.0f;
        }
        return ButtonSmallTokens.INSTANCE.m6482getContainerHeightD9Ej5fM();
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m4446getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final BorderStroke getOutlinedButtonBorder(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:1504)");
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(ButtonSmallTokens.INSTANCE.m6486getOutlinedOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:1153)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1599095131, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-pressedShape> (Button.kt:1121)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:1141)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4447getSmallIconSizeD9Ej5fM() {
        return SmallIconSize;
    }

    public final Shape getSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-61545427, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-squareShape> (Button.kt:1117)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    public final Shape getTextShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i2, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:1157)");
        }
        Shape value = ShapesKt.getValue(ButtonSmallTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: iconSizeFor-5rwHm24, reason: not valid java name */
    public final float m4448iconSizeFor5rwHm24(float f2) {
        return Dp.m11163compareTo0680j_4(f2, m4445getMinHeightD9Ej5fM()) < 0 ? ExtraSmallIconSize : Dp.m11163compareTo0680j_4(f2, MediumContainerHeight) < 0 ? SmallIconSize : Dp.m11163compareTo0680j_4(f2, LargeContainerHeight) < 0 ? MediumIconSize : Dp.m11163compareTo0680j_4(f2, ExtraLargeContainerHeight) < 0 ? LargeIconSize : ExtraLargeIconSize;
    }

    /* renamed from: iconSpacingFor-5rwHm24, reason: not valid java name */
    public final float m4449iconSpacingFor5rwHm24(float f2) {
        return Dp.m11163compareTo0680j_4(f2, m4445getMinHeightD9Ej5fM()) < 0 ? ExtraSmallIconSpacing : Dp.m11163compareTo0680j_4(f2, MediumContainerHeight) < 0 ? IconSpacing : Dp.m11163compareTo0680j_4(f2, LargeContainerHeight) < 0 ? MediumIconSpacing : Dp.m11163compareTo0680j_4(f2, ExtraLargeContainerHeight) < 0 ? LargeIconSpacing : ExtraLargeIconSpacing;
    }

    public final BorderStroke outlinedButtonBorder(boolean z, Composer composer, int i2, int i3) {
        long jM8227copywmQWz5c$default;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-626854767, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonBorder (Button.kt:1516)");
        }
        int i4 = (i3 & 1) | (z ? 1 : 0);
        float fM6486getOutlinedOutlineWidthD9Ej5fM = ButtonSmallTokens.INSTANCE.m6486getOutlinedOutlineWidthD9Ej5fM();
        if (i4 != 0) {
            composer.startReplaceGroup(-112362814);
            jM8227copywmQWz5c$default = ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-112275208);
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedButtonTokens.INSTANCE.getOutlineColor(), composer, 6), OutlinedButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            composer.endReplaceGroup();
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(fM6486getOutlinedOutlineWidthD9Ej5fM, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    public final ButtonColors outlinedButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:1327)");
        }
        ButtonColors defaultOutlinedButtonColors$material3 = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedButtonColors$material3;
    }

    /* renamed from: outlinedButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m4450outlinedButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i2, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:1345)");
        }
        long j6 = j3;
        long j7 = j2;
        ButtonColors buttonColorsM4415copyjRlVdoo = getDefaultOutlinedButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4415copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM4415copyjRlVdoo;
    }

    public final ButtonShapes shapes(Shape shape, Shape shape2, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1854268625, i2, -1, "androidx.compose.material3.ButtonDefaults.shapes (Button.kt:1174)");
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            shape2 = null;
        }
        if (1 == i5) {
            shape = null;
        }
        ButtonShapes buttonShapesCopy = getDefaultButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonShapesCopy;
    }

    /* renamed from: shapesFor-8Feqmps, reason: not valid java name */
    public final ButtonShapes m4451shapesFor8Feqmps(float f2, Composer composer, int i2) {
        ButtonShapes buttonShapesShapes;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1262605294, i2, -1, "androidx.compose.material3.ButtonDefaults.shapesFor (Button.kt:1534)");
        }
        float f3 = ExtraSmallContainerHeight;
        float fM4445getMinHeightD9Ej5fM = m4445getMinHeightD9Ej5fM();
        float f4 = MediumContainerHeight;
        float f5 = LargeContainerHeight;
        float f6 = ExtraLargeContainerHeight;
        int i3 = (i2 >> 3) & 14;
        if (Dp.m11163compareTo0680j_4(f2, (f3 + fM4445getMinHeightD9Ej5fM) / 2.0f) <= 0) {
            int i4 = (i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY;
            composer.startReplaceGroup(-2112044758);
            buttonShapesShapes = shapes(getShape(composer, i3), getExtraSmallPressedShape(composer, i3), composer, i4, 0);
            composer.endReplaceGroup();
        } else if (Dp.m11163compareTo0680j_4(f2, (fM4445getMinHeightD9Ej5fM + f4) / 2.0f) <= 0) {
            composer.startReplaceGroup(-2112040810);
            buttonShapesShapes = shapes(composer, i3);
            composer.endReplaceGroup();
        } else {
            int i5 = (i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY;
            if (Dp.m11163compareTo0680j_4(f2, (f4 + f5) / 2.0f) <= 0) {
                composer.startReplaceGroup(-2112037914);
                buttonShapesShapes = shapes(getShape(composer, i3), getMediumPressedShape(composer, i3), composer, i5, 0);
                composer.endReplaceGroup();
            } else if (Dp.m11163compareTo0680j_4(f2, (f5 + f6) / 2.0f) <= 0) {
                composer.startReplaceGroup(-2112033531);
                buttonShapesShapes = shapes(getShape(composer, i3), getLargePressedShape(composer, i3), composer, i5, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-2112031094);
                buttonShapesShapes = shapes(getShape(composer, i3), getExtraLargePressedShape(composer, i3), composer, i5, 0);
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonShapesShapes;
    }

    public final ButtonColors textButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1370)");
        }
        ButtonColors defaultTextButtonColors$material3 = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextButtonColors$material3;
    }

    /* renamed from: textButtonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m4452textButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i2, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:1388)");
        }
        long j6 = j3;
        long j7 = j2;
        ButtonColors buttonColorsM4415copyjRlVdoo = getDefaultTextButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4415copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonColorsM4415copyjRlVdoo;
    }

    /* renamed from: textStyleFor-8Feqmps, reason: not valid java name */
    public final TextStyle m4453textStyleFor8Feqmps(float f2, Composer composer, int i2) {
        TextStyle headlineLarge;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2034166092, i2, -1, "androidx.compose.material3.ButtonDefaults.textStyleFor (Button.kt:1645)");
        }
        float f3 = MediumContainerHeight;
        float f4 = LargeContainerHeight;
        float f5 = ExtraLargeContainerHeight;
        if (Dp.m11163compareTo0680j_4(f2, f3) < 0) {
            composer.startReplaceGroup(-623485538);
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getLabelLarge();
            composer.endReplaceGroup();
        } else if (Dp.m11163compareTo0680j_4(f2, f4) < 0) {
            composer.startReplaceGroup(-623483041);
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getTitleMedium();
            composer.endReplaceGroup();
        } else if (Dp.m11163compareTo0680j_4(f2, f5) < 0) {
            composer.startReplaceGroup(-623480479);
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineSmall();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-623478591);
            headlineLarge = MaterialTheme.INSTANCE.getTypography(composer, 6).getHeadlineLarge();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return headlineLarge;
    }

    public final PaddingValues getLargeContentPadding() {
        float f2 = LargeLeadingPadding;
        float f3 = LargeVerticalPadding;
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, LargeTrailingPadding, f3);
    }

    public final PaddingValues getMediumContentPadding() {
        float f2 = MediumLeadingPadding;
        float f3 = MediumVerticalPadding;
        return PaddingKt.m2751PaddingValuesa9UjIt4(f2, f3, MediumTrailingPadding, f3);
    }

    public final PaddingValues getSmallContentPadding() {
        return PaddingKt.m2751PaddingValuesa9UjIt4(SmallStartPadding, m4422getSmallVerticalPaddingD9Ej5fM(), SmallEndPadding, m4422getSmallVerticalPaddingD9Ej5fM());
    }

    public final ButtonShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1554265461, i2, -1, "androidx.compose.material3.ButtonDefaults.shapes (Button.kt:1163)");
        }
        ButtonShapes defaultButtonShapes$material3 = getDefaultButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonShapes$material3;
    }
}
