package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();
    private static final float StrokeWidth = 2.0f;

    private CheckboxDefaults() {
    }

    public final CheckboxColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-9530498, i2, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:334)");
        }
        CheckboxColors defaultCheckboxColors$material3 = getDefaultCheckboxColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors$material3;
    }

    /* renamed from: colors-5tl4gsc, reason: not valid java name */
    public final CheckboxColors m4489colors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i2, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:360)");
        }
        CheckboxColors checkboxColorsM4474copydaRQuJA = getDefaultCheckboxColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4474copydaRQuJA(jM8264getUnspecified0d7_KjU3, Color.Companion.m8263getTransparent0d7_KjU(), jM8264getUnspecified0d7_KjU, Color.Companion.m8263getTransparent0d7_KjU(), jM8264getUnspecified0d7_KjU4, Color.Companion.m8263getTransparent0d7_KjU(), jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColorsM4474copydaRQuJA;
    }

    /* renamed from: colors-kwJvTHA, reason: not valid java name */
    public final CheckboxColors m4490colorskwJvTHA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
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
            ComposerKt.traceEventStart(1465157505, i2, i3, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:414)");
        } else {
            j15 = jM8264getUnspecified0d7_KjU12;
            j16 = jM8264getUnspecified0d7_KjU2;
        }
        CheckboxColors checkboxColorsM4474copydaRQuJA = getDefaultCheckboxColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4474copydaRQuJA(j17, j16, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, jM8264getUnspecified0d7_KjU11, j15, jM8264getUnspecified0d7_KjU13, jM8264getUnspecified0d7_KjU3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return checkboxColorsM4474copydaRQuJA;
    }

    public final CheckboxColors getDefaultCheckboxColors$material3(ColorScheme colorScheme) {
        CheckboxColors defaultCheckboxColorsCached$material3 = colorScheme.getDefaultCheckboxColorsCached$material3();
        if (defaultCheckboxColorsCached$material3 != null) {
            return defaultCheckboxColorsCached$material3;
        }
        CheckboxColors checkboxColors = new CheckboxColors(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedIconColor()), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedContainerColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), CheckboxTokens.INSTANCE.getSelectedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), CheckboxTokens.INSTANCE.getSelectedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getUnselectedOutlineColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), CheckboxTokens.INSTANCE.getSelectedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), CheckboxTokens.INSTANCE.getUnselectedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), CheckboxTokens.INSTANCE.getSelectedDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, CheckboxTokens.INSTANCE.getSelectedDisabledIconColor()), null);
        colorScheme.setDefaultCheckboxColorsCached$material3(checkboxColors);
        return checkboxColors;
    }

    /* renamed from: getStrokeWidth-D9Ej5fM, reason: not valid java name */
    public final float m4491getStrokeWidthD9Ej5fM() {
        return StrokeWidth;
    }
}
