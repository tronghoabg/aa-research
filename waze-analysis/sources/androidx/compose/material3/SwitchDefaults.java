package androidx.compose.material3;

import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();
    private static final float IconSize = 16.0f;

    private SwitchDefaults() {
    }

    public final SwitchColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(435552781, i2, -1, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:340)");
        }
        SwitchColors defaultSwitchColors$material3 = getDefaultSwitchColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors$material3;
    }

    /* renamed from: colors-V1nXRL4, reason: not valid java name */
    public final SwitchColors m5701colorsV1nXRL4(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, Composer composer, int i2, int i3, int i4) {
        long j18;
        long j19;
        long jM8273compositeOverOWjLjI;
        long j20;
        long jM8273compositeOverOWjLjI2;
        long j21;
        long j22;
        long jM8273compositeOverOWjLjI3;
        long j23;
        int i5;
        long jM8273compositeOverOWjLjI4;
        long j24;
        long jM8273compositeOverOWjLjI5;
        long j25;
        long jM8273compositeOverOWjLjI6;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedHandleColor(), composer, 6) : j2;
        long value2 = (i4 & 2) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedTrackColor(), composer, 6) : j3;
        long jM8263getTransparent0d7_KjU = (i4 & 4) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j4;
        long value3 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getSelectedIconColor(), composer, 6) : j5;
        long value4 = (i4 & 16) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedHandleColor(), composer, 6) : j6;
        long value5 = (i4 & 32) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedTrackColor(), composer, 6) : j7;
        long value6 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor(), composer, 6) : j8;
        long value7 = (i4 & 128) != 0 ? ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getUnselectedIconColor(), composer, 6) : j9;
        if ((i4 & 256) != 0) {
            j18 = value;
            j19 = value2;
            jM8273compositeOverOWjLjI = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedHandleColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU());
        } else {
            j18 = value;
            j19 = value2;
            jM8273compositeOverOWjLjI = j10;
        }
        if ((i4 & 512) != 0) {
            j20 = jM8273compositeOverOWjLjI;
            jM8273compositeOverOWjLjI2 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedTrackColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU());
        } else {
            j20 = jM8273compositeOverOWjLjI;
            jM8273compositeOverOWjLjI2 = j11;
        }
        long jM8263getTransparent0d7_KjU2 = (i4 & 1024) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j12;
        if ((i4 & 2048) != 0) {
            j21 = jM8273compositeOverOWjLjI2;
            j22 = jM8263getTransparent0d7_KjU;
            jM8273compositeOverOWjLjI3 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledSelectedIconColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU());
        } else {
            j21 = jM8273compositeOverOWjLjI2;
            j22 = jM8263getTransparent0d7_KjU;
            jM8273compositeOverOWjLjI3 = j13;
        }
        if ((i4 & 4096) != 0) {
            i5 = 6;
            j23 = jM8273compositeOverOWjLjI3;
            jM8273compositeOverOWjLjI4 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor(), composer, 6), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m4577getSurface0d7_KjU());
        } else {
            j23 = jM8273compositeOverOWjLjI3;
            i5 = 6;
            jM8273compositeOverOWjLjI4 = j14;
        }
        if ((i4 & 8192) != 0) {
            j24 = jM8273compositeOverOWjLjI4;
            jM8273compositeOverOWjLjI5 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor(), composer, i5), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i5).m4577getSurface0d7_KjU());
        } else {
            j24 = jM8273compositeOverOWjLjI4;
            jM8273compositeOverOWjLjI5 = j15;
        }
        if ((i4 & 16384) != 0) {
            j25 = jM8273compositeOverOWjLjI5;
            jM8273compositeOverOWjLjI6 = ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor(), composer, i5), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i5).m4577getSurface0d7_KjU());
        } else {
            j25 = jM8273compositeOverOWjLjI5;
            jM8273compositeOverOWjLjI6 = j16;
        }
        long jM8273compositeOverOWjLjI7 = (i4 & 32768) != 0 ? ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(SwitchTokens.INSTANCE.getDisabledUnselectedIconColor(), composer, i5), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, i5).m4577getSurface0d7_KjU()) : j17;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1937926421, i2, i3, "androidx.compose.material3.SwitchDefaults.colors (Switch.kt:403)");
        }
        long j26 = j18;
        SwitchColors switchColors = new SwitchColors(j26, j19, j22, value3, value4, value5, value6, value7, j20, j21, jM8263getTransparent0d7_KjU2, j23, j24, j25, jM8273compositeOverOWjLjI6, jM8273compositeOverOWjLjI7, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return switchColors;
    }

    public final SwitchColors getDefaultSwitchColors$material3(ColorScheme colorScheme) {
        SwitchColors defaultSwitchColorsCached$material3 = colorScheme.getDefaultSwitchColorsCached$material3();
        if (defaultSwitchColorsCached$material3 != null) {
            return defaultSwitchColorsCached$material3;
        }
        SwitchColors switchColors = new SwitchColors(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedTrackColor()), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getSelectedIconColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedHandleColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedTrackColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedFocusTrackOutlineColor()), ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getUnselectedIconColor()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedHandleColor()), SwitchTokens.INSTANCE.getDisabledSelectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), Color.Companion.m8263getTransparent0d7_KjU(), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledSelectedIconColor()), SwitchTokens.INSTANCE.getDisabledSelectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedHandleColor()), SwitchTokens.INSTANCE.getDisabledUnselectedHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedTrackColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedTrackOutlineColor()), SwitchTokens.INSTANCE.getDisabledTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), ColorKt.m8273compositeOverOWjLjI(Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, SwitchTokens.INSTANCE.getDisabledUnselectedIconColor()), SwitchTokens.INSTANCE.getDisabledUnselectedIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m4577getSurface0d7_KjU()), null);
        colorScheme.setDefaultSwitchColorsCached$material3(switchColors);
        return switchColors;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5702getIconSizeD9Ej5fM() {
        return IconSize;
    }
}
