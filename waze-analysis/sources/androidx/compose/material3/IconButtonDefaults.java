package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.material3.tokens.FilledIconButtonTokens;
import androidx.compose.material3.tokens.FilledTonalIconButtonTokens;
import androidx.compose.material3.tokens.LargeIconButtonTokens;
import androidx.compose.material3.tokens.MediumIconButtonTokens;
import androidx.compose.material3.tokens.OutlinedIconButtonTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.StandardIconButtonTokens;
import androidx.compose.material3.tokens.XLargeIconButtonTokens;
import androidx.compose.material3.tokens.XSmallIconButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.DpKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IconButtonDefaults {
    public static final int $stable = 0;
    public static final IconButtonDefaults INSTANCE = new IconButtonDefaults();
    private static final float extraSmallIconSize = XSmallIconButtonTokens.INSTANCE.m7278getIconSizeD9Ej5fM();
    private static final float smallIconSize = SmallIconButtonTokens.INSTANCE.m7082getIconSizeD9Ej5fM();
    private static final float mediumIconSize = MediumIconButtonTokens.INSTANCE.m6847getIconSizeD9Ej5fM();
    private static final float largeIconSize = LargeIconButtonTokens.INSTANCE.m6796getIconSizeD9Ej5fM();
    private static final float extraLargeIconSize = XLargeIconButtonTokens.INSTANCE.m7269getIconSizeD9Ej5fM();

    private IconButtonDefaults() {
    }

    /* renamed from: extraLargeContainerSize-N-wlBFI$default, reason: not valid java name */
    public static /* synthetic */ long m4988extraLargeContainerSizeNwlBFI$default(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.Companion.m5032getUniformrc6NtMs();
        }
        return iconButtonDefaults.m5002extraLargeContainerSizeNwlBFI(i2);
    }

    /* renamed from: extraSmallContainerSize-N-wlBFI$default, reason: not valid java name */
    public static /* synthetic */ long m4989extraSmallContainerSizeNwlBFI$default(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.Companion.m5032getUniformrc6NtMs();
        }
        return iconButtonDefaults.m5003extraSmallContainerSizeNwlBFI(i2);
    }

    /* renamed from: largeContainerSize-N-wlBFI$default, reason: not valid java name */
    public static /* synthetic */ long m4995largeContainerSizeNwlBFI$default(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.Companion.m5032getUniformrc6NtMs();
        }
        return iconButtonDefaults.m5017largeContainerSizeNwlBFI(i2);
    }

    /* renamed from: mediumContainerSize-N-wlBFI$default, reason: not valid java name */
    public static /* synthetic */ long m4996mediumContainerSizeNwlBFI$default(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.Companion.m5032getUniformrc6NtMs();
        }
        return iconButtonDefaults.m5018mediumContainerSizeNwlBFI(i2);
    }

    /* renamed from: smallContainerSize-N-wlBFI$default, reason: not valid java name */
    public static /* synthetic */ long m4997smallContainerSizeNwlBFI$default(IconButtonDefaults iconButtonDefaults, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = IconButtonWidthOption.Companion.m5032getUniformrc6NtMs();
        }
        return iconButtonDefaults.m5023smallContainerSizeNwlBFI(i2);
    }

    /* renamed from: defaultIconButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconButtonColors m4998defaultIconButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultIconButtonColorsCached$material3 = colorScheme.getDefaultIconButtonColorsCached$material3();
        if (defaultIconButtonColorsCached$material3 != null) {
            return defaultIconButtonColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), j2, Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(j2, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconButtonColors defaultIconButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultIconButtonVibrantColorsCached$material3 = colorScheme.getDefaultIconButtonVibrantColorsCached$material3();
        if (defaultIconButtonVibrantColorsCached$material3 != null) {
            return defaultIconButtonVibrantColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getDisabledColor()), StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultIconButtonVibrantColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultIconToggleButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconToggleButtonColors m4999defaultIconToggleButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3 = colorScheme.getDefaultIconToggleButtonColorsCached$material3();
        if (defaultIconToggleButtonColorsCached$material3 != null) {
            return defaultIconToggleButtonColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), j2, Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(j2, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getSelectedColor()), null);
        colorScheme.setDefaultIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors defaultIconToggleButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultIconToggleButtonVibrantColorsCached$material3 = colorScheme.getDefaultIconToggleButtonVibrantColorsCached$material3();
        if (defaultIconToggleButtonVibrantColorsCached$material3 != null) {
            return defaultIconToggleButtonVibrantColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getUnselectedColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getDisabledColor()), StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, StandardIconButtonTokens.INSTANCE.getSelectedColor()), null);
        colorScheme.setDefaultIconToggleButtonVibrantColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: defaultOutlinedIconButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconButtonColors m5000defaultOutlinedIconButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j2) {
        IconButtonColors defaultOutlinedIconButtonColorsCached$material3 = colorScheme.getDefaultOutlinedIconButtonColorsCached$material3();
        if (defaultOutlinedIconButtonColorsCached$material3 != null) {
            return defaultOutlinedIconButtonColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), j2, Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(j2, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconButtonColors defaultOutlinedIconButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultOutlinedIconButtonVibrantColorsCached$material3 = colorScheme.getDefaultOutlinedIconButtonVibrantColorsCached$material3();
        if (defaultOutlinedIconButtonVibrantColorsCached$material3 != null) {
            return defaultOutlinedIconButtonVibrantColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getDisabledColor()), OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedIconButtonVibrantColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    /* renamed from: defaultOutlinedIconToggleButtonColors-4WTKRHQ$material3, reason: not valid java name */
    public final IconToggleButtonColors m5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(ColorScheme colorScheme, long j2) {
        IconToggleButtonColors defaultIconToggleButtonColorsCached$material3 = colorScheme.getDefaultIconToggleButtonColorsCached$material3();
        if (defaultIconToggleButtonColorsCached$material3 != null) {
            return defaultIconToggleButtonColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), j2, Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(j2, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.m4592contentColorFor4WTKRHQ(colorScheme, ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor())), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultOutlinedIconToggleButtonVibrantColorsCached$material3 = colorScheme.getDefaultOutlinedIconToggleButtonVibrantColorsCached$material3();
        if (defaultOutlinedIconToggleButtonVibrantColorsCached$material3 != null) {
            return defaultOutlinedIconToggleButtonVibrantColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(Color.Companion.m8263getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getUnselectedColor()), Color.Companion.m8263getTransparent0d7_KjU(), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getDisabledColor()), OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedIconButtonTokens.INSTANCE.getSelectedColor()), null);
        colorScheme.setDefaultOutlinedIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    /* renamed from: extraLargeContainerSize-N-wlBFI, reason: not valid java name */
    public final long m5002extraLargeContainerSizeNwlBFI(int i2) {
        float f2;
        float fM7273getWideLeadingSpaceD9Ej5fM;
        float fM7274getWideTrailingSpaceD9Ej5fM;
        if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5031getNarrowrc6NtMs())) {
            fM7273getWideLeadingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7270getNarrowLeadingSpaceD9Ej5fM();
            fM7274getWideTrailingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7271getNarrowTrailingSpaceD9Ej5fM();
        } else if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5032getUniformrc6NtMs())) {
            fM7273getWideLeadingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7267getDefaultLeadingSpaceD9Ej5fM();
            fM7274getWideTrailingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7267getDefaultLeadingSpaceD9Ej5fM();
        } else {
            if (!IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5033getWiderc6NtMs())) {
                f2 = 0.0f;
                return DpKt.m11186DpSizeYgX7TsA(XLargeIconButtonTokens.INSTANCE.m7269getIconSizeD9Ej5fM() + f2, XLargeIconButtonTokens.INSTANCE.m7266getContainerHeightD9Ej5fM());
            }
            fM7273getWideLeadingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7273getWideLeadingSpaceD9Ej5fM();
            fM7274getWideTrailingSpaceD9Ej5fM = XLargeIconButtonTokens.INSTANCE.m7274getWideTrailingSpaceD9Ej5fM();
        }
        f2 = fM7273getWideLeadingSpaceD9Ej5fM + fM7274getWideTrailingSpaceD9Ej5fM;
        return DpKt.m11186DpSizeYgX7TsA(XLargeIconButtonTokens.INSTANCE.m7269getIconSizeD9Ej5fM() + f2, XLargeIconButtonTokens.INSTANCE.m7266getContainerHeightD9Ej5fM());
    }

    /* renamed from: extraSmallContainerSize-N-wlBFI, reason: not valid java name */
    public final long m5003extraSmallContainerSizeNwlBFI(int i2) {
        float f2;
        float fM7282getWideLeadingSpaceD9Ej5fM;
        float fM7283getWideTrailingSpaceD9Ej5fM;
        if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5031getNarrowrc6NtMs())) {
            fM7282getWideLeadingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7279getNarrowLeadingSpaceD9Ej5fM();
            fM7283getWideTrailingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7280getNarrowTrailingSpaceD9Ej5fM();
        } else if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5032getUniformrc6NtMs())) {
            fM7282getWideLeadingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7276getDefaultLeadingSpaceD9Ej5fM();
            fM7283getWideTrailingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7276getDefaultLeadingSpaceD9Ej5fM();
        } else {
            if (!IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5033getWiderc6NtMs())) {
                f2 = 0.0f;
                return DpKt.m11186DpSizeYgX7TsA(XSmallIconButtonTokens.INSTANCE.m7278getIconSizeD9Ej5fM() + f2, XSmallIconButtonTokens.INSTANCE.m7275getContainerHeightD9Ej5fM());
            }
            fM7282getWideLeadingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7282getWideLeadingSpaceD9Ej5fM();
            fM7283getWideTrailingSpaceD9Ej5fM = XSmallIconButtonTokens.INSTANCE.m7283getWideTrailingSpaceD9Ej5fM();
        }
        f2 = fM7282getWideLeadingSpaceD9Ej5fM + fM7283getWideTrailingSpaceD9Ej5fM;
        return DpKt.m11186DpSizeYgX7TsA(XSmallIconButtonTokens.INSTANCE.m7278getIconSizeD9Ej5fM() + f2, XSmallIconButtonTokens.INSTANCE.m7275getContainerHeightD9Ej5fM());
    }

    public final IconButtonColors filledIconButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-958304265, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:307)");
        }
        IconButtonColors defaultFilledIconButtonColors$material3 = getDefaultFilledIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconButtonColors$material3;
    }

    /* renamed from: filledIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5004filledIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = ColorSchemeKt.m4593contentColorForek8zF_U(j2, composer, i2 & 14);
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245481051, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconButtonColors (IconButtonDefaults.kt:324)");
        }
        long j6 = j3;
        long j7 = j2;
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = getDefaultFilledIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4983copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final IconToggleButtonColors filledIconToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1455160689, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:353)");
        }
        IconToggleButtonColors defaultFilledIconToggleButtonColors$material3 = getDefaultFilledIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledIconToggleButtonColors$material3;
    }

    /* renamed from: filledIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5005filledIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM4593contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU5, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1473292947, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledIconToggleButtonColors (IconButtonDefaults.kt:377)");
        } else {
            j8 = jM8264getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = getDefaultFilledIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5042copytNS2XkQ(j8, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5, jM4593contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    public final IconButtonColors filledTonalIconButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1145002745, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:414)");
        }
        IconButtonColors defaultFilledTonalIconButtonColors$material3 = getDefaultFilledTonalIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconButtonColors$material3;
    }

    /* renamed from: filledTonalIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5006filledTonalIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 2) != 0) {
            j3 = ColorSchemeKt.m4593contentColorForek8zF_U(j2, composer, i2 & 14);
        }
        if ((i3 & 4) != 0) {
            j4 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if ((i3 & 8) != 0) {
            j5 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(562762851, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconButtonColors (IconButtonDefaults.kt:432)");
        }
        long j6 = j3;
        long j7 = j2;
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = getDefaultFilledTonalIconButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4983copyjRlVdoo(j7, j6, j4, j5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final IconToggleButtonColors filledTonalIconToggleButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(656374417, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:461)");
        }
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColors$material3 = getDefaultFilledTonalIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFilledTonalIconToggleButtonColors$material3;
    }

    /* renamed from: filledTonalIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5007filledTonalIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM4593contentColorForek8zF_U = (i3 & 2) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU, composer, i2 & 14) : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 8) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j5;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM4593contentColorForek8zF_U2 = (i3 & 32) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU4, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j8 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(2130748241, i2, -1, "androidx.compose.material3.IconButtonDefaults.filledTonalIconToggleButtonColors (IconButtonDefaults.kt:483)");
        } else {
            j8 = jM8264getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = getDefaultFilledTonalIconToggleButtonColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5042copytNS2XkQ(j8, jM4593contentColorForek8zF_U, jM8264getUnspecified0d7_KjU2, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4, jM4593contentColorForek8zF_U2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    public final IconButtonColors getDefaultFilledIconButtonColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultFilledIconButtonColorsCached$material3 = colorScheme.getDefaultFilledIconButtonColorsCached$material3();
        if (defaultFilledIconButtonColorsCached$material3 != null) {
            return defaultFilledIconButtonColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledIconToggleButtonColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledIconToggleButtonColorsCached$material3 = colorScheme.getDefaultFilledIconToggleButtonColorsCached$material3();
        if (defaultFilledIconToggleButtonColorsCached$material3 != null) {
            return defaultFilledIconToggleButtonColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getUnselectedColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getDisabledColor()), FilledIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledIconButtonTokens.INSTANCE.getSelectedColor()), null);
        colorScheme.setDefaultFilledIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonColors getDefaultFilledTonalIconButtonColors$material3(ColorScheme colorScheme) {
        IconButtonColors defaultFilledTonalIconButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalIconButtonColorsCached$material3();
        if (defaultFilledTonalIconButtonColorsCached$material3 != null) {
            return defaultFilledTonalIconButtonColorsCached$material3;
        }
        IconButtonColors iconButtonColors = new IconButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalIconButtonColorsCached$material3(iconButtonColors);
        return iconButtonColors;
    }

    public final IconToggleButtonColors getDefaultFilledTonalIconToggleButtonColors$material3(ColorScheme colorScheme) {
        IconToggleButtonColors defaultFilledTonalIconToggleButtonColorsCached$material3 = colorScheme.getDefaultFilledTonalIconToggleButtonColorsCached$material3();
        if (defaultFilledTonalIconToggleButtonColorsCached$material3 != null) {
            return defaultFilledTonalIconToggleButtonColorsCached$material3;
        }
        IconToggleButtonColors iconToggleButtonColors = new IconToggleButtonColors(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getUnselectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getUnselectedColor()), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledContainerOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getDisabledColor()), FilledTonalIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getSelectedContainerColor()), ColorSchemeKt.fromToken(colorScheme, FilledTonalIconButtonTokens.INSTANCE.getSelectedColor()), null);
        colorScheme.setDefaultFilledTonalIconToggleButtonColorsCached$material3(iconToggleButtonColors);
        return iconToggleButtonColors;
    }

    public final IconButtonShapes getDefaultIconButtonShapes$material3(Shapes shapes) {
        IconButtonShapes defaultIconButtonShapesCached$material3 = shapes.getDefaultIconButtonShapesCached$material3();
        if (defaultIconButtonShapesCached$material3 != null) {
            return defaultIconButtonShapesCached$material3;
        }
        IconButtonShapes iconButtonShapes = new IconButtonShapes(ShapesKt.fromToken(shapes, SmallIconButtonTokens.INSTANCE.getContainerShapeRound()), ShapesKt.fromToken(shapes, SmallIconButtonTokens.INSTANCE.getPressedContainerShape()));
        shapes.setDefaultIconButtonShapesCached$material3(iconButtonShapes);
        return iconButtonShapes;
    }

    public final IconToggleButtonShapes getDefaultIconToggleButtonShapes$material3(Shapes shapes) {
        IconToggleButtonShapes defaultIconToggleButtonShapesCached$material3 = shapes.getDefaultIconToggleButtonShapesCached$material3();
        if (defaultIconToggleButtonShapesCached$material3 != null) {
            return defaultIconToggleButtonShapesCached$material3;
        }
        IconToggleButtonShapes iconToggleButtonShapes = new IconToggleButtonShapes(ShapesKt.fromToken(shapes, SmallIconButtonTokens.INSTANCE.getContainerShapeRound()), ShapesKt.fromToken(shapes, SmallIconButtonTokens.INSTANCE.getPressedContainerShape()), ShapesKt.fromToken(shapes, SmallIconButtonTokens.INSTANCE.getSelectedContainerShapeRound()));
        shapes.setDefaultIconToggleButtonShapesCached$material3(iconToggleButtonShapes);
        return iconToggleButtonShapes;
    }

    /* renamed from: getExtraLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5008getExtraLargeIconSizeD9Ej5fM() {
        return extraLargeIconSize;
    }

    public final Shape getExtraLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(481568179, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraLargePressedShape> (IconButtonDefaults.kt:988)");
        }
        Shape value = ShapesKt.getValue(XLargeIconButtonTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargeRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371354061, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraLargeRoundShape> (IconButtonDefaults.kt:978)");
        }
        Shape value = ShapesKt.getValue(XLargeIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargeSelectedRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1450837075, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraLargeSelectedRoundShape> (IconButtonDefaults.kt:993)");
        }
        Shape value = ShapesKt.getValue(XLargeIconButtonTokens.INSTANCE.getSelectedContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargeSelectedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-116183833, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraLargeSelectedSquareShape> (IconButtonDefaults.kt:998)");
        }
        Shape value = ShapesKt.getValue(XLargeIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraLargeSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1416839217, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraLargeSquareShape> (IconButtonDefaults.kt:983)");
        }
        Shape value = ShapesKt.getValue(XLargeIconButtonTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getExtraSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5009getExtraSmallIconSizeD9Ej5fM() {
        return extraSmallIconSize;
    }

    public final Shape getExtraSmallPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1061421875, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraSmallPressedShape> (IconButtonDefaults.kt:879)");
        }
        Shape value = ShapesKt.getValue(XSmallIconButtonTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1321634995, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraSmallRoundShape> (IconButtonDefaults.kt:869)");
        }
        Shape value = ShapesKt.getValue(XSmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallSelectedRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(370391251, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraSmallSelectedRoundShape> (IconButtonDefaults.kt:884)");
        }
        Shape value = ShapesKt.getValue(XSmallIconButtonTokens.INSTANCE.getSelectedContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallSelectedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(814033279, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraSmallSelectedSquareShape> (IconButtonDefaults.kt:889)");
        }
        Shape value = ShapesKt.getValue(XSmallIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getExtraSmallSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(219275465, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-extraSmallSquareShape> (IconButtonDefaults.kt:874)");
        }
        Shape value = ShapesKt.getValue(XSmallIconButtonTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getFilledShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1542796069, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-filledShape> (IconButtonDefaults.kt:860)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getLargeIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5010getLargeIconSizeD9Ej5fM() {
        return largeIconSize;
    }

    public final Shape getLargePressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1695211601, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-largePressedShape> (IconButtonDefaults.kt:963)");
        }
        Shape value = ShapesKt.getValue(LargeIconButtonTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1926537991, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-largeRoundShape> (IconButtonDefaults.kt:953)");
        }
        Shape value = ShapesKt.getValue(LargeIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeSelectedRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-987878831, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-largeSelectedRoundShape> (IconButtonDefaults.kt:968)");
        }
        Shape value = ShapesKt.getValue(LargeIconButtonTokens.INSTANCE.getSelectedContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeSelectedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-577828301, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-largeSelectedSquareShape> (IconButtonDefaults.kt:973)");
        }
        Shape value = ShapesKt.getValue(LargeIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getLargeSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-137453869, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-largeSquareShape> (IconButtonDefaults.kt:958)");
        }
        Shape value = ShapesKt.getValue(LargeIconButtonTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMediumIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5011getMediumIconSizeD9Ej5fM() {
        return mediumIconSize;
    }

    public final Shape getMediumPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(72043507, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-mediumPressedShape> (IconButtonDefaults.kt:938)");
        }
        Shape value = ShapesKt.getValue(MediumIconButtonTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2111840525, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-mediumRoundShape> (IconButtonDefaults.kt:928)");
        }
        Shape value = ShapesKt.getValue(MediumIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumSelectedRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1651572077, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-mediumSelectedRoundShape> (IconButtonDefaults.kt:943)");
        }
        Shape value = ShapesKt.getValue(MediumIconButtonTokens.INSTANCE.getSelectedContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumSelectedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1224712133, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-mediumSelectedSquareShape> (IconButtonDefaults.kt:948)");
        }
        Shape value = ShapesKt.getValue(MediumIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getMediumSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471824891, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-mediumSquareShape> (IconButtonDefaults.kt:933)");
        }
        Shape value = ShapesKt.getValue(MediumIconButtonTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getOutlinedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1706356635, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-outlinedShape> (IconButtonDefaults.kt:864)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getSmallIconSize-D9Ej5fM, reason: not valid java name */
    public final float m5012getSmallIconSizeD9Ej5fM() {
        return smallIconSize;
    }

    public final Shape getSmallPressedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-915829737, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-smallPressedShape> (IconButtonDefaults.kt:904)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getPressedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSmallRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2020124271, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-smallRoundShape> (IconButtonDefaults.kt:894)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSmallSelectedRoundShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1359654471, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-smallSelectedRoundShape> (IconButtonDefaults.kt:909)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getSelectedContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSmallSelectedSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1515364429, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-smallSelectedSquareShape> (IconButtonDefaults.kt:914)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final /* synthetic */ Shape getSmallSelectedSquareShape_pascalName(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1665942605, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-SmallSelectedSquareShape> (IconButtonDefaults.kt:923)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getSelectedContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getSmallSquareShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(309880915, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-smallSquareShape> (IconButtonDefaults.kt:899)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeSquare(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final Shape getStandardShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-377108005, i2, -1, "androidx.compose.material3.IconButtonDefaults.<get-standardShape> (IconButtonDefaults.kt:856)");
        }
        Shape value = ShapesKt.getValue(SmallIconButtonTokens.INSTANCE.getContainerShapeRound(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final IconButtonColors iconButtonColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1037266503, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:49)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        IconButtonColors iconButtonColorsM4998defaultIconButtonColors4WTKRHQ$material3 = m4998defaultIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM8238unboximpl);
        if (!Color.m8229equalsimpl0(iconButtonColorsM4998defaultIconButtonColors4WTKRHQ$material3.m4985getContentColor0d7_KjU(), jM8238unboximpl)) {
            iconButtonColorsM4998defaultIconButtonColors4WTKRHQ$material3 = IconButtonColors.m4980copyjRlVdoo$default(iconButtonColorsM4998defaultIconButtonColors4WTKRHQ$material3, 0L, jM8238unboximpl, 0L, Color.m8227copywmQWz5c$default(jM8238unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4998defaultIconButtonColors4WTKRHQ$material3;
    }

    /* renamed from: iconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5013iconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        long jM8238unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl() : j3;
        long jM8264getUnspecified0d7_KjU = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(jM8238unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1639168605, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButtonDefaults.kt:85)");
        }
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = m4998defaultIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl()).m4983copyjRlVdoo(j2, jM8238unboximpl, jM8264getUnspecified0d7_KjU, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final IconButtonColors iconButtonVibrantColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(111454247, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:117)");
        }
        IconButtonColors iconButtonColorsDefaultIconButtonVibrantColors$material3 = defaultIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsDefaultIconButtonVibrantColors$material3;
    }

    /* renamed from: iconButtonVibrantColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5014iconButtonVibrantColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        long jM8264getUnspecified0d7_KjU = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(jM8264getUnspecified0d7_KjU, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1036440437, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonVibrantColors (IconButtonDefaults.kt:139)");
        }
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = defaultIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4983copyjRlVdoo(j2, jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final IconToggleButtonColors iconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-1355771567);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355771567, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:171)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM4999defaultIconToggleButtonColors4WTKRHQ$material3 = m4999defaultIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM8238unboximpl);
        if (!Color.m8229equalsimpl0(iconToggleButtonColorsM4999defaultIconToggleButtonColors4WTKRHQ$material3.m5046getContentColor0d7_KjU(), jM8238unboximpl)) {
            iconToggleButtonColorsM4999defaultIconToggleButtonColors4WTKRHQ$material3 = IconToggleButtonColors.m5041copytNS2XkQ$default(iconToggleButtonColorsM4999defaultIconToggleButtonColors4WTKRHQ$material3, 0L, jM8238unboximpl, 0L, Color.m8227copywmQWz5c$default(jM8238unboximpl, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM4999defaultIconToggleButtonColors4WTKRHQ$material3;
    }

    /* renamed from: iconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5015iconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8227copywmQWz5c$default;
        long j9;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8238unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl() : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j10 = jM8238unboximpl;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j10, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j10;
        } else {
            j8 = jM8238unboximpl;
            jM8227copywmQWz5c$default = j5;
        }
        long jM8264getUnspecified0d7_KjU3 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU4 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(1402082449, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonColors (IconButtonDefaults.kt:210)");
        } else {
            j9 = jM8264getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = m4999defaultIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl()).m5042copytNS2XkQ(j9, j8, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default, jM8264getUnspecified0d7_KjU3, jM8264getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    public final IconToggleButtonColors iconToggleButtonVibrantColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1755001127, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:248)");
        }
        IconToggleButtonColors iconToggleButtonColorsDefaultIconToggleButtonVibrantColors$material3 = defaultIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsDefaultIconToggleButtonVibrantColors$material3;
    }

    /* renamed from: iconToggleButtonVibrantColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5016iconToggleButtonVibrantColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8227copywmQWz5c$default;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j9 = jM8264getUnspecified0d7_KjU2;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j9, StandardIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j9;
        } else {
            j8 = jM8264getUnspecified0d7_KjU2;
            jM8227copywmQWz5c$default = j5;
        }
        long jM8264getUnspecified0d7_KjU4 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM8264getUnspecified0d7_KjU5 = (i3 & 32) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1027328773, i2, -1, "androidx.compose.material3.IconButtonDefaults.iconToggleButtonVibrantColors (IconButtonDefaults.kt:274)");
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = defaultIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5042copytNS2XkQ(jM8264getUnspecified0d7_KjU, j8, jM8264getUnspecified0d7_KjU3, jM8227copywmQWz5c$default, jM8264getUnspecified0d7_KjU4, jM8264getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    /* renamed from: largeContainerSize-N-wlBFI, reason: not valid java name */
    public final long m5017largeContainerSizeNwlBFI(int i2) {
        float f2;
        float fM6802getWideLeadingSpaceD9Ej5fM;
        float fM6803getWideTrailingSpaceD9Ej5fM;
        if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5031getNarrowrc6NtMs())) {
            fM6802getWideLeadingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6797getNarrowLeadingSpaceD9Ej5fM();
            fM6803getWideTrailingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6798getNarrowTrailingSpaceD9Ej5fM();
        } else if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5032getUniformrc6NtMs())) {
            fM6802getWideLeadingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6800getUniformLeadingSpaceD9Ej5fM();
            fM6803getWideTrailingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6800getUniformLeadingSpaceD9Ej5fM();
        } else {
            if (!IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5033getWiderc6NtMs())) {
                f2 = 0.0f;
                return DpKt.m11186DpSizeYgX7TsA(LargeIconButtonTokens.INSTANCE.m6796getIconSizeD9Ej5fM() + f2, LargeIconButtonTokens.INSTANCE.m6795getContainerHeightD9Ej5fM());
            }
            fM6802getWideLeadingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6802getWideLeadingSpaceD9Ej5fM();
            fM6803getWideTrailingSpaceD9Ej5fM = LargeIconButtonTokens.INSTANCE.m6803getWideTrailingSpaceD9Ej5fM();
        }
        f2 = fM6802getWideLeadingSpaceD9Ej5fM + fM6803getWideTrailingSpaceD9Ej5fM;
        return DpKt.m11186DpSizeYgX7TsA(LargeIconButtonTokens.INSTANCE.m6796getIconSizeD9Ej5fM() + f2, LargeIconButtonTokens.INSTANCE.m6795getContainerHeightD9Ej5fM());
    }

    /* renamed from: mediumContainerSize-N-wlBFI, reason: not valid java name */
    public final long m5018mediumContainerSizeNwlBFI(int i2) {
        float f2;
        float fM6851getWideLeadingSpaceD9Ej5fM;
        float fM6852getWideTrailingSpaceD9Ej5fM;
        if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5031getNarrowrc6NtMs())) {
            fM6851getWideLeadingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6848getNarrowLeadingSpaceD9Ej5fM();
            fM6852getWideTrailingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6849getNarrowTrailingSpaceD9Ej5fM();
        } else if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5032getUniformrc6NtMs())) {
            fM6851getWideLeadingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6845getDefaultLeadingSpaceD9Ej5fM();
            fM6852getWideTrailingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6845getDefaultLeadingSpaceD9Ej5fM();
        } else {
            if (!IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5033getWiderc6NtMs())) {
                f2 = 0.0f;
                return DpKt.m11186DpSizeYgX7TsA(MediumIconButtonTokens.INSTANCE.m6847getIconSizeD9Ej5fM() + f2, MediumIconButtonTokens.INSTANCE.m6844getContainerHeightD9Ej5fM());
            }
            fM6851getWideLeadingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6851getWideLeadingSpaceD9Ej5fM();
            fM6852getWideTrailingSpaceD9Ej5fM = MediumIconButtonTokens.INSTANCE.m6852getWideTrailingSpaceD9Ej5fM();
        }
        f2 = fM6851getWideLeadingSpaceD9Ej5fM + fM6852getWideTrailingSpaceD9Ej5fM;
        return DpKt.m11186DpSizeYgX7TsA(MediumIconButtonTokens.INSTANCE.m6847getIconSizeD9Ej5fM() + f2, MediumIconButtonTokens.INSTANCE.m6844getContainerHeightD9Ej5fM());
    }

    public final BorderStroke outlinedIconButtonBorder(boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1270640488, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonBorder (IconButtonDefaults.kt:825)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        if (!z) {
            jM8238unboximpl = Color.m8227copywmQWz5c$default(jM8238unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean zChanged = composer.changed(jM8238unboximpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m1998BorderStrokecXLIe8U(SmallIconButtonTokens.INSTANCE.m7085getOutlinedOutlineWidthD9Ej5fM(), jM8238unboximpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final IconButtonColors outlinedIconButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(1591384183);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1591384183, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:520)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        IconButtonColors iconButtonColorsM5000defaultOutlinedIconButtonColors4WTKRHQ$material3 = m5000defaultOutlinedIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM8238unboximpl);
        if (!Color.m8229equalsimpl0(iconButtonColorsM5000defaultOutlinedIconButtonColors4WTKRHQ$material3.m4985getContentColor0d7_KjU(), jM8238unboximpl)) {
            iconButtonColorsM5000defaultOutlinedIconButtonColors4WTKRHQ$material3 = IconButtonColors.m4980copyjRlVdoo$default(iconButtonColorsM5000defaultOutlinedIconButtonColors4WTKRHQ$material3, 0L, jM8238unboximpl, 0L, Color.m8227copywmQWz5c$default(jM8238unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 5, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButtonColorsM5000defaultOutlinedIconButtonColors4WTKRHQ$material3;
    }

    /* renamed from: outlinedIconButtonColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5019outlinedIconButtonColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        long jM8238unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl() : j3;
        long jM8264getUnspecified0d7_KjU = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(jM8238unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1335916251, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonColors (IconButtonDefaults.kt:554)");
        }
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = m5000defaultOutlinedIconButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl()).m4983copyjRlVdoo(j2, jM8238unboximpl, jM8264getUnspecified0d7_KjU, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final BorderStroke outlinedIconButtonVibrantBorder(boolean z, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2139728858, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantBorder (IconButtonDefaults.kt:843)");
        }
        long value = ColorSchemeKt.getValue(OutlinedIconButtonTokens.INSTANCE.getOutlineColor(), composer, 6);
        if (!z) {
            value = Color.m8227copywmQWz5c$default(value, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        }
        boolean zChanged = composer.changed(value);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = BorderStrokeKt.m1998BorderStrokecXLIe8U(SmallIconButtonTokens.INSTANCE.m7085getOutlinedOutlineWidthD9Ej5fM(), value);
            composer.updateRememberedValue(objRememberedValue);
        }
        BorderStroke borderStroke = (BorderStroke) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderStroke;
    }

    public final IconButtonColors outlinedIconButtonVibrantColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-899469399, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:588)");
        }
        IconButtonColors iconButtonColorsDefaultOutlinedIconButtonVibrantColors$material3 = defaultOutlinedIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsDefaultOutlinedIconButtonVibrantColors$material3;
    }

    /* renamed from: outlinedIconButtonVibrantColors-ro_MJ88, reason: not valid java name */
    public final IconButtonColors m5020outlinedIconButtonVibrantColorsro_MJ88(long j2, long j3, long j4, long j5, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            j2 = Color.Companion.m8264getUnspecified0d7_KjU();
        }
        long jM8264getUnspecified0d7_KjU = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        long jM8227copywmQWz5c$default = (i3 & 8) != 0 ? Color.m8227copywmQWz5c$default(jM8264getUnspecified0d7_KjU, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278201933, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconButtonVibrantColors (IconButtonDefaults.kt:610)");
        }
        IconButtonColors iconButtonColorsM4983copyjRlVdoo = defaultOutlinedIconButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m4983copyjRlVdoo(j2, jM8264getUnspecified0d7_KjU, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonColorsM4983copyjRlVdoo;
    }

    public final BorderStroke outlinedIconToggleButtonBorder(boolean z, boolean z2, Composer composer, int i2) {
        BorderStroke borderStrokeOutlinedIconButtonBorder;
        composer.startReplaceGroup(1933433512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1933433512, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonBorder (IconButtonDefaults.kt:793)");
        }
        if (z2) {
            borderStrokeOutlinedIconButtonBorder = null;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            borderStrokeOutlinedIconButtonBorder = outlinedIconButtonBorder(z, composer, (i2 & 14) | ((i2 >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return borderStrokeOutlinedIconButtonBorder;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonColors(Composer composer, int i2) {
        composer.startReplaceGroup(-834376945);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-834376945, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:643)");
        }
        long jM8238unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl();
        IconToggleButtonColors iconToggleButtonColorsM5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3 = m5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), jM8238unboximpl);
        if (!Color.m8229equalsimpl0(iconToggleButtonColorsM5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3.m5046getContentColor0d7_KjU(), jM8238unboximpl)) {
            iconToggleButtonColorsM5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3 = IconToggleButtonColors.m5041copytNS2XkQ$default(iconToggleButtonColorsM5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3, 0L, jM8238unboximpl, 0L, Color.m8227copywmQWz5c$default(jM8238unboximpl, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 53, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconToggleButtonColorsM5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3;
    }

    /* renamed from: outlinedIconToggleButtonColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5021outlinedIconToggleButtonColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8227copywmQWz5c$default;
        long j9;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8238unboximpl = (i3 & 2) != 0 ? ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl() : j3;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j10 = jM8238unboximpl;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j10, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j10;
        } else {
            j8 = jM8238unboximpl;
            jM8227copywmQWz5c$default = j5;
        }
        long jM8264getUnspecified0d7_KjU3 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM4593contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU3, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-514625005, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonColors (IconButtonDefaults.kt:682)");
        } else {
            j9 = jM8264getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = m5001defaultOutlinedIconToggleButtonColors4WTKRHQ$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl()).m5042copytNS2XkQ(j9, j8, jM8264getUnspecified0d7_KjU2, jM8227copywmQWz5c$default, jM8264getUnspecified0d7_KjU3, jM4593contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    public final BorderStroke outlinedIconToggleButtonVibrantBorder(boolean z, boolean z2, Composer composer, int i2) {
        BorderStroke borderStrokeOutlinedIconButtonVibrantBorder;
        composer.startReplaceGroup(394022990);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394022990, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantBorder (IconButtonDefaults.kt:808)");
        }
        if (z2) {
            borderStrokeOutlinedIconButtonVibrantBorder = null;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            borderStrokeOutlinedIconButtonVibrantBorder = outlinedIconButtonVibrantBorder(z, composer, (i2 & 14) | ((i2 >> 3) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        composer.endReplaceGroup();
        return borderStrokeOutlinedIconButtonVibrantBorder;
    }

    public final IconToggleButtonColors outlinedIconToggleButtonVibrantColors(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1236236887, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:726)");
        }
        IconToggleButtonColors iconToggleButtonColorsDefaultOutlinedIconToggleButtonVibrantColors$material3 = defaultOutlinedIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsDefaultOutlinedIconToggleButtonVibrantColors$material3;
    }

    /* renamed from: outlinedIconToggleButtonVibrantColors-5tl4gsc, reason: not valid java name */
    public final IconToggleButtonColors m5022outlinedIconToggleButtonVibrantColors5tl4gsc(long j2, long j3, long j4, long j5, long j6, long j7, Composer composer, int i2, int i3) {
        long j8;
        long jM8227copywmQWz5c$default;
        long j9;
        long jM8264getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j2;
        long jM8264getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j3;
        long jM8264getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j4;
        if ((i3 & 8) != 0) {
            long j10 = jM8264getUnspecified0d7_KjU2;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j10, OutlinedIconButtonTokens.INSTANCE.getDisabledOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
            j8 = j10;
        } else {
            j8 = jM8264getUnspecified0d7_KjU2;
            jM8227copywmQWz5c$default = j5;
        }
        long jM8264getUnspecified0d7_KjU4 = (i3 & 16) != 0 ? Color.Companion.m8264getUnspecified0d7_KjU() : j6;
        long jM4593contentColorForek8zF_U = (i3 & 32) != 0 ? ColorSchemeKt.m4593contentColorForek8zF_U(jM8264getUnspecified0d7_KjU4, composer, (i2 >> 12) & 14) : j7;
        if (ComposerKt.isTraceInProgress()) {
            j9 = jM8264getUnspecified0d7_KjU;
            ComposerKt.traceEventStart(-142016199, i2, -1, "androidx.compose.material3.IconButtonDefaults.outlinedIconToggleButtonVibrantColors (IconButtonDefaults.kt:752)");
        } else {
            j9 = jM8264getUnspecified0d7_KjU;
        }
        IconToggleButtonColors iconToggleButtonColorsM5042copytNS2XkQ = defaultOutlinedIconToggleButtonVibrantColors$material3(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m5042copytNS2XkQ(j9, j8, jM8264getUnspecified0d7_KjU3, jM8227copywmQWz5c$default, jM8264getUnspecified0d7_KjU4, jM4593contentColorForek8zF_U);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonColorsM5042copytNS2XkQ;
    }

    public final IconButtonShapes shapes(Shape shape, Shape shape2, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1165993094, i2, -1, "androidx.compose.material3.IconButtonDefaults.shapes (IconButtonDefaults.kt:1011)");
        }
        int i4 = i3 & 2;
        int i5 = i3 & 1;
        if (i4 != 0) {
            shape2 = null;
        }
        if (1 == i5) {
            shape = null;
        }
        IconButtonShapes iconButtonShapesCopy = getDefaultIconButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconButtonShapesCopy;
    }

    /* renamed from: smallContainerSize-N-wlBFI, reason: not valid java name */
    public final long m5023smallContainerSizeNwlBFI(int i2) {
        float f2;
        float fM7086getWideLeadingSpaceD9Ej5fM;
        float fM7087getWideTrailingSpaceD9Ej5fM;
        if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5031getNarrowrc6NtMs())) {
            fM7086getWideLeadingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7083getNarrowLeadingSpaceD9Ej5fM();
            fM7087getWideTrailingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7084getNarrowTrailingSpaceD9Ej5fM();
        } else if (IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5032getUniformrc6NtMs())) {
            fM7086getWideLeadingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7080getDefaultLeadingSpaceD9Ej5fM();
            fM7087getWideTrailingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7080getDefaultLeadingSpaceD9Ej5fM();
        } else {
            if (!IconButtonWidthOption.m5027equalsimpl0(i2, IconButtonWidthOption.Companion.m5033getWiderc6NtMs())) {
                f2 = 0.0f;
                return DpKt.m11186DpSizeYgX7TsA(SmallIconButtonTokens.INSTANCE.m7082getIconSizeD9Ej5fM() + f2, SmallIconButtonTokens.INSTANCE.m7079getContainerHeightD9Ej5fM());
            }
            fM7086getWideLeadingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7086getWideLeadingSpaceD9Ej5fM();
            fM7087getWideTrailingSpaceD9Ej5fM = SmallIconButtonTokens.INSTANCE.m7087getWideTrailingSpaceD9Ej5fM();
        }
        f2 = fM7086getWideLeadingSpaceD9Ej5fM + fM7087getWideTrailingSpaceD9Ej5fM;
        return DpKt.m11186DpSizeYgX7TsA(SmallIconButtonTokens.INSTANCE.m7082getIconSizeD9Ej5fM() + f2, SmallIconButtonTokens.INSTANCE.m7079getContainerHeightD9Ej5fM());
    }

    public final IconToggleButtonShapes toggleableShapes(Shape shape, Shape shape2, Shape shape3, Composer composer, int i2, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1794821771, i2, -1, "androidx.compose.material3.IconButtonDefaults.toggleableShapes (IconButtonDefaults.kt:1052)");
        }
        int i4 = i3 & 4;
        int i5 = i3 & 2;
        int i6 = i3 & 1;
        if (i4 != 0) {
            shape3 = null;
        }
        if (i5 != 0) {
            shape2 = null;
        }
        if (1 == i6) {
            shape = null;
        }
        IconToggleButtonShapes iconToggleButtonShapesCopy = getDefaultIconToggleButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6)).copy(shape, shape2, shape3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iconToggleButtonShapesCopy;
    }

    /* compiled from: WazeSource */
    @a
    public final class IconButtonWidthOption {
        public static final Companion Companion = new Companion(null);
        private static final int Narrow = 0;
        private static final int Uniform = 1;
        private static final int Wide = 2;
        private final int value;

        private /* synthetic */ IconButtonWidthOption(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IconButtonWidthOption m5024boximpl(int i2) {
            return new IconButtonWidthOption(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m5026equalsimpl(int i2, Object obj) {
            return (obj instanceof IconButtonWidthOption) && i2 == ((IconButtonWidthOption) obj).m5030unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m5027equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m5029toStringimpl(int i2) {
            return m5027equalsimpl0(i2, Narrow) ? "Narrow" : m5027equalsimpl0(i2, Uniform) ? "Uniform" : m5027equalsimpl0(i2, Wide) ? "Wide" : "Unknown";
        }

        public boolean equals(Object obj) {
            return m5026equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m5029toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m5030unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getNarrow-rc6NtMs, reason: not valid java name */
            public final int m5031getNarrowrc6NtMs() {
                return IconButtonWidthOption.Narrow;
            }

            /* renamed from: getUniform-rc6NtMs, reason: not valid java name */
            public final int m5032getUniformrc6NtMs() {
                return IconButtonWidthOption.Uniform;
            }

            /* renamed from: getWide-rc6NtMs, reason: not valid java name */
            public final int m5033getWiderc6NtMs() {
                return IconButtonWidthOption.Wide;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m5025constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m5028hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* renamed from: getExtraLargeIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4990getExtraLargeIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getExtraSmallIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4991getExtraSmallIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getLargeIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4992getLargeIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getMediumIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4993getMediumIconSizeD9Ej5fM$annotations() {
    }

    /* renamed from: getSmallIconSize-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4994getSmallIconSizeD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getDefaultIconButtonShapes$material3$annotations(Shapes shapes) {
    }

    public static /* synthetic */ void getDefaultIconToggleButtonShapes$material3$annotations(Shapes shapes) {
    }

    public static /* synthetic */ void getExtraLargePressedShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraLargeRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraLargeSelectedRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraLargeSelectedSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraLargeSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraSmallPressedShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraSmallRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraSmallSelectedRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraSmallSelectedSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getExtraSmallSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getLargePressedShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getLargeRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getLargeSelectedRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getLargeSelectedSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getLargeSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getMediumPressedShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getMediumRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getMediumSelectedRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getMediumSelectedSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getMediumSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallPressedShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallSelectedRoundShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallSelectedSquareShape$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallSelectedSquareShape_pascalName$annotations(Composer composer, int i2) {
    }

    public static /* synthetic */ void getSmallSquareShape$annotations(Composer composer, int i2) {
    }

    public final IconButtonShapes shapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198298816, i2, -1, "androidx.compose.material3.IconButtonDefaults.shapes (IconButtonDefaults.kt:1023)");
        }
        IconButtonShapes defaultIconButtonShapes$material3 = getDefaultIconButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultIconButtonShapes$material3;
    }

    public final IconToggleButtonShapes toggleableShapes(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2022759230, i2, -1, "androidx.compose.material3.IconButtonDefaults.toggleableShapes (IconButtonDefaults.kt:1066)");
        }
        IconToggleButtonShapes defaultIconToggleButtonShapes$material3 = getDefaultIconToggleButtonShapes$material3(MaterialTheme.INSTANCE.getShapes(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultIconToggleButtonShapes$material3;
    }
}
