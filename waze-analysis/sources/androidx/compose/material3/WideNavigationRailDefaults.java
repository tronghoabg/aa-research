package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.internal.SystemBarsDefaultInsets_androidKt;
import androidx.compose.material3.tokens.NavigationRailCollapsedTokens;
import androidx.compose.material3.tokens.NavigationRailExpandedTokens;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class WideNavigationRailDefaults {
    public static final int $stable = 0;
    public static final WideNavigationRailDefaults INSTANCE = new WideNavigationRailDefaults();
    private static final ModalWideNavigationRailProperties ModalExpandedProperties = WideNavigationRail_androidKt.createDefaultModalWideNavigationRailProperties();
    private static final PaddingValues ContentPadding = PaddingKt.m2751PaddingValuesa9UjIt4(0.0f, WideNavigationRailKt.WNRVerticalPadding, 0.0f, WideNavigationRailKt.WNRVerticalPadding);

    private WideNavigationRailDefaults() {
    }

    private final long getContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2034736487, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-containerColor> (WideNavigationRail.kt:1253)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    private final WideNavigationRailColors getDefaultWideWideNavigationRailColors(ColorScheme colorScheme, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1969597361, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-defaultWideWideNavigationRailColors> (WideNavigationRail.kt:1260)");
        }
        WideNavigationRailColors defaultWideWideNavigationRailColorsCached$material3 = colorScheme.getDefaultWideWideNavigationRailColorsCached$material3();
        if (defaultWideWideNavigationRailColorsCached$material3 == null) {
            composer.startReplaceGroup(1297532678);
            int i3 = (i2 >> 3) & 14;
            defaultWideWideNavigationRailColorsCached$material3 = new WideNavigationRailColors(getContainerColor(composer, i3), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, getContainerColor(composer, i3)), getModalContainerColor(composer, i3), Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, getModalContainerColor(composer, i3)), null);
            colorScheme.setDefaultWideWideNavigationRailColorsCached$material3(defaultWideWideNavigationRailColorsCached$material3);
        } else {
            composer.startReplaceGroup(1297515721);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideWideNavigationRailColorsCached$material3;
    }

    private final long getModalContainerColor(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1008951947, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalContainerColor> (WideNavigationRail.kt:1256)");
        }
        long value = ColorSchemeKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WideNavigationRailColors colors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(255272712, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:1157)");
        }
        WideNavigationRailColors defaultWideWideNavigationRailColors = getDefaultWideWideNavigationRailColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultWideWideNavigationRailColors;
    }

    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final /* synthetic */ WideNavigationRailColors m6133colorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        long containerColor = (i3 & 1) != 0 ? INSTANCE.getContainerColor(composer, 6) : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(containerColor, composer, i2 & 14) : j3;
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6) : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1139423876, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:1224)");
        }
        WideNavigationRailColors wideNavigationRailColorsM6127copyt635Npw = getDefaultWideWideNavigationRailColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 >> 9) & 112).m6127copyt635Npw(containerColor, jM4593contentColorForek8zF_U, value, jM8227copywmQWz5c$default, ColorSchemeKt.m4593contentColorForek8zF_U(value, composer, (i2 >> 6) & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wideNavigationRailColorsM6127copyt635Npw;
    }

    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final WideNavigationRailColors m6134colorszjMxDiM(long j2, long j3, long j4, long j5, long j6, Composer composer, int i2, int i3) {
        long containerColor = (i3 & 1) != 0 ? INSTANCE.getContainerColor(composer, 6) : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(containerColor, composer, i2 & 14) : j3;
        long value = (i3 & 4) != 0 ? ColorSchemeKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerColor(), composer, 6) : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j5;
        long jM4593contentColorForek8zF_U2 = (i3 & 16) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(value, composer, (i2 >> 6) & 14) : j6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239918099, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.colors (WideNavigationRail.kt:1183)");
        }
        WideNavigationRailColors wideNavigationRailColorsM6127copyt635Npw = getDefaultWideWideNavigationRailColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i2 >> 12) & 112).m6127copyt635Npw(containerColor, jM4593contentColorForek8zF_U, value, jM8227copywmQWz5c$default, jM4593contentColorForek8zF_U2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return wideNavigationRailColorsM6127copyt635Npw;
    }

    public final Arrangement.Vertical getArrangement() {
        return Arrangement.INSTANCE.getTop();
    }

    public final Shape getContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020122139, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-containerShape> (WideNavigationRail.kt:1240)");
        }
        Shape value = ShapesKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    public final Shape getModalCollapsedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(926228775, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalCollapsedShape> (WideNavigationRail.kt:1143)");
        }
        Shape shape = getShape(composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    public final Shape getModalContainerShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-5121925, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalContainerShape> (WideNavigationRail.kt:1250)");
        }
        Shape value = ShapesKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final ModalWideNavigationRailProperties getModalExpandedProperties() {
        return ModalExpandedProperties;
    }

    public final Shape getModalExpandedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1865689797, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-modalExpandedShape> (WideNavigationRail.kt:1147)");
        }
        Shape value = ShapesKt.getValue(NavigationRailExpandedTokens.INSTANCE.getModalContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1756160851, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-shape> (WideNavigationRail.kt:1127)");
        }
        Shape value = ShapesKt.getValue(NavigationRailCollapsedTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1769402286, i2, -1, "androidx.compose.material3.WideNavigationRailDefaults.<get-windowInsets> (WideNavigationRail.kt:1137)");
        }
        WindowInsets windowInsetsM2850onlybOOhFvg = WindowInsetsKt.m2850onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6), WindowInsetsSides.m2860plusgK_yJZ4(WindowInsetsSides.Companion.m2875getVerticalJoeWqyM(), WindowInsetsSides.Companion.m2873getStartJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowInsetsM2850onlybOOhFvg;
    }

    public static /* synthetic */ void getContainerShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getModalContainerShape$annotations(Composer composer, int i2) {
    }
}
