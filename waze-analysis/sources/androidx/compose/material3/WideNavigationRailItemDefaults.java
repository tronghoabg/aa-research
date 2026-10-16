package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.NavigationItemIconPosition;
import androidx.compose.material3.tokens.NavigationRailColorTokens;
import androidx.compose.material3.tokens.NavigationRailHorizontalItemTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final WideNavigationRailItemDefaults INSTANCE = new WideNavigationRailItemDefaults();
    private static final PaddingValues IndicatorCollapsedPadding = PaddingKt.m2749PaddingValuesYgX7TsA(WideNavigationRailKt.ItemTopIconIndicatorHorizontalPadding, WideNavigationRailKt.ItemTopIconIndicatorVerticalPadding);
    private static final PaddingValues IndicatorExpandedPadding = PaddingKt.m2749PaddingValuesYgX7TsA(NavigationRailHorizontalItemTokens.INSTANCE.m6891getFullWidthLeadingSpaceD9Ej5fM(), WideNavigationRailKt.ItemStartIconIndicatorVerticalPadding);

    private WideNavigationRailItemDefaults() {
    }

    private final NavigationItemColors getDefaultWideNavigationRailItemColors(ColorScheme colorScheme) {
        NavigationItemColors defaultWideNavigationRailItemColorsCached$material3 = colorScheme.getDefaultWideNavigationRailItemColorsCached$material3();
        if (defaultWideNavigationRailItemColorsCached$material3 != null) {
            return defaultWideNavigationRailItemColorsCached$material3;
        }
        NavigationItemColors navigationItemColors = new NavigationItemColors(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveIcon()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveLabelText()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemActiveIndicator()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultWideNavigationRailItemColorsCached$material3(navigationItemColors);
        return navigationItemColors;
    }

    public final NavigationItemColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(911821421, i2, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:1307)");
        }
        NavigationItemColors defaultWideNavigationRailItemColors = getDefaultWideNavigationRailItemColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideNavigationRailItemColors;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final NavigationItemColors m6135colors69fazGs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i2, int i3) {
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
            ComposerKt.traceEventStart(1759081702, i2, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:1332)");
        } else {
            j11 = value;
        }
        NavigationItemColors navigationItemColorsM5286copy4JmcsL4 = getDefaultWideNavigationRailItemColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5286copy4JmcsL4(j11, value2, value3, j9, j10, jM8227copywmQWz5c$default, jM8227copywmQWz5c$default2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationItemColorsM5286copy4JmcsL4;
    }

    public final PaddingValues getIndicatorCollapsedPadding() {
        return IndicatorCollapsedPadding;
    }

    public final PaddingValues getIndicatorExpandedPadding() {
        return IndicatorExpandedPadding;
    }

    /* renamed from: iconPositionFor-s8pcRp0, reason: not valid java name */
    public final int m6136iconPositionFors8pcRp0(boolean z) {
        NavigationItemIconPosition.Companion companion = NavigationItemIconPosition.Companion;
        return z ? companion.m5303getStartxw1Ddg() : companion.m5304getTopxw1Ddg();
    }

    public final PaddingValues indicatorPadding(boolean z, PaddingValues paddingValues, PaddingValues paddingValues2, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            paddingValues = IndicatorCollapsedPadding;
        }
        if ((i3 & 4) != 0) {
            paddingValues2 = IndicatorExpandedPadding;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(273422139, i2, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.indicatorPadding (WideNavigationRail.kt:1292)");
        }
        boolean z2 = ((((i2 & 112) ^ 48) > 32 && composer.changed(paddingValues)) || (i2 & 48) == 32) | ((((i2 & DisplayStrings.DS_TAP_TO_VERIFY) ^ 384) > 256 && composer.changed(paddingValues2)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && composer.changed(z)) || (i2 & 6) == 4);
        Object objRememberedValue = composer.rememberedValue();
        if (z2 || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new DynamicPaddingValues(paddingValues, paddingValues2, z);
            composer.updateRememberedValue(objRememberedValue);
        }
        DynamicPaddingValues dynamicPaddingValues = (DynamicPaddingValues) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dynamicPaddingValues;
    }
}
