package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m4002colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long j7;
        long jM8227copywmQWz5c$default;
        long jM4029getSecondary0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4029getSecondary0d7_KjU() : j2;
        long jM8227copywmQWz5c$default2 = (i3 & 2) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM4031getSurface0d7_KjU = (i3 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j4;
        long jM8227copywmQWz5c$default3 = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if ((i3 & 16) != 0) {
            long j8 = jM4029getSecondary0d7_KjU;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j7 = j8;
        } else {
            j7 = jM4029getSecondary0d7_KjU;
            jM8227copywmQWz5c$default = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i2, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:225)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(j7)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(jM8227copywmQWz5c$default2)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(jM4031getSurface0d7_KjU)) || (i2 & 384) == 256) | ((((i2 & 7168) ^ DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) > 2048 && composer.changed(jM8227copywmQWz5c$default3)) || (i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 2048) | ((((57344 & i2) ^ 24576) > 16384 && composer.changed(jM8227copywmQWz5c$default)) || (i2 & 24576) == 16384);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.Companion.getEmpty()) {
            long j9 = j7;
            long j10 = jM8227copywmQWz5c$default3;
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(jM4031getSurface0d7_KjU, Color.m8227copywmQWz5c$default(jM4031getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j9, Color.m8227copywmQWz5c$default(j9, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j10, Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default3, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM8227copywmQWz5c$default, j9, jM8227copywmQWz5c$default2, jM8227copywmQWz5c$default3, jM8227copywmQWz5c$default, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            objRememberedValue = defaultCheckboxColors;
        }
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors2;
    }
}
