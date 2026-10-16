package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationRailColorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final NavigationRailItemDefaults INSTANCE = new NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    public final NavigationRailItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2014332261, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:355)");
        }
        NavigationRailItemColors defaultNavigationRailItemColors$material3 = getDefaultNavigationRailItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationRailItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationRailItemColors m5332colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
        long j9;
        long jM8227copywmQWz5c$default;
        long j10;
        long jM8227copywmQWz5c$default2;
        long j11;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIcon(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveLabelText(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIndicator(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveIcon(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText(), composer, 6) : j6;
        if ((i3 & 32) != 0) {
            long j12 = value4;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j9 = j12;
        } else {
            j9 = value4;
            jM8227copywmQWz5c$default = j7;
        }
        if ((i3 & 64) != 0) {
            long j13 = value5;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j13, 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            j10 = j13;
        } else {
            j10 = value5;
            jM8227copywmQWz5c$default2 = j8;
        }
        if (ComposerKt.isTraceInProgress()) {
            j11 = value;
            ComposerKt.traceEventStart(-2104358508, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:380)");
        } else {
            j11 = value;
        }
        NavigationRailItemColors navigationRailItemColorsM5321copy4JmcsL4 = getDefaultNavigationRailItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5321copy4JmcsL4(j11, value2, value3, j9, j10, jM8227copywmQWz5c$default, jM8227copywmQWz5c$default2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColorsM5321copy4JmcsL4;
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationRailItemColors m5333colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIcon(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveLabelText(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemActiveIndicator(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveIcon(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1621601574, i2, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:424)");
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(value, value2, value3, value4, value5, Color.m8227copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors;
    }

    public final NavigationRailItemColors getDefaultNavigationRailItemColors$material3(ColorScheme colorScheme) {
        NavigationRailItemColors defaultNavigationRailItemColorsCached$material3 = colorScheme.getDefaultNavigationRailItemColorsCached$material3();
        if (defaultNavigationRailItemColorsCached$material3 != null) {
            return defaultNavigationRailItemColorsCached$material3;
        }
        NavigationRailItemColors navigationRailItemColors = new NavigationRailItemColors(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveIcon()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveLabelText()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveIndicator()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationRailItemColorsCached$material3(navigationRailItemColors);
        return navigationRailItemColors;
    }
}
