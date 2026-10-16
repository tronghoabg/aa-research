package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class TimePickerDefaults {
    public static final int $stable = 0;
    public static final TimePickerDefaults INSTANCE = new TimePickerDefaults();

    private TimePickerDefaults() {
    }

    public final TimePickerColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2085808058, i2, -1, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:300)");
        }
        TimePickerColors defaultTimePickerColors$material3 = getDefaultTimePickerColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerColors$material3;
    }

    /* renamed from: colors-u3YEpmA, reason: not valid java name */
    public final TimePickerColors m5842colorsu3YEpmA(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, Composer composer, int i2, int i3, int i4) {
        long j16;
        long j17;
        long jM8264getUnspecified0d7_KjU = (i4 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i4 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i4 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i4 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i4 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i4 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i4 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        long jM8264getUnspecified0d7_KjU8 = (i4 & 128) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j9;
        long j18 = jM8264getUnspecified0d7_KjU;
        long jM8264getUnspecified0d7_KjU9 = (i4 & 256) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j10;
        long jM8264getUnspecified0d7_KjU10 = (i4 & 512) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j11;
        long jM8264getUnspecified0d7_KjU11 = (i4 & 1024) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j12;
        long jM8264getUnspecified0d7_KjU12 = (i4 & 2048) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j13;
        long jM8264getUnspecified0d7_KjU13 = (i4 & 4096) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j14;
        long jM8264getUnspecified0d7_KjU14 = (i4 & 8192) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j15;
        if (ComposerKt.isTraceInProgress()) {
            j16 = jM8264getUnspecified0d7_KjU13;
            j17 = jM8264getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(-646352288, i2, i3, "androidx.compose.material3.TimePickerDefaults.colors (TimePicker.kt:347)");
        } else {
            j16 = jM8264getUnspecified0d7_KjU13;
            j17 = jM8264getUnspecified0d7_KjU2;
        }
        TimePickerColors timePickerColorsM5823copydVHXu7A = getDefaultTimePickerColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5823copydVHXu7A(j18, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, j17, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU7, jM8264getUnspecified0d7_KjU8, jM8264getUnspecified0d7_KjU9, jM8264getUnspecified0d7_KjU10, jM8264getUnspecified0d7_KjU11, jM8264getUnspecified0d7_KjU12, j16, jM8264getUnspecified0d7_KjU14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return timePickerColorsM5823copydVHXu7A;
    }

    public final TimePickerColors getDefaultTimePickerColors$material3(ColorScheme colorScheme) {
        TimePickerColors defaultTimePickerColorsCached$material3 = colorScheme.getDefaultTimePickerColorsCached$material3();
        if (defaultTimePickerColorsCached$material3 != null) {
            return defaultTimePickerColorsCached$material3;
        }
        TimePickerColors timePickerColors = new TimePickerColors(ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialSelectorHandleContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getClockDialUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedContainerColor()), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getPeriodSelectorUnselectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorSelectedLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, TimePickerTokens.INSTANCE.getTimeSelectorUnselectedLabelTextColor()), null);
        colorScheme.setDefaultTimePickerColorsCached$material3(timePickerColors);
        return timePickerColors;
    }

    /* renamed from: layoutType-sDNSZnc, reason: not valid java name */
    public final int m5843layoutTypesDNSZnc(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(517161502, i2, -1, "androidx.compose.material3.TimePickerDefaults.layoutType (TimePicker.kt:397)");
        }
        int defaultTimePickerLayoutType = TimePickerKt.getDefaultTimePickerLayoutType(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTimePickerLayoutType;
    }
}
