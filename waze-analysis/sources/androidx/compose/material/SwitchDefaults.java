package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m4228colorsSQMK_m0(long j2, long j3, float f2, long j4, long j5, float f3, long j6, long j7, long j8, long j9, Composer composer, int i2, int i3, int i4) {
        long j10;
        long j11;
        long jM8273compositeOverOWjLjI;
        long j12;
        float f4;
        long j13;
        long jM8273compositeOverOWjLjI2;
        long j14;
        int i5;
        long jM8273compositeOverOWjLjI3;
        long jM4030getSecondaryVariant0d7_KjU = (i4 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4030getSecondaryVariant0d7_KjU() : j2;
        long j15 = (i4 & 2) != 0 ? jM4030getSecondaryVariant0d7_KjU : j3;
        float f5 = (i4 & 4) != 0 ? 0.54f : f2;
        long jM4031getSurface0d7_KjU = (i4 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU() : j4;
        long jM4026getOnSurface0d7_KjU = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU() : j5;
        float f6 = (i4 & 32) != 0 ? 0.38f : f3;
        if ((i4 & 64) != 0) {
            long j16 = jM4030getSecondaryVariant0d7_KjU;
            long jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j16, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j10 = j16;
            j11 = j15;
            jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(jM8227copywmQWz5c$default, MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU());
        } else {
            j10 = jM4030getSecondaryVariant0d7_KjU;
            j11 = j15;
            jM8273compositeOverOWjLjI = j6;
        }
        if ((i4 & 128) != 0) {
            j12 = j11;
            f4 = f5;
            j13 = jM8273compositeOverOWjLjI;
            jM8273compositeOverOWjLjI2 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU());
        } else {
            j12 = j11;
            f4 = f5;
            j13 = jM8273compositeOverOWjLjI;
            jM8273compositeOverOWjLjI2 = j7;
        }
        if ((i4 & 256) != 0) {
            i5 = 6;
            j14 = jM8273compositeOverOWjLjI2;
            jM8273compositeOverOWjLjI3 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(jM4031getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m4031getSurface0d7_KjU());
        } else {
            j14 = jM8273compositeOverOWjLjI2;
            i5 = 6;
            jM8273compositeOverOWjLjI3 = j8;
        }
        long jM8273compositeOverOWjLjI4 = (i4 & 512) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(jM4026getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i5), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, i5).m4031getSurface0d7_KjU()) : j9;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i2, i3, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:341)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j10, Color.m8227copywmQWz5c$default(j12, f4, 0.0f, 0.0f, 0.0f, 14, null), jM4031getSurface0d7_KjU, Color.m8227copywmQWz5c$default(jM4026getOnSurface0d7_KjU, f6, 0.0f, 0.0f, 0.0f, 14, null), j13, Color.m8227copywmQWz5c$default(j14, f4, 0.0f, 0.0f, 0.0f, 14, null), jM8273compositeOverOWjLjI3, Color.m8227copywmQWz5c$default(jM8273compositeOverOWjLjI4, f6, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors;
    }
}
