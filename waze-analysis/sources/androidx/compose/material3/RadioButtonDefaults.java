package androidx.compose.material3;

import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    public final RadioButtonColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1191566130, i2, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:142)");
        }
        RadioButtonColors defaultRadioButtonColors$material3 = getDefaultRadioButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRadioButtonColors$material3;
    }

    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final RadioButtonColors m5399colorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
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
            ComposerKt.traceEventStart(-351083046, i2, -1, "androidx.compose.material3.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        long j6 = j3;
        long j7 = j2;
        RadioButtonColors radioButtonColorsM5394copyjRlVdoo = getDefaultRadioButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5394copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return radioButtonColorsM5394copyjRlVdoo;
    }

    public final RadioButtonColors getDefaultRadioButtonColors$material3(ColorScheme colorScheme) {
        RadioButtonColors defaultRadioButtonColorsCached$material3 = colorScheme.getDefaultRadioButtonColorsCached$material3();
        if (defaultRadioButtonColorsCached$material3 != null) {
            return defaultRadioButtonColorsCached$material3;
        }
        RadioButtonColors radioButtonColors = new RadioButtonColors(ColorSchemeKt.fromToken(colorScheme, RadioButtonTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, RadioButtonTokens.INSTANCE.getUnselectedIconColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, RadioButtonTokens.INSTANCE.getDisabledSelectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, RadioButtonTokens.INSTANCE.getDisabledUnselectedIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultRadioButtonColorsCached$material3(radioButtonColors);
        return radioButtonColors;
    }
}
