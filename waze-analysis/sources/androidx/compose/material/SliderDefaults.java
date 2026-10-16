package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m4180colorsq0g_0yA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, Composer composer, int i2, int i3, int i4) {
        long j12;
        long jM8227copywmQWz5c$default;
        long j13;
        long jM8227copywmQWz5c$default2;
        long j14;
        long jM8227copywmQWz5c$default3;
        long j15;
        long jM8227copywmQWz5c$default4;
        long j16;
        long jM8227copywmQWz5c$default5;
        long j17;
        long jM4027getPrimary0d7_KjU = (i4 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j2;
        long jM8273compositeOverOWjLjI = (i4 & 2) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU()) : j3;
        long jM4027getPrimary0d7_KjU2 = (i4 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j4;
        if ((i4 & 8) != 0) {
            long j18 = jM4027getPrimary0d7_KjU2;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j18, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            j12 = j18;
        } else {
            j12 = jM4027getPrimary0d7_KjU2;
            jM8227copywmQWz5c$default = j5;
        }
        long jM8227copywmQWz5c$default6 = (i4 & 16) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        if ((i4 & 32) != 0) {
            long j19 = jM8227copywmQWz5c$default6;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j19, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j13 = j19;
        } else {
            j13 = jM8227copywmQWz5c$default6;
            jM8227copywmQWz5c$default2 = j7;
        }
        long jM8227copywmQWz5c$default7 = (i4 & 64) != 0 ? Color.m8227copywmQWz5c$default(ColorsKt.m4045contentColorForek8zF_U(j12, composer, (i2 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if ((i4 & 128) != 0) {
            long j20 = j12;
            jM8227copywmQWz5c$default3 = Color.m8227copywmQWz5c$default(j20, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j14 = j20;
        } else {
            j14 = j12;
            jM8227copywmQWz5c$default3 = j9;
        }
        if ((i4 & 256) != 0) {
            long j21 = jM8227copywmQWz5c$default7;
            jM8227copywmQWz5c$default4 = Color.m8227copywmQWz5c$default(j21, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j15 = j21;
        } else {
            j15 = jM8227copywmQWz5c$default7;
            jM8227copywmQWz5c$default4 = j10;
        }
        if ((i4 & 512) != 0) {
            long j22 = jM8227copywmQWz5c$default2;
            jM8227copywmQWz5c$default5 = Color.m8227copywmQWz5c$default(j22, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j22;
        } else {
            j16 = jM8227copywmQWz5c$default2;
            jM8227copywmQWz5c$default5 = j11;
        }
        if (ComposerKt.isTraceInProgress()) {
            j17 = jM8227copywmQWz5c$default5;
            ComposerKt.traceEventStart(436017687, i2, i3, "androidx.compose.material.SliderDefaults.colors (Slider.kt:605)");
        } else {
            j17 = jM8227copywmQWz5c$default5;
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(jM4027getPrimary0d7_KjU, jM8273compositeOverOWjLjI, j14, jM8227copywmQWz5c$default, j13, j16, j15, jM8227copywmQWz5c$default3, jM8227copywmQWz5c$default4, j17, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors;
    }
}
