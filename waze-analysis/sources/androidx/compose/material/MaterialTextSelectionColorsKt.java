package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m4115binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j2, long j3, long j4) {
        float f2 = DefaultSelectionBackgroundAlpha;
        float f3 = 0.2f;
        int i2 = 0;
        float f4 = 0.4f;
        while (i2 < 7) {
            long j5 = j2;
            long j6 = j3;
            long j7 = j4;
            float fM4117calculateContrastRationb2GgbA = (m4117calculateContrastRationb2GgbA(j5, f4, j6, j7) / DesiredContrastRatio) - 1.0f;
            if (fM4117calculateContrastRationb2GgbA >= 0.0f && fM4117calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (fM4117calculateContrastRationb2GgbA < 0.0f) {
                f2 = f4;
            }
            if (fM4117calculateContrastRationb2GgbA >= 0.0f) {
                f3 = f4;
            }
            i2++;
            f4 = (f2 + f3) / 2.0f;
            j2 = j5;
            j3 = j6;
            j4 = j7;
        }
        return f4;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m4116calculateContrastRatioOWjLjI(long j2, long j3) {
        float fM8280luminance8_81llA = ColorKt.m8280luminance8_81llA(j2) + 0.05f;
        float fM8280luminance8_81llA2 = ColorKt.m8280luminance8_81llA(j3) + 0.05f;
        return Math.max(fM8280luminance8_81llA, fM8280luminance8_81llA2) / Math.min(fM8280luminance8_81llA, fM8280luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m4117calculateContrastRationb2GgbA(long j2, float f2, long j3, long j4) {
        long jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(j2, f2, 0.0f, 0.0f, 0.0f, 14, null), j4);
        return m4116calculateContrastRatioOWjLjI(ColorKt.m8273compositeOverOWjLjI(j3, jM8273compositeOverOWjLjI), jM8273compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m4118calculateSelectionBackgroundColorysEtTa8(long j2, long j3, long j4) {
        return Color.m8227copywmQWz5c$default(j2, m4117calculateContrastRationb2GgbA(j2, DefaultSelectionBackgroundAlpha, j3, j4) >= DesiredContrastRatio ? DefaultSelectionBackgroundAlpha : m4117calculateContrastRationb2GgbA(j2, 0.2f, j3, j4) < DesiredContrastRatio ? 0.2f : m4115binarySearchForAccessibleSelectionColorAlphaysEtTa8(j2, j3, j4), 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final TextSelectionColors rememberTextSelectionColors(Colors colors, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i2, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jM4027getPrimary0d7_KjU = colors.m4027getPrimary0d7_KjU();
        long jM4020getBackground0d7_KjU = colors.m4020getBackground0d7_KjU();
        composer.startReplaceGroup(-2060762245);
        long jM4044contentColorFor4WTKRHQ = ColorsKt.m4044contentColorFor4WTKRHQ(colors, jM4020getBackground0d7_KjU);
        if (jM4044contentColorFor4WTKRHQ == 16) {
            jM4044contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        }
        composer.endReplaceGroup();
        long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(jM4044contentColorFor4WTKRHQ, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean zChanged = composer.changed(jM4027getPrimary0d7_KjU) | composer.changed(jM4020getBackground0d7_KjU) | composer.changed(jM8227copywmQWz5c$default);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(colors.m4027getPrimary0d7_KjU(), m4118calculateSelectionBackgroundColorysEtTa8(jM4027getPrimary0d7_KjU, jM8227copywmQWz5c$default, jM4020getBackground0d7_KjU), null);
            composer.updateRememberedValue(textSelectionColors);
            objRememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textSelectionColors2;
    }
}
