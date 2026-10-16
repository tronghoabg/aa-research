package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final PaddingValues ContentPadding;
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float ButtonHorizontalPadding = 16.0f;
    private static final float ButtonVerticalPadding = 8.0f;

    static {
        PaddingValues paddingValuesM2751PaddingValuesa9UjIt4 = PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 8.0f, 16.0f, 8.0f);
        ContentPadding = paddingValuesM2751PaddingValuesa9UjIt4;
        MinWidth = 64.0f;
        MinHeight = 36.0f;
        IconSize = 18.0f;
        IconSpacing = 8.0f;
        OutlinedBorderSize = 1.0f;
        TextButtonHorizontalPadding = 8.0f;
        TextButtonContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(8.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2707calculateTopPaddingD9Ej5fM(), 8.0f, paddingValuesM2751PaddingValuesa9UjIt4.mo2704calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m3989buttonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long jM4027getPrimary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j2;
        long jM4045contentColorForek8zF_U = (i3 & 2) != 0 ? ColorsKt.m4045contentColorForek8zF_U(jM4027getPrimary0d7_KjU, composer, i2 & 14) : j3;
        long jM8273compositeOverOWjLjI = (i3 & 4) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i2, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:412)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM4027getPrimary0d7_KjU, jM4045contentColorForek8zF_U, jM8273compositeOverOWjLjI, jM8227copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m3990elevationR_JCAzs(float f2, float f3, float f4, float f5, float f6, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i2, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:374)");
        }
        boolean z = true;
        if (1 == (i3 & 1)) {
            f2 = 2.0f;
        }
        float f7 = f2;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.changed(f7)) || (i2 & 6) == 4;
        if ((i3 & 2) != 0) {
            f3 = 8.0f;
        }
        float f8 = f3;
        boolean z3 = (((i2 & 112) ^ 48) > 32 && composer.changed(f8)) || (i2 & 48) == 32;
        if ((i3 & 4) != 0) {
            f4 = 0.0f;
        }
        float f9 = f4;
        boolean z4 = z2 | z3;
        boolean z5 = (((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(f9)) || (i2 & 384) == 256;
        float f10 = (i3 & 8) != 0 ? 4.0f : f5;
        boolean z6 = z4 | z5;
        boolean z7 = (((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(f10)) || (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048;
        float f11 = (i3 & 16) != 0 ? 4.0f : f6;
        boolean z8 = z6 | z7;
        if ((((57344 & i2) ^ 24576) <= 16384 || !composer.changed(f11)) && (i2 & 24576) != 16384) {
            z = false;
        }
        boolean z9 = z8 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z9 || objRememberedValue == Composer.Companion.getEmpty()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f7, f8, f9, f10, f11, null);
            composer.updateRememberedValue(defaultButtonElevation);
            objRememberedValue = defaultButtonElevation;
        }
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonElevation2;
    }

    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m3991elevationyajeYGU(float f2, float f3, float f4, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i2, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:347)");
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        float f5 = (i3 & 4) != 0 ? 0.0f : f4;
        float f6 = i4 != 0 ? 8.0f : f3;
        if (1 == i5) {
            f2 = 2.0f;
        }
        ButtonElevation buttonElevationM3990elevationR_JCAzs = m3990elevationR_JCAzs(f2, f6, f5, 4.0f, 4.0f, composer, (i2 & 14) | 27648 | (i2 & 112) | (i2 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i2 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return buttonElevationM3990elevationR_JCAzs;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3992getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m3993getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m3994getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m3995getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    public final BorderStroke getOutlinedBorder(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i2, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:473)");
        }
        BorderStroke borderStrokeM1998BorderStrokecXLIe8U = BorderStrokeKt.m1998BorderStrokecXLIe8U(OutlinedBorderSize, Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStrokeM1998BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m3996getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m3997outlinedButtonColorsRGew2ao(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jM4031getSurface0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j2;
        long jM4027getPrimary0d7_KjU = (i3 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j3;
        long jM8227copywmQWz5c$default = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i2, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:434)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM4031getSurface0d7_KjU, jM4027getPrimary0d7_KjU, jM4031getSurface0d7_KjU, jM8227copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m3998textButtonColorsRGew2ao(long j2, long j3, long j4, Composer composer, int i2, int i3) {
        long jM8263getTransparent0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j2;
        long jM4027getPrimary0d7_KjU = (i3 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j3;
        long jM8227copywmQWz5c$default = (i3 & 4) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i2, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:456)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM8263getTransparent0d7_KjU, jM4027getPrimary0d7_KjU, jM8263getTransparent0d7_KjU, jM8227copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }
}
