package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final NavigationBarItemDefaults INSTANCE = new NavigationBarItemDefaults();

    private NavigationBarItemDefaults() {
    }

    public final NavigationBarItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018883954, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:350)");
        }
        NavigationBarItemColors defaultNavigationBarItemColors$material3 = getDefaultNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultNavigationBarItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationBarItemColors m5256colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
        long j9;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        long jM8264getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j8;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-1618564327, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:375)");
        } else {
            j9 = jM8264getUnspecified0d7_KjU;
        }
        NavigationBarItemColors navigationBarItemColorsM5245copy4JmcsL4 = getDefaultNavigationBarItemColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5245copy4JmcsL4(j9, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM8264getUnspecified0d7_KjU6, jM8264getUnspecified0d7_KjU7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColorsM5245copy4JmcsL4;
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ NavigationBarItemColors m5257colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIconColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor(), composer, 6) : j3;
        long value3 = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor(), composer, 6) : j4;
        long value4 = (i3 & 8) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveIconColor(), composer, 6) : j5;
        long value5 = (i3 & 16) != 0 ? ColorSchemeKt.getValue(NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor(), composer, 6) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-213647161, i2, -1, "androidx.compose.material3.NavigationBarItemDefaults.colors (NavigationBar.kt:418)");
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(value, value2, value3, value4, value5, Color.m8227copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarItemColors;
    }

    public final NavigationBarItemColors getDefaultNavigationBarItemColors$material3(ColorScheme colorScheme) {
        NavigationBarItemColors defaultNavigationBarItemColorsCached$material3 = colorScheme.getDefaultNavigationBarItemColorsCached$material3();
        if (defaultNavigationBarItemColorsCached$material3 != null) {
            return defaultNavigationBarItemColorsCached$material3;
        }
        NavigationBarItemColors navigationBarItemColors = new NavigationBarItemColors(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemActiveIconColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemInactiveIconColor()), ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationBarItemColorsCached$material3(navigationBarItemColors);
        return navigationBarItemColors;
    }
}
